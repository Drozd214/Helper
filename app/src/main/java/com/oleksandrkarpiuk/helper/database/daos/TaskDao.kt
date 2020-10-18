package com.oleksandrkarpiuk.helper.database.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.oleksandrkarpiuk.helper.database.models.Task

@Dao
interface TaskDao {


    @Query("SELECT * FROM tasks")
    fun getTasks() : LiveData<List<Task>>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addNewTask(task: Task)


    @Update
    fun updateTask(task: Task)


    @Delete
    fun deleteTask(task: Task)


}