package com.shayanne.core.model

data class Repository (
    val id: Int,
    val type: String,
    val subtype: String,
    val description: String,
    val harvest: Int,
    val volume: String,
    val contentAlcohol: String,
    val price: Float,
    val country: String,
    val region: String,
    val manufacturer: String,
    val closureType: String,
    val grapes: String,
    val winePairing: String,
    val awards: String,
    val picture: String

        )

data class RepositoryWrapper(
    val repositories: List<Repository>
)