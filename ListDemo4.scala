package Collections

/**
  * Created by SShakeer on Sep,2019
  **/
object ListDemo4 {
  def main(args: Array[String]): Unit = {

    val list = (1 to 10).toList
      val output= list.filter((item: Int) => item % 2==0)
    println(output)
  }

}
