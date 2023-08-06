package com.example.apexercise77

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apexercise77.databinding.ActivitySlayTheDayBinding

class SlayTheDay : AppCompatActivity() {
    private lateinit var binding : ActivitySlayTheDayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySlayTheDayBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}