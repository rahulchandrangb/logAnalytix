package com.logx.main

import com.logx.confs.DAOConf
import scala.xml.XML

case class Parse(xmlFile: String, daoSettings: DAOConf) {

  def parseFormatterXML = {
    val xml = XML.loadFile(xmlFile)

    val sectionIter = xml \ "section"
    println(s"Number of sections:${sectionIter.length}")
    val sectionObjs = sectionIter.map {
      x =>
        val sectName = x \ "@name"  // Represents the name of the section
        val tagType = x \ "@tagtype" // represents how the section is identified. possible configs: (regex,csv,json)
        println(s"Section name:$sectName , tagtype : $tagType") 
        val startTag = x \ "startTag"
        val startMapSettings = startTag.map {
          v =>
            val tagid = (v \ "tagid").text
            val tagTypeIdx =  (v \ "tagtypeidx").text
            val datamapTblNm = (v \ "dataMap" \ "@tableName").text
            println(s"Tag ID: $tagid \nTbl Nm: $datamapTblNm \ntagTypeIdx : $tagTypeIdx")
            (tagid,tagTypeIdx,datamapTblNm)
        }   
        
    }
  }
}

class ParseTree(id: String) {
  val sectionList: List[Section] = List()
  val tableList: List[Table] = List()
}

object Test extends App {
  val x = Parse("/tmp/test.xml", null)
  x.parseFormatterXML

}