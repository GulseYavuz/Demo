package com.yavuz.groovyapp

import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter

@BindingAdapter("customText1")
fun TextView.customText(text: String) {
    this.text = text
    this.setTextColor(ContextCompat.getColor(context, R.color.purple_200))
}