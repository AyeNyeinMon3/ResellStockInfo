package com.example.exercises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.view.isVisible
import com.example.exercises.databinding.ActivityResellStockInfoBinding

class ResellStockInfoActivity : AppCompatActivity() {

    lateinit var binding : ActivityResellStockInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResellStockInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val myList = listOf(
            Pair(binding.includeAmountList.includeGoldAndGemWeightGm.btnEdtGoldAndGemWeightGm,binding.includeAmountList.includeGoldAndGemWeightGm.root),
            Pair(binding.includeAmountList.includeGoldAndGemWeightKpy.btnEditGoldAndGemWeightKPY,binding.includeAmountList.includeGoldAndGemWeightKpy.root),
            Pair(binding.includeAmountList.includeGemWeight.btnEditGemWeightKPY, binding.includeAmountList.includeGemWeight.root),
            Pair(binding.includeAmountList.includeGeeWeight.btnEditGeeWeightKPY, binding.includeAmountList.includeGeeWeight.root),
            Pair(binding.includeAmountList.includeItemType.rBtnGood, binding.includeAmountList.includeItemType.root),
            Pair(binding.includeAmountList.includeGoldQ.btnEditGoldQ, binding.includeAmountList.includeGoldQ.root),
            Pair(binding.includeAmountList.includeGeneralExpense.switchGeneralExpense,binding.includeAmountList.includeGeneralExpense.root),
            Pair(binding.includeAmountList.includePurchasePrice.btnEditPurchasePrice,binding.includeAmountList.includePurchasePrice.root),
            Pair(binding.includeAmountList.includeMortgagePrice.btnEditMortgagePrice,binding.includeAmountList.includeMortgagePrice.root),
            Pair(binding.includeAmountList.includeVoucherOpenPay.btnEditVoucherOpenPay,binding.includeAmountList.includeVoucherOpenPay.root),
            Pair(binding.includeAmountList.includeVoucherOpenPrice.btnEditVoucherOpenPrice,binding.includeAmountList.includeVoucherOpenPrice.root),
            Pair(binding.includeAmountList.includePurchaseGoldWeight.btnEditPurchaseGoldWeight,binding.includeAmountList.includePurchaseGoldWeight.root)



        )

