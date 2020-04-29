package Collections

//Options will give some or None

object OptionsType {
  val lst= List(10,20,30,40,50)
  val m1: Map[String, String] = Map("India" -> "Delhi", "SriLanka" -> "Colombo")
  //Declaring Option type as variable

  val opt:Option[Int]=Some(100)

  def main(args: Array[String]): Unit = {

    println(lst.find(_ > 60))//Output is None
    println(lst.find(_ > 10))//Output is Some(20)
    println(m1.get("India"))//Some(Delhi)

    //How to extract value of Some
    println(lst.find(_ > 10).get)

    //Error Handling
    //println(m1.get("USA")) //Error as it is not exists
    println(m1.get("USA").getOrElse("No Country Found"))

    println(opt.isEmpty)

  }

}
