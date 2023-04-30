package Array_easy

object PrintLargest {
  def print3largest(arr:Array[Int],arr_size:Int)={
    var(first:Int,second:Int,third:Int)=(Int.MinValue ,Int.MinValue, Int.MinValue )
    if(arr_size <3)
    {
      println("Invalid Input")
    }
    for(i <- 0 until arr.length)
    {
      if(arr(i) > first)
      {
        third =second
        second = first
        first =arr(i)
      }
      else if (arr(i) > second)
      {
        third = second
        second = arr(i)
      }
      else if(arr(i)>third)
      {
        third = arr(i)
      }

    }
    println(s"three largest no are $first ,$second ,$third")
  }
  def main(args:Array[String]):Unit={
    val arr= Array(12,13,1,10,34,1)
    val n= arr.length
    print3largest(arr,n)
  }

}

