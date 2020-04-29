package Collections

//Set is collection of type of elements.It cannot have duplicate values in it. By default it is immutable, you can make it as mutable
//as declared below
//elements in Set are not ordered.
object SetDemo {

  val s1=Set(1,2,3,4,5,6,7)
  val s2=Set("BANGALORE","HYDERABAD","CHENNAI")
  var mutableset=scala.collection.mutable.Set(1,3,4,8)
  val s3=Set(34,4,5,6)
  def main(args: Array[String]): Unit = {

 println(s2)
    //adding some value to set
    println(s1 + 10)
    println(s1.head)
    println(s2.tail)
   //concating
    println(s1 ++ s2)
    //intersection

    println(s1.&(s3))
    println(s1.intersect(s3))
  }

}
