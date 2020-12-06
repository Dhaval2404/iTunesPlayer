package com.github.dhaval2404.itunesplayer.ui.song

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.dhaval2404.itunesplayer.data.room.entity.SongEntity
import com.github.dhaval2404.itunesplayer.databinding.AdapterSongListBinding

/**
 * Songs Listing Adapter
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 06 December 2020
 */
class SongListAdapter : RecyclerView.Adapter<SongListAdapter.SongViewHolder>() {

    val itemList: MutableList<SongEntity> = mutableListOf()
    private var mItemClickListener: ((SongEntity) -> Unit)? = null

    fun setItemClickListener(listener: ((SongEntity) -> Unit)) {
        mItemClickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AdapterSongListBinding.inflate(
            inflater,
            parent,
            false
        )
        return SongViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val songEntity = itemList[position]
        holder.bind(songEntity)
    }

    override fun getItemCount(): Int = itemList.size

    fun refresh(list: List<SongEntity>) {
        itemList.clear()
        itemList.addAll(list)
        notifyDataSetChanged()
    }

    inner class SongViewHolder(private val viewBinding: AdapterSongListBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        init {
            viewBinding.root.setOnClickListener {
                mItemClickListener?.invoke(it.tag as SongEntity)
            }
        }

        fun bind(song: SongEntity) {
            viewBinding.root.tag = song
            viewBinding.entity = song
            viewBinding.executePendingBindings()
        }
    }
}
