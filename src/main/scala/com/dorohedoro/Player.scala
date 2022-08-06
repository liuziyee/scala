package com.dorohedoro

class Player(var name: String, var age: Int) {
  def printInfo(): Unit = {
    println(name + " " + age + " " + Player.city)
  }
}

object Player {
  val city: String = "San Francisco"

  def main(args: Array[String]): Unit = {
    val curry = new Player("curry", 30)
    val green = new Player("green", 30)

    curry.printInfo()
    green.printInfo()
    
    Player.eat("pizza")
  }
  
  def eat(food: String): Unit = {
    println("eat " + food)
  }
}