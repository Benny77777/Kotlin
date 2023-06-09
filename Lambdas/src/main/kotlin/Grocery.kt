//import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.search

data class Grocery(val name: String, val category: String,
                   val unit: String, val unitPrice: Double)
fun main(args: Array<String>) {
val groceries = listOf(Grocery("Tomatoes", "Vegetable", "lb", 3.0),
Grocery("Mushrooms", "Vegetable", "lb", 4.0),
Grocery("Bagels", "Bakery", "Pack", 1.5),
Grocery("Olive oil", "Pantry", "Bottle", 6.0),
Grocery("Ice cream", "Frozen", "Pack", 3.0))
println("Expensive ingredients:")
    search(groceries) {i: Grocery -> i.unitPrice > 5.0}
println("All vegetables:")
search(groceries) {i: Grocery -> i.category == "Vegetable"}
println("All packs:")
search(groceries) {i: Grocery -> i.unit == "Pack"}
}

fun search(groceries: List<Grocery>, function: (Grocery) -> Boolean) {
}
