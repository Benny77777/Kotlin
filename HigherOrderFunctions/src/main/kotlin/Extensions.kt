fun Double.toDollar(): String
{
    return "$$this"
}
fun Double.toHalfLength(): Double
{
    return this/2
}
fun main(args: Array<String>) {
val dbl = 14.25
    println(dbl.toDollar())
val length = 12.98
    println(length.toHalfLength())
}