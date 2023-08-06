package com.example.apexercise77

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apexercise77.databinding.ActivityDermExfoBinding

class DermExfo : AppCompatActivity() {
    private lateinit var binding : ActivityDermExfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDermExfoBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}