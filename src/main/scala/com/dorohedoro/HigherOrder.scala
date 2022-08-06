package com.dorohedoro

object HigherOrder {
  def main(args: Array[String]): Unit = {
    def printNo(no: Int): Unit = {
      println(no)
    }

    //val printNoInstance: Int => Unit = printNo
    //val printNoInstance = printNo(_)
    val printNoInstance = printNo _

    println(printNoInstance)
    printNoInstance(117)
    
    def dualOps(op: (Int, Int) => Int, x: Int, y: Int): Int = {
      op(x, y)
    }
    
    def add(x: Int, y: Int) = x + y

    println(dualOps(add, 30, 117))
    println(dualOps((x, y) => x + y, 30, 117))
    
    def returnFunc(): Int => Unit = {
      def printYear(year: Int)= println(year)
      printYear
    }

    val printYear = returnFunc()
    println(printYear)
    println(printYear(1994))
    
    println(returnFunc()(1994))
    
  }
}
