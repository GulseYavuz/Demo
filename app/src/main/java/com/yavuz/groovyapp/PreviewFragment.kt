package com.yavuz.groovyapp

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.yavuz.groovyapp.databinding.FragmentPreviewBinding

class PreviewFragment : Fragment() {

    private lateinit var binding: FragmentPreviewBinding

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentPreviewBinding.inflate(inflater, container, false)
        val user = arguments?.getParcelable("name", User::class.java)
        binding.user = user
        return binding.root
    }

    fun changeBackgroundColor(backgroundColorResId: Int) {
        view?.setBackgroundColor(ContextCompat.getColor(requireContext(), backgroundColorResId))


    }


}