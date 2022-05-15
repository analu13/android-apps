package dev.analuiza.mvi_animals.view

import dev.analuiza.mvi_animals.model.Animal

sealed class MainState {

    object Idle : MainState()
    object Loading : MainState()
    data class Animals(val animails: List<Animal>) : MainState()
    data class Error(val error: String?) : MainState()
}
