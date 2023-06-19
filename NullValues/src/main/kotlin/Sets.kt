fun main(args: Array<String>) {
    val friendSet = setOf("Jim", "Sue", "Nick")
    val isFredGoing = friendSet.contains("Fred")
    for (item in friendSet) println(item)

    var a = "Sue"
    var b = a
    var set = setOf(a, b)

    var mfreindSet: MutableSet<String> = mutableSetOf("Jim", "Sue")
    mfreindSet.add("Nick")
    println(mfreindSet)
    mfreindSet.remove("Nick")
    println(mfreindSet)

    var toAdd = setOf("Joe", "Mia")
    mfreindSet.addAll(toAdd)
    println(mfreindSet)

    val freindSetCopy = mfreindSet.toSet()
    println(freindSetCopy)

    val freindList = mfreindSet.toSet()
    println(freindList)
}
