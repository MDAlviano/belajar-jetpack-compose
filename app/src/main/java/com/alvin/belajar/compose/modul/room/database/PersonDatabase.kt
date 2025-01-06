package com.alvin.belajar.compose.modul.room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alvin.belajar.compose.modul.room.dao.PersonDao
import com.alvin.belajar.compose.modul.room.model.Person

@Database(entities = [Person::class], version = 1, exportSchema = true)
abstract class PersonDatabase: RoomDatabase() {
    abstract fun personDao(): PersonDao
}