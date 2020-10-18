package com.oleksandrkarpiuk.helper.network.models.currentweather

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Weather(
    @SerializedName("temp_c") val temperatureC: Float,
    @SerializedName("condition") val condition: WeatherCondition,
    @SerializedName("wind_kph") val windKph: Float,
    @SerializedName("wind_dir") val windDir: String,
    @SerializedName("precip_mm") val precipitationMm: Float,
    @SerializedName("humidity") val humidity: Int,
    @SerializedName("feelslike_c") val feelsLikeC: Float,
    @SerializedName("uv") val uv: Float
): Parcelable