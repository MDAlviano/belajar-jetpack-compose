package com.alvin.belajar.compose.dao

import androidx.room.Dao
import androidx.room.Query
import com.alvin.belajar.compose.model.Person
import kotlinx.coroutines.flow.Flow

@Dao
interface PersonDao {

    @Query("SELECT * FROM person")
    fun readAll(): Flow<List<Person>>

}