inline fun convert(x:Double,converter:(Double)->Double): Double {
    var result = converter(x)
    println("$x is converted to $result")
    return result
}
fun main(args: Array<String>) {
val fahrenheit = convert(20.0,{c:Double->c*1.8+32})
}