package Collections
import ArrayDemo._
import org.apache.hadoop.yarn.webapp.hamlet.HamletSpec.A
/*
So Array is a data structure which can store fixed size sequential elements of same day that day.
So the keyword fixed size and the same data type is important to note here. Arrays are mutable collections.
 */
object ArrayDemo {
//declaration 1
  val myarray: Array[Int]=new Array[Int](4)
  //declaration 2
  val myarray2 =new Array[Int](4)
  //declaration3
  val myarray3=Array(1,2,3,4,5,6)
  def main(args: Array[String]): Unit = {
    //println(myarray3)
    myarray(0) = 10
    myarray(1) = 20
    myarray(2) = 30
    println(myarray)
    for (x <- myarray) {
      println(x)
    }
    //another method using for lloop
    //for (i <- 0 to (myarray.length - 1)){
    //println(myarray(i))
    //}
  }
}


