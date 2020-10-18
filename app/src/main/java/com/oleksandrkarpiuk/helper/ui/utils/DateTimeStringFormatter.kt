package com.oleksandrkarpiuk.helper.ui.utils

import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.time.format.TextStyle
import java.util.*

class DateTimeStringFormatter {


    private val dateFormatter = DateTimeFormatter.ofPattern("EEE, d MMM, yyyy", Locale.ENGLISH)




    fun getDateTimeString(date: LocalDate?, time: LocalTime?): String {
        var dateTimeString = ""

        if(date != null) {
            dateTimeString = date.format(dateFormatter)

            if(time != null) {
                dateTimeString += ", $time"
            }
        }

        return dateTimeString
    }


    fun getDateString(date: LocalDate?): String? {
        return date?.format(dateFormatter)
    }


    fun getDateFromString(dateString: String): LocalDate? {
        return if(dateString.isEmpty()) {
            null
        } else {
            LocalDate.parse(dateString, dateFormatter)
        }
    }


}