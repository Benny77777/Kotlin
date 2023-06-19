
import kotlin.IllegalArgumentException
fun main(args: Array<String>) {
    myFunction()
    setWorkRatePercentage(10)
}
fun myFunction()
{
    try{
        println("This is the try block")
    }
    catch (e:Exception)
    {
        println("Any exception code goes here")
    }
    finally{
        println("This code must get executed")
    }
}

fun setWorkRatePercentage(x: Int)
{
    if(x !in 0..100)
    {
        throw IllegalArgumentException("Percentage is not in range 0..100: $x")
    }
    try
    {
        setWorkRatePercentage(110)
    }
    catch(e:IllegalArgumentException)
    {
        //code goes here
    }
    finally{
        println("The last code goes here")
    }
}