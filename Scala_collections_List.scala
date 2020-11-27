package practise

import scala.collection.immutable.ListSet

object Scala_collections_List {
  def main(args: Array[String]): Unit = {
    var listset = ListSet(4,2,8,0,6,3,45)
    val list1 = List(1,4,5,6,8,22,11,5)
    listset.foreach((element:Int) => println(element+" "))
    println("header element : " + listset.head)

    var listset1:ListSet[String] = new ListSet()                 // Creating empty ListSet by using constructor
    var listset2:ListSet[String] = ListSet.empty                // Creating an empty listset
    println("listset1: "+listset1)
    println("listset2: "+listset2)
    println("After adding new elements:")
    listset1+="India"            // Adding new element
    listset2+="Russia"          // Adding new element
    listset2+="France"          // Adding new element
    println("listset1: "+listset1)
    println("listset2: "+listset2)
    println("header element after adding listset1 : " + listset1.head)
    println("header element after adding listset2 : " + listset2.head)
    println("List length : " + list1.length)
    println("List size : " + list1.size)

    val points = List(1.5, 3.5, 10.3, 11.3)
    // Get slice of list.
    val slice1 = points.slice(1, 3)
    println(slice1)

    // Get slice until end of list.
    val slice2 = points.slice(2, points.length) //won't fail even if we give out of range
    println(slice2)

    // Get slice when we supply out of range
    val slice3 = points.slice(2, 7) //won't fail even if we give out of range
    println(slice3)

    println(" ")

    // sum in List
    val a = List ( List(1,2,3), List(3,4), List(5,6,7,8), List(9,10))
    val res = a.map(x=>
    x.sum)
    println(res)

    // sum in List - with different input
    val data = List ( "10,20,30",  "10,50,40,30,60", "50,30", "11,22,33,44")
    val strToInt = data.map(_.split(",").map(_.toInt).toList)
    println(strToInt)
    val res2 = strToInt.map(x1=>
      x1.sum)
    println(res2)

    // List : filter
    val recs = List( "101,kumar,50000,m,11",
      "102,ganesh,40000,m,22",
      "103,kalyani,60000,f,11",
      "104,rani,10000,f,22" )

    val genM = recs.filter{x=>
      val gen = x.split(",")(3).toLowerCase
      gen=="m"
    }
    println(genM)

    /*val grpBy = recs.groupBy{z=>
      val grp = z.split(",")(2)
      val sm = grp.sum
    }*/
    val grpby = recs.map(a=> a.split(",")(2).sum)
    println(grpby)
  }

}
