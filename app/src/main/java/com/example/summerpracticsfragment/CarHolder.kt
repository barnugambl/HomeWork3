package com.example.summerpracticsfragment

import android.content.Context
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestOptions
import com.example.summerpracticsfragment.databinding.ItemCarBinding

class CarHolder(
    private val binding: ItemCarBinding,
    private val glide: RequestManager,
    private val onClick: (Car) -> Unit,
) : ViewHolder(binding.root) {


    private val requestOptions = RequestOptions
        .diskCacheStrategyOf(
            DiskCacheStrategy.ALL
        )

    private val context: Context
        get() = itemView.context

    fun onBind(car: Car) {
        binding.run {
            tvBrand.text = car.brand
            tvModel.text = car.model

            glide
                .load(car.url)
                .error(R.drawable.ic_launcher_foreground)
                .placeholder(R.drawable.ic_launcher_foreground)
                .apply(requestOptions)
                .into(ivImage)

            root.setOnClickListener {
                onClick.invoke(car)
            }
        }
    }
}




