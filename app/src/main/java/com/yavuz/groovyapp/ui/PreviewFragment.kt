package com.yavuz.groovyapp.ui

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.yavuz.groovyapp.databinding.FragmentPreviewBinding
import com.yavuz.groovyapp.model.User
import com.yavuz.groovyapp.model.UserObservable
import com.yavuz.groovyapp.util.parcelable

class PreviewFragment : Fragment() {

    private lateinit var binding: FragmentPreviewBinding
    private val userObservable = UserObservable()

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentPreviewBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        val userData = arguments?.parcelable<User>("name")
        userObservable.data.set(userData?.name)
        binding.user = userObservable
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setOnClickListener {
            changeData()
        }
    }

    private fun changeData() {
        /**
         * First Way of changing the text
         */
        // userObservable.observable.set("ngjgjjghkjghkjykuhgjkgkjgjk")
        /**
         * Second way of changing the text (classical)
         */
        binding.textViewDegisen.text = "jjjj"
    }
}