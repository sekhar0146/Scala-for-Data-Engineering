package practise

object basics {
  def main(args:Array[String]){

    val x = 1 +1
    println("x value is : " + x)

    /* IF statement */
    if (x>20){
      println("greater than 20") }

      else if (x==20) {
        println("equal to 20") }

      else println("less than 20")


    /**
      * Scala Pattern Matching (As Switch case)
      * method 1 **/
    var q = 8
    q match {
      case 1 => println("one")
      case 2 => println("two")
      case 3 => println("three")
      case _ => println("nothing")

    }
    /**
      * Scala Pattern Matching (As Switch case)
      * method 2 **/
    var result = search("reault")  /* call search function */
    println("search result is : " + result)

    /* function */
    var v1 = multiplyBy2(add2(20))
    println("Value from function : " + v1)

    /**
      * while loop
      */
    var i=1
    while (i<=5){
      println(i)
      i = i+1
    }

    /**
      * For loop
      */
    var j=1
    for (j<-1 to 15 if j%2==0){
      println("Even numbers in for loop is : " + j)
    }

    /**
      * yield loop
      */
    var res=for(k<-1 to 3) yield k
    for (k<- res){
      println(k)
    }

    /* ---- accessing classes ---- */
    var empl1=new empl(1,"raj",eaddr="chennai")
    var empl2=new empl(2,"ram",eaddr="chennai")
    var empl3=new empl(3,"sam",eaddr="hyd")
    empl1.printrec()
    empl2.printrec()
    empl3.printrec()

    /* class example 2 */
    new addition().add(8,77)

    /* call constructor */
    var s = new Student("Raja", 400)

    /* inheritance */
    var t = new a3()
    t.display()

    /* field override */
    var w = new Bike()
    w.show()
  } /* ---------------------------- Main function end -----------------------*/

  /**
    * function **/
  def search (a:Any): Any = a match {
    case 1  => "one"
    case "two" => "two"
    case "renault" => "renault"
    case _ => "not found"
  }

  /* function */
  def multiplyBy2 (a1:Int): Int={
    a1*2
  }

  def add2 (a2:Int): Int={
    a2+2
  }

  /* class */
  class empl(enum:Int,ename:String,eaddr:String) {
    def printrec(): Unit = {
      println(enum + " " + ename + " " + eaddr)
    }
  }

  class addition{
    def add(a:Int,b:Int): Unit ={
      var add1 = a + b
      println("addition of 2 numbers : " + add1)
    }
  }

  /* constructor by THIS key word */
  class Student(name:String){
    def this(name:String,age:Int){
      this(name)
      println(name + " " + age)
    }
  }

  /* Inheritance */
  class a1{
    var val1 = 1000
  }

  class a2 extends a1 {
    var val2 = 2000
  }

  class a3 extends a2 {
    var val3 = 3000
    def display(): Unit ={
      println("val1" + " " +val1)
      println("val2" + " " +val2)
      println("val3" + " " +val3)

    }
  }

  /* field override */
  class Vehicle{
      val speed:Int = 60

    }

  class Bike extends Vehicle{
    override val speed:Int = 100     // Override keyword
    def show(){
      println("speed"+" "+speed)
    }
  }
} /* ------------------------------- Object end -------------------------------*/