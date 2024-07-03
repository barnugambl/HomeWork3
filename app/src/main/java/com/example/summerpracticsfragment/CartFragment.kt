package com.example.summerpracticsfragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpracticsfragment.databinding.FragmentCartBinding
import com.google.android.material.snackbar.Snackbar

class CartFragment: Fragment(R.layout.fragment_cart) {
    private var binding: FragmentCartBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCartBinding.bind(view)

        binding?.run {
            cartButton.setOnClickListener{
                val text = editText.text.toString()
                val bundle = Bundle()
                bundle.putString("ARG", text)

                findNavController().navigate(
                    resId = R.id.action_cartFragment_to_resultFragment,
                    args = bundle

                )
            }
        }



    }




    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}