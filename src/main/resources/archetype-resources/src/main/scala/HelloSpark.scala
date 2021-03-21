package ${package}

import org.apache.spark.internal.Logging
import org.apache.spark.sql.SparkSession

/**
 * Hello world!
 *
 */
object HelloSpark extends Logging{
  def main(args: Array[String]): Unit = {
    println("Hello World!")
    val spark = SparkSession.builder()
      .appName("hello")
      .master("local[4]")
      .getOrCreate()


    spark.stop()
  }
}

