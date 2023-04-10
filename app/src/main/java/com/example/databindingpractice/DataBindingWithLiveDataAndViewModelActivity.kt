package com.example.databindingpractice

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databindingpractice.databinding.ActivityDataBindingWithLiveDataAndViewModelBinding
import com.example.databindingpractice.viewmodel.QuoteViewModel

class DataBindingWithLiveDataAndViewModelActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDataBindingWithLiveDataAndViewModelBinding
    private val viewModel: QuoteViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_with_live_data_and_view_model)
        viewModel._quoteLiveData.observe(this) {
            binding.quoteTitle.text = it
        }
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.bindingAdapterScreen.setOnClickListener {
             startActivity(Intent(this@DataBindingWithLiveDataAndViewModelActivity, BindingAdapterActivity::class.java))
        }
    }
}
