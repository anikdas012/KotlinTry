import java.util.*

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
    println("---------------------------------------------------")


//    Ranges
    val oneTo10 = 1..10
    val alpha = "A".."Z"
    println("R in Alpha: ${"R" in alpha}")
    val tenTo1 = 10.downTo(1)
    val  twoTo20 = 2.rangeTo(20)
    val rng3 = oneTo10.step(3)
    for (x in rng3) println("rng3: $x")
    for (x in tenTo1.reversed()) println("Reverse: $x")
    println("---------------------------------------------------")


//    Conditions
    val  age = 8
    if (age < 5) {
        println("Go to Preschool")
    } else if (age == 5) {
        println("Go to Kindergarten")
    } else if ((age > 5) && (age <= 17)) {
        val grade = age - 5
        println("Go to Grade $grade")
    } else {
        println("Go to College")
    }

    when(age) {
        0,1,2,4 -> println("Go to Preschool")
        5 -> println("Got to Kindergarten")
        in 6..17 -> {
            val grade = age -5
            println("Go to Grade $grade")
        }
        else -> println("Go to College")
    }
    println("---------------------------------------------------")


//    Loops
    for (x in 1..10) {
        println("Loop: $x")
    }

    val rand = Random()
    val magicNum = rand.nextInt(50)+1
    var guess = 0
    while (magicNum != guess) {
        guess += 1
    }
    println("Magic Number was $guess")

    for (x in 1..20) {
        if (x%2 == 0) {
            continue
        }
        println("Odd: $x")
        if (x ==15){
            break
        }
    }

    var arr3: Array<Int> = arrayOf(3,6,9)
    for (i in arr3.indices){
        println("Mult 3: ${arr3[i]}")
    }
    for ((index, value) in arr3.withIndex()) {
        println("Index: $index Value: $value")
    }
    println("---------------------------------------------------")


    
}