package practise

class Student(id:Int){
  def this(id:Int, name:String)={
    this(id)
    println(id+" "+name)
  }
  println(id)
}

object MainObject{
  def main(args:Array[String]){
    new Student(101)
    new Student(100,"India")
  }
}
