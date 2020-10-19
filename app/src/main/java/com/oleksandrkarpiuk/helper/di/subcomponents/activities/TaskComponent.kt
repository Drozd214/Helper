package com.oleksandrkarpiuk.helper.di.subcomponents.activities

import com.oleksandrkarpiuk.helper.data.repositories.tasks.TasksRepository
import com.oleksandrkarpiuk.helper.database.daos.TaskDao
import com.oleksandrkarpiuk.helper.ui.task.TaskActivity
import com.oleksandrkarpiuk.helper.ui.task.TaskContract
import com.oleksandrkarpiuk.helper.ui.task.TaskPresenter
import com.oleksandrkarpiuk.helper.ui.utils.DateTimeStringFormatter
import dagger.BindsInstance
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

@Subcomponent(modules = [TaskComponent.ComponentModule::class])
interface TaskComponent {


    fun inject(activity: TaskActivity)


    @Subcomponent.Factory
    interface Factory {

        fun create(@BindsInstance view: TaskContract.View): TaskComponent
    }


    @Module
    object ComponentModule {

        @Provides
        fun provideTaskPresenter(
            view: TaskContract.View,
            tasksRepository: TasksRepository,
            dateTimeStringFormatter: DateTimeStringFormatter
        ): TaskPresenter {
            return TaskPresenter(view, tasksRepository, dateTimeStringFormatter)
        }
    }


}