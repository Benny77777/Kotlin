fun myFun()
{
    listOf<String>("A","B","C","D").forEach { if (it == "C") return println(it) }
    println("finished myFum()")
}
fun myFun1()
{
    listOf<String>("A","B","C","D").forEach myloop@{ if (it == "C")return@myloop println(it) }
    println("finished myFun()")
}
fun main(args: Array<String>) {
    //use of Labels
    var x = 0
    var y = 0
    myloop@ while(x<20)
    {
        while (y<20) {
            x++
            break@myloop
        }
    }

    println(myFun())
    println(myFun1())
}