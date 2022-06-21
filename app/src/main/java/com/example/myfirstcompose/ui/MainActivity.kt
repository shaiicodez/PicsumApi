package com.example.myfirstcompose.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import com.example.myfirstcompose.ui.imagelist.ImagesScreen
import com.example.myfirstcompose.ui.theme.MyFirstComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposeTheme {
                ImagesScreen()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@OptIn(ExperimentalUnitApi::class, androidx.compose.foundation.ExperimentalFoundationApi::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    MyFirstComposeTheme {
        ImagesScreen()
    }
}