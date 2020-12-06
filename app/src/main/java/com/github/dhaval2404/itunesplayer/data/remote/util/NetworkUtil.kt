package com.github.dhaval2404.itunesplayer.data.remote.util

import android.content.Context
import android.net.ConnectivityManager
import android.os.Build

/**
 * @author Dhaval Patel
 * @version 1.0
 * @since 05 December 2020
 */
object NetworkUtil {

    @Suppress("DEPRECATION")
    fun isConnected(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return connectivityManager.activeNetwork != null
        } else {
            val activeNetworkInfo = connectivityManager.activeNetworkInfo
            activeNetworkInfo != null && activeNetworkInfo.isConnected
        }
    }
}
