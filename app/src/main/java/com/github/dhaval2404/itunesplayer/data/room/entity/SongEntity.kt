package com.github.dhaval2404.itunesplayer.data.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.Date

/**
 * Song Table
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 06 December 2020
 */

@Entity(tableName = "song")
data class SongEntity(

    @ColumnInfo
    @PrimaryKey(autoGenerate = false)
    val id: Long,

    @ColumnInfo
    val name: String,

    @ColumnInfo
    val title: String,

    @ColumnInfo
    val link: String,

    @ColumnInfo
    val artist: String,

    @ColumnInfo
    val cover: String? = null,

    @ColumnInfo
    val duration: Int,

    @ColumnInfo(name = "rights")
    var rights: String? = null,

    @ColumnInfo(name = "update_at")
    var updateAt: Date? = null,
) : Serializable
