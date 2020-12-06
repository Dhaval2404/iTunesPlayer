package com.github.dhaval2404.itunesplayer.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.github.dhaval2404.itunesplayer.data.room.converter.DateConverter
import com.github.dhaval2404.itunesplayer.data.room.dao.SongDao
import com.github.dhaval2404.itunesplayer.data.room.entity.SongEntity

/**
 * Room Database Instance
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 06 December 2020
 */
@Database(version = 1, entities = [SongEntity::class])
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {

    companion object {

        fun getInstance(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, "itunes_player.db")
                .fallbackToDestructiveMigration()
                .build()
        }
    }

    abstract fun songDao(): SongDao
}
