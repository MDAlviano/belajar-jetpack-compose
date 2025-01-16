package com.alvin.belajar.compose.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alvin.belajar.compose.activity.ui.theme.BelajarComposeTheme
import com.alvin.belajar.compose.modul.animated_shimmer.AnimatedShimmer

class AnimatedShimmerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BelajarComposeTheme {
                Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                    repeat(11) {
                        AnimatedShimmer()
                    }
                }
            }
        }
    }
}