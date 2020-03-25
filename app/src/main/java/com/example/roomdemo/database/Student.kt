package com.example.roomdemo.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Student(@PrimaryKey(autoGenerate = true)val id: Int = 0,
                   var age: Int,
                   var name: String,
                   val teacherID: Int)