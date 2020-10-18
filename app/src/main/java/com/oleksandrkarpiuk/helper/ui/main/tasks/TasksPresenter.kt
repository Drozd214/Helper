package com.oleksandrkarpiuk.helper.ui.main.tasks

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.oleksandrkarpiuk.helper.database.daos.TaskDao
import com.oleksandrkarpiuk.helper.database.models.Task
import com.oleksandrkarpiuk.helper.ui.base.mvp.presenters.BasePresenter

class TasksPresenter(
    private val view: TasksContract.View,
    private val tasksDao: TaskDao
): BasePresenter(), TasksContract.ActionListener {


    override lateinit var tasks: LiveData<List<Task>>




    override fun init() {
        tasks = tasksDao.getTasks()
    }


    override fun onItemClickedListener(task: Task) {
        view.launchTaskActivity(task)
    }


    override fun onAddTaskMenuBtnClicked() {
        view.launchTaskActivity(Task())
    }


    override fun onItemCheckChanged(position: Int, isChecked: Boolean) {
        val newTask = tasks.value!![position]
        tasksDao.updateTask(newTask.copy(isDone = isChecked))
    }


}