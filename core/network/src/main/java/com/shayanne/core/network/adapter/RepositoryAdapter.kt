package com.shayanne.core.network.adapter


import com.shayanne.core.model.Repository
import com.shayanne.core.model.RepositoryWrapper
import com.shayanne.core.network.dto.RepositoryAlcoholDto
import com.shayanne.core.network.dto.RepositoryWrapperDto
import com.squareup.moshi.FromJson


internal class RepositoryAdapter  {
    @FromJson
    fun repositoryWrapperDtoFromWrapperModel( wrapperDto: RepositoryWrapperDto)= RepositoryWrapper(
        wrapperDto.wineHouse.map {
            repositoryDtoToModel(it)
        }
    )

    internal fun repositoryDtoToModel(repositoryDto: RepositoryAlcoholDto): Repository {
        val repository = Repository(
            id = repositoryDto.id,
            type = repositoryDto.type,
            subtype = repositoryDto.subtype,
            description = repositoryDto.description,
            harvest = repositoryDto.harvest,
            volume = repositoryDto.volume,
            contentAlcohol = repositoryDto.contentAlcohol,
            price = repositoryDto.price,
            country = repositoryDto.country,
            region = repositoryDto.region,
            manufacturer = repositoryDto.manufacturer,
            closureType = repositoryDto.closureType,
            grapes = repositoryDto.grapes,
            winePairing = repositoryDto.winePairing,
            awards = repositoryDto.awards,
            picture = repositoryDto.picture
        )
        return repository

    }

}
