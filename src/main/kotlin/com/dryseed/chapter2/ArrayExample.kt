package net.println.kotlin.chapter2


/**
 * Created by benny on 2/26/17.
 */
val arrayOfInt: IntArray = intArrayOf(1, 3, 5, 7)
val arrayOfChar: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val arrayOfString: Array<String> = arrayOf("我", "是", "码农")

fun main(args: Array<String>) {
    /*
        4
        1
        3
        5
        7
        H, e, l, l, o, W, o, r, l, d
        [3, 5, 7]
        码农
     */
    println(arrayOfInt.size)
    for (int in arrayOfInt) {
        println(int)
    }

    println(arrayOfChar.joinToString())
    println(arrayOfInt.slice(1..3))
    println(arrayOfString[2])
}