class Duck(val height: Int? = null) {
    fun quack()
    {
        println("Quack! Quack!")
    }
}

class MyDucks(var myDucks:Array<Duck?>)
{
    fun quacks()
    {
        for(duck in myDucks)
        {
            duck?.let {
                it.quack()
            }
        }
    }
    fun totalDuckHeight():Int{
        var h:Int = 0
        for(duck in myDucks) {
            h += duck?.height ?: 0
        }
            return h
    }
}

fun main(args: Array<String>) {
}
