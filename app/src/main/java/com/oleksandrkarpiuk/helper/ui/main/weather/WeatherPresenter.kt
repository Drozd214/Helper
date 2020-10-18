package com.oleksandrkarpiuk.helper.ui.main.weather

import com.oleksandrkarpiuk.helper.network.models.Location
import com.oleksandrkarpiuk.helper.network.models.currentweather.CurrentWeather
import com.oleksandrkarpiuk.helper.network.models.currentweather.CurrentWeatherAPI
import com.oleksandrkarpiuk.helper.network.models.currentweather.Weather
import com.oleksandrkarpiuk.helper.ui.base.mvp.presenters.BasePresenter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class WeatherPresenter(
    private val view: WeatherContract.View,
    private val currentWeatherAPI: CurrentWeatherAPI
) : BasePresenter(), WeatherContract.ActionListener {


    private lateinit var weather: Weather
    private lateinit var location: Location




    override fun init() {
        updateWeather("Polonne")
    }


    override fun updateWeather(requestParameter: String) {
        currentWeatherAPI.getRealtimeWeather(requestParameter).enqueue(object: Callback<CurrentWeather> {

            override fun onFailure(call: Call<CurrentWeather>, t: Throwable) {
                view.showToast(t.message.toString())
            }

            override fun onResponse(
                call: Call<CurrentWeather>,
                response: Response<CurrentWeather>
            ) {
                if(response.code() == 400) {
                    return
                }
                with(response) {
                    weather = body()!!.weather
                    location = body()!!.location
                }

                view.initViews(weather, location)
            }

        })
    }


}