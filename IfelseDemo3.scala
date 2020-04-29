package ControlStructures

object IfelseDemo3 {
  def main(args: Array[String]): Unit = {

    def max(x:Int, y:Int, z:Int) = {
      if (x > y) println(x+" is maximum")
      if (y > z) println(y+ " is Maximum") else println(z+" is maximum")
    }
    //calling

    max(10,20,30)
  }
}
