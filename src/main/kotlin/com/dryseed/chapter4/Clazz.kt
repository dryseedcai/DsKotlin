package com.dryseed.chapter4

/**
 * @author caiminming
 */
class Clazz(name: String) {
    /**
     * 构造函数的函数体
     */
    init {

    }
}

/**
 * 默认任何类都是基础继承自 Any （与java中的 Object 类似），但是我们可以继
 * 承其它类。所有的类默认都是不可继承的（final），所以我们只能继承那些明确声
 * 明 open 或者 abstract 的类
 */
open class Animal(name: String)

class Person(name: String) : Animal(name)