        binding.includeAmountList.includeGoldAndGemWeightGm.root.setTransitionListener(object : MotionLayout.TransitionListener{
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
                    if( myList.filter { it.first.isVisible.not() }.isNotEmpty() && view.first.id != binding.includeAmountList.includeGoldAndGemWeightGm.btnEdtGoldAndGemWeightGm.id){
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

        binding.includeAmountList.includeGoldAndGemWeightKpy.root.setTransitionListener(object : MotionLayout.TransitionListener{
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
                    if( myList.filter { it.first.isVisible.not() }.isNotEmpty() && view.first.id != binding.includeAmountList.includeGoldAndGemWeightKpy.btnEditGoldAndGemWeightKPY.id){
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

//        binding.includeAmountList.includeItemType.root.setTransitionListener(object : MotionLayout.TransitionListener{
//            override fun onTransitionStarted(
//                motionLayout: MotionLayout?,
//                startId: Int,
//                endId: Int
//            ) {
//
//
//            }
//
//            override fun onTransitionChange(
//                motionLayout: MotionLayout?,
//                startId: Int,
//                endId: Int,
//                progress: Float
//            ) {
//
//            }
//
//
//
//            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
//
//
//
//                myList.forEach { view ->
//                    if( myList.filter { it.first.isVisible.not() }.isNotEmpty() && view.first.id != binding.includeAmountList.includeItemType.rBtnGood.id){
//                        view.first.isEnabled = false
//                        view.second.alpha = 0.3F
//
//                    }else{
//                        view.first.isEnabled = true
//                        view.second.alpha = 1F
//                    }
//                }
//            }
//
//            override fun onTransitionTrigger(
//                motionLayout: MotionLayout?,
//                triggerId: Int,
//                positive: Boolean,
//                progress: Float
//            ) {
//
//
//
//            }
//
//        })

        binding.includeAmountList.includeGemWeight.root.setTransitionListener(object : MotionLayout.TransitionListener{
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
                    if( myList.filter { it.first.isVisible.not() }.isNotEmpty() && view.first.id != binding.includeAmountList.includeGemWeight.btnEditGemWeightKPY.id){
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

        binding.includeAmountList.includeGeeWeight.root.setTransitionListener(object : MotionLayout.TransitionListener{
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
                    if( myList.filter { it.first.isVisible.not() }.isNotEmpty() && view.first.id != binding.includeAmountList.includeGeeWeight.btnEditGeeWeightKPY.id){
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

        binding.includeAmountList.includeGoldQ.root.setTransitionListener(object : MotionLayout.TransitionListener{
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
                    if( myList.filter { it.first.isVisible.not() }.isNotEmpty() && view.first.id != binding.includeAmountList.includeGoldQ.btnEditGoldQ.id){
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

//        binding.includeAmountList.includeGeneralExpense.root.setTransitionListener(object : MotionLayout.TransitionListener{
//            override fun onTransitionStarted(
//                motionLayout: MotionLayout?,
//                startId: Int,
//                endId: Int
//            ) {
//
//
//            }
//
//            override fun onTransitionChange(
//                motionLayout: MotionLayout?,
//                startId: Int,
//                endId: Int,
//                progress: Float
//            ) {
//
//            }
//
//
//
//            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
//
//
//
//                myList.forEach { view ->
//                    if( myList.filter { it.first.isVisible.not() }.isNotEmpty() && view.first.id != binding.includeAmountList.includeGeneralExpense.switchGeneralExpense.id){
//                        view.first.isEnabled = false
//                        view.second.alpha = 0.3F
//
//                    }else{
//                        view.first.isEnabled = true
//                        view.second.alpha = 1F
//                    }
//                }
//            }
//
//            override fun onTransitionTrigger(
//                motionLayout: MotionLayout?,
//                triggerId: Int,
//                positive: Boolean,
//                progress: Float
//            ) {
//
//
//
//            }
//
//        })

        binding.includeAmountList.includePurchasePrice.root.setTransitionListener(object : MotionLayout.TransitionListener{
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
                    if( myList.filter { it.first.isVisible.not() }.isNotEmpty() && view.first.id != binding.includeAmountList.includePurchasePrice.btnEditPurchasePrice.id){
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

        binding.includeAmountList.includeMortgagePrice.root.setTransitionListener(object : MotionLayout.TransitionListener{
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
                    if( myList.filter { it.first.isVisible.not() }.isNotEmpty() && view.first.id != binding.includeAmountList.includeMortgagePrice.btnEditMortgagePrice.id){
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

        binding.includeAmountList.includeVoucherOpenPay.root.setTransitionListener(object : MotionLayout.TransitionListener{
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
                    if( myList.filter { it.first.isVisible.not() }.isNotEmpty() && view.first.id != binding.includeAmountList.includeVoucherOpenPay.btnEditVoucherOpenPay.id){
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

        binding.includeAmountList.includeVoucherOpenPrice.root.setTransitionListener(object : MotionLayout.TransitionListener{
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
                    if( myList.filter { it.first.isVisible.not() }.isNotEmpty() && view.first.id != binding.includeAmountList.includeVoucherOpenPrice.btnEditVoucherOpenPrice.id){
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

        binding.includeAmountList.includePurchaseGoldWeight.root.setTransitionListener(object : MotionLayout.TransitionListener{
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
                    if( myList.filter { it.first.isVisible.not() }.isNotEmpty() && view.first.id != binding.includeAmountList.includePurchaseGoldWeight.btnEditPurchaseGoldWeight.id){
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