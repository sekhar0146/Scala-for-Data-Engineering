package practise

import org.apache.spark.sql.SparkSession

object RDD {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Spark basic example")
      .config("spark.master", "local")
      .getOrCreate()

    val fileRDD = spark.read.format("csv").option("header", "true").csv("C:/Users/z011348/Desktop/Spark/temp.csv")
    fileRDD.show()
    fileRDD.printSchema()

  }

}
