package com.example.apexercise77

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apexercise77.databinding.ActivityGlowBombBinding

class GlowBomb : AppCompatActivity() {
    private lateinit var binding : ActivityGlowBombBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGlowBombBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}