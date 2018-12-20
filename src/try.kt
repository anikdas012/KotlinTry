fun main(args: Array<String>) {
    println("Hello world")
    println("---------------------------------------------------")

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
    println("---------------------------------------------------")


//    Casting try
    println("3.14 to Int: "+(3.14.toInt()))
    println("A to Int: ${'A'.toInt()}")
    println("65 to Char: "+ 65.toChar())
    println("---------------------------------------------------")


//    String try
    val myName = "Anik Das"
    val longStr = """This is a
long string"""
    var fName: String = "Doug"
    var lName: String = "Smith"
    fName = "Sally"
    var fullName = fName + " "+ lName
    println("Name: $fullName")
    println("1 + 2 = ${1+2}")
    println("String Length: ${longStr.length}")
    var str1 = "A random string"
    var str2 = "a random string"
    println("Strings Equal: ${str1.equals(str2)}")
    println("Compare A to B: ${"A".compareTo("B")}")
    println("longStr: $longStr")
    println("2nd Index: ${str1.get(2)}")
    println("2nd Index: ${str1[2]}")
    println("Index 2-7: ${str1.subSequence(2,8)}")
    println("Contains random: ${str1.contains("random")}")
    println("---------------------------------------------------")


//    Array
    var myArray = arrayOf(1, 123, "Doung")
    println(myArray[2])
    myArray[1] = 3.14
    println("Array Length: ${myArray.size}")
    println("Doug in Array: ${myArray.contains("Doung")}")
    var partArray = myArray.copyOfRange(0,1)
    println("First: ${partArray.first()}")
    println("Doug Index: ${myArray.indexOf("Doung")}")

    var sqArray = Array(5, { x -> x * x })
    println("sqArray[2]: ${sqArray[2]}")
    var arr2: Array<Int> = arrayOf(1, 2, 3)
}