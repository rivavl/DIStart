package com.marina.distart.example2.di

import androidx.lifecycle.ViewModel
import com.marina.distart.example2.presentation.ExampleViewModel
import com.marina.distart.example2.presentation.ExampleViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    // @IntoMap говорит собирать вью модели в мапу
    // @StringKey указываем ключ
    @IntoMap
    @ViewModelKey(ExampleViewModel::class)
    @Binds
    fun bindExampleViewModel(impl: ExampleViewModel): ViewModel

    @IntoMap
    @ViewModelKey(ExampleViewModel2::class)
    @Binds
    fun bindExampleViewModel2(impl: ExampleViewModel2): ViewModel
}