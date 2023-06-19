fun main(args: Array<String>) {
    val d = DrumKit(true,true)
    d.playTopHat()
    d.playSnare()
    d.hasSnare = false
     d.playTopHat()
    d.playSnare()
}

class DrumKit(var hasTopHat: Boolean,var hasSnare: Boolean)
{
    fun playTopHat()
    {
        if(hasTopHat) println("ding bing ba-da-bing!")
    }
    fun playSnare()
    {
        if (hasSnare) println("bang bang bang")
    }
}