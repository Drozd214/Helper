package com.oleksandrkarpiuk.helper.ui.main.weather

import com.oleksandrkarpiuk.helper.network.models.Location
import com.oleksandrkarpiuk.helper.network.models.currentweather.Weather

interface WeatherContract {

    interface View {

        fun initViews(weather: Weather, location: Location)

        fun showToast(message: String)
    }


    interface ActionListener {

        fun updateWeather(requestParameter: String)
    }

}