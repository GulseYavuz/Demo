package com.yavuz.groovyapp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    var name: String,
    var surname: String,
    var tckn: String
) : Parcelable
