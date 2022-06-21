package com.example.myfirstcompose.di

import com.example.myfirstcompose.common.Constants
import com.example.myfirstcompose.data.domain.PicsumApi
import com.example.myfirstcompose.data.repository.ImageRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // will live as long as the app running
object AppModule {

    // API Impl
    @Provides
    @Singleton
    fun providePicsumApi(): PicsumApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PicsumApi::class.java)
    }

    // repo
    @Provides
    fun provideRepo(api : PicsumApi): ImageRepository{
        return ImageRepository(picsumApi = api)
    }
}