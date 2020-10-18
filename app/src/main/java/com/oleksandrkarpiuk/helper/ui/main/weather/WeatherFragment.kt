package com.oleksandrkarpiuk.helper.ui.main.weather

import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import android.widget.Toast
import com.oleksandrkarpiuk.helper.HelperApplication
import com.oleksandrkarpiuk.helper.R
import com.oleksandrkarpiuk.helper.network.models.Location
import com.oleksandrkarpiuk.helper.network.models.currentweather.Weather
import com.oleksandrkarpiuk.helper.ui.base.fragments.BaseFragment
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_weather.*
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import javax.inject.Inject


class WeatherFragment: BaseFragment(R.layout.fragment_weather), WeatherContract.View {


    @Inject lateinit var presenter: WeatherPresenter




    override fun injectDependencies() {
        (requireContext().applicationContext as HelperApplication).getAppComponent()
            .createWeatherComponent()
            .create(this)
            .inject(this)
    }


    override fun init() {
        presenter.init()

        button.setOnClickListener {
            presenter.updateWeather(locationEt.text.toString())
        }
    }





    override fun initViews(weather: Weather, location: Location) {
        dayTv.text = LocalDate.now().dayOfWeek.name
        dateTv.text = LocalDate.now().format(DateTimeFormatter.ofPattern("MMMM d", Locale.ENGLISH))

        locationTv.text = location.name

        Picasso.get().load("http:${weather.condition.iconUrl}")
            .resize(128, 128)
            .into(iconImv)

        temperatureTv.text = "${weather.temperatureC}°"
        weatherTv.text = weather.condition.text

        humidityTv.text = "Humidity ${weather.humidity}%"
        windSpeedTv.text = "Wind ${weather.windKph * 1000 / 3600} m/s"
    }


    override fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }


}