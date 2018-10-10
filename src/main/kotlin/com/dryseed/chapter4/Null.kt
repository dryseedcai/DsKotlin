package com.dryseed.chapter4

/**
 * @author caiminming
 */
class Null {
    /**
     * 指定一个变量是可null是通过在类型的最后增加一个问号。因为在Kotlin中一切都是
     * 对象（甚至是Java中原始数据类型），一切都是可null的。所以，当然我们可以有
     * 一个可null的integer
     */
    val a: Int? = null

    fun method(num: Int) {
        System.out.println(num)
    }

    fun test() {
        System.out.println("test")

        /**
         * 一个可nul类型，你在没有进行检查之前你是不能直接使用它。
         * 这个代码不能被编译：
         */
        val b: Null? = null
        //System.out.println(b.a)

        /**
         * 前一行代码标记为可null，然后编译器就会知道它，所以在你null检查之前你不能去
         * 使用它。还有一个特性是当我们检查了一个对象的可null性，之后这个对象就会自
         * 动转型成不可null类型，这就是Kotlin编译器的智能转换
         */
        if (b != null) {
            System.out.println(b.method(1))
        }

        /**
         * 这里我们使用了安全访问操作符( ? )。只有这个变量不是null的时候才会去执行前
         * 面的那行代码。否则，它不会做任何事情。
         */
        b?.method(2)

        /**
         * operator( ?: )
         */
        val c = b?.a ?: "Empty"
        System.out.println(c) //Empty

        /**
         * 可以使用 !! 操作符来强制编译器执行可null类型时跳过限制检查
         */
        //b!!.method(3) //KotlinNullPointerException
    }
}

fun main(args: Array<String>) {
    Null().test()
}