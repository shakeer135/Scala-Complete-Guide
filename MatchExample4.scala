package ControlStructures

object MatchExample4 {
  def main(args: Array[String]): Unit = {

    val day = "MONDAY"

    val result1 = day match{
      case "MON_"|"TUE"|"WED"|"THU"|"FRI" => {println("WeekDay")}
      case "SAT"|"SUN" => {println("WeekEnd")}
      case _ => {println("Default case")}
    }

  }

}
