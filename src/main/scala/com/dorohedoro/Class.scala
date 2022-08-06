package com.dorohedoro

import scala.beans.BeanProperty

object Class {
  def main(args: Array[String]): Unit = {
    val student = new Student()
    println(student.getGender())
    println(student.age)
    println(student.isGay)
  }
}

class Student {
  private var name: String = "curry"
  var age: Int = _
  var isGay: Boolean = _
  @BeanProperty
  var gender: String = _
}

