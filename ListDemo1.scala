package Collections


object ListDemo1 {
  def main(args: Array[String]): Unit = {


    val lst = List(10, 20, 30, 40, 50)
    val lst2 = List.apply(10, 20, 30, 40, 50)
    val lst3 = 10 :: 20 :: 30 :: 40 :: 50 :: Nil
    val name = List("Shakeer", "Maheer", "Vinod")
    /*println(lst.head)
    println(lst.tail)
    println(lst.isEmpty)
    println(lst.reverse)*/
    println(List.fill(5)(3))
    lst.foreach(println)

    var sum: Int = 0;
    lst.foreach(sum += _)
    println(sum)

    for (all <- name) {
      println(all)
    }


  }
}