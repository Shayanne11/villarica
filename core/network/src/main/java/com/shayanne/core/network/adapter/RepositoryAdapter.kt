package com.shayanne.core.network.adapter

import com.shayanne.core.network.dto.RepositoryWineDto
import com.shayanne.core.network.dto.RepositoryWrapperDto
import com.squareup.moshi.FromJson


/*internal class RepositoryAdapter  {
    @FromJson
    fun repositoryWrapperDtoFromWrapperModel( wrapperDto: RepositoryWrapperDto)= RepositoryWrapper(
        wrapperDto.wineHouse.map {
            repositoryDtoToModel(it)
        }
    )

    internal fun repositoryDtoToModel(repositoryDto: RepositoryWineDto):Repository {
        val repository = Repository(
        )
        return repository

    }

}*/
