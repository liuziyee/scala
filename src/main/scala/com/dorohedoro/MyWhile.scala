package com.dorohedoro

object MyWhile {
  def main(args: Array[String]): Unit = {
    def myWhile(condition: => Boolean): (=> Unit) => Unit = {
      def doLoop(op: => Unit): Unit = {
        if (condition) {
          op
          myWhile(condition)(op)
        }
      }
      doLoop
    }

    def myWhileLambda(condition: => Boolean): (=> Unit) => Unit = {
      op => {
        if (condition) {
          op
          myWhile(condition)(op)
        }
      }
    }
    
    def myWhileCurrying(condition: => Boolean)(op: => Unit): Unit = {
      if (condition) {
        op
        myWhile(condition)(op)
      }
    }

    var n = 5
    myWhile(n >= 1)({
      println(n)
      n -= 1
    })
  }
} 
