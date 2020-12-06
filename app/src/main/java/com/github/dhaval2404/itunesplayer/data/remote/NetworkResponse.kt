package com.github.dhaval2404.itunesplayer.data.remote

/**
 * Network Response
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 06 December 2020
 */
sealed class NetworkResponse<out T : Any> {

    data class Success<out T : Any>(val data: T) : NetworkResponse<T>()

    data class Error(val error: String, val status: Int = 0) : NetworkResponse<Nothing>()
}
