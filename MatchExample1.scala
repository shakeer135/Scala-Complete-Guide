package ControlStructures
//Switch is not available in scala. so we will use match expression
/*
val msg = <condition/expression> match {
case <expression> => {     }
case <expression> => {     }
}

Switch will check all the cases. But match will execute corresponding case and come out

*/

object MatchExample1 {
  def main(args: Array[String]): Unit = {

    val a = 10;
    val b = 1;

    val msg = a > b match {
      case true => println("a is greater")
      case false => println("b is greater")
      case _ => println("Default case")

    }
  }
}
