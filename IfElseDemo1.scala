package ControlStructures

object IfElseDemo1 {
  def main(args: Array[String]): Unit = {

    //If else can be used in Scala as Conditional statements or Expressions

    /* Syntax: if (<condition>)
              {

              }
              else
              {

              }

     */

    val a:Int = 10
    val b:Int = 20
    val max = if (a > b) a else b
    println(max)
  }

}
