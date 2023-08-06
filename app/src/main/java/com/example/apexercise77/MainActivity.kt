package com.example.apexercise77

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.apexercise77.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.whatIsRyx.setOnClickListener {
            val intent = Intent(this, Aboutryx::class.java)

            startActivity(intent)
            Toast.makeText(this, "About Us", Toast.LENGTH_SHORT).show()

        }
        binding.Interested.setOnClickListener {
            val intent = Intent(this, Products::class.java)

            startActivity(intent)
            Toast.makeText(this, "Slay The Day", Toast.LENGTH_SHORT).show()

        }
    }
}