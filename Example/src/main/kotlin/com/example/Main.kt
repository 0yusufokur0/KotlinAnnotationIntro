package com.example

import com.example.processor.MyConstant

fun main() {

    println(DoWork.Hello)
}

@MyConstant(propName = "Hello", propValue = "world")
fun doWork() {

}
