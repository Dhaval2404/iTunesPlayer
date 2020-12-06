package com.github.dhaval2404.itunesplayer.utils

/**
 * DateTime utility methods
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 06 December 2020
 */
object DateTimeUtil {

    /**
     * Format Duration
     * e.g. 01:30 for 90 seconds
     *
     * @return String formatted duration as XX:XX
     */
    fun getFormattedDuration(duration: Int): String {
        val minutes = (duration / 1000) / 60
        val seconds = ((duration / 1000) % 60)
        return String.format("%02d:%02d", minutes, seconds)
    }
}
