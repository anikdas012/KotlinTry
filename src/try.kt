fun main(args: Array<String>) {
    println("Hello world")

//    Variable try
    val name = "Anik"
    var myAge = 22
    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Big Int: "+bigInt)
    println("Small Int: $smallInt")

    var dblNum1: Double = 1.1111111111111111
    var dblNum2: Double = 1.1111111111111111
    println("Sum: "+(dblNum1 + dblNum2))

    if (true is Boolean) {
        print("true is boolean \n")
    }
    var letterGrade: Char = 'A'
    println("A is a Char: ${letterGrade is Char}")


//    Casting try
    println("3.14 to Int: "+(3.14.toInt()))
    println("A to Int: ${'A'.toInt()}")
    println("65 to Char: "+ 65.toChar())
}