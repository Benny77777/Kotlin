class Dog1 {
    infix fun bark(x:Int):String {
        for (i in 0 until 6)  println("Whoo!")
          return "The Dog has barked $x times"
    }
}
fun main(args: Array<String>) {
val bark = Dog1() bark 6
    println(bark)
}