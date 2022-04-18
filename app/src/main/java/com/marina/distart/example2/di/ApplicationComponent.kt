package com.marina.distart.example2.di

import android.content.Context
import com.marina.distart.example2.data.database.ExampleDatabase
import com.marina.distart.example2.data.network.ExampleApiService
import com.marina.distart.example2.presentation.ExampleViewModel
import com.marina.distart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    // еще один способ добавить агрументы в граф
    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance time: Long
        ): ApplicationComponent
    }
}