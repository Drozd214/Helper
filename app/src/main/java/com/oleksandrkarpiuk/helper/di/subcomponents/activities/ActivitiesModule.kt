package com.oleksandrkarpiuk.helper.di.subcomponents.activities

import dagger.Module

@Module(
    subcomponents = [
        MainComponent::class,
        TaskComponent::class
    ]
)
class ActivitiesModule