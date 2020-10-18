package com.oleksandrkarpiuk.helper.di

import android.content.Context
import com.oleksandrkarpiuk.helper.di.modules.core.CoreModule
import com.oleksandrkarpiuk.helper.di.modules.data.DataModule
import com.oleksandrkarpiuk.helper.di.subcomponents.interfaces.ExposeActivitySubcomponents
import com.oleksandrkarpiuk.helper.di.subcomponents.interfaces.ExposeFragmentSubcomponents
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    CoreModule::class,
    DataModule::class
])
interface HelperAppComponent: ExposeActivitySubcomponents,
    ExposeFragmentSubcomponents {


    @Component.Factory
    interface Factory {

        fun create(@BindsInstance context: Context) : HelperAppComponent
    }


}