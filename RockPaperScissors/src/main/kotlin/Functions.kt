fun main(args: Array<String>) {
    val a: Int = 9
    val b: Int = 6
    var maxValue = max(a,b)
    println(maxValue)
    println(max(3,8))
}
fun max(a:Int,b:Int) :Int{
    var max = if (a > b) a else b
    return max
}
fun max(x: Long,y:Long) :Long = if (x > y) x else y