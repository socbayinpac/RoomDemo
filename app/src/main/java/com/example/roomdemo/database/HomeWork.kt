package com.example.roomdemo.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class HomeWork(@PrimaryKey(autoGenerate = true) val id: Int,
                    @ColumnInfo( name = "subject")val subject: String,
                    var content: String,
                    var studentId: Int)