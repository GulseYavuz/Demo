package com.yavuz.groovyapp

import android.os.Build.VERSION.SDK_INT
import android.os.Bundle
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.replaceFragment(fragment: Fragment){
    this.supportFragmentManager.beginTransaction()
        .addToBackStack(fragment.tag)
        .replace(R.id.frame_layout, fragment)
        .commit()
}

fun Fragment.replaceFragment(fragment: Fragment) {
    this.requireActivity().supportFragmentManager
        .beginTransaction()
        .addToBackStack(fragment.tag)
        .replace(R.id.frame_layout, fragment)
        .commit()
}

inline fun <reified T : Parcelable> Bundle.parcelable(key: String): T? = when {
    SDK_INT >= 33 -> getParcelable(key, T::class.java)
    else -> @Suppress("DEPRECATION") getParcelable(key) as? T
}