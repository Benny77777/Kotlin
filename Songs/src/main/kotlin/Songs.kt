class Songs (val title: String,
             val artiste: String){
    fun play()
    {
        println("Playing the song $title by $artiste")
    }
    fun stop()
    {
        println("Stopped playing $title")
    }
}

fun main(args: Array<String>) {
    var songOne = Songs("The Mesopotemians","They Might be Giants")
    var songTwo = Songs("Going Underground","The Jam")
    var songThree = Songs("Make Me Smile","Steve Harley")
    songTwo.play()
    songTwo.stop()
    songThree.play()
    songThree.stop()
}
