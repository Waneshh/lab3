package com.example.laba2_students

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class StudentListActivity : AppCompatActivity() {
    companion object {
        const val groupNumber = "groupNumber"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)
        val intent = getIntent()
        val groupNumber = intent.getStringExtra(groupNumber)
        if (groupNumber != null) {
            val textStudents = Student.students
                .filter { it.groupNumber == groupNumber }
                .map { it.name + "\n" }
                .reduce { result, value -> result + value }
            val textView = findViewById<TextView>(R.id.text)
            textView.text = textStudents
        }
    }

    fun onSendButtonClick(view: View) {
        val textView = findViewById<TextView>(R.id.text)

        val intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_TEXT, textView.text.toString())
        intent.putExtra(Intent.EXTRA_SUBJECT, "Список студентів")
        startActivity(intent)
    }
}