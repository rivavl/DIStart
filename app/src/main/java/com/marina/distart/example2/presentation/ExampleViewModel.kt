package com.marina.distart.example2.presentation

import com.marina.distart.example2.domain.ExampleUseCase
import javax.inject.Inject


class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}
