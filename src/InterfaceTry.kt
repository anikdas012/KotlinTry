abstract class View {       //This is an Abstract class
    abstract var viewName: String
    abstract fun printDetails()
}

open class Button(var name: String, override var viewName: String) : View() {      //This is a Normal class inheriting a Abstract class
    override fun printDetails() {
        println("In TouchButton class name is $name and View class viewName is $viewName")
    }

    init {
        println("in Init of Button")
        printDetails()
    }
}

interface ClickListiner {   //This is an Interface
    fun onClick()
}

class TouchButton(var n: String, var vN: String) : Button(n, vN), ClickListiner {
    init {
        println("in Init of TouchButton")
        onClick()
    }

    override fun onClick() {
        this.printDetails()
    }

    override fun printDetails() {
        println("Clicked on TouchButton")
    }
}