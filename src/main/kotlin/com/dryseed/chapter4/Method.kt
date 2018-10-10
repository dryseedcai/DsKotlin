package com.dryseed.chapter4

/**
 * @author caiminming
 */
class Method {
    /**
     * 函数（我们Java中的方法）可以使用 fun 关键字就可以定义
     * 如果你没有指定它的返回值，它就会返回 Unit ，与Java中的 void 类似，但
     * 是 Unit 是一个真正的对象。你当然也可以指定任何其它的返回类型
     */
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * 然而如果返回的结果可以使用一个表达式计算出来，你可以不使用括号而是使用等号：
     * 我们可以给参数指定一个默认值使得它们变得可选，
     */
    fun del(a: Int, b: Int = 3): Int = a - b

    /**
     * 可以使用参数名字来调用，这表示你可以通过在值
     * 前写明参数名来传入你希望的参数
     */
    fun del(a: Int, b: Int, c: Float): Int {
        return a - b - c.toInt()
    }

    fun del(a: Int, c: Float): Int {
        return a - c.toInt()
    }

    fun callDel(): Int {
        return del(a = 10, c = 7f)
    }
}

