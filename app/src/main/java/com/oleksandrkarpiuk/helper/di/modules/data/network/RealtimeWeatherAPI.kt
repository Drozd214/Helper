package com.oleksandrkarpiuk.helper.di.modules.data.network

import com.oleksandrkarpiuk.helper.network.models.currentweather.CurrentWeatherAPI
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
object RealtimeWeatherAPI {


    @Singleton
    @Provides
    fun provideRealtimeWeatherAPI(retrofit: Retrofit): CurrentWeatherAPI {
        return retrofit.create(CurrentWeatherAPI::class.java)
    }
}