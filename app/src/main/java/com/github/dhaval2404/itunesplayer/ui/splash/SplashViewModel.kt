package com.github.dhaval2404.itunesplayer.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.github.dhaval2404.itunesplayer.data.remote.NetworkResponse
import com.github.dhaval2404.itunesplayer.data.repository.ITunesRepository
import com.github.dhaval2404.itunesplayer.ui.base.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

/**
 * ViewModel for SplashActivity
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 05 December 2020
 */
class SplashViewModel : BaseViewModel(), KoinComponent {

    private val mITunesRepository by inject<ITunesRepository>()

    private val mSyncLiveData = MutableLiveData<Boolean>()
    val syncLiveData: LiveData<Boolean> = mSyncLiveData

    private val mErrorLiveData = MutableLiveData<String>()
    val errorLiveData: LiveData<String> = mErrorLiveData

    /**
     * Perform task on App Launch
     */
    fun preProcessing() {
        viewModelScope.launch {
            // Add dummy delay
            delay(SPLASH_DELAY)

            // Fetch Top Songs
            val response = mITunesRepository.fetchTopSongs()
            if (response is NetworkResponse.Success) {
                // Start Next Screen
                mSyncLiveData.postValue(true)
            } else if (response is NetworkResponse.Error) {
                mErrorLiveData.postValue(response.error)
            }
        }
    }

    companion object {
        // 3 sec delay
        private const val SPLASH_DELAY = 3000L
    }
}
