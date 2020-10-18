package com.oleksandrkarpiuk.helper.di.subcomponents.interfaces

import com.oleksandrkarpiuk.helper.di.subcomponents.activities.MainComponent
import com.oleksandrkarpiuk.helper.di.subcomponents.activities.TaskComponent

interface ExposeActivitySubcomponents {

    fun createMainComponent(): MainComponent.Factory

    fun createTaskComponent() :TaskComponent.Factory
}
