package com.shayanne.core.network.adapter


import com.shayanne.core.model.Repository
import com.shayanne.core.model.RepositoryWrapper
import com.shayanne.core.network.dto.RepositoryWineDto
import com.shayanne.core.network.dto.RepositoryWrapperDto
import com.squareup.moshi.FromJson


internal class RepositoryAdapter  {
    @FromJson
    fun repositoryWrapperDtoFromWrapperModel(
        wrapperDto: RepositoryWrapperDto)= RepositoryWrapper(
        wrapperDto.wineHouse.map {
            repositoryDtoToModel(it)
        }
    )

    internal fun repositoryDtoToModel(
        repositoryDto: RepositoryWineDto): Repository {
        val repository = Repository(
            id = repositoryDto.id,
            type = repositoryDto.type,
            subtype = repositoryDto.subtype,
            description = repositoryDto.description,
            harvest = repositoryDto.harvest,
            volume = repositoryDto.volume,
            contentAlcohol = repositoryDto.contentAlcohol,
            price = 0f,
            country = repositoryDto.country,
            region = repositoryDto.region,
            manufacturer = repositoryDto.manufacturer,
            closureType = repositoryDto.closureType,
            grapes = "",
            winePairing = "",
            awards = "",
            picture = repositoryDto.picture
        )
        return repository

    }

}
