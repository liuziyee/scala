package com.dorohedoro

object Constructor {
  def main(args: Array[String]): Unit = {
    var pizza = new Pizza()
    println(pizza)
    pizza = new Pizza(7)
    println(pizza)
  }
}

//class Pizza(var size: Int, var crustType: String) {
//  println("primary constructor is called")
//
//  def this(size: Int) = {
//    this(size, "thin")
//    println("auxiliary constructor with one param is called")
//  }
//  
//  def this() = {
//    this(10, "thin")
//    println("auxiliary constructor with zero param is called")
//  }
//
//  override def toString = s"A $size inch pizza with a $crustType crust"
//}

class Pizza() {
  var size: Int = _
  var crustType: String = _
  
  println("primary constructor is called")

  def this(size: Int, crustType: String) = {
    this()
    this.size = size
    this.crustType = crustType
    println("auxiliary constructor with two param is called")
  }
  
  def this(size: Int) = {
    this(size, "thin")
    println("auxiliary constructor with one param is called")
  }
  
  override def toString = s"A $size inch pizza with a $crustType crust"
}
