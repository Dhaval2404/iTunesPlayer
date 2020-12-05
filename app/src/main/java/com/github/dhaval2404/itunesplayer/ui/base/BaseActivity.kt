package com.github.dhaval2404.itunesplayer.ui.base

import android.os.Bundle
import android.view.MenuItem
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * Parent Activity for all the app activity
 *
 * @author Dhaval Patel
 * @version 1.0
 * @since 05 December 2020
 */
abstract class BaseActivity<VDB : ViewDataBinding, VM : BaseViewModel>() : AppCompatActivity() {

    protected lateinit var mViewDataBinding: VDB
    protected lateinit var mViewModel: VM

    /**
     * @return layout resource id
     */
    @LayoutRes
    abstract fun getLayout(): Int

    /**
     * @return ViewModel instance
     */
    abstract fun getViewModel(): VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDataBinding()
    }

    private fun performDataBinding() {
        mViewModel = getViewModel()
        mViewDataBinding = DataBindingUtil.setContentView(this, getLayout())
        mViewDataBinding.executePendingBindings()
        mViewDataBinding.lifecycleOwner = this
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }
}
