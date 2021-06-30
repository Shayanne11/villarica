package com.shayanne.villarricaemporio

interface Logger {

    fun logMessage(
        tag: String = "",
        message: String
    )
}