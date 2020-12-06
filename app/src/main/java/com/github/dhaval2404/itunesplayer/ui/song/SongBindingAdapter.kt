package com.github.dhaval2404.itunesplayer.ui.song

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation
import com.github.dhaval2404.itunesplayer.R
import com.github.dhaval2404.itunesplayer.data.room.entity.SongEntity

/**
 * Songs Listing Screen
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 06 December 2020
 */
object SongBindingAdapter {

    @JvmStatic
    @BindingAdapter("srcCoverImage")
    fun bindSrcCoverImage(imageView: ImageView, url: String?) {
        imageView.load(url) {
            val radius = imageView.resources.getDimension(R.dimen.cover_small_corner_radius)
            transformations(RoundedCornersTransformation(radius))
        }
    }

    @JvmStatic
    @BindingAdapter(value = ["adapter"])
    fun bindAdapter(recyclerView: RecyclerView, adapter: RecyclerView.Adapter<*>?) {
        recyclerView.run {
            this.setHasFixedSize(true)
            this.adapter = adapter
        }
    }

    @JvmStatic
    @BindingAdapter("adapterSongItems")
    fun bindAdapterSongItems(view: RecyclerView, pokemonList: List<SongEntity>?) {
        pokemonList?.let { itemList ->
            (view.adapter as? SongListAdapter)?.refresh(itemList)
        }
    }
}
