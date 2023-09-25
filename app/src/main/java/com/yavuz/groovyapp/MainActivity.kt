package com.yavuz.groovyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.yavuz.groovyapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val view =binding.root
        setContentView(view) //view binding activityde nasıl kullanılır

        replaceFragment(MainFragment())

    //Wıth fragment manager kullanarak fragment nasıl yönetilir


    }



}
