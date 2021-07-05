package com.shayanne.core.model

sealed class ResponseViewState {
    data class Success( val list: List<Repository>):ResponseViewState()
    data class Error(val messageError: Int): ResponseViewState()
}