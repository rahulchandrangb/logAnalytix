package com.logx.main

import com.logx.confs.DAOConf
import scala.xml.XML

case class Parse(xmlFile: String, daoSettings: DAOConf) {
  val xml = XML.loadFile(xmlFile)
  
}

class ParseTree(id:String){
  val sectionList:List[Section]= List()
  val tableList:List[Table] = List()
}