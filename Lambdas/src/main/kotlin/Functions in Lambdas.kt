fun convert(x:Double,converter:(Double)->Double): Double {
    var result = converter(x)
    println("$x is converted to $result")
    return result
}
fun convertFive(converter:(Int)->Double):Double {
    var result1 = converter(5)
    println(message = "5 is converted to $result1")
    return result1
}

fun getCoversionLambda(str:String): (Double) -> Double {
    if (str == "centigrateToFahrenheit")
    {
        return {it*1.8+32}
    }
     else if (str == "kgsToPounds")
    {
        return {it*2.204623}
    }
     else if (str == "poundToUsTons")
    {
        return {it/2000.0}
    }
    else
    {
        return {it}
    }

}

fun combine(Lambda1:(Double)->Double,Lambda2:(Double)->Double):(Double)->Double
{
    return {x:Double->Lambda2(Lambda1(x))}
}
fun main(args: Array<String>) {
    val fahrenheit = convert(20.0,{c:Double->c*1.8+32})
    var Five = convertFive { it * 1.8 + 32 }
    var pounds = getCoversionLambda("kgsToPounds");{}
    val fahrenheit1 = convert(20.0,pounds)

    var kgsToPounds = {x:Double->x*2.204623}
    var poundsToUsTons = {x:Double->x/2000.0}

    var kgsToUSTons = combine(kgsToPounds,poundsToUsTons)
     var x = 1000.0
    val usTons = kgsToUSTons(x)
    println("The coversion of $x kgs to usTons is $usTons")
}