package Collections

/**
  * Created by SShakeer on Sep,2019
  **/
object FoldDemo1 {
  def main(args: Array[String]): Unit = {

/*The fold method iterates over a collection, using an initial accumulator value and applying a function that uses
    each element to update the accumulator successfully
    */

    def summation(x: Int, y: Int) = x+ y
    val nums = List(1, 2, 3, 4, 5)
    var v: Int = 5
    val sum = nums.fold(v)(summation)
    println(sum) // prints 15 because 0 + 1 + 2 + 3 + 4 + 5 = 15

  }
}
