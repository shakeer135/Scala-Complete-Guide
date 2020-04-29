package Collections

/**
  * Created by SShakeer on Jul,2019
  **/
object ListDemo2 {
  def main(args: Array[String]): Unit = {


    var l = List.empty[String]
    l :+= "a"

    l :+= "b"

    l :+= "c"

   // use for appending a list

    var myList = List.empty[String]

    myList ++= List("a", "b", "c")

    println(myList)
    println(l)
  }
}