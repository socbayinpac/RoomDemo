package com.example.roomdemo.database

import androidx.room.*

@Dao
interface AppDao {

    // các hàm khác truy vấn thì phải suspend

    @Insert(onConflict = OnConflictStrategy.IGNORE) // khi trung thi bo qua
     suspend fun addStudent(student: Student)

    @Update
    suspend fun updateStudent(student: Student) // update dựa theo primary key

    @Delete
    suspend fun deleteStudent(student: Student) // delete theo primary key

    @Query("select * from Student")
    fun getAllStudent(): List<Student> // lay tat ca student

    @Query("select * from Student where name = :name")
    fun getStudentByName(name: String): List<Student> // lay tat ca student va ten trung voi tham so


    @Transaction // buoc phai co, noi sau
    @Query("select * from Teacher")
    fun getTeacherWithStudentList(): List<TeacherWithStudentList> // lay tat ca giao vien kèm theo ds học sinh của giáo viên
}