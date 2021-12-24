package com.example.bindingadaptersexample

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/24/21.
 */

@BindingAdapter("loadImage","displayName", requireAll = true)
fun ImageView.loadImageFromUrl(image: String, name: String) {
    this.load(image)
    Log.i("MYTAG", name)
}
@BindingAdapter("setVisibility")
fun View.setVisibilityOfView(point: Int) {
    if(point>10) {
        when(this) {
            is ImageView -> {
                visibility = View.VISIBLE
            }

            is TextView -> {
                visibility = View.GONE
            }
        }
    }

}

