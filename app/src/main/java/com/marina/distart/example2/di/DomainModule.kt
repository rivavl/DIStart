package com.marina.distart.example2.di

import com.marina.distart.example2.data.repository.ExampleRepositoryImpl
import com.marina.distart.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}