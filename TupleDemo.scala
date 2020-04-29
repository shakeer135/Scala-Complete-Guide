package Collections
//Tuple can have only 22 elements

object TupleDemo {
  //Declaration1
  val t1=(10,20,"Tuple")
  //Declaration2
  val t2=new Tuple5(1,2,4,"A","B")
  def main(args: Array[String]): Unit = {
    println(t1._1)
    println(t2._4)

    //.productIterator.foreach{
    //  i=>println(i)
    //}
  }
}
