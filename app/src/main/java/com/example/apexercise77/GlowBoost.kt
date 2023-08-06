package com.example.apexercise77

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apexercise77.databinding.ActivityGlowBoostBinding

class GlowBoost : AppCompatActivity() {
    private lateinit var binding : ActivityGlowBoostBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGlowBoostBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}