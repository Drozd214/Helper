package com.oleksandrkarpiuk.helper.di.modules.core

import android.content.Context
import com.oleksandrkarpiuk.helper.di.subcomponents.SubcomponentsModule
import com.oleksandrkarpiuk.helper.ui.utils.DateTimeStringFormatter
import com.oleksandrkarpiuk.helper.ui.utils.StringProvider
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


    @Provides
    fun provideStringProvider(context: Context): StringProvider {
        return StringProvider(context)
    }


}