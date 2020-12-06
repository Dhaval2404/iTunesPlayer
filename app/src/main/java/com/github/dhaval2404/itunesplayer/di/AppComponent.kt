package com.github.dhaval2404.itunesplayer.di

import com.github.dhaval2404.itunesplayer.BuildConfig
import com.github.dhaval2404.itunesplayer.data.remote.di.remoteModules
import com.github.dhaval2404.itunesplayer.data.remote.di.remoteServiceModules
import com.github.dhaval2404.itunesplayer.data.repository.di.repositoryModules
import com.github.dhaval2404.itunesplayer.data.room.di.localModule

/**
 * Combine all dependencies
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 06 December 2020
 */
val appComponent = listOf(
    remoteModules(BuildConfig.API_BASE_URL, BuildConfig.DEBUG),
    remoteServiceModules,
    repositoryModules,
    localModule
)
