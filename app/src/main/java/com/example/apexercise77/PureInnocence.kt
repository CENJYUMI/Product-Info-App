package com.example.apexercise77

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apexercise77.databinding.ActivityPureInnocenceBinding

class PureInnocence : AppCompatActivity() {
    private lateinit var binding : ActivityPureInnocenceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPureInnocenceBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}