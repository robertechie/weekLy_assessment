package com.tinyit.week7

fun main(){
    var numberList = 348597
    println(reverse(numberList))
}

fun reverse (arrayNum:Int):ArrayList<Int>{
   var reversed:Int = 0
    var num = arrayNum
    while ( num !== 0) {
        var digit: Int = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }
    //get the reversed number, then convert to intArray
    val temp = reversed.toString()
    val numbs:ArrayList<Int> = arrayListOf()
    for (i in 0 .. temp.length-1) {
        numbs.add(temp[i].digitToInt())
    }
    return numbs

    }


