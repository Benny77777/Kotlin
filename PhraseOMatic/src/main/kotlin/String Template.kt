import kotlin.contracts.contract

fun main(args: Array<String>) {
    var x = 42
    var value = "The value of x is $x"
    println(value)
    var myArray = arrayOf(1, 2, 3)
    var arraySize = "myArray has ${myArray.size} items"
    var firstItem = "The first item is ${myArray[0]}"
    println(arraySize)
    println(firstItem)
    var result = "myArray is ${if (myArray.size > 10) "large" else "small"}"
    println(result)
}