package com.alvin.belajar.compose.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "person")
data class Person(

    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val name: String,

    val age: Int

)
