package com.example.apexercise77

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apexercise77.databinding.ActivityBeautyLotionBinding

class BeautyLotion : AppCompatActivity() {
    private lateinit var binding : ActivityBeautyLotionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBeautyLotionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}