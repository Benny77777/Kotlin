abstract class Animals2 {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
     val hunger  = 10
    abstract fun makeNoise()
    abstract fun eat()
     open fun roam()
    {
        println("The animal is roaming")
    }
      fun sleep()
    {
        println("The animal is sleeping")
    }
}

class Hippo2: Animals() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"
    override fun makeNoise() {
        println("Grunt! Grunt!")
    }
    override fun eat() {
        println("The Hippo is eating $food")
}
}

    abstract class canine2(): Animals()
    {
        override fun roam() {
            println("The canine is roaming")
        }

    }

    class wolf2:canine()
    {
        override val image = "wolf.jpg"
        override val food = "Meat"
        override val habitat = "Forest"

        override fun makeNoise() {
            println("Hooooo!")
        }

        override fun eat() {
            println("The wolf is eating $food")
        }
    }
class Vet2 {
    fun giveShot(animals: Animals) {
        //code to do something medical
        animals.makeNoise()
    }
}

fun main(args: Array<String>) {
    val animals = arrayOf(Hippo(),wolf())
    for(item in animals)
    {
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val w = wolf()
    val h = Hippo()
    vet.giveShot(w)//vet.giveShot(w)
    vet.giveShot(h)
}