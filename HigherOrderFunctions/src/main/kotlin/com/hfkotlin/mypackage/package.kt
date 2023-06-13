package com.hfkotlin.mypackage
class Duck//Public modifeir
{
    object DuckFactory{
        fun create(): Duck = Duck()
    }
}
class Duck1
{
    companion object{
        fun create(): Duck1 = Duck1()
    }
}
    private fun doStuff()
    {
    println("Hello")
    }