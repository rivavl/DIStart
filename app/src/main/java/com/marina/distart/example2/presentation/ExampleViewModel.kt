package com.marina.distart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.marina.distart.example2.di.IdQualifier
import com.marina.distart.example2.di.NameQualifier
import com.marina.distart.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Named


class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String
) : ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "$this $id $name")
    }
}
