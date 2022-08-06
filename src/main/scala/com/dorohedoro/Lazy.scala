package com.dorohedoro

object Lazy {
  def main(args: Array[String]): Unit = {
    lazy val res: Int = sum(0, 3)
    
    def sum(x: Int, y: Int): Int = {
      println("sum() is called")
      x + y
    }
    
    println("+++++++++++++++")
    println("res: " + res)
    println("res: " + res)
  }
}
