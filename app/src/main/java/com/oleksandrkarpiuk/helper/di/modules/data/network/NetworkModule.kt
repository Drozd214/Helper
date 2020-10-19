package com.oleksandrkarpiuk.helper.di.modules.data.network

import com.oleksandrkarpiuk.helper.network.WeatherRestAPI.Companion.BASE_URL
import com.oleksandrkarpiuk.helper.network.models.currentweather.CurrentWeatherAPI
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(includes = [
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


    @Singleton
    @Provides
    fun provideRealtimeWeatherAPI(retrofit: Retrofit): CurrentWeatherAPI {
        return retrofit.create(CurrentWeatherAPI::class.java)
    }
}