open class Animals {
    open val image = ""
    open val food = ""
    open val habitat = ""
     val hunger  = 10
    open fun makeNoise()
    {
        println("The animal is making noise")
    }
     open fun eat()
    {
        println("The animal is eating")
    }
     open fun roam()
    {
        println("The animal is roaming")
    }
    fun sleep()
    {
        println("The animal is sleeping")
    }
}

class Hippo: Animals() {
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

    open class canine(): Animals()
    {
        override fun roam() {
            println("The canine is roaming")
        }

    }

    class wolf:canine()
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
class Vet {
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