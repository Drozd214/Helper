package com.oleksandrkarpiuk.helper.di.modules.core

import com.oleksandrkarpiuk.helper.di.subcomponents.SubcomponentsModule
import com.oleksandrkarpiuk.helper.ui.utils.DateTimeStringFormatter
import dagger.Module
import dagger.Provides

@Module(includes = [
    SubcomponentsModule::class
])
object CoreModule {


    @Provides
    fun provideDateTimeStringFormatter(): DateTimeStringFormatter {
        return DateTimeStringFormatter()
    }


}