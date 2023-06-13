data class Grocery(val name: String, val category: String,
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

    val highestUnitPrice = groceries.maxBy { it.unitPrice }
    println(highestUnitPrice)
    val lowestUnitPrice = groceries.minBy { it.unitPrice }
    println(lowestUnitPrice)
    //val sumQuantity:Double = groceries.sumBy { it.unitPrice } if only unit price is int
    val totalPrice = groceries.sumByDouble { it.quantity * it.unitPrice }
    println(totalPrice)
}