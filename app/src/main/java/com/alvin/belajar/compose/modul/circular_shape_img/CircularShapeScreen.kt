package com.alvin.belajar.compose.modul.circular_shape_img

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alvin.belajar.compose.R

@Composable
fun CircularShapeScreen() {
    Image(
        modifier = Modifier
            .size(300.dp)
            .clip(CircleShape)
            .border(
                width = 10.dp,
                color = Color.Cyan,
                shape = CircleShape
            ),
        painter = painterResource(id = R.drawable.cuanfullimage),
        contentDescription = "Image"
    )
}

@Preview
@Composable
fun CircularShapeScreenPreview() {
    CircularShapeScreen()
}