package com.logx.main

import com.logx.confs.DAOConf
import scala.xml.XML

case class Parse(xmlFile: String, daoSettings: DAOConf) {
  val xml = XML.loadFile(xmlFile)

}
