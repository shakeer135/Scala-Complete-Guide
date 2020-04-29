                        package ControlStructures

/*syntax:

for (identifier <- <starting integer> to/until <ending integer> [by increment/decrement]
{
-------------------
}
another way

for (identifier <- <iterator> [ by (inc/dec)]
{
-------------------
}

*/

object ForLoopDemo1 {
  def main(args: Array[String]): Unit = {
    for (i<-1 to 10)
    {
      println(i)
    }
    //type 2
    for (j <- 1 to 10 by 2)
    {
      println(j)
    }
    //type 3 reverse
    for (k <- 5 to 1  by -1)
    {
      println(k)
    }
    //type 4 even numbers using for loop
    for (a <- 1 to 10)
    {
      if (a%2==0)
      {
        println(a)
      }
    }
    //type 5 for loop with iterator guard
    for (b<- 1 to 10; if(b%2==0)){println(b)}
  }
}
