package com.oleksandrkarpiuk.helper

import android.app.Application
import com.oleksandrkarpiuk.helper.di.DaggerHelperAppComponent
import com.oleksandrkarpiuk.helper.di.HelperAppComponent

class HelperApplication : Application() {


    private lateinit var appComponent: HelperAppComponent


    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerHelperAppComponent.factory().create(applicationContext)
    }


    fun getAppComponent() : HelperAppComponent {
        return appComponent
    }
}