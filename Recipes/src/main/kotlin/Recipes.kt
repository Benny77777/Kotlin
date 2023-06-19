data class Recipe(val title:String,
                  val mainIngredient:String,
                  val isVegeterian:Boolean = false,
                  val difficulty:String = "Easy")
{
}

class Mushroom1(val size :Int,val isMagic:Boolean)
{
    constructor(isMagic_param:Boolean):this(0,isMagic_param)

}

fun findRecipes1(title:String = "",
                    Ingredient:String = "",
                    isVegeterian:Boolean = false,
                    difficuly:String = ""):Array<Recipe>{

        return arrayOf(Recipe(title,Ingredient,isVegeterian,difficuly))
    }

fun addNumbers(a:Int,b:Int) :Int
{
    println("the sum of $a and $b is ")
    return a+b
}

fun addNumbers(a:Double,b:Double) :Double
{
    println("the sum of $a and $b is ")
    return a+b
}
fun main(args: Array<String>) {
    val r1 = Recipe("Thai curry","Chicken")
    val r2 = Recipe(title = "Thai curry",mainIngredient = "Chicken")

    val r3 = r1.copy(title = "Chicken Bhuna")

    println("r1 hashcode:${r1.hashCode()}")
    println("r2 hashcode:${r2.hashCode()}")
    println("r3 hashcode:${r3.hashCode()}")
    println("r1 toString:$r1")
    println("r1 == r2? ${r1 == r2}")
    println("r1 === r2? ${r1 === r2}")
    println("r1 == r3? ${r1 == r3}")
    val (title,mainIngredient,vegeterian,difficulty) = r1
    println("title is $title and vegeterian is $vegeterian")

    val m = Mushroom1(6,false)
    println("m size is ${m.size} and m magic is ${m.isMagic}")
    val m1 = Mushroom1(true)
    println("m1 size is ${m1.size} and the m1 magic is ${m1.isMagic}")
    println(addNumbers(2,5))
    println(addNumbers(1.4,4.2))
}