package com.example.exercises

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.exercises.databinding.ActivityMotionBinding
import com.google.android.material.button.MaterialButton

class MotionActivity:AppCompatActivity() {

    lateinit var binding: ActivityMotionBinding

    @SuppressLint("UseCompatLoadingForDrawables", "ResourceAsColor", "ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMotionBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val btnList = listOf<MaterialButton>(binding.includePurchase.btnEditPurchasePrice,binding.includeMortgage.btnEditMortgagePrice)


        binding.includePurchase.btnEditPurchasePrice.setOnClickListener {
            btnList.forEach {view->

                view.isEnabled = btnList.any { !it.isVisible }

            }
        }


    }
}