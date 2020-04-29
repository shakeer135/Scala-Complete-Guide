package Collections


object MapDemo {
  def main(args: Array[String]): Unit = {
    val m1: Map[String, String] = Map("India" -> "Delhi", "SriLanka" -> "Colombo")
    println(m1)
    println(m1("India"),m1("SriLanka"))
    println(m1.keys)
    println(m1.values)

    m1.keys.foreach{
      key=>
        println("key" + key)
        println("value" + m1(key))
    }
  }
}