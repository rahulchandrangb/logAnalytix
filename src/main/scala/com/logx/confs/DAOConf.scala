package com.logx.confs
import scala.collection.mutable.Map

object DBType extends Enumeration{
    type DBType = Value
    val CASS,MONG = Value
}
import DBType._
class DAOConf(val id:Int,val dbType:DBType.Value=CASS) {
  val dbConf = Map(
        "ip" -> "127.0.0.1",
        "port"->"9160",
        "keyspace" -> "LogAnalytix",
        "parallelism" -> "4",
        "username" -> "",
        "password" -> ""
       
      )
  val zooConf = Map(
      "ip" -> "",
      "timeout" -> ""
      )
  val searchConf = Map[String,String]()
  
  
}