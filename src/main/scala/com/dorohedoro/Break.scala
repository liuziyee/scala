package com.dorohedoro

import scala.util.control.Breaks._


object Break {
  def main(args: Array[String]): Unit = {
    try {
      for (no <- Set("dorohedoro", "onepiece", "chainsaw man")) {
        if (no == "chainsaw man")
          throw new RuntimeException
        println(no)
      }
    } catch {
      case e: Exception =>
    }

    breakable(
      for (no <- Set("dorohedoro", "onepiece", "chainsaw man")) {
        if (no == "chainsaw man")
          break()
        println(no)
      }
    )
    
    
  }
}
