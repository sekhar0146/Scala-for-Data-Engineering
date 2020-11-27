package practise


/* Single dimensional array */
class arrayint{
  def display2(arr2:Array[Int]): Unit ={
    for(a1<-arr2)
      println(a1)
    println("Array element in Int :" +arr2(2))
  }
}

class arr1{
  var ar=Array('a','b','c','d')
  def display1(): Unit ={
    for(a<-ar)
      println(a)
    println("Array element is : "+ ar(1))
  }
}
object array {
  def main(args:Array[String]): Unit ={
    var b = new arr1
    b.display1()

    var arr2 = Array(1,2,3,4,5)
    var c = new arrayint()
    c.display2(arr2)

    val ls1 = List("Mary", "Paris","had", "a", "little", "lamb")
    val ls2 = List("Mary", "world","had")
    val word = ls2(2)
    val res = ls1.indexOf(word)
    println(word)
    println("searched string is in : "+ res)

    var points =Array('a','b','c','d')
    // Get slice
    val slice1 = points.slice(1, 3)
    println(slice1)

  }

}
