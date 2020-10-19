package com.oleksandrkarpiuk.helper.data.repositories.tasks

import androidx.lifecycle.LiveData
import com.oleksandrkarpiuk.helper.data.stores.tasks.TasksDatabaseStore
import com.oleksandrkarpiuk.helper.database.models.Task

class TasksRepositoryImpl(
    private val tasksDatabaseStore: TasksDatabaseStore
): TasksRepository {


    override fun getTasks(): LiveData<List<Task>> {
        return tasksDatabaseStore.getTasks()
    }


    override fun saveTask(task: Task) {
        tasksDatabaseStore.insertTask(task)
    }


    override fun updateTask(task: Task) {
        tasksDatabaseStore.updateTask(task)
    }


    override fun deleteTask(task: Task) {
        tasksDatabaseStore.deleteTask(task)
    }


}