package ControlStructures

object MatchExample3 {
  def main(args: Array[String]): Unit = {

    val a = 10
    val b = 20
    val op = '+'

    val output = op match{
      case '+' => println(a + b)
      case '-' => println(a - b)
      case '*' => println(a * b)
      case _ => "Default case"
    }
  }
}
