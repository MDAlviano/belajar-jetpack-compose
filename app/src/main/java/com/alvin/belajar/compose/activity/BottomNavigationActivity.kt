package com.alvin.belajar.compose.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.alvin.belajar.compose.modul.bottom_navigation.MainScreen
import com.alvin.belajar.compose.ui.theme.BelajarComposeTheme

class BottomNavigationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BelajarComposeTheme {
                MainScreen()
            }
        }
    }
}