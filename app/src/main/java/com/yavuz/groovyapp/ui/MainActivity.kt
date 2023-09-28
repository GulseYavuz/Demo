package com.yavuz.groovyapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yavuz.groovyapp.R
import com.yavuz.groovyapp.databinding.ActivityMainBinding
import com.yavuz.groovyapp.util.replaceFragment


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val view =binding.root
        setContentView(view) //view binding activityde nasıl kullanılır

        replaceFragment(MainFragment())
    }
}
