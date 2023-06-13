package com.hfkotlin.mypackage//This shows that we are using the class Duck which we created in the package com.hfkotlin.mypackage
object DuckManager {
    val allDucks = mutableListOf<Duck>()
    fun herdDucks(): String
    {
        return "This is the code for herdDucks"
    }
}
fun main(args: Array<String>) {
    println(DuckManager.herdDucks())
    val newDuck = Duck.DuckFactory.create()
    val newDuck1 = Duck1.create()
    val x = Duck1.Companion
    println(x)
}