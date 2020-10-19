package com.oleksandrkarpiuk.helper.di.subcomponents.fragments

import com.oleksandrkarpiuk.helper.data.repositories.tasks.TasksRepository
import com.oleksandrkarpiuk.helper.data.repositories.tasks.TasksRepositoryImpl
import com.oleksandrkarpiuk.helper.database.daos.TaskDao
import com.oleksandrkarpiuk.helper.ui.main.tasks.TasksContract
import com.oleksandrkarpiuk.helper.ui.main.tasks.TasksFragment
import com.oleksandrkarpiuk.helper.ui.main.tasks.TasksPresenter
import com.oleksandrkarpiuk.helper.ui.utils.DateTimeStringFormatter
import dagger.BindsInstance
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

@Subcomponent(modules = [TasksComponent.ComponentModule::class])
interface TasksComponent {


    fun inject(fragment: TasksFragment)


    @Subcomponent.Factory
    interface Factory {

        fun create(@BindsInstance view: TasksContract.View): TasksComponent
    }


    @Module
    object ComponentModule {


        @Provides
        fun provideTasksPresenter(
            view: TasksContract.View,
            tasksRepository: TasksRepository
        ): TasksPresenter {
            return TasksPresenter(view, tasksRepository)
        }
    }


}