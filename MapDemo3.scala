package Collections

/**
  * Created by SShakeer on Sep,2019
  **/
object MapDemo3 {

  def main(args: Array[String]): Unit = {

    case class Person(firstName: String,lastName: String,title: String)
    val people = Seq(Person("Shakeer", "Shaik", "Mrs"),
      Person("Maheer", "Shaik", "Mr"),
      Person("Roqiya", "Patan", "Miss"))


    val labels = people.map( person =>   s"${person.title}. ${person.lastName}")
    println(labels)
    val beginningWithJ = people.filter(_.firstName.startsWith("S"))
    println(beginningWithJ)
    val firstNames = people.map(_.firstName).reduce( (a, b) => a + "," + b )
    println(firstNames)

  }


}
