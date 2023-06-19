fun main(args: Array<String>) {
var array = arrayOf(1,2,3)
    val nullArray:Array<String?>  = arrayOfNulls(2)
    println("The size of the array is $array.size")
    println("The reversed array is $array.reverse()")
    var isIn = array.contains(1)
    println(" $isIn is in the array")
    var sum = array.sum()
    println("The sum of elements in the array is $sum")
    var average = array.average()
    println("The average of elements in the array is $average")
    println(array.min())
    println(array.max())
}