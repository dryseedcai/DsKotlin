package com.dryseed.chapter3

/**
 * Created by benny on 3/9/17.
 */

class X

class A{
    var b = 0
        get() {
            println("some one tries to get b")
            return field
        }
        set(value) {
            println("some one tries to set b")
            field = value
        }

    lateinit var c: String
    lateinit var d: X
    val e: X by lazy {
        println("init X")
        X()
    }

    var cc: String? = null
}

fun main(args: Array<String>) {
    /*
        log:
            start
            init a
            some one tries to get b
            0
            init X
            com.dryseed.chapter3.X@31befd9f
            com.dryseed.chapter3.X@1c20c684
     */
    println("start")
    val a = A()
    println("init a")
    println(a.b)
    println(a.e)

    a.d = X()
    println(a.d)

    println(a.c) //crash

    println(a.cc?.length)
}