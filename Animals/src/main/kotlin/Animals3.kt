abstract class Animals3:Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
     val hunger  = 10
    abstract fun makeNoise()
    abstract fun eat()
     override fun roam()
    {
        println("The animal is roaming")
    }
      fun sleep()
    {
        println("The animal is sleeping")
    }
}

interface Roamable {
    fun roam()
}

class Vehicle : Roamable {
    override fun roam() {
        println("The vehicle is roaming")
    }
}

class Hippo3: Animals3() {
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

    abstract class canine3(): Animals3()
    {
        override fun roam() {
            println("The canine is roaming")
        }

    }

    class wolf3:canine3()
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
class Vet3 {
    fun giveShot(animals: Animals3) {
        //code to do something medical
        animals.makeNoise()
    }
}

fun main(args: Array<String>) {
    val animals:Array<Animals3> = arrayOf(Hippo3(),wolf3())
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
    val roamables = arrayOf(Hippo3(),wolf3(),Vehicle())
    for (item in roamables)
    {
        item.roam()
        if(item is Animals3)
        {
            item.eat()
        }
    }
}