package com.alvin.belajar.compose.repository

import com.alvin.belajar.compose.model.Individual

class IndividualRepository {
    fun getAllData(): List<Individual> {
        return listOf(
            Individual(
                id = 0,
                firstName = "John",
                lastName = "Doe",
                age = 20
            ),
            Individual(
                id = 1,
                firstName = "Sergio",
                lastName = "Ramos",
                age = 43
            ),
            Individual(
                id = 2,
                firstName = "Cristiano",
                lastName = "Messi",
                age = 12
            ),
            Individual(
                id = 3,
                firstName = "Lionel",
                lastName = "Ronaldo",
                age = 54
            ),
            Individual(
                id = 4,
                firstName = "Antony",
                lastName = "Santos",
                age = 54
            ),
        )
    }
}