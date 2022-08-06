package com.dorohedoro

object Function {
  def main(args: Array[String]): Unit = {
    def printCity(city: String*): Unit = {
      println(city)
    }
    printCity("san francisco", "hongkong", "tokyo")

    def printStudio(studio: String = "343", company: String = "Xbox") =
      println(s"${studio} is under ${company}")
    printStudio()
    printStudio(company = "Steam")

    def printNo(no: Int = 117, name: String = "John") {
      println(s"${no}: ${name}")
    }
    printNo()
    println(printNo())

    def noParam() = "null"
    noParam()
    noParam

    def noParamNoClaim = "null"
    printf(noParamNoClaim)
  }
}
