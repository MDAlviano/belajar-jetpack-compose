package com.alvin.belajar.compose.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alvin.belajar.compose.modul.navigation.nav_graph.SetupNavGraph
import com.alvin.belajar.compose.ui.theme.BelajarComposeTheme

class MyNavigationActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BelajarComposeTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}