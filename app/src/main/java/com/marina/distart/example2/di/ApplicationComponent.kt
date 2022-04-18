package com.marina.distart.example2.di

import com.marina.distart.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}