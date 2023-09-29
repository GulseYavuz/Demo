package com.yavuz.groovyapp.model

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

class PreviewFragmentViewModel : ViewModel() {
    var sharedData: ObservableField<String> = ObservableField()

    fun startWatch() {
        var i = 0
        CoroutineScope(Dispatchers.Main).launch {
            while (isActive) {
                i += 1
                delay(1000)
                sharedData.set(i.toString())
            }
        }
    }

}
