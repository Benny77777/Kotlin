fun<T> valueToList(vararg vals:T):MutableList<T>
{
    val list:MutableList<T> = mutableListOf()
    for(i in vals)
    {
        list.add(i)
    }
    return list
}
fun main(args: Array<String>) {
   val mList = valueToList(9,2,3,6)
    println(mList)
    val myArray = arrayOf(1,2,3,4,5)
    val mList1 = valueToList(*myArray)
    val mList2 = valueToList(0,*myArray,6,7)
    println(mList1)
    println(mList2)
}