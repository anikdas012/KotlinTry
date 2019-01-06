abstract class View {       //This is a Abstract class
    abstract var viewName: String
    abstract fun printDetails()
}

open class TouchButton(var name: String, override var viewName: String) : View() {      //This is a Normal class inheriting a Abstract class
    override fun printDetails() {
        println("In TouchButton class name is $name and View class viewName is $viewName")
    }

    init {
        printDetails()
    }
}

interface ClickListiner {   //This is an Interface
    fun onClick()
}