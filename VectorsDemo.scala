package Collections

object VectorsDemo {
  def main(args: Array[String]): Unit = {
    //Declaration Type1
    var v1:Vector[Int] = Vector(5,8,3,6,9,4)
    //Declaration Type2
    var v2 = Vector(5,2,6,3)
    //Delaration Type3
    var v3 = Vector.empty
    println(v1)
    println(v2)
    println(v3)

    //different kind of operations on vectors

    val v4 = 1000 +: v2
    println(v4)
    val v5 = v3 :+ 1 :+ 2
    println(v5)
    val v6 = v2 updated (2, 3000)
    println(v6)
  }
}
