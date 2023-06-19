fun main(args: Array<String>) {
    {x:Int -> x+5}
    fun addFive(x: Int) = x + 5
    {x:Int,y:Int ->x + y}
    val x = {"Pow"}
    println(x.invoke())
    var addFive = {x:Int -> x+5}
    addFive = {y:Int -> 5+y}
    val addInts = {x:Int,y:Int ->x+y}
    val result = addInts.invoke(6,7)
    val result1 = addInts(6,14)
    println(result)
    println(result1)

    val add:(Int,Int)->Int
    add = {x:Int,y:Int -> x+y}
    //val greeting:() -> String
    val greeting:()-> String = {"Hello"}
    println(add.invoke(2,6))
    println(greeting.invoke())
    val addFive1:(Int)->Int = {x:Int->x+5}
    println(addFive.invoke(9))

    val myLambda:() -> Unit = {println("Hello! Hi! Bye! Bye!")}
    println(myLambda.invoke())
}