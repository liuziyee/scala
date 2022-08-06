package com.dorohedoro

object Lambda {
  def main(args: Array[String]): Unit = {
    val lambda = (no: Int) => {
      println(no)
    }
    println(lambda)
    lambda(30)

    def printNo(fun: Int => Unit): Unit = {
      fun(117)
    }
    printNo(lambda)
    printNo((no: Int) => { println(no) })
    printNo(no => { println(no) })
    printNo(no => println(no))
    printNo({ println(_) })
    printNo(println)

    def dualOpsOneAndThree(op: (Int, Int) => Int): Int = {
      op(1, 3)
    }

    println(dualOpsOneAndThree((a, b) => a + b))
    println(dualOpsOneAndThree((a, b) => a - b))
    println(dualOpsOneAndThree(_ + _))
  }
}