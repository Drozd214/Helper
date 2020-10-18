package com.oleksandrkarpiuk.helper.network.models.currentweather

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.oleksandrkarpiuk.helper.network.models.Location
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CurrentWeather(
    @SerializedName("location") val location: Location,
    @SerializedName("current") val weather: Weather
): Parcelable