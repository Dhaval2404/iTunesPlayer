package com.github.dhaval2404.itunesplayer.ui.song

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.github.dhaval2404.itunesplayer.R
import com.github.dhaval2404.itunesplayer.data.room.entity.SongEntity
import com.github.dhaval2404.itunesplayer.databinding.ActivitySongBinding
import com.github.dhaval2404.itunesplayer.ui.base.BaseActivity
import com.github.dhaval2404.itunesplayer.ui.song_detail.SongDetailActivity

/**
 * Songs Listing Screen
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 05 December 2020
 */
class SongActivity : BaseActivity<ActivitySongBinding, SongViewModel>() {

    private val mAdapter: SongListAdapter by lazy {
        SongListAdapter()
    }

    override fun getLayout() = R.layout.activity_song

    override fun getViewModel(): SongViewModel {
        return ViewModelProvider(this).get(SongViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Apply Binding
        mViewDataBinding.apply {
            viewModel = mViewModel
            adapter = mAdapter
        }

        initToolbar()
        initUI()
    }

    /**
     * Set Toolbar
     */
    private fun initToolbar() {
        val toolbar = mViewDataBinding.appbarLayout.toolbar
        setSupportActionBar(toolbar)
    }

    /**
     * Setup UI
     */
    private fun initUI() {
        mAdapter.setItemClickListener { song ->
            startSongDetailActivity(song)
        }
    }

    /**
     * Navigate to Song Detail Screen
     */
    private fun startSongDetailActivity(song: SongEntity) {
        // Start Song Detail Activity
        val intent = Intent(this, SongDetailActivity::class.java)
        intent.putExtra(SongDetailActivity.EXTRA_SONG_LIST, ArrayList(mAdapter.itemList))
        intent.putExtra(SongDetailActivity.EXTRA_SONG, song)
        startActivity(intent)
    }
}
