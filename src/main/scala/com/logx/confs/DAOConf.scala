package com.logx.confs

class DAOConf(val id:Int) {
  object DBType extends Enumeration{
    type DBType = Value
    val CASS,MONG = Value
  }
  
  
}