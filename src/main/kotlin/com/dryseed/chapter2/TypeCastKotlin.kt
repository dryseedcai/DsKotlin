package net.println.kotlin.chapter2

import com.dryseed.chapter2.Child
import com.dryseed.chapter2.Parent

/**
 * Created by benny on 2/26/17.
 */
fun main(args: Array<String>) {
//    val parent: Parent = Child();
//    if(parent is Child){
//        print(parent.name);
//    }

    val parent: Parent = Parent()
    //val child: Child? = parent as Child //如果转换异常，抛异常
    val child: Child? = parent as? Child //加了?表示：如果转换异常，返回null
    println(child)

    val string: String? = "Hello"
    if (string != null)
        println(string.length)


}