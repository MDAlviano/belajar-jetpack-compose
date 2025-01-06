package com.alvin.belajar.compose.modul.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.alvin.belajar.compose.modul.navigation.AUTHENTICATION_ROUTE
import com.alvin.belajar.compose.modul.navigation.Screen
import com.alvin.belajar.compose.modul.navigation.screens.LoginScreen
import com.alvin.belajar.compose.modul.navigation.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Login.route,
        route = AUTHENTICATION_ROUTE
    ) {
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ) {
            SignUpScreen(navController = navController)
        }
    }
}