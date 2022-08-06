package com.dorohedoro

object Closure {
  def main(args: Array[String]): Unit = {
    def addBy(x: Int): Int => Int = {
      y => x + y
    }
    
    def addBySim(x: Int): Int => Int = x + _ 
    println(addBy(3)(0))
    println(addBySim(3)(0))
    
    def addByCurrying(x: Int)(y: Int): Int = {
      x + y
    }
    println(addByCurrying(0)(3))
  }
}
