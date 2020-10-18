package com.oleksandrkarpiuk.helper.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.oleksandrkarpiuk.helper.database.HelperDatabase.Companion.VERSION
import com.oleksandrkarpiuk.helper.database.converters.Converters
import com.oleksandrkarpiuk.helper.database.daos.TaskDao
import com.oleksandrkarpiuk.helper.database.models.Task

@Database(
    entities = [
        Task::class
    ],
    version = VERSION
)
@TypeConverters(Converters::class)
abstract class HelperDatabase: RoomDatabase() {


    companion object {

        const val NAME = "helper_database.db"
        const val VERSION = 6
    }


    abstract val taskDao: TaskDao
}