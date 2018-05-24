package com.dryseed.chapter3

/**
 * Created by benny on 3/5/17.
 */
const val FINAL_HELLO_WORLD: String = "HelloWorld" //const val 编译期常量
var helloWorld: String = FINAL_HELLO_WORLD

val FINAL_HELLO_CHINA = "HelloChina" //final String类型 运行时常量

fun main(args: Array<String>) { // (Array<String>) -> Unit
    println(FINAL_HELLO_CHINA)

    checkArgs(args)
    val arg1 = args[0].toInt()
    val arg2 = args[1].toInt()
    println("111 : $arg1 + $arg2 = ${calSum(arg1, arg2)}")
    println("222 : $arg1 + $arg2 = ${sum(arg1, arg2)}")

    println(int2Long(3))
    println(sum(1, 3))
    println(sum.invoke(1, 3))

    println("The Start")
    args.forEach {
        println(it)
    }
    args.forEach(::println)
    /*args.forEach {
        if (it == "1") return //这里return了，因为是lambda表达式，后面的语句就不会执行了
        println(it)
    }*/
    args.forEach ForEach@{
        if(it == "1") return@ForEach //相当于continue
        println(it)
    }
    println("The End")

    println(sum)                            //Function2<java.lang.Integer, java.lang.Integer, java.lang.Integer>
    println(int2Long)                       //Function1<java.lang.Integer, java.lang.Long>
    println(::printUsage is () -> Unit)     //true
}

fun calSum(arg1: Int, arg2: Int): Int {
    return arg1 + arg2;
}

fun checkArgs(args: Array<String>) {
    if (args.size != 2) {
        printUsage()
        System.exit(-1)
    }
}

/**
 * () -> Unit
 */
fun printUsage() {
    println("请传入两个整型参数，例如 1 2") // (Any?) -> Unit
}


/**
 * 匿名函数
 * (Int) -> Long
 */
val int2Long = fun(x: Int): Long {
    return x.toLong()
}


/**
 * Lambda表达式
 * (Int, Int) -> Int
 */
val sum = { arg1: Int, arg2: Int ->
    println("333 : $arg1 + $arg2 = ${arg1 + arg2}")
    arg1 + arg2 //return最后一行的值
}

/**
 * Lambda表达式
 * () -> Unit
 */
val printlnHello = {
    println("Hello")
}


