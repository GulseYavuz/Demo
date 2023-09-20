package com.yavuz.groovyapp

import AmaniSDKUI
import ai.amani.base.utility.AmaniVersion
import ai.amani.sdk.extentions.parcelable
import ai.amani.sdk.model.KYCResult
import ai.amani.sdk.utils.AppConstant
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.yavuz.groovyapp.databinding.ActivityMainBinding
import com.yavuz.groovyapp.databinding.FragmentMainBinding
import com.yavuz.groovyapp.ui.theme.GroovyAppTheme


class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding
  //  private lateinit var  bindingFragment : FragmentMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //bindingFragment = FragmentMainBinding.inflate(layoutInflater)

        setContentView(binding.root) //view binding activityde nasıl kullanılır
        replaceFragment(MainFragment())

       // setContentView(bindingFragment.root)
        //Wıth fragment manager kullanarak fragment nasıl yönetilir


    }



}
