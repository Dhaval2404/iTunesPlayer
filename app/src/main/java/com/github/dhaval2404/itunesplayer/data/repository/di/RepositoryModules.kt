package com.github.dhaval2404.itunesplayer.data.repository.di

import com.github.dhaval2404.itunesplayer.data.repository.ITunesRepository
import com.github.dhaval2404.itunesplayer.data.repository.ITunesRepositoryImp
import org.koin.dsl.module

/**
 * Configure Repositories
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 06 December 2020
 */
val repositoryModules = module {

    factory<ITunesRepository> {
        ITunesRepositoryImp(get(), get())
    }
}
