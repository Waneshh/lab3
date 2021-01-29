package com.example.laba2_students

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onBtnClick(view: View) {
//        val textStudents = Student.students
//            .filter { it.groupNumber == groupNumber }
//            .map { it.name + "\n" }
//            .reduce { result, value -> result + value }
//        val textView = findViewById<TextView>(R.id.text)
//        textView.text = textStudents
        val spinner = findViewById<Spinner>(R.id.spinner)
        val groupNumber = spinner.selectedItem as String

        val intent = Intent(this, StudentListActivity::class.java)
        intent.putExtra(StudentListActivity.groupNumber, groupNumber)
        startActivity(intent)
    }
}