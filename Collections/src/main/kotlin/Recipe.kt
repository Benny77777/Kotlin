data class Recipe(var name:String)
{

}
fun main(args: Array<String>) {
var mShoppingList = mutableListOf("Tea","Eggs","Milk")
    println("mShoppingLIst originals: $mShoppingList")
    var extraShopping = listOf("Cookies","Sugar","Eggs")
    mShoppingList.addAll(extraShopping)
    println("mShoppingList items added: $mShoppingList")
    if(mShoppingList.contains("Tea"))
    {
        mShoppingList.set(mShoppingList.indexOf("Tea"),"Coffee")
    }
    mShoppingList.sort()
    println("mShoppingList sorted: $mShoppingList")

    mShoppingList.reverse()
    println("mShoppingList reversed: $mShoppingList")

    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")
    val moreShopping = setOf("Chives","Spinach","Milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added: $mShoppingSet")

    mShoppingList =mShoppingSet.toMutableList()
    println("mShoppingList new version: $mShoppingList")

     val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quiona Salad")
    val r3 = Recipe("Thai curry")
     val r4 = Recipe("Jambalaya")
    val r5  = Recipe("Sausage Rolls")
    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    println("mRecipeMapOriginal: $mRecipeMap")

    var recipeToAdd = mapOf("Recipe4" to r4,"Recipe5" to r5)
    mRecipeMap.putAll(recipeToAdd)
    println("mRecipeMapUpdated: $mRecipeMap")
    if(mRecipeMap.containsKey("Recipe1"))
    {
        println("Recipe1 is : ${mRecipeMap.getValue("Recipe1")}")
    }

}
