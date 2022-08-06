package com.dorohedoro

import scala.collection.immutable

object For {
  def main(args: Array[String]): Unit = {
    for (no <- 0 to 9 by 3) {
      println(no)
    }

    for (no <- 0 to 9 reverse) {
      println(no)
    }

    for (no <- 0 until 10) {
      println(no)
    }

    for (no <- Array(1, 2, 3)) {
      println(no)
    }

    for (no <- 0 to 9 if no != 3) {
      println(no)
    }

    for (i <- 1 to 4; j <- 1 to 5) {
      println("i = " + i + ", j = " + j)
    }

    for {
      i <- 1 to 10
      j = 10 - i
    } {
      println("i = " + i + ", j = " + j)
    }

    val ints = for (no <- 0 to 9 by 3) yield no
    println(ints)
  }
}
