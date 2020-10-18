package com.oleksandrkarpiuk.helper.ui.main.tasks

import androidx.lifecycle.LiveData
import com.oleksandrkarpiuk.helper.database.models.Task

interface TasksContract {

    interface View {

        fun launchTaskActivity(task: Task)
    }


    interface ActionListener {

        val tasks: LiveData<List<Task>>

        fun onAddTaskMenuBtnClicked()

        fun onItemClickedListener(task: Task)

        fun onItemCheckChanged(position: Int, isChecked: Boolean)
    }

}