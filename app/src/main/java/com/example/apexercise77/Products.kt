package com.example.apexercise77

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.apexercise77.databinding.ActivityProductsBinding

class Products : AppCompatActivity() {
    private lateinit var binding : ActivityProductsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.glowBomb.setOnClickListener {
            val intent = Intent (this, GlowBomb::class.java)
            startActivity(intent)
            Toast.makeText(this, "Glow Bomb", Toast.LENGTH_SHORT).show()
        }
        binding.txtGlowBomb.setOnClickListener {
            val intent = Intent (this, GlowBomb::class.java)
            startActivity(intent)
            Toast.makeText(this, "Glow Bomb", Toast.LENGTH_SHORT).show()
        }

        binding.radiant.setOnClickListener {
            val intent = Intent (this, RadiantBoost::class.java)
            startActivity(intent)
            Toast.makeText(this, "Radiant Boost", Toast.LENGTH_SHORT).show()
        }

        binding.txtRadiant.setOnClickListener {
            val intent = Intent (this, RadiantBoost::class.java)
            startActivity(intent)
            Toast.makeText(this, "Radiant Boost", Toast.LENGTH_SHORT).show()
        }

        binding.dermExfo.setOnClickListener {
            val intent = Intent (this, DermExfo::class.java)
            startActivity(intent)
            Toast.makeText(this, "Derm Exfoliator Illuminating Body Polish", Toast.LENGTH_SHORT).show()
        }

        binding.txtDermExfo.setOnClickListener {
            val intent = Intent (this, DermExfo::class.java)
            startActivity(intent)
            Toast.makeText(this, "Derm Exfoliator Illuminating Body Polish", Toast.LENGTH_SHORT).show()
        }

        binding.glowBoost.setOnClickListener {
            val intent = Intent (this, GlowBoost::class.java)
            startActivity(intent)
            Toast.makeText(this, "Glow Boost", Toast.LENGTH_SHORT).show()
        }
        binding.txtGlowBoost.setOnClickListener {
            val intent = Intent (this, GlowBoost::class.java)
            startActivity(intent)
            Toast.makeText(this, "Glow Boost", Toast.LENGTH_SHORT).show()
        }

        binding.beautyLotion.setOnClickListener {
            val intent = Intent (this, BeautyLotion::class.java)
            startActivity(intent)
            Toast.makeText(this, "Beauty Lotion", Toast.LENGTH_SHORT).show()
        }

        binding.txtBeautyLotion.setOnClickListener {
            val intent = Intent (this, BeautyLotion::class.java)
            startActivity(intent)
            Toast.makeText(this, "Beauty Lotion", Toast.LENGTH_SHORT).show()
        }

        binding.vagicare.setOnClickListener {
            val intent = Intent (this, Vagicare::class.java)
            startActivity(intent)
            Toast.makeText(this, "Vagicare", Toast.LENGTH_SHORT).show()
        }

        binding.txtVagicare.setOnClickListener {
            val intent = Intent (this, Vagicare::class.java)
            startActivity(intent)
            Toast.makeText(this, "Vagicare", Toast.LENGTH_SHORT).show()
        }

        binding.slayTheDay.setOnClickListener {
            val intent = Intent (this, SlayTheDay::class.java)
            startActivity(intent)
            Toast.makeText(this, "Slay The Day", Toast.LENGTH_SHORT).show()
        }

        binding.txtSlayTheDay.setOnClickListener {
            val intent = Intent (this, SlayTheDay::class.java)
            startActivity(intent)
            Toast.makeText(this, "Slay The Day", Toast.LENGTH_SHORT).show()
        }

        binding.pureInnocence.setOnClickListener {
            val intent = Intent (this, PureInnocence::class.java)
            startActivity(intent)
            Toast.makeText(this, "Pure Innocence", Toast.LENGTH_SHORT).show()
        }

        binding.txtPureInnocence.setOnClickListener {
            val intent = Intent (this, PureInnocence::class.java)
            startActivity(intent)
            Toast.makeText(this, "Pure Innocence", Toast.LENGTH_SHORT).show()
        }


        binding.backToHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
            Toast.makeText(this, "Back to Home", Toast.LENGTH_SHORT).show()

        }
    }


}