package com.example.task


import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.example.task.databinding.ActivityMainBinding
import com.example.task.R

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        loadImage(getString(R.string.img1),binding.imageView)
       loadImage(getString(R.string.img2),binding.imageView5)
        loadImage(getString(R.string.img3),binding.imageView6)
       loadImage(getString(R.string.img4),binding.imageView7)

    }
private fun loadImage(url:String,imageView:ImageView){
    Glide.with(this)
        .load(url)
        .into(imageView)
}

    }


