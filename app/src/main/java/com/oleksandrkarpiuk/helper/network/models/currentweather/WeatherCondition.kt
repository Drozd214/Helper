package com.oleksandrkarpiuk.helper.network.models.currentweather

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class WeatherCondition(
    @SerializedName("text") val text: String,
    @SerializedName("icon") val iconUrl: String
): Parcelable