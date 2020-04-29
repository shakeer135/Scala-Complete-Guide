package Collections

//closure is a function which uses one or more  variables declared outside this function
//same as functions but different is above.

object ClosureDemo{
  var value1=20; //here value1 is variable declare outside of function
  val addition=(x:Int)=>x+value1;//addition is depends on the one or more variable values of value1

  /*
  val value1=20;
  val addition=(x:Int)=>x+value1; //This is called pure closure as value1 variable cannot be modified

   */

def main (args: Array[String] ): Unit = {
println(addition(20))
}

}
