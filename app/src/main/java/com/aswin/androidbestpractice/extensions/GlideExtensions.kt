package com.aswin.androidbestpractice.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.setImage(imgUrl: String?) {
    imgUrl?.let {
        Glide.with(this).load(imgUrl).into(this)
    }
}

fun ImageView.clear() {
    Glide.with(this).clear(this)
}