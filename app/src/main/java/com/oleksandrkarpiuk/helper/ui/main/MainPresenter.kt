package com.oleksandrkarpiuk.helper.ui.main

import com.oleksandrkarpiuk.helper.ui.base.mvp.presenters.BasePresenter

class MainPresenter(
    private val view: MainContract.View
) : BasePresenter(),
    MainContract.ActionListener { }