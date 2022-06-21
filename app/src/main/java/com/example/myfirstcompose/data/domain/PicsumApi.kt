package com.example.myfirstcompose.data.domain

import androidx.compose.ui.unit.Constraints
import com.example.myfirstcompose.common.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface PicsumApi {

    @GET("/v2/list")
    suspend fun getImages() : List<Image>
}