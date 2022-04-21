package com.marina.distart.example2.data.database

import android.content.Context
import android.util.Log
import com.marina.distart.R
import com.marina.distart.example2.di.ApplicationScope
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val timeInMillis: Long
) {

    fun method() {
        Log.d(
            LOG_TAG,
            "ExampleDatabase ${context.getString(R.string.app_name)}  $timeInMillis   $this"
        )
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
