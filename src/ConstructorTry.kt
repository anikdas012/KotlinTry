
fun main(args: Array<String>) {
    var student = Student("Anik", 14301002, "CSE")

    println("Student id is ${student.id} and subject is ${student.subject}")
}

class Student(var name: String) {

    var id: Int = -1
    var subject: String? = null

    init {
        println("Student name is $name and id is $id and subject is $subject")
    }

    constructor(name: String, id: Int): this(name) {
//        Secondary Constructor's body is always called after init block
        this.id = id
    }

    constructor(name: String, id: Int, subject: String): this(name) {
        this.id = id
        this.subject = subject
    }
}