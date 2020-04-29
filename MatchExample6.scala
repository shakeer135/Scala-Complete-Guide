package ControlStructures

object MatchExample6 {
  def main(args: Array[String]): Unit = {

    def sample123(x:Int):String=x match{
         case 1=> "One"
         case 2=>"Two"
         case _=>"One too many"
         }
    //calling function

    sample123(1)
  }

}
