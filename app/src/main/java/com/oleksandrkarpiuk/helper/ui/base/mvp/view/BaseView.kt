package com.oleksandrkarpiuk.helper.ui.base.mvp.view

import android.content.Context
import android.widget.Toast

interface BaseView {

    fun injectDependencies()

    fun init()
}