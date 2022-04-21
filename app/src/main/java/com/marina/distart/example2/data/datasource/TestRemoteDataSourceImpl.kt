package com.marina.distart.example2.data.datasource

import android.util.Log
import javax.inject.Inject

class TestRemoteDataSourceImpl @Inject constructor() : ExampleRemoteDataSource {
    override fun method() {
        Log.d("TestRemoteDataSourceImpl", "Test")
    }
}