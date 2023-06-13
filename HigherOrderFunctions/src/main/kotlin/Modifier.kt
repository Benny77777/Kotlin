    open class Parent public constructor()
    {
        var a = 1
        private var b = 2//As b is private, it can only be used inside this class. it can't be seen by any subclass of the parent
        protected open var c = 3
        internal var d = 4
    }

    class Child:Parent()//the child class can see a and c and can also access d property if the parent and child classes are defined in thesame module
    {
    override var c = 6//also becomes protected
    }

fun main(args: Array<String>) {
}