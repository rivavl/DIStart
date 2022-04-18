package com.marina.distart.example2.di

import com.marina.distart.example2.data.datasource.ExampleLocalDataSource
import com.marina.distart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.marina.distart.example2.data.datasource.ExampleRemoteDataSource
import com.marina.distart.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

}