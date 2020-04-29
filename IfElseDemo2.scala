package ControlStructures

object IfElseDemo2 {
  def main(args: Array[String]): Unit = {

    //Expression:(If else) It return two different data types when its true one data type and false one data type.
    //so confusion to compiler.so type inference will takes place and it will give =ANY type

    val a = 11;
    if (a%2==0) {
      println("It is even")
    }
    else
    {
      println("It is Odd")
    }
    val b = 20
    val msg= if (b%2==0) "It is even2" else "It is odd2"

    println(msg)
  }
}
