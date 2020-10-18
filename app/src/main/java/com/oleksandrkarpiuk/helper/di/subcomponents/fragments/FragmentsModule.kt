package com.oleksandrkarpiuk.helper.di.subcomponents.fragments

import com.oleksandrkarpiuk.helper.di.subcomponents.activities.MainComponent
import dagger.Module

@Module(
    subcomponents = [
        TasksComponent::class,
        WeatherComponent::class
    ]
)
class FragmentsModule