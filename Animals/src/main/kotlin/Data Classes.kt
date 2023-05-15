data class Recipe(val title:String,val isVeg:Boolean)
{

}
fun main(args: Array<String>) {
    var r1 = Recipe("Chicken Bhuna",false)
    var r2 = Recipe("Chicken Bhuna",false)
    println(r1.equals(r2))
    println(r1.hashCode())
    println(r2.hashCode())
    println(r1.toString())
    println(r2.toString())
    var r3 = r1.copy(isVeg = true)
    println(r3.toString())
    val title = r1.component1()
    val isVeg = r1.component2()
    println("($title,$isVeg)")

    val(title1,isVeg1) = r1
    println("($title1,$isVeg1)")
    println(r1 === r2)
    println("thanks")

}
