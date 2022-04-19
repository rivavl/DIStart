package com.marina.distart.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.marina.distart.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Provider

/*
*  при кажом вызове create() должна создаваться новая вью модель,
* но ViewModelFactory должна быть одна на все приложение
* */

@ApplicationScope
class ViewModelFactory @Inject constructor(
    // @JvmSuppressWildcards чтобы даггер понимал, откуда брать реализацию объекта
    private val viewModelProviders: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return viewModelProviders[modelClass]?.get() as T
    }
}