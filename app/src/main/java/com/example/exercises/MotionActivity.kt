package com.example.exercises

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
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


        val myList = listOf(
             Pair(binding.includePurchase.btnEditPurchasePrice,binding.includePurchase.root),
             Pair(binding.includeMortgage.btnEditMortgagePrice,binding.includeMortgage.root),
             Pair(binding.includeVoucherOpen.btnEditVoucherOpenPay,binding.includeVoucherOpen.root))

        val btnList = listOf(
            binding.includePurchase.btnEditPurchasePrice,
            binding.includeMortgage.btnEditMortgagePrice,
            binding.includeVoucherOpen.btnEditVoucherOpenPay
        )


        binding.includePurchase.root.setTransitionListener(object : MotionLayout.TransitionListener{
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {


            }

            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {

            }



            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {



                myList.forEach { view ->
                    if( myList.filter { it.first.isVisible.not() }.isNotEmpty() && view.first.id != binding.includePurchase.btnEditPurchasePrice.id){
                        view.first.isEnabled = false
                        view.second.alpha = 0.3F

                    }else{
                        view.first.isEnabled = true
                        view.second.alpha = 1F
                    }
                }
            }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {



            }

        })

        binding.includeMortgage.root.setTransitionListener(object : MotionLayout.TransitionListener{
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {

            }

            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {

            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                myList.forEach { view ->
                    if( myList.filter { it.first.isVisible.not() }.isNotEmpty() && view.first.id != binding.includeMortgage.btnEditMortgagePrice.id){
                        view.first.isEnabled = false
                        view.second.alpha = 0.3F

                    }else{
                        view.first.isEnabled = true
                        view.second.alpha = 1F
                    }
                }
                }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {

            }
        })

        binding.includeVoucherOpen.root.setTransitionListener(object : MotionLayout.TransitionListener{
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {

            }

            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {

            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                myList.forEach { view ->
                    if( myList.filter { it.first.isVisible.not() }.isNotEmpty() && view.first.id != binding.includeVoucherOpen.btnEditVoucherOpenPay.id){
                        view.first.isEnabled = false
                        view.second.alpha = 0.3F

                    }else{
                        view.first.isEnabled = true
                        view.second.alpha = 1F
                    }
                }
                }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {

            }
        })


    }
}