typealias DoubleConversion = (Double)->Double
fun convert2(x:Double,converter:DoubleConversion): Double {
    var result = converter(x)
    println("$x is converted to $result")
    return result
}
fun getCoversionLambda2(str:String): DoubleConversion {
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

fun combine1(Lambda1:DoubleConversion,Lambda2:DoubleConversion):DoubleConversion
{
    return {x:Double->Lambda2(Lambda1(x))}
}
fun main(args: Array<String>) {
    println("conversion of 2.5kg to pounds is ${getCoversionLambda2("kgsToPounds")}")
     var pounds = getCoversionLambda("kgsToPounds");{2.5}
    //val fahrenheit1 = convert(20.0,pounds)

    var kgsToPoundsLambda = getCoversionLambda2("kgsToPounds")
    var poundsToUsTonsLambda = getCoversionLambda2("poundsToUsTons")

    var kgsToUSTonsLambda = combine(kgsToPoundsLambda,poundsToUsTonsLambda)
     var value = 17.4
    println("value in kgs is ${convert2(value,kgsToUSTonsLambda)} US tons")
}