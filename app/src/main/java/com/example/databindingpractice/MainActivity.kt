package com.example.databindingpractice

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databindingpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val quote = Quote("Quote 1", "This is the dummy title for quote 1")
        binding.quote = quote

        binding.changeScreenBtn.setOnClickListener {
             startActivity(Intent(this@MainActivity, DataBindingWithLiveDataAndViewModelActivity::class.java))
        }
    }
}
