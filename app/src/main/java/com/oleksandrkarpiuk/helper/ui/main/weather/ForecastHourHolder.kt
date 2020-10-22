package com.oleksandrkarpiuk.helper.ui.main.weather

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.oleksandrkarpiuk.helper.R
import com.oleksandrkarpiuk.helper.network.models.weatherforecast.forecast.Hour
import com.oleksandrkarpiuk.helper.ui.utils.DateTimeStringFormatter
import com.oleksandrkarpiuk.helper.ui.utils.StringProvider
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_forecast_hour.view.*
import kotlin.math.max

class ForecastHourHolder(
    itemView: View,
    private val dateTimeStringFormatter: DateTimeStringFormatter,
    private val stringProvider: StringProvider
): RecyclerView.ViewHolder(itemView) {


    private val hour = itemView.hourTv
    private val icon = itemView.iconImv
    private val precipitation = itemView.precipitationChanceTv
    private val temperature = itemView.temperatureTv




    fun bindHour(forecastHour: Hour) {
        hour.text = dateTimeStringFormatter.getTimeFromForecastHour(forecastHour.time)
        Picasso.get().load("http:${forecastHour.condition.iconUrl}").into(icon)

        val precipitationChance = max(forecastHour.chanceOfRain, forecastHour.chanceOfSnow)
        precipitation.text = stringProvider.getString(R.string.forecast_hour_precipitation_chance, precipitationChance)
        temperature.text = stringProvider.getString(R.string.current_weather_temperature, forecastHour.temperatureC)
    }
}