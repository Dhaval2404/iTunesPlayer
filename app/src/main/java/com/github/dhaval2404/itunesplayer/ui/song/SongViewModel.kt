package com.github.dhaval2404.itunesplayer.ui.song

import androidx.lifecycle.LiveData
import com.github.dhaval2404.itunesplayer.data.repository.ITunesRepository
import com.github.dhaval2404.itunesplayer.data.room.entity.SongEntity
import com.github.dhaval2404.itunesplayer.ui.base.BaseViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

/**
 * ViewModel for SongActivity
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 05 December 2020
 */
class SongViewModel : BaseViewModel(), KoinComponent {

    private val mITunesRepository by inject<ITunesRepository>()
    val songsLiveData: LiveData<List<SongEntity>>

    init {
        // Fetch Top Songs from Database
        songsLiveData = mITunesRepository.getTopSongs()
    }
}
