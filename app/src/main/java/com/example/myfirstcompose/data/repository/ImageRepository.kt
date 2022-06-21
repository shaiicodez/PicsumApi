package com.example.myfirstcompose.data.repository

import com.example.myfirstcompose.common.Response
import com.example.myfirstcompose.data.domain.Image
import com.example.myfirstcompose.data.domain.PicsumApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.lang.Exception
import javax.inject.Inject

class ImageRepository @Inject constructor(
    private val picsumApi: PicsumApi
) {

    suspend fun getImages() : List<Image>{
        return picsumApi.getImages()
    }

    fun getAllImages() : Flow<Response<List<Image>>> = flow {
        try {
            emit(Response.Loading<List<Image>>())
            val images = getImages()
            emit(Response.Success<List<Image>>(images))
        } catch (e : HttpException){
            emit(Response.Error<List<Image>>(e.localizedMessage!!))
        }
    }
}