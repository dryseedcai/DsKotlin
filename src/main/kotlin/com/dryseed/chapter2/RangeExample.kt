package com.dryseed.chapter2

/**
 * Created by benny on 2/26/17.
 */
val range: IntRange = 0..1024 // [0, 1024]
val range_exclusive: IntRange = 0 until 1024 // [0, 1024) = [0, 1023]

val emptyRange: IntRange = 0..-1

fun main(args: Array<String>) {
    println(emptyRange.isEmpty()) //true
    println(range.contains(50)) //true
    println(50 in range) //true

    for(i in range_exclusive){
        print("$i, ")
    }
}