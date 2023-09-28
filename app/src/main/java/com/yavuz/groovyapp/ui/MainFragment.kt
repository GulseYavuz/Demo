package com.yavuz.groovyapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yavuz.groovyapp.databinding.FragmentMainBinding
import com.yavuz.groovyapp.model.User
import com.yavuz.groovyapp.util.replaceFragment


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var user: User

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        user = User(
            name = binding.editTextName.text.toString(),
            surname = binding.editTextSurname.text.toString(),
            tckn = binding.editTextTckn.text.toString()
        )

        binding.buttonGiris.setOnClickListener {
            val previewFragment = PreviewFragment()
            val bundle = Bundle()
            bundle.putParcelable("name", user)
            previewFragment.arguments = bundle

            replaceFragment(previewFragment)
        }

    }
}