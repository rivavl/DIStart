package com.marina.distart.example2.di

import android.content.Context
import com.marina.distart.example2.presentation.MainActivity
import com.marina.distart.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun activityComponentFactory(): ActivityComponent.Factory

    // еще один способ добавить агрументы в граф
    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance time: Long
        ): ApplicationComponent
    }
}