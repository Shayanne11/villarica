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
        )
        return repository

    }

}
