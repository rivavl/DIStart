package com.marina.distart.example1

import javax.inject.Inject

class Activity {

    // при помощи геттеров
    val component = DaggerNewComponent.create()
    val keyboard: Keyboard = component.getKeyboard()
    val mouse: Mouse = component.getMouse()
    val monitor: Monitor = component.getMonitor()


    // инъекция в поля
    @Inject
    lateinit var keyboardIn: Keyboard

    init {
        DaggerNewComponent.create().inject(this)
    }
}