package com.github.dhaval2404.itunesplayer.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import com.github.dhaval2404.itunesplayer.R
import com.github.dhaval2404.itunesplayer.databinding.ActivitySplashBinding
import com.github.dhaval2404.itunesplayer.ui.base.BaseActivity
import com.github.dhaval2404.itunesplayer.ui.song.SongActivity

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

        // Apply Binding
        mViewDataBinding.viewModel = mViewModel

        initObserver()

        // Perform Initialization
        mViewModel.preProcessing()
    }

    /**
     * Listen to ViewModel changes
     */
    private fun initObserver() {
        // Observe Sync Complete
        mViewModel.syncLiveData.observe(
            this,
            { _ ->
                startSongActivity()
            }
        )

        // Observe Error
        mViewModel.errorLiveData.observe(
            this,
            { error ->
                showErrorMessage(error)
            }
        )
    }

    private fun showErrorMessage(message: String) {
        AlertDialog.Builder(this)
            .setMessage(message)
            .setPositiveButton(android.R.string.ok, null)
            .show()
    }

    /**
     * Navigate to Song Listing Screen
     */
    private fun startSongActivity() {
        // Start Song Activity
        val intent = Intent(this, SongActivity::class.java)
        startActivity(intent)

        // Finish Splash Activity. It should not open on back press
        finish()
    }
}
