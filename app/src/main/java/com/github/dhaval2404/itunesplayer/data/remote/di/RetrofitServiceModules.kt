package com.github.dhaval2404.itunesplayer.data.remote.di

import com.github.dhaval2404.itunesplayer.data.remote.retrofit.service.ITunesService
import org.koin.dsl.module
import retrofit2.Retrofit

/**
 * Defined Retrofit Services
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 05 December 2020
 */
val remoteServiceModules = module {

    factory { get<Retrofit>().create(ITunesService::class.java) }
}
