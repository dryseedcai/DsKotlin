package com.dryseed.chapter4

/**
 * @author caiminming
 *
 * 如果需要在getter和setter中访问这个属性自身的值，它需要创建一个 backing
 * field 。可以使用 field 这个预留字段来访问，它会被编译器找到正在使用的并
 * 自动创建。需要注意的是，如果我们直接调用了属性，那我们会使用setter和getter
 * 而不是直接访问这个属性。 backing field 只能在属性访问器内访问。
 */
class Property {
    class Person {
        var name: String = ""
            get() = field.toUpperCase()
            set(value) {
                field = "Name : $value"
            }
    }

    fun test() {
        val person = Person()
        person.name = "dryseed"
        val name = person.name
        System.out.println(name)
    }
}

fun main(args: Array<String>) {
    val property = Property()
    property.test()
}

