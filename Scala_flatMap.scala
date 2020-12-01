package practise

object Scala_flatMap {
  def main(args: Array[String]): Unit = {
    val l1 = List(List("nag","hari"), List("ram","raj"))
    val l2 = List("nag","hari")
    val m1 = l2.map(a => a.capitalize)      // record to record (1 to 1)
    val f1 = l2.flatMap(a => a.capitalize)  // record to manay (1 to many)
    println(m1)
    println(f1)

    val l0 = l1.map(a => a.toString.toUpperCase)
    val l3 = l1.flatMap(a => a.toString.toUpperCase)
    val l4 = l1.flatten(a => a.toString.toUpperCase)   //flatten gives same as flatMap
    println(l0)
    println(l3)
    println(l4)
  }
}
