package com.alvin.belajar.compose.repository

import com.alvin.belajar.compose.dao.PersonDao

class PersonRepository constructor(
    private val personDao: PersonDao
) {
    val readAll = personDao.readAll()
}