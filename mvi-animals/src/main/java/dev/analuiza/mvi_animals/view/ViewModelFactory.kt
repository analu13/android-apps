package dev.analuiza.mvi_animals.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dev.analuiza.mvi_animals.api.AnimalApi
import dev.analuiza.mvi_animals.api.AnimalRepo
import java.lang.IllegalArgumentException

class ViewModelFactory(private val api: AnimalApi) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>) =
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) MainViewModel(AnimalRepo(api)) as T
        else throw IllegalArgumentException("Unknown Class Name")
}
