package ControlStructures

object MatchExample2 {
  def main(args: Array[String]): Unit = {

    val name = "PRAVEEN"
    val res = name match {
      case "MADHAVI" =>{println("She is DB Developer")}
      case "PRAVEEN" =>{println("He is PB Developer")}
      case "ANUP" =>{println("He is DB Developer")}
      //  case _ => {println("Default case")}
    }
  }

}
