package Collections

/**
  * Created by SShakeer on Sep,2019
  **/
object OptionDemo1 {
  def main(args: Array[String]): Unit = {

    val countries = Map(   "USA" -> "Washington",   "UK" -> "London",   "Germany" -> "Berlin",   "Netherlands" -> "Amsterdam",   "Japan" -> "Tokyo" )

    println(countries.get("USA")) // Some(Washington)
    println(countries.get("France")) // None
    println(countries.get("USA").get) // Washington
   // println(countries.get("France").get) // Error: NoSuchElementException
    println(countries.get("USA").getOrElse("Nope")) // Washington
    println(countries.get("France").getOrElse("Nope")) // Nope
  }
}
