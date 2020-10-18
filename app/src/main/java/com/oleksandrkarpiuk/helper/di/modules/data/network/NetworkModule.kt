package com.oleksandrkarpiuk.helper.di.modules.data.network

import com.oleksandrkarpiuk.helper.network.WeatherNetwork
import com.oleksandrkarpiuk.helper.network.WeatherNetwork.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(includes = [
    RealtimeWeatherAPI::class
])
object NetworkModule {


    @Singleton
    @Provides
    fun provideWeatherNetwork(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}