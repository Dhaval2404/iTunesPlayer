package com.github.dhaval2404.itunesplayer.data.room.converter

import androidx.room.TypeConverter
import java.util.Date

/**
 * Room Type Converter
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 05 December 2020
 */
object DateConverter {

    @JvmStatic
    @TypeConverter
    fun toDate(dateLong: Long?): Date? {
        return if (dateLong == null) null else Date(dateLong)
    }

    @JvmStatic
    @TypeConverter
    fun fromDate(date: Date?): Long? {
        return date?.time
    }
}
