package com.example.roomdemo.database

import androidx.room.Embedded
import androidx.room.Relation

// data class chua du lieu truy van
// sql bth khong dung, chi co trong huong doi tuong dung, t se noi lai sau
data class TeacherWithStudentList(
    @Embedded val teacher: Teacher,
    @Relation(parentColumn = "id", entityColumn = "teacherID")
    val studentList: List<Student>
)
