
fun main(args: Array<String>) {
    var student = Student("Anik", 14301002)

    println(student.id)
}

class Student(var name: String) {

    var id: Int = -1

    init {
        println("Student name is $name and id is $id")
    }

    constructor(name: String, id: Int): this(name) {
//        Secondary Constructor's body is always called after init block
        this.id = id
    }
}