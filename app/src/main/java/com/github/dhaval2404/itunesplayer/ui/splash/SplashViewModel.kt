package com.github.dhaval2404.itunesplayer.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.github.dhaval2404.itunesplayer.ui.base.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * ViewModel for SplashActivity
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 05 December 2020
 */
class SplashViewModel : BaseViewModel() {

    private val mSyncLiveData = MutableLiveData<Boolean>()
    val syncLiveData: LiveData<Boolean> = mSyncLiveData

    /**
     * Perform task on App Launch
     */
    fun preProcessing() {
        viewModelScope.launch {
            // Add dummy delay
            delay(SPLASH_DELAY)

            // Start Next Screen
            mSyncLiveData.postValue(true)
        }
    }

    companion object {
        // 3 sec delay
        private const val SPLASH_DELAY = 3000L
    }
}
