class Mushroom(val size :Int,val isMagic:Boolean)
{
    constructor(isMagic_param:Boolean):this(0,isMagic_param)

}
fun findRecipes(title:String = "",
                    Ingredient:String = "",
                    isVegeterian:Boolean = false,
                    difficuly:String = ""):Array<Recipe>{

        return TODO("Provide the return value")
    }
fun main(args: Array<String>) {
    val m = Mushroom(true)
    val recipes = findRecipes(title ="Thai curry")//same as ("Thai curry")
   println(m.size)
}