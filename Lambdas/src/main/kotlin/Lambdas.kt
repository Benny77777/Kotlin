fun main(args: Array<String>) {
    /*var addFive = { x: Int -> x + 5 }
    println("Pass 6 to addFive: ${addFive(6)}")
    val addInts = {x:Int,y:Int ->x + y}
    val result = addInts.invoke(6,7)
    println("Pass 6 and 7 to addInts:${result}")

    val intLambda:(Int,Int)->Int = {x,y->x+y}
    println("Pass 10 and 11 to int lambda: ${intLambda(10,11)}")

    val addSeven:(Int)->Int = {it + 7}
    println("Pass 12 to addSeven: ${addSeven(12)}")

    val myLambda:()->Unit = {println("Hello!")}
    myLambda()*/
    convert1(20.0){it * 1.8 + 32 }
    convertFive1 { it * 1.8 + 32 }
}
    fun convertFive1(converter:(Int)->Double) :Double{
        var result1 = converter(5)
        println(message = "5 is converted to $result1")
        return result1
    }
fun convert1(x:Double,converter:(Double)->Double): Double {
    var result = converter(x)
    println("$x is converted to $result")
    return result
}