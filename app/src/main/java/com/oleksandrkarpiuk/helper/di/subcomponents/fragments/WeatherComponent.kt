package com.oleksandrkarpiuk.helper.di.subcomponents.fragments

import com.oleksandrkarpiuk.helper.network.models.currentweather.CurrentWeatherAPI
import com.oleksandrkarpiuk.helper.ui.main.weather.WeatherContract
import com.oleksandrkarpiuk.helper.ui.main.weather.WeatherFragment
import com.oleksandrkarpiuk.helper.ui.main.weather.WeatherPresenter
import dagger.BindsInstance
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

@Subcomponent(modules = [WeatherComponent.ComponentModule::class])
interface WeatherComponent {


    fun inject(fragment: WeatherFragment)


    @Subcomponent.Factory
    interface Factory {

        fun create(@BindsInstance view: WeatherContract.View): WeatherComponent
    }


    @Module
    object ComponentModule {

        @Provides
        fun provideWeatherPresenter(
            view: WeatherContract.View,
            currentWeatherAPI: CurrentWeatherAPI
        ): WeatherPresenter {
            return WeatherPresenter(view, currentWeatherAPI)
        }
    }


}