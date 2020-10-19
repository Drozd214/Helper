package com.oleksandrkarpiuk.helper.di.modules.data.repositories

import com.oleksandrkarpiuk.helper.data.stores.tasks.TasksDatabaseStore
import com.oleksandrkarpiuk.helper.database.daos.TaskDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DataStoresModule {


    @Singleton
    @Provides
    fun provideTasksDatabaseStore(taskDao: TaskDao): TasksDatabaseStore {
        return TasksDatabaseStore(taskDao)
    }
}