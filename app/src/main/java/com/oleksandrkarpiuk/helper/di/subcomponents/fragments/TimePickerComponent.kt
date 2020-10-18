package com.oleksandrkarpiuk.helper.di.subcomponents.fragments

import com.oleksandrkarpiuk.helper.ui.task.fragments.timepicker.TimePickerContract
import com.oleksandrkarpiuk.helper.ui.task.fragments.timepicker.TimePickerFragment
import com.oleksandrkarpiuk.helper.ui.task.fragments.timepicker.TimePickerPresenter
import dagger.BindsInstance
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

@Subcomponent(modules = [TimePickerComponent.ComponentModule::class])
interface TimePickerComponent {


    fun inject(fragment: TimePickerFragment)


    @Subcomponent.Factory
    interface Factory {

        fun create(@BindsInstance view: TimePickerContract.View): TimePickerComponent
    }


    @Module
    object ComponentModule {

        @Provides
        fun provideTimePickerPresenter(
            view: TimePickerContract.View
        ): TimePickerPresenter {
            return TimePickerPresenter(view)
        }
    }


}