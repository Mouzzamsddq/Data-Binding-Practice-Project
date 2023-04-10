package com.example.databindingpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databindingpractice.databinding.ActivityBindingAdapterBinding

class BindingAdapterActivity : AppCompatActivity() {
    lateinit var binding: ActivityBindingAdapterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_binding_adapter)
        val post = Post(
            title = "Dummy Post",
            text = "Dummy Text",
            imageUrl = "https://source.unsplash.com/user/c_v_r/1900x800",
        )
        binding.post = post
    }
}
