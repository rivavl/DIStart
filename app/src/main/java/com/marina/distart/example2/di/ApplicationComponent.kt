package com.marina.distart.example2.di

import android.content.Context
import com.marina.distart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)


    // если нужно передать параметр и использовать его в графе зависимостей,
    // предпочтительнее делать это при помощи билдера,
    // а не передавать объект в конструктор модуля
    @Component.Builder
    interface ApplicationComponentBuilder {

        // передаем контекст в ApplicationComponentBuilder,
        // не используется в графе зависимостей,
        // т.е БД и апи сервис не могут его использовать
        // аннотация BindsInstance для передачи в граф
        @BindsInstance
        fun context(context: Context): ApplicationComponentBuilder

        @BindsInstance
        fun timeInMillis(time: Long): ApplicationComponentBuilder

        fun build(): ApplicationComponent
    }
}