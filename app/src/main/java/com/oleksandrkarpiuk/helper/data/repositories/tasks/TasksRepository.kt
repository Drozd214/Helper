package com.oleksandrkarpiuk.helper.data.repositories.tasks

import androidx.lifecycle.LiveData
import com.oleksandrkarpiuk.helper.database.models.Task

interface TasksRepository {

    fun getTasks(): LiveData<List<Task>>

    fun saveTask(task: Task)

    fun updateTask(task: Task)

    fun deleteTask(task: Task)
}