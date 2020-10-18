package com.oleksandrkarpiuk.helper.ui.task.fragments.datepicker

import com.oleksandrkarpiuk.helper.ui.base.mvp.presenters.BasePresenter
import java.time.LocalDate

class DatePickerPresenter(
    private val view: DatePickerContract.View
): BasePresenter(), DatePickerContract.ActionListener {


    override fun onCreateDialog(date: LocalDate) = view.setDateToDialog(
        date.year,
        date.monthValue - 1,
        date.dayOfMonth
    )


    override fun onDialogOkButtonClicked(year: Int, month: Int, dayOfMonth: Int) {
        view.sendOkResult(LocalDate.of(year, month, dayOfMonth))
    }


}