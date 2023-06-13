fun main(args: Array<String>) {
    println("Hello World!")

    val x = 20
    val y = 2.3
    var l4 = {y:Int->(y/2).toDouble()}
    println(l4(x))
    l4 = {it+6.3}
    println(l4(7))

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}