package com.github.dhaval2404.itunesplayer.ui.splash

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.github.dhaval2404.itunesplayer.R
import com.github.dhaval2404.itunesplayer.databinding.ActivitySplashBinding
import com.github.dhaval2404.itunesplayer.ui.base.BaseActivity

/**
 * Splash Screen
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 05 December 2020
 */
class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>() {

    override fun getLayout() = R.layout.activity_splash

    override fun getViewModel(): SplashViewModel {
        return ViewModelProvider(this).get(SplashViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewDataBinding.viewModel = mViewModel

        setObserver()

        // Perform Initialization
        mViewModel.preProcessing()
    }

    /**
     * Listen to ViewModel changes
     */
    private fun setObserver() {
        mViewModel.syncLiveData.observe(this, {
            startSongActivity()
        })
    }

    private fun startSongActivity() {

    }
}
