package com.example.myfirstcompose.ui.imagelist

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.myfirstcompose.R
import com.example.myfirstcompose.data.domain.Image
import com.example.myfirstcompose.data.repository.ImageRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ImagesViewModel @Inject constructor(
    imageRepository: ImageRepository
): ViewModel(){

    // like a constructor
    // called first thing when a class is created
    init {
        Log.v("ImagesViewModel","Hello Shaima!")
    }

    fun getImages() : List<Image>{
        // create an object
        val image = mutableListOf<Image>(
            Image("Sunset", R.drawable.image1, 0),
            Image("Lake", R.drawable.image2, 1),
            Image("Bridge", R.drawable.image3, 2),
            Image("Rocks", R.drawable.image4, 3),
            Image("Golden Bridge", R.drawable.image5, 3),
            Image("Mountain", R.drawable.image6, 3),
            Image("Island", R.drawable.image7, 3),
            Image("Ice", R.drawable.image8, 3)
        )

        return image
    }
} // End ImagesViewModel