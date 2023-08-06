package com.example.apexercise77

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apexercise77.databinding.ActivityRadiantBoostBinding

class RadiantBoost : AppCompatActivity() {
    private lateinit var binding : ActivityRadiantBoostBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRadiantBoostBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}