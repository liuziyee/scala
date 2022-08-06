package com.dorohedoro

import scala.annotation.tailrec

object Recursion {
  def main(args: Array[String]): Unit = {
    def rec(n: Int): Int = {
      if (n == 1) return 1
      rec(n - 1) * n
    }
    println(rec(5))
    
    @tailrec
    def tailRec(n: Int, res: Int): Int = {
      if (n == 0) return res
      tailRec(n - 1, res * n)
    }
    println(tailRec(5, 1))
  }
}
