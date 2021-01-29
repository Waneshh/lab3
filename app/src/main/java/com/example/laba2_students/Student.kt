package com.example.laba2_students

data class Student(val name: String, val groupNumber: String) {
    companion object {
        val students = arrayListOf(Student("student1", "301"),
            Student("student2", "301"),
            Student("Иван Раздобудько", "302"),
            Student("student3", "302"),
            Student("student4", "303"),
            Student("student5", "303"))
    }
}