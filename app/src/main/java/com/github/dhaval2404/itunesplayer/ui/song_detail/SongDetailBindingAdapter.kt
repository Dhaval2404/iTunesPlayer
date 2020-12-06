package com.github.dhaval2404.itunesplayer.ui.song_detail

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load
import com.github.dhaval2404.itunesplayer.R
import com.github.dhaval2404.itunesplayer.utils.DateTimeUtil
import com.google.android.material.floatingactionbutton.FloatingActionButton

/**
 * Songs Listing Screen
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 06 December 2020
 */
object SongDetailBindingAdapter {

    @JvmStatic
    @BindingAdapter("srcImage")
    fun bindSrcImage(imageView: ImageView, url: String?) {
        imageView.load(url)
    }

    @JvmStatic
    @BindingAdapter("srcPlayPause")
    fun bindPlayPauseImage(imageView: FloatingActionButton, isPlaying: Boolean?) {
        val resourceId = if (isPlaying == true) {
            R.drawable.baseline_pause_white_24dp
        } else {
            R.drawable.baseline_play_arrow_white_24dp
        }
        imageView.setImageResource(resourceId)
    }

    @JvmStatic
    @BindingAdapter("visible")
    fun bindVisibility(view: View, visible: Boolean) {
        view.visibility = if (visible) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }

    @JvmStatic
    @BindingAdapter("duration")
    fun bindDuration(view: TextView, duration: Int) {
        view.text = DateTimeUtil.getFormattedDuration(duration)
    }
}
