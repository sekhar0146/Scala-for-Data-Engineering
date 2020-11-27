
// Ex 1
class Student(id:Int, name:String){                 // Primary constructor
  def show(){
    println(id+" "+name)
  }
}

// EX 2
class empl{                 // Primary constructor
  var eid: Int = 0
  var ename: String = null
}

object Scala_class{
  def main(args:Array[String]){
    var s = new Student(100,"Martin")   // Passing values to constructor
    s.show()                                       // Calling a function by using an object

    var e = new empl()
    println("sample class result : " + e.eid+" "+e.ename)
  }
}
