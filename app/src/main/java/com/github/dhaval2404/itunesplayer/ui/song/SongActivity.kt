package com.github.dhaval2404.itunesplayer.ui.song

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.github.dhaval2404.itunesplayer.R
import com.github.dhaval2404.itunesplayer.databinding.ActivitySongBinding
import com.github.dhaval2404.itunesplayer.ui.base.BaseActivity

/**
 * Songs Listing Screen
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 05 December 2020
 */
class SongActivity : BaseActivity<ActivitySongBinding, SongViewModel>() {

    override fun getLayout() = R.layout.activity_song

    override fun getViewModel(): SongViewModel {
        return ViewModelProvider(this).get(SongViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

}
