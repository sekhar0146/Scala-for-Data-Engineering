import org.apache.spark.sql.SparkSession
import org.apache.spark.storage.StorageLevel
import java.lang.Math

object Persist {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Spark basic example")
      .config("spark.master", "local")
      .getOrCreate()

    val lines = spark.sparkContext.textFile("C:/Users/z011348/Desktop/Spark/temp.txt")
    lines.persist(StorageLevel.MEMORY_AND_DISK)
    val linesWithChennai =  lines.filter(line => line.contains("chennai")).count()
    val lineLengths = lines.map(s => s.length)
    val totalLength = lineLengths.reduce((a, b) => a + b)

    println("count :" + lines.count())        /* no of lines in the file */
    println("first line : " + lines.first())  /* display first line */
    println("Number of lines With Chennai : " + linesWithChennai)  /* filter based on chennai */
    println(totalLength)

    /* find the small length line from the input file */
    val ln = lines.map(line => line.size).reduce((a, b) => if (a < b) a else b)
    println("The smallest line length is : " + ln)

    /* word cout */
    val wordcount = lines.flatMap(line => line.split(","))
      .map(word => (word, 1))
      .reduceByKey(_ + _)
    wordcount.foreach(println)

    spark.stop()
  }

}
