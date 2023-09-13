package com.example.exercises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exercises.databinding.ActivityResellStockInfoBinding

class ResellStockInfoActivity : AppCompatActivity() {

    lateinit var binding : ActivityResellStockInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResellStockInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}