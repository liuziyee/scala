package com.dorohedoro

object String {
  def main(args: Array[String]): Unit = {
    val comic = "dorohedoro"
    val manufacturer = "threezero"
    println(s"${manufacturer}: ${comic} is coming")
    
    val sql =
      s"""select * from wiki
         |where comic = ${comic}
         |limit 0, 100""".stripMargin
    println(sql)

    val str1 = "dorohedoro"
    val str2 = new String("dorohedoro")
    
    println(str1 == str2)
    println(str1.equals(str2))
    println(str1.eq(str2))
  }
}
