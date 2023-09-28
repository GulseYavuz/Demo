package com.yavuz.groovyapp.ui.binding

import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.yavuz.groovyapp.R

@BindingAdapter("customText1")
fun TextView.customText(text: String) {
    this.text = text
    this.setTextColor(ContextCompat.getColor(context, R.color.purple_200))
}