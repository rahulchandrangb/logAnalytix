package com.logx.main
import scala.collection.mutable.Map
import scala.collection.mutable.HashMap
import scala.collection.mutable.ListBuffer

class Section(val id:String,val name:String) {
	private val settings:Map[String,String] = Map()
	private val tagIds:ListBuffer[Int] = ListBuffer()
	def addSettings(key:String,value:String)= settings += key -> value
	def getSettings(key:String) = settings.getOrElse(key, "")
	def addTagIds(value:Int) = tagIds += value
	def getTagIds = tagIds.toList
}