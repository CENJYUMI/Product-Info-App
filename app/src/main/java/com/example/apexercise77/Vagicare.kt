package com.example.apexercise77

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apexercise77.databinding.ActivityVagicareBinding

class Vagicare : AppCompatActivity() {
    private lateinit var binding : ActivityVagicareBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVagicareBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}