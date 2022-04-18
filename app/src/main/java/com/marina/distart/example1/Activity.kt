package com.marina.distart.example1

class Activity {

    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }
}