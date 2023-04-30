package Array_easy

import java.util

object GFG1 {
  def main(args:Array[String])={
    val arr:Array[Int]=Array(11,65,193,36,209,664,32)
    util.Arrays.sort(arr)
    var x= arr.length
    println(s"first = ${arr(x-1)}")
    println(s"second = ${arr(x-2)}")
    println(s"third = ${arr(x-3)}")

  }

}
