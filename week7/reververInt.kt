package com.tinyit.week7

fun main(){
    val arrayNumList: ArrayList<Int> = arrayListOf(21, 20, 19, 18, 17, 16, 15)
    println(reverse(arrayNumList))

}

fun reverse (arrayNum: ArrayList<Int>): ArrayList<Int> {
    val result: ArrayList<Int> = arrayListOf()
    for (i: Int in arrayNum.size - 1 downTo  0) {
        result.add (arrayNum[i])
    }
    return result
}