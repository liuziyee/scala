package com.dorohedoro

object Unit {
  def main(args: Array[String]): Unit = {
    def returnUnit(): Unit = {
      println("do nothing")
    }
    val unit: Unit = returnUnit()
    println(unit)
    
    var student: Player = new Player("curry", 30)
    student = null
    println(student)
    
    def returnNothing(): Nothing = {
      throw new NullPointerException
    }
    println(returnNothing())
  }
}
