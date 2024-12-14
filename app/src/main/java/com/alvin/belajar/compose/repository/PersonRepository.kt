package com.alvin.belajar.compose.repository

import com.alvin.belajar.compose.model.Person

class PersonRepository {
    fun getAllData(): List<Person> {
        return listOf(
            Person(
                id = 0,
                firstName = "John",
                lastName = "Doe",
                age = 20
            ),
            Person(
                id = 1,
                firstName = "Sergio",
                lastName = "Ramos",
                age = 43
            ),
            Person(
                id = 2,
                firstName = "Cristiano",
                lastName = "Messi",
                age = 12
            ),
            Person(
                id = 3,
                firstName = "Lionel",
                lastName = "Ronaldo",
                age = 54
            ),
            Person(
                id = 4,
                firstName = "Antony",
                lastName = "Santos",
                age = 54
            ),
        )
    }
}