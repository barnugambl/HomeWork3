package com.example.summerpracticsfragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.summerpracticsfragment.databinding.FragmentCategoriesBinding
import com.google.android.material.snackbar.Snackbar

class CategoriesFragment : Fragment(R.layout.fragment_categories) {
    private var binding: FragmentCategoriesBinding? = null

    private var adapter: CarAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCategoriesBinding.bind(view)
        initAdapter()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun initAdapter() {
        binding?.run {
            adapter = CarAdapter(
                list = CarRepository.cars,
                glide = Glide.with(this@CategoriesFragment),
                onClick = {
                    Snackbar.make(root, it.url, Snackbar.LENGTH_LONG).show()
                }
            )
        }
    }
}
