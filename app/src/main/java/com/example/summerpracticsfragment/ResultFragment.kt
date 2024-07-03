package com.example.summerpracticsfragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.summerpracticsfragment.databinding.FragmentResultBinding

class ResultFragment : Fragment(R.layout.fragment_result) {

    private var binding: FragmentResultBinding? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentResultBinding.bind(view)
        val text = arguments?.getString("ARG",) ?: "ERROR"

        binding?.run {
            textView.text = text
        }

    }

}