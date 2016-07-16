package com.kali.scala.datastrcutures

/**
  * Created by kalit_000 on 16/07/2016.
  */

import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkContext, SparkConf}
import scala.collection.mutable
import scala.collection.mutable.Queue

//Queu:- is FIFO

// similar to sainsburys q at checkouts

//Enqueue and Dequeue

//Enqueue is insert operation

//Peek returns head item of the q

//clear clears the q

//Dequeue is remove operation , get data operation

//Priority Queue

object Queueobj {

  def main(args: Array[String]) {

    Logger.getLogger("org").setLevel(Level.WARN)
    Logger.getLogger("akka").setLevel(Level.WARN)

    val conf = new SparkConf().setMaster("local[*]").setAppName("YOUR_APP_NAME_USER").set("spark.hadoop.validateOutputSpecs", "false")
    val sc = new SparkContext(conf)

    var q=new mutable.Queue[String]()

    q+="kali"

    q+="sri"

    q.enqueue("super")

    println(q)


  }


}
