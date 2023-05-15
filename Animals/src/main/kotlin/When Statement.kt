fun main(args: Array<String>) {
    println("Enter a value for x")
    var x = readln().toInt()
    when(x)
    {
        0 -> println("x is zero")
        1,2 -> println("x is 1 or 2")
        else ->
        {
            println("x is neither zero,1 nor 2")
            println("x is some other value")
        }
    }
}