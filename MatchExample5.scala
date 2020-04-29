package ControlStructures

object MatchExample5 {
  def main(args: Array[String]): Unit = {

    case class Car(Company:String,name:String,price:Int)
    val car1 =new Car("SUZUKI","Swift",700000)
    val car2 =new Car("MAHINDRA","TAAR",800000)
    val car3 =new Car("TOYOTA","INNOVA",900000)

    for(car<-List(car1,car2,car3)){
       car match{
       case Car("SUZUKI","Swift",700000)=>println("MY favorite car")
         case Car("MAHINDRA","TAAR",800000)=>println("Hi Luxury Car")
         case Car("TOYOTA","INNOVA",900000)=>println("Hi sports car")
         }

      }
  }

}
