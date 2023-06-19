fun main(args: Array<String>) {
    val shopping = listOf("Tea","Coffee","Milk")
    val shopping1:List<String>
    shopping1 = listOf("Tea","Coffee","Eggs") //explicitly
    if(shopping1.size > 0)
    {
        println(shopping1.get(0))
    }
    for(items in shopping1) println(items)
    if(shopping1.contains("Milk"))
    {
        println(shopping1.indexOf("Milk"))
    }
    val mShopping = mutableListOf("Tea","Eggs")
    mShopping.add("Milk")
    mShopping.add(0,"Cheese")
    println(mShopping)

    if(mShopping.contains("Milk"))
    {
        mShopping.remove("Milk")
    }
    if (mShopping.size > 1)
    {
        mShopping.removeAt(1)
    }
    println(mShopping)


    if(mShopping.size > 0)
    {
        mShopping.set(0,"Beef")
    }
    println(mShopping)

    mShopping.sort()
    println(mShopping)
    mShopping.reverse()
    println(mShopping)
    mShopping.shuffle()
    println(mShopping)

    val shoppingSet = mShopping.toSet()
    println("shoppingSet: $shoppingSet")
    val shoppingCopy = mShopping.toList()
    println(shoppingCopy)

    val toAdd = listOf("Cookies","Sugar")
    mShopping.addAll(toAdd)
    println(mShopping)
    val toRemove = listOf("Milk","Sugar")
    mShopping.removeAll(toRemove)
    println(mShopping)

    if(mShopping.size > mShopping.toSet().size)
    {
        println("mShopping has duplicate values")
    }
    else{
        println("mShopping doesn't contain duplicate values")
    }
    val toRetain = listOf("Milk","Sugar")
    mShopping.retainAll(toRetain)
    println(mShopping)
    mShopping.clear()
    println(mShopping)
}
