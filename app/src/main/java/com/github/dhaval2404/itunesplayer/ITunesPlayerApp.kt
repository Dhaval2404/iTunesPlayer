package com.github.dhaval2404.itunesplayer

import android.app.Application
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger.addLogAdapter
import com.orhanobut.logger.PrettyFormatStrategy

/**
 * Application Instance
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 05 December 2020
 */
class ITunesPlayerApp : Application() {

    override fun onCreate() {
        super.onCreate()

        initLogger()
    }

    /**
     * Initialize the logger
     */
    private fun initLogger() {
        if (!BuildConfig.DEBUG) return

        val formatStrategy = PrettyFormatStrategy.newBuilder()
            .showThreadInfo(false) // (Optional) Whether to show thread info or not. Default true
            .methodCount(2) // (Optional) How many method line to show. Default 2
            .methodOffset(0) // (Optional) Hides internal method calls up to offset. Default 5
            .tag(getString(R.string.app_name)) // (Optional) Global tag for every log. Default PRETTY_LOGGER
            .build()

        addLogAdapter(AndroidLogAdapter(formatStrategy))
    }
}
