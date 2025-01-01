package com.alvin.belajar.compose.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.navArgument
import com.alvin.belajar.compose.navigation.DETAIL_ARGUMENT_KEY
import com.alvin.belajar.compose.navigation.DETAIL_ARGUMENT_KEY2
import com.alvin.belajar.compose.navigation.HOME_ROUTE
import com.alvin.belajar.compose.navigation.Screen
import com.alvin.belajar.compose.screens.DetailScreen
import com.alvin.belajar.compose.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument(DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                }
            )
        ) {
            DetailScreen(navController = navController)
        }
    }
}