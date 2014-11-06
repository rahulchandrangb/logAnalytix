package com.logx.main

import com.logx.confs.DAOConf
import scala.xml.XML

case class Parse(xmlFile: String, daoSettings: DAOConf) {
  
  def parseFormatterXML = {
    val xml = XML.loadFile(xmlFile)
    
    val sectionIter = xml \ "section"
    println(s"Number of section:${sectionIter.length}")
    sectionIter.map { x =>
      val sectName = x \ "@name"
      println(s"Section name:$sectName")
      val startTag = x \ "startTag"
      startTag.map { 
        v =>
          val tagid = (v \"tagid").text
          val datamapTblNm = ( v \ "dataMap"\ "@tableName").text
          println(s"Tag ID: $tagid \nTbl Nm: $datamapTblNm")
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