data class Student(val id:Int, val fullName:String, val grade:Double, )

val students = listOf<Student>(
    Student(223, "John", 140.0),
    Student(548, "Mark", 120.0),
    Student(342, "Natali", 150.0),
    Student(781, "Sara", 130.0)
)
fun main(args: Array<String>) {
    println("Please, Enter the student's ID")
    val id = readln().toInt()
    println( getStudentById(id))

    println("Please, Enter the student's name")
    val name= readln() // function which reads a line from the terminal and returns it as a String.
    println(searchInStudents(name)?:"the student is not found")

}

// In this step, you had to return the student from the students list and if not found, the program should return NPE
fun getStudentById(id:Int):Student{
    return  students.find { it.id==id }!!
}

// Next, you needed to create a function called searchInStudents with one string argument and return a nullable Student.
fun searchInStudents(name:String):Student?{
    return students.find { it.fullName.lowercase()==name.lowercase()}
}