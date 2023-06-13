class Outer {
    val x = "This is an outer class"
    class Nested
    {
        val y = "This is a nested class"
        fun myFun() = "This is a nested function"
    }
    inner class Inner
    {
        val y = "This is an inner class"
        fun myFun() = "This is a nested function"
        fun getX() = "The value of x is: $x"
    }
    var myInner = Inner1()
    inner class Inner1
    {
        val x = "This is another way of doing this"
    }
}
fun main(args: Array<String>) {
    val nested = Outer.Nested()
    println(nested.y)
    println(nested.myFun())

    val inner = Outer().Inner()
    println(inner.y)
    println(inner.myFun())
    println(inner.getX())

    val inner1 = Outer().myInner
    println(inner1.x)
}