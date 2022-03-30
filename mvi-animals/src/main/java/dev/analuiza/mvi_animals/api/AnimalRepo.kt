package dev.analuiza.mvi_animals.api

class AnimalRepo(private val api: AnimalApi) {
    suspend fun getAnimals( ) = api.getAnimals()
}