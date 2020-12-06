package com.github.dhaval2404.itunesplayer.ui.song_detail

import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.github.dhaval2404.itunesplayer.R
import com.github.dhaval2404.itunesplayer.data.room.entity.SongEntity
import com.github.dhaval2404.itunesplayer.databinding.ActivitySongDetailBinding
import com.github.dhaval2404.itunesplayer.ui.base.BaseActivity

/**
 * Song Detail Screen
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 06 December 2020
 */
class SongDetailActivity : BaseActivity<ActivitySongDetailBinding, SongDetailViewModel>() {

    override fun getLayout() = R.layout.activity_song_detail

    override fun getViewModel(): SongDetailViewModel {
        return ViewModelProvider(this).get(SongDetailViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Apply Binding
        mViewDataBinding.viewModel = mViewModel

        initToolbar()

        initUI()

        handleExtras()
    }

    /**
     * Setup Toolbar
     */
    private fun initToolbar() {
        val toolbar = mViewDataBinding.appbarLayout.toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    /**
     * Setup UI
     */
    private fun initUI() {
        mViewDataBinding.progressbar.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (fromUser) mViewModel.setProgress(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }

    /**
     * Handle Intent Extras
     */
    private fun handleExtras() {
        val extras = intent.extras
        val songList = extras?.getSerializable(EXTRA_SONG_LIST) as List<SongEntity>?
        val songEntity = extras?.getSerializable(EXTRA_SONG) as SongEntity?
        if (songEntity == null || songList.isNullOrEmpty()) {
            // Finish Early if data not found
            Toast.makeText(applicationContext, R.string.error_missing_song_info, Toast.LENGTH_LONG)
                .show()
            finish()
            return
        }

        mViewModel.playSong(songList, songEntity)
    }

    /**
     * Release Media Player
     */
    override fun onDestroy() {
        mViewModel.releaseMediaPlayer()
        super.onDestroy()
    }

    companion object {
        const val EXTRA_SONG_LIST = "extra.song_list"
        const val EXTRA_SONG = "extra.song"
    }
}
