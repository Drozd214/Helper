package com.oleksandrkarpiuk.helper.di.modules.data

import com.oleksandrkarpiuk.helper.di.modules.data.database.DatabaseModule
import com.oleksandrkarpiuk.helper.di.modules.data.network.NetworkModule
import dagger.Module
import javax.inject.Singleton

@Module(includes = [
    DatabaseModule::class,
    NetworkModule::class
])
object DataModule