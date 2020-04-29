package Collections

/**
The reduce() method is a higher-order function that takes all the elements in a collection (Array, List, etc)
and combines them using a binary operation to produce a single value.
  **/
object ReduceDemo2 {


  // Scala program to
  // print maximum value
  // using reduce()

    def main(args:Array[String])
    {
      // source collection
      val collection = List(1, 3, 2, 5, 4, 7, 6)

      // finding the maximum valued element
      val res = collection.reduce((x, y) => x max y)

      println(res)

      //demo2

      val c = List(1, 5, 7, 8)

      // converting every element to a pair of the form (x,1)
      // 1 is initial frequency of all elements
      val new_collection = c.map(x => (x,1))

      /*
      List((1, 1), (5, 1), (7, 1), (8, 1))
      */

      // adding elements at correspnding positions
      val res2 = new_collection.reduce( (a,b) => ( a._1 + b._1, a._2 + b._2 ) )
      /*
      (21, 4)
      */

      println(res2)
      println("Average="+ res2._1/res2._2.toFloat)
    }
  }


