package com.oleksandrkarpiuk.helper.network.models.currentweather

import com.oleksandrkarpiuk.helper.network.key
import com.oleksandrkarpiuk.helper.network.location
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrentWeatherAPI {

    @GET ("/v1/current.json?key=$key")
    fun getRealtimeWeather(@Query("q") requestParameter: String): Call<CurrentWeather>

}