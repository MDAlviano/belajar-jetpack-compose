package com.alvin.belajar.compose.modul.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.alvin.belajar.compose.modul.bottom_navigation.screens.HomeScreen
import com.alvin.belajar.compose.modul.bottom_navigation.screens.ProfileScreen
import com.alvin.belajar.compose.modul.bottom_navigation.screens.SettingsScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Settings.route) {
            SettingsScreen()
        }
    }
}