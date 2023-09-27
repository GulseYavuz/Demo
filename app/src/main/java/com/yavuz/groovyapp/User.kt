package com.yavuz.groovyapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val name: String,
    val surname: String,
    val tckn: String
) : Parcelable
