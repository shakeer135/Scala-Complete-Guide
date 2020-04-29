package ControlStructures
import scala._
/**
  * Created by SShakeer on Jul,2019
  **/
object pcm {
  def main(args: Array[String]): Unit = {

    val str = "ABC"
    val output = (str * str.length).combinations(str.length).toList

    output.foreach(println)

  }
}
