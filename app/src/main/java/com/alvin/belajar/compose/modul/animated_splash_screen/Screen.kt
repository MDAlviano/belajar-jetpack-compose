package com.alvin.belajar.compose.modul.animated_splash_screen

sealed class Screen(val route: String) {
    object Splash: Screen("splash_screen")
    object Home: Screen("home_screen")
}