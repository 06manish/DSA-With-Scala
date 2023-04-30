package Array_easy

import java.util.Arrays
import scala.util.control.Breaks.break

object gfg {
  def find3largest(arr:Array[Int])={
    Arrays.sort(arr)
    val n= arr.length
    var(check:Int ,count:Int)=(0,1)
    println(s"count =$count check =$check")
    for(i <- 1 until arr.length )
    {
      if(count < 4)
      {
        if(check != arr(n-i))
        {
          println(arr(n-i))
          check = arr(n-i)
          count = count +1
        }
      }
      else
        break

    }
  }
  def main(args:Array[String])={
    val arr =Array(12,45,1,-21,45,54,23,5,0,-10)
    find3largest(arr)
  }
}

