package dev.analuiza.mvi_animals.api

import dev.analuiza.mvi_animals.model.Animal
import retrofit2.http.GET

interface AnimalApi {

    @GET("animals.json")
    suspend fun getAnimals(): List<Animal>
}