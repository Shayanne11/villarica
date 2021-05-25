package com.shayanne.core.network.dto

import com.squareup.moshi.Json

internal data class RepositoryWrapperDto (
    @Json(name = "adega") val wineHouse: List<RepositoryWineDto>
    // @Json(name = "bebidas_nao_alcool") val nonAlcoolBeverages:List<RepositoryNonAlcoolDto>,
        )

internal data class RepositoryWineDto(
    @Json(name = "cod_ref") val id: Int,
    @Json(name = "tipo") val type: String,
    @Json(name = "subtipo") val subtype: String,
    @Json(name = "descricao") val description: String,
    @Json(name = "safra") val harvest: Int,
    @Json(name = "volume") val volume: String,
    @Json(name = "teor_alcool") val contentAlcohol:String,
    @Json(name = "vlr_unid") val price: Float,
    @Json(name = "pais_prod") val country: String,
    @Json(name = "regiao_prod") val region: String,
    @Json(name = "produtor") val manufacturer: String,
    @Json(name = "tipo_fechamento") val closureType: String,
    @Json(name = "uvas") val grapes: String,
    @Json(name = "harmonizacao") val winePairing: String,
    @Json(name = "premiacoes") val awards: String,
    @Json(name = "foto_prod") val picture: String
)

/*internal data class RepositoryNonAlcoolDto(
    @Json()
)*/

