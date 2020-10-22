package com.oleksandrkarpiuk.helper.di.modules.data

import com.oleksandrkarpiuk.helper.di.modules.data.database.DatabaseModule
import com.oleksandrkarpiuk.helper.di.modules.data.network.NetworkModule
import com.oleksandrkarpiuk.helper.di.modules.data.repositories.DataStoresModule
import com.oleksandrkarpiuk.helper.di.modules.data.repositories.RepositoriesModule
import dagger.Module
import javax.inject.Singleton

@Module(includes = [
    DatabaseModule::class,
    NetworkModule::class,
    DataStoresModule::class,
    RepositoriesModule::class
])
object DataModule