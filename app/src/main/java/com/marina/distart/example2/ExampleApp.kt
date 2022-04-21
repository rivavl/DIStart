package com.marina.distart.example2

import android.app.Application
import com.marina.distart.example2.di.DaggerApplicationComponent

// надо указать в манифесте нейм
class ExampleApp : Application() {

    // этот component будет жить все время жизни приложения,
    // значит классы, помеченные аннотацией @Singleton тоже
    val component by lazy {
        DaggerApplicationComponent.factory().create(this, System.currentTimeMillis())
    }
}