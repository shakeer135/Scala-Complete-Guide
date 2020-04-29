package Collections

/**
  * Created by SShakeer on Sep,2019
  **/
object OptionDemo2 {
  def main(args: Array[String]): Unit = {

    val some:Option[Int] = Some(1000)
    val none:Option[Int] = None
    val x = some.getOrElse(0)
    val y = none.getOrElse(100)
    val a = some.isEmpty
    val b = none.isEmpty
    println(x)
    println(y)
    println(a)
    println(b)
  }
}
