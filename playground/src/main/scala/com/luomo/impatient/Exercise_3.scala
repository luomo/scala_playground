package com.luomo.impatient

import scala.util.Random
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable

/**
 * User: joao.cunha
 */
class Exercise_3 {

  def random(n : Int) = {
    val r = Random
    var res = ArrayBuffer[Int]()
    for (i <- 0 until n) {
      res += r.nextInt(n)
    }
    res.toArray
  }

  def swap(a : Array[Int]) = {
    var res = ArrayBuffer[Int]()
    val isOdd = if (a.size % 2 == 0) false else true
    for( i <- 0 until a.size -1 by 2)  res += a(i+1) += a(i)
    if(isOdd) res += a(a.size-1)
    res.toArray
  }

  def swapYield(a : Array[Int]) = {
    var res =
      for(i <- 0 until a.size)
        yield {
          if( i < a.size -1) {
            if( i % 2 == 0) a(i+1) else a(i-1)
          } else a(i)
        }
    res.toArray
  }

  def partition(a : Array[Int]) = {
    var b = a.filter(_ > 0 )
    b ++= a.filter( _ <= 0)
    b
  }

  def avg(a : Array[Double]) = a.sum / a.size

  def reverse(a : Array[Int]) = a.sorted.reverse

  def filterDuplicates(a: Array[Int]) : Array[Int] = {
    a.distinct
  }

  def filterDuplicatesMyVersion(a: Array[Int]) : Array[Int] = {
    var res = ArrayBuffer[Int]()
    val seen = mutable.HashSet[Int]()
    for ( e <- a ) {
      if (!seen(e)) {
        seen += e
        res += e
      }
    }
    res.toArray
  }

}
