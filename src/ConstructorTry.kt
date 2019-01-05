
fun main(args: Array<String>) {
    var student = Student("Anik")
}

class Student(var name: String) {
    init {
        println("Student name is $name")
    }
}