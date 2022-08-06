package com.dorohedoro

object ControlAbstraction {
  def main(args: Array[String]): Unit = {
    def byValueParam(no: Int): Unit = {
      println("no: " + no)
      println("no: " + no)
    }
    
    def byNameParam(no:  => Int): Unit = {
      println("no: " + no)
      println("no: " + no)
    }
    
    def returnNo(): Int = {
      println("returnNo() is called")
      117
    }
    byValueParam(returnNo())
    byNameParam(returnNo())
    byNameParam({
      println("this is a code block")
      30
    })
  }
}
