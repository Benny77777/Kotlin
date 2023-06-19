fun main(args: Array<String>) {
var index = arrayOf(1,3,4,2)
    var Fruit = arrayOf("Apple","Banana","Cherry","Blueberry","Pomgrenate")
    var x = 0
    var y: Int
    while (x < 4)
    {
        y = index[x]
        println("Fruit[$y]  = ${Fruit[y]}")
        x = x + 1
    }
}