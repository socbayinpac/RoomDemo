package com.example.roomdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.roomdemo.database.AppDatabase
import com.example.roomdemo.database.Student
import com.example.roomdemo.database.TeacherWithStudentList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    lateinit var allStudent: List<Student>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
//        val returnData = listOf<TeacherWithStudentList>()
//        val studentList = returnData.get(0).studentList


        val database = AppDatabase.getInstance(this) // new ra database
        val dao = database.appDao() // tham chieu dao

        // add thử data
//        lifecycleScope.launch {
//            dao.addStudent(Student(name = "d",teacherID = 0,age = 12)) // do ham suspend nen can chay trong coroutine
//        }

        //  đọc thử data
            lifecycleScope.launch {
                withContext(Dispatchers.IO) {
                     allStudent = dao.getAllStudent()

                }
                Toast.makeText(this@MainActivity, allStudent[0].toString(),Toast.LENGTH_SHORT).show()

            }
    }
}
