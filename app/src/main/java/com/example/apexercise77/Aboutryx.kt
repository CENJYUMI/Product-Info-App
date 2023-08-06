package com.example.apexercise77

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apexercise77.databinding.ActivityAboutryxBinding
import com.example.apexercise77.databinding.ActivityMainBinding

class Aboutryx : AppCompatActivity() {
    private lateinit var binding : ActivityAboutryxBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutryxBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}