fun main(args: Array<String>) {
    var x: Int
    for (x in 1..10) println(x)
    for (x in 1 until 10) println(x)
    for (x in 15 downTo 1) println(x)
    for (x in 1..10 step 2) println(x)

    var options = arrayOf("ben","jay","josh")
    for(items in options)println(items)
    for((index,item) in options.withIndex())println("Index $index has item $item")
}