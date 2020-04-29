package ControlStructures

object Collection1 {

  def main(args: Array[String]): Unit = {

    val fibs = 1::1::2::4::3::5::Nil
    println(fibs.head)

    println(fibs.tail)

println(fibs.tail.tail.head)
    println(fibs.tail.tail.tail.head)

  }

}
