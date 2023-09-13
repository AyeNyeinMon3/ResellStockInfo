package com.example.exercises

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.exercises.databinding.ActivityMotionBinding

class MotionActivity:AppCompatActivity() {

    lateinit var binding: ActivityMotionBinding

    @SuppressLint("UseCompatLoadingForDrawables", "ResourceAsColor", "ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMotionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnEditMortgagePrice = binding.includeMortgage.btnEditMortgagePrice

        binding.includePruchase.btnEditPurchasePrice.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                btnEditMortgagePrice.isEnabled = true
            } else if (event.action == MotionEvent.ACTION_DOWN) {
                btnEditMortgagePrice.isEnabled = false
            }

            false
        }


    }
}