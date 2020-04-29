package Collections

object ReduceDemo {
//reduce will work as associative binary function
  val lst=List(1,2,3,4,5)
  val lst2=List("A","B","C")
  def main(args: Array[String]): Unit = {
    println(lst2.reduceLeft(_ + _))  //output is ABC   left to right
    println(lst.reduceLeft(_ + _))  //15
    println(lst.reduceLeft((x,y)=>{println(x+" , "+y); x+y;}))

    //println(lst2.reduceRight(_ - _))  //output is ABC  right to left
    println(lst.reduceRight(_ - _))  //15
    println(lst.reduceRight((x,y)=>{println(x+" , "+y); x-y;}))


    //diifernt between reduce and fold is fold will accept extra paramter to provide initial value
    println(lst.foldLeft(0)(_ + _)) //output initial value + all sum 0+15
    println(lst.foldLeft(100)(_ + _)) //output initial value + all sum 100+15
    println(lst2.foldLeft("shakeer")(_ + _))

    //scan-- It is same as fold but it will give intermediate map results also
    println(lst.scanLeft(100)(_ + _))
    println(lst2.scanLeft("shakeer")(_ + _))
  }
}
