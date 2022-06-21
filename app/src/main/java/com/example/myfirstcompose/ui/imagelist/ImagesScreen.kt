package com.example.myfirstcompose.ui.imagelist

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.GridItemSpan
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.myfirstcompose.ImageCard
import dagger.hilt.android.lifecycle.HiltViewModel

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImagesScreen(viewModel: ImagesViewModel = hiltViewModel()){
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        LazyVerticalGrid(
            cells = GridCells.Fixed(2)
        ){
            item(
                span = { GridItemSpan(4)}
            ){
                Text(text = "Nam pellentesque elit ac ultricies maximus. " +
                        "Curabitur accumsan, mauris eu feugiat pretium, libero quam tempus lectus, non pellentesque massa nibh in leo. " +
                        "In lacus odio, blandit in mauris eget, gravida dictum nisl. " +
                        "In dignissim enim cursus quam consequat tincidunt. " +
                        "Morbi ut molestie nunc.",
                    modifier = Modifier
                        .padding(16.dp))

            }

            items(viewModel.getImages()){ picture ->
                ImageCard(image = picture)
            }
        }
    }
}