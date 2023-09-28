package com.yavuz.groovyapp

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.databinding.ObservableField
import androidx.fragment.app.Fragment
import com.yavuz.groovyapp.databinding.FragmentPreviewBinding

class PreviewFragment : Fragment() {

    private lateinit var binding: FragmentPreviewBinding
    private var userObservable = ObservableField<User>()

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentPreviewBinding.inflate(inflater, container, false)

        val userData = arguments?.getParcelable("name", User::class.java)

        userObservable = ObservableField(userData)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.user = UserObservable(ObservableField(userObservable))
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setOnClickListener {
            changeData()
        }
    }

    private fun changeData() {
        userObservable.get()?.name = "dfgdghdgh"
        userObservable.get()?.surname = "dfgdghdgh"
        userObservable.get()?.tckn = "49769854"
    }

}