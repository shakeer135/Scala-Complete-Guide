package Collections

/**
  * Created by SShakeer on Sep,2019
  **/
object OptionDemo {
  def main(args: Array[String]): Unit = {

    val name = Map("Shakeer" -> "Hadoop Developer",
      "Maheer" -> "My Son")

    val a=name.get("Shakeer")
    val b=name.get("Vinod")
    println(pattrnOption(a))
    println(pattrnOption(b))
  }

  def pattrnOption(x: Option[String]) = x match
  {
    case Some(s) => (s)
    case None => ("key not found")
  }
}
