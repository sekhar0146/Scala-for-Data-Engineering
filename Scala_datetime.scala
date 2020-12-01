package practise

import java.text.SimpleDateFormat
import java.util.Calendar

object Scala_datetime {
  def main(args: Array[String]): Unit = {
    val now = Calendar.getInstance()
    val currentHour = now.get(Calendar.HOUR)    // get the current hour
    val currentMinute = now.get(Calendar.MINUTE)  // get the current minute
    val currentsec = now.get(Calendar.SECOND) // get the current sec
    println("currentHour", currentHour)
    println("currentHour", currentMinute)
    println("currentHour",currentsec)

    val format = new SimpleDateFormat("d-M-y")  // Get the current date : DD-MM-YYYY
    println("Cuurent date in DD-MM-YYYY", format.format(Calendar.getInstance().getTime()))

    val a = now.get(Calendar.DAY_OF_MONTH)  //date (number) will be displayed
    println("DAY_OF_MONTH",a)

    import java.util.Calendar
    val numDays = now.getActualMaximum(Calendar.DAY_OF_MONTH) // get the no. of days of current month
    println(numDays)

    val tm = now.getTime // get time in : Sat Jun 22 22:12:34 IST 2019
    println(tm)

    }

}
