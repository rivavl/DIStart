package com.marina.distart.example2.di

import com.marina.distart.example2.presentation.MainActivity
import com.marina.distart.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@Subcomponent(
    modules = [ViewModelModule::class]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)
    fun inject(activity: MainActivity2)

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @IdQualifier id: String,
            @BindsInstance @NameQualifier name: String
        ): ActivityComponent
    }
}

/*
* мы не можем создать сабкомпонент сами, он создается компонентом, в котором находится
* */