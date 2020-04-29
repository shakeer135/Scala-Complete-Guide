package ControlStructures

/**
  * Created by SShakeer on Sep,2019
  **/
object FibanaciiDemo extends App{
  def fib1( n : Int) : Int = n match {
    case 0 | 1 => n
    case _ => fib1( n-1 ) + fib1( n-2 )
  }

  println(fib1(5))

  def fib2( n : Int ) : Int = {
    var a = 0
    var b = 1
    var i = 0

    while( i < n ) {
      val c = a + b
      a = b
      b = c
      i = i + 1
    }
    return a
  }

  println(fib2(5))
}
