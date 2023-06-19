class Recipe(var name:String)
{

}
fun main(args: Array<String>) {
    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quiona Salad")
    val r3 = Recipe("Thai curry")
    val recipeMap = mapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    val recipeToCheck = Recipe("Chicken Soup")
    if (recipeMap.containsValue(recipeToCheck)) {
        println("true")
    }

    if (recipeMap.containsKey("Recipe1")) {
        val recipe = recipeMap.getValue("Recipe1")
        println("Successful")
    }

    for ((key, value) in recipeMap) {
        println("key is $key, value is $value")
    }

    val mRecipeMap = mutableMapOf<String, Recipe>("Recipe1" to r1, "Recipe2" to r2)
    mRecipeMap.put("Recipe3", r3)
    println(mRecipeMap)

    val r4 = Recipe("Jambalaya")
    val r5  = Recipe("Sausage Rolls")
    val recipeToAdd = mapOf("Recipe4" to r4,"Recipe5" to r5)
    mRecipeMap.putAll(recipeToAdd)
    println(mRecipeMap)

    mRecipeMap.remove("Recipe1")
    val recipeToRemove = Recipe("Quiona Salad")
    mRecipeMap.remove("Recipe2",recipeToRemove)
    println(mRecipeMap)

    val recipeEntries = mRecipeMap.entries
    println(recipeEntries)

    if(mRecipeMap.size > mRecipeMap.values.toSet().size)
    {
        println("mRecipeMap has duplicate values")
    }
    else{
        println("Contains no duplicates")
    }

    mRecipeMap.clear()
    println(mRecipeMap)

    val x:Set<Int> = setOf(1,2,3)
    val y:Set<Int> = x
    println("y is : $y")
}