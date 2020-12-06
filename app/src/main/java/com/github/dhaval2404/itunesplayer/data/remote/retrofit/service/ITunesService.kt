package com.github.dhaval2404.itunesplayer.data.remote.retrofit.service

import com.github.dhaval2404.itunesplayer.data.model.FeedResponse
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * iTunes Service
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 05 December 2020
 */
interface ITunesService {

    @POST("topsongs/limit={limit}/xml")
    suspend fun fetchTopSongs(@Path("limit") limit: Int): Response<FeedResponse>
}
