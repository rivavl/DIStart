package com.marina.distart.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marina.distart.R
import com.marina.distart.example1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activity = Activity()
        activity.computer.toString()
    }
}