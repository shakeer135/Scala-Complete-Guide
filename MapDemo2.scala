package Collections

object MapDemo2 {
  val lst=List(1,20,40,50,79)
  val m1 = Map("India" -> "Delhi", "SriLanka" -> "Colombo")
  def main(args: Array[String]): Unit = {
  println(lst.map(_ *2))//It will give new list with doubled
  println(lst.map(x=>x*2))
    println(lst.map(x=>"HOF" + x))//It will append HOF to each element in the list
   // println(lst.map(x=>"HOF" * x))

    println(m1.map(x=>"Hello" + x))
    println(m1.mapValues(x=>"Capital is " + x))
    //flatten
    println(List(List(1,3,4),List(7,8,8)).flatten)
      //flatmap
   println(lst.flatMap(x=> List(x, x+1)))
  }
}
