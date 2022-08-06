package com.dorohedoro

object IfElse {
  def main(args: Array[String]): Unit = {
    val comic = "onepiece"
    val author: String = if (comic == "dorohedoro") {
      println("dorohedoro")
      "Hayashida"
    } else if (comic == "onepiece") {
      println("onepiece")
      "Eiichiro Oda"
    } else if (comic == "chainsaw man") {
      println("chainsaw man")
      "Fujimoto Tatsuki"
    } else {
      "fuck"
    }
    println(author)
    
    println(if (comic == "dorohedoro") "threezero" else "30")
  }
}
