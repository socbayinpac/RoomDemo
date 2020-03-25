package com.example.roomdemo.database

import androidx.room.Entity
import androidx.room.PrimaryKey

// khi sử dụng tự tăng primary key thì phải set mặc định (vd ở dưới set 0 )
@Entity(tableName = "teacher")
data class Teacher(@PrimaryKey(autoGenerate = true)var id: Int = 0,
                   var name: String,
                   var address: String)