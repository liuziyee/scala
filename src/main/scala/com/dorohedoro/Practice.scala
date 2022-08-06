package com.dorohedoro

import com.dorohedoro.basic.PACKAGE_DOROHEDORO

object Practice {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(0, 30, 117)

    def arrayOps(arr: Array[Int], op: Int => String): Array[String] = {
      for (elem <- arr) yield op(elem)
    }

    val newArr = arrayOps(arr, elem => elem.toString)
    println(newArr.mkString(","))

    def fun(i: Int): String => (Char => Boolean) = {
      (s: String) => {
        (c: Char) => if (i == 0 && s == "" && c == '0') false else true
      }
    }
    println(fun(0)("")('0'))
    
    def curryingFun(i: Int)(s: String)(c:Char) = {
      if (i == 0 && s == "" && c == '0') false else true
    }
    println(curryingFun(0)("")('0'))
    
    println(PACKAGE_DOROHEDORO)
  }
}
