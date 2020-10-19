package com.oleksandrkarpiuk.helper.di.modules.data.repositories

import com.oleksandrkarpiuk.helper.data.repositories.tasks.TasksRepository
import com.oleksandrkarpiuk.helper.data.repositories.tasks.TasksRepositoryImpl
import com.oleksandrkarpiuk.helper.data.stores.tasks.TasksDatabaseStore
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object RepositoriesModule {


    @Singleton
    @Provides
    fun provideTasksRepository(tasksDatabaseStore: TasksDatabaseStore): TasksRepository {
        return TasksRepositoryImpl(tasksDatabaseStore)
    }


}