data class Grocery1(val name: String, val category: String,
val unit: String, val unitPrice: Double,val quantity:Double)
fun main(args: Array<String>) {
val groceries = listOf(Grocery("Tomatoes", "Vegetable", "lb", 3.0,4.2),
Grocery("Mushrooms", "Vegetable", "lb", 4.0,5.2),
Grocery("Bagels", "Bakery", "Pack", 1.5,5.9),
Grocery("Olive oil", "Pantry", "Bottle", 6.0,3.2),
Grocery("Ice cream", "Frozen", "Pack", 3.0,2.1))
println("Expensive ingredients:")

    val ints = listOf<Int>(1,2,3,4)
    val maxint = ints.max()
    println(maxint)

    val highestUnitPrice = groceries.maxBy { it.unitPrice*5 }
    println("highestUnitPrice: $highestUnitPrice")
    val lowestUnitPrice = groceries.minBy { it.unitPrice }
    println("lowestUnitPrice: $lowestUnitPrice")
    val sumQuantity:Double = groceries.sumByDouble { it.quantity }
    println("sumQuantity:$sumQuantity")
    val totalPrice = groceries.sumByDouble { it.quantity * it.unitPrice }
    println("totalPrice:$totalPrice")

    val vegetable  = groceries.filter { it.category == "Vegetable" }
    println(vegetable)
    val notFrozen = groceries.filterNot { it.category == "Frozen" }
    println("notFrozen:$notFrozen")
    val instance = groceries.filterIsInstance<Grocery>()
    println("instance:$instance")
    val untiPriceOver3 = groceries.filter { it.unitPrice > 3 }
    println("untiPriceOver3:$untiPriceOver3")

    val doubleInts = ints.map { it*2 }
    println("doubleInts:$doubleInts")
    val groceryNames = groceries.map { it.name }
    println("groceryNames:$groceryNames")
    val halfunitPrice = groceries.map { it.unitPrice*0.5 }
    println("halfunitPrice:$halfunitPrice")
    val newPrice = groceries.filter { it.unitPrice>3 }.map { it.unitPrice*2 }
    println("newPrice:$newPrice")

    for(item in groceries)
    {
        println(item.name)
    }
    val forEach = groceries.forEach { println(it.name) }
    println(forEach)
    val forEach1 = groceries.filter { it.unitPrice > 3 }.forEach { println(it.name) }
    println(forEach1)

    var itemNames = ""
    for(item in groceries)
    {
        itemNames+="${item.name}"
    }
    println(itemNames)

    val itemNames1 = groceries.forEach { {itemNames+= "${it.name}"} }
    println(itemNames1)

    val groupByCategory = groceries.groupBy { it.category }
    println("groupByCategory:$groupByCategory")

    groceries.groupBy { it.category }.forEach { println(it.key)
    it.value.forEach { println(" ${it.name}") }}

    val sumOfInts = ints.fold(0){runningSum,item -> runningSum+item}
    println(sumOfInts)

    val productOfInts = ints.fold(1){runningProduct,item -> runningProduct*item}
    println(productOfInts)
    val string = groceries.fold(""){string,item->string + "${item.name}"}
    println(string)
    val change = groceries.fold(50.0){change,item -> change-item.unitPrice*item.quantity}
    println(change)



}