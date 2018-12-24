import java.lang.IllegalArgumentException
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


//    Functions tutorial
    fun add(num1: Int, num2: Int): Int = num1 + num2
    println("5 + 4 = ${add(5,4)}")

    fun subtract(num1: Int = 1, num2: Int = 1) = num1 - num2
    println("5 - 4 = ${subtract(5,4)}")

    println("4 - 6 = ${subtract(num2 = 6, num1 = 4)} ")

    fun sayHello(name: String): Unit = println("Hello $name")

    sayHello("Paul")

    val (two, three) = nextTwo(1)
    println("1 $two $three")

    println("Sum = ${getSum(1,2,3,4,5)}")

    val multiply = {num1: Int, num2: Int -> num1 * num2}

    println("5 * 3 = ${multiply(5,3)}")

    println("5! = ${fact(5)}")

    val numList = 1..20
    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach { n -> println(n) }

    val mult3 = makeMathFunc(3)
    println("5 *3 = ${mult3(5)}")

    val multiply2 = {num1: Int -> num1 * 2}
    val numList2 = arrayOf(1,2,3,4,5)
    mathOnList(numList2, multiply2)
    println("---------------------------------------------------")


//    Collection operators
    val numList3 = 1..20
    val listSum = numList3.reduce { x, y -> x + y }
    println("Reduce Sum: $listSum")

    val listSum2 = numList3.fold(5) {x, y -> x+y }
    println("Fold Sum: $listSum2")

    println("Evens: ${numList3.any{ it % 2 == 0}}")
    println("Evens: ${numList3.all { it % 2 ==0 }}")

    val big3 = numList3.filter { it > 3 }
    big3.forEach { n -> println(">3: $n") }

    val times7 = numList3.map { it * 7 }
    times7.forEach { n -> println("*7: $n") }
    println("---------------------------------------------------")


//    Exception handling
    val divisor = 1
    try {
        if (divisor == 0) {
            throw IllegalArgumentException("Can't Divide by Zero")
        } else {
            println("5 / $divisor = ${5/divisor}")
        }
    } catch (e: IllegalArgumentException) {
        println("${e.message}")
    }
    println("---------------------------------------------------")


//    List
    var list1: MutableList<Int> = mutableListOf(1,2,3,4,5)
    val list2: List<Int> = listOf(1,2,3)
    list1.add(6)
    println("1st: ${list1.first()}")
    println("last: ${list1.last()}")
    println("2nd: ${list1[2]}")
    var list3 = list1.subList(0, 3)
    println("Length: ${list1.size}")
    list3.clear()
    list1.remove(1)
    list1.removeAt(1)
    list1[1] = 10
    list1.forEach { n -> println("Mutable List: $n")}
    println("---------------------------------------------------")


//    Maps
    val map = mutableMapOf<Int, Any?>()
    val map2 = mutableMapOf(1 to "Doug", 2 to 25)
    map[1] = "Derek"
    map[2] = 42
    println("Map Size: ${map.size}")
    map.put(3, "Pittsburgh")
    map.remove(2)
    for ((x,y) in map) {
        println("Key: $x Value: $y")
    }
    println("---------------------------------------------------")


//    Classes
    val bowser = Animal("Bowers", 20.0, 13.5)
    bowser.getInfo()
}




fun nextTwo(num: Int): Pair<Int, Int>{
    return Pair(num+1, num+2)
}

fun getSum(vararg nums: Int): Int{
    var sum = 0
    nums.forEach { n -> sum += n }
    return sum
}

fun fact(x: Int): Int {
    tailrec fun  factTail (y: Int, z: Int): Int {
        if (y == 0) return z
        else return factTail(y - 1, y * z)
    }
    return factTail(x, 1)
}

fun makeMathFunc(num1: Int): (Int) ->Int = {num2 -> num1 * num2}

fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int) {
    for (num in numList) {
        println("MathOnList ${myFunc(num)}")
    }
}




open class Animal(val name: String,
                  var height: Double,
                  var weight: Double) {
    init {
        val regex = Regex(".*\\d+.*")
        require(!name.matches(regex)) {"Animal name Can't Contain Numbers"}
        require(height > 0) {"Height must be Greater then 0"}
        require(weight > 0){"Weight must be Greater then 0"}
    }

    open fun getInfo(): Unit {
        println("$name is $height tall and weights $weight")
    }
}