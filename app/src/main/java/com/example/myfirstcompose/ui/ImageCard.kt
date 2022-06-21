package com.example.myfirstcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.myfirstcompose.data.domain.Image

@OptIn(ExperimentalUnitApi::class)
@Composable
fun ImageCard(image: Image){
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = 10.dp,
        modifier = Modifier
            .size(170.dp, 170.dp)
            .padding(16.dp)
    ) {
        Box(modifier = Modifier
            .size(170.dp)){
            Image(
                bitmap = ImageBitmap.imageResource(id = image.photoPath),
                contentDescription = image.title,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
            )
            Text(
                text = image.title.uppercase(),
                color = Color.White,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .background(Color.DarkGray.copy(alpha = 0.5f))
                    .fillMaxWidth(),
                fontSize = TextUnit(value = 20f, TextUnitType.Sp),
                textAlign = TextAlign.Center
            )
        }
    }
}