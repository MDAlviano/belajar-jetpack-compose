package com.alvin.belajar.compose.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.alvin.belajar.compose.navigation.HOME_ROUTE
import com.alvin.belajar.compose.navigation.ROOT_ROUTE
import com.alvin.belajar.compose.navigation.Screen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {
        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)
    }
}