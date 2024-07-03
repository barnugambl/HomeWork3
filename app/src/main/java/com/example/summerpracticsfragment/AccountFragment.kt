package com.example.summerpracticsfragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.summerpracticsfragment.databinding.FragmentAccountBinding

class AccountFragment: Fragment(R.layout.fragment_account) {
    private var binding: FragmentAccountBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAccountBinding.bind(view)

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}