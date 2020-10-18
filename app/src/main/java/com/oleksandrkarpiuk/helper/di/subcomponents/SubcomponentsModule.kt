package com.oleksandrkarpiuk.helper.di.subcomponents

import com.oleksandrkarpiuk.helper.di.subcomponents.activities.ActivitiesModule
import com.oleksandrkarpiuk.helper.di.subcomponents.activities.MainComponent
import com.oleksandrkarpiuk.helper.di.subcomponents.fragments.FragmentsModule
import dagger.Module

@Module(
    includes = [
        ActivitiesModule::class,
        FragmentsModule::class
    ]
)
object SubcomponentsModule