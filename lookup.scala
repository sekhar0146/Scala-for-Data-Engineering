import org.apache.spark.sql.SparkSession

object lookup {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Spark basic example")
      .config("spark.master", "local")
      .getOrCreate()

    val rdd = spark.sparkContext.parallelize(Seq(
      ("math",    55),
      ("math",    56),
      ("english", 57),
      ("english", 58),
      ("science", 59),
      ("science", 54)))

    rdd.foreach(println)

    val result1 = rdd.countByKey()
    result1.foreach(println)

    val reslt2 = rdd.collectAsMap()
    println(reslt2)

    val result3 = rdd.lookup("math")
    println(result3)

    //**//

    /*val textdf = spark.read.format("txt").csv("C:/Users/z011348/Desktop/Spark/temp.txt").toDF("eno", "ename","eloc","esal")
    val keyval = textdf.select("eno", "ename").rdd*/

    /*val result4 = keyval.lookup()
    println(result4)*/
  }

}
