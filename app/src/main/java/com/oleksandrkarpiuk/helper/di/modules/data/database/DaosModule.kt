package com.oleksandrkarpiuk.helper.di.modules.data.database

import com.oleksandrkarpiuk.helper.database.HelperDatabase
import com.oleksandrkarpiuk.helper.database.daos.TaskDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DaosModule {


    @Singleton
    @Provides
    fun provideTasksDao(roomDatabase: HelperDatabase): TaskDao {
        return roomDatabase.taskDao
    }


}