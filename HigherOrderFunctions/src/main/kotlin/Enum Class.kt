enum class BandMember(val instrument:String)
{Jerry("Lead Guitar")
{
override fun sings() = "plaintively"
},
    Bobby("Rythm Guitar")
    {
    override fun sings() = "hoarsely"
    },
    Phil("Bass");
open fun sings() = "occasionally"}
/*enum class BandMember(val instrument:String)
{Jerry("Lead Guitar"),
    Bobby("Rythm Guitar"),
    Phil("Bass");
fun sings() = "occasionally"}*/
fun main(args: Array<String>) {
val selectedBandMember:BandMember = BandMember.Jerry
    println(selectedBandMember)
    println(selectedBandMember.instrument)
    println(selectedBandMember.sings())
}