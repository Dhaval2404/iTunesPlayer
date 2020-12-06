package com.github.dhaval2404.itunesplayer.data.room.di

import com.github.dhaval2404.itunesplayer.data.room.AppDatabase
import org.koin.dsl.module

/**
 * Database dependencies
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 06 December 2020
 */
val localModule = module {

    single { AppDatabase.getInstance(get()) }

    single { (get() as AppDatabase).songDao() }
}
