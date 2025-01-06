package com.alvin.belajar.compose.modul.room.repository

import com.alvin.belajar.compose.modul.room.dao.PersonDao

class PersonRepository constructor(
    private val personDao: PersonDao
) {
    val readAll = personDao.readAll()
}