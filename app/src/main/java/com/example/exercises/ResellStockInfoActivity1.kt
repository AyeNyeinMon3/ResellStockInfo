package com.example.exercises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.view.isVisible
import com.example.exercises.databinding.ActivityResellStockInfoBinding

class ResellStockInfoActivity1 : AppCompatActivity() {

    lateinit var binding : ActivityResellStockInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResellStockInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val  include = binding.includeAmountList.includeGoldAndGemWeightGm
        val startList = listOf(include.btnCancelGoldAndGemWeightGm,include.textInputLayoutGoldAndGemWeightGm,include.btnAddGoldAndGemWeightGm,
            include.view,include.view2)
        val endList = listOf(include.btnEdtGoldAndGemWeightGm,include.tvGoldAndGemWeightGm)
        startList.forEach {
            it.isVisible = false
        }
        include.btnEdtGoldAndGemWeightGm.setOnClickListener {
            startList.forEach {
                it.isVisible = true
            }
            endList.forEach {
                it.isVisible = false
            }
            blurView(include.btnEdtGoldAndGemWeightGm)
        }
        include.btnCancelGoldAndGemWeightGm.setOnClickListener {
            endList.forEach {
                it.isVisible = true
            }
            startList.forEach {
                it.isVisible = false
            }
            unBlurView()
        }

        val includeGoldAndGemKPY = binding.includeAmountList.includeGoldAndGemWeightKpy
        val goldAndGemKPYStart = listOf(includeGoldAndGemKPY.btnCancelGoldAndGemWeightKPY,includeGoldAndGemKPY.textInputLayoutGoldAndGemWeightK,includeGoldAndGemKPY.textInputLayoutGoldAndGemWeightP,includeGoldAndGemKPY.textInputLayoutGoldAndGemWeightY,
            includeGoldAndGemKPY.btnAddGoldAndGemWeight,includeGoldAndGemKPY.view,includeGoldAndGemKPY.view2)
        val goldAndGemKPYEnd = listOf(includeGoldAndGemKPY.btnEditGoldAndGemWeightKPY,includeGoldAndGemKPY.tvGoldAndGemWeightK,includeGoldAndGemKPY.tvGoldAndGemWeightP,includeGoldAndGemKPY.tvGoldAndGemWeightY)

        goldAndGemKPYStart.forEach {
            it.isVisible = false
        }
        includeGoldAndGemKPY.btnEditGoldAndGemWeightKPY.setOnClickListener {

            goldAndGemKPYStart.forEach {
                it.isVisible = true
            }
            goldAndGemKPYEnd.forEach {
                it.isVisible = false
            }
           blurView(includeGoldAndGemKPY.btnEditGoldAndGemWeightKPY)
        }
        includeGoldAndGemKPY.btnCancelGoldAndGemWeightKPY.setOnClickListener {
            goldAndGemKPYStart.forEach {
                it.isVisible = false
            }
            goldAndGemKPYEnd.forEach {
                it.isVisible = true
            }
            unBlurView()
        }

        val includeGemWeight = binding.includeAmountList.includeGemWeight
        val gemWeightStart = listOf(
            includeGemWeight.btnCancelGemWeightKPY,
            includeGemWeight.rBtnManually,
            includeGemWeight.rBtnAddFromServer,
            includeGemWeight.textInputLayoutGemWeightK,
            includeGemWeight.textInputLayoutGemWeightP,
            includeGemWeight.textInputLayoutGemWeightY,
            includeGemWeight.tvServerGemWeightK,
            includeGemWeight.tvServerGemWeightP,
            includeGemWeight.tvServerGemWeightY,
            includeGemWeight.btnEditServerGemWeightKPY,
            includeGemWeight.btnAddFromServer,
            includeGemWeight.btnAddGemWeightKPY,
            includeGemWeight.btnAddGemWeight,
            includeGemWeight.view,
            includeGemWeight.view2,
            includeGemWeight.view3
        )

        val gemWeightEdit = listOf(
            includeGemWeight.btnAddGemWeightKPY,
            includeGemWeight.btnEditGemWeightKPY,
            includeGemWeight.tvGemWeightY,
            includeGemWeight.tvGemWeightP,
            includeGemWeight.tvGemWeightK,
            includeGemWeight.tvServerGemWeightY,
            includeGemWeight.tvServerGemWeightK,
            includeGemWeight.tvServerGemWeightP,
            includeGemWeight.btnEditServerGemWeightKPY,
            includeGemWeight.btnAddFromServer,
            includeGemWeight.view3,

            )

        val gemWeightAddFromServer = listOf(
            includeGemWeight.btnAddGemWeightKPY,
            includeGemWeight.btnEditGemWeightKPY,
            includeGemWeight.tvGemWeightK,
            includeGemWeight.tvGemWeightP,
            includeGemWeight.tvGemWeightY,
            includeGemWeight.btnAddGemWeight,
            includeGemWeight.view2,
            includeGemWeight.textInputLayoutGemWeightK,
            includeGemWeight.textInputLayoutGemWeightP,
            includeGemWeight.textInputLayoutGemWeightY,
        )

        val gemWeightCancel = listOf(
            includeGemWeight.tvGemWeightY,
            includeGemWeight.tvGemWeightP,
            includeGemWeight.tvGemWeightK,
            includeGemWeight.btnEditGemWeightKPY
        )

        gemWeightStart.forEach {
            it.isVisible = false
        }

        includeGemWeight.btnEditGemWeightKPY.setOnClickListener {

            gemWeightStart.forEach {
                it.isVisible = true
            }

            gemWeightEdit.forEach {
                it.isVisible = false
            }

           blurView(includeGemWeight.btnEditGemWeightKPY)
        }

        includeGemWeight.rBtnAddFromServer.setOnClickListener{
            gemWeightStart.forEach {
                it.isVisible = true
            }

            gemWeightEdit.forEach {
                it.isVisible = true
            }

            gemWeightAddFromServer.forEach {
                it.isVisible = false
            }
        }

        includeGemWeight.btnCancelGemWeightKPY.setOnClickListener {
            gemWeightStart.forEach {
                it.isVisible = false
            }
            gemWeightCancel.forEach {
                it.isVisible = true
            }
            unBlurView()

        }

        val includeGeeWeight = binding.includeAmountList.includeGeeWeight
        val geeWeightStart = listOf(
            includeGeeWeight.btnCancelGeeWeightKPY,
            includeGeeWeight.textInputLayoutGeeWeightP,
            includeGeeWeight.textInputLayoutGeeWeightY,
            includeGeeWeight.textInputLayoutGeeWeightK,
            includeGeeWeight.btnAddGeeWeight,
            includeGeeWeight.view,
            includeGeeWeight.view2,
        )
        val geeWeightEnd = listOf(
            includeGeeWeight.btnEditGeeWeightKPY,
            includeGeeWeight.tvGeeWeightY,
            includeGeeWeight.tvGeeWeightP,
            includeGeeWeight.tvGeeWeightK
        )

        geeWeightStart.forEach {
            it.isVisible = false
        }
        includeGeeWeight.btnEditGeeWeightKPY.setOnClickListener {
            geeWeightStart.forEach {
                it.isVisible = true
            }
            geeWeightEnd.forEach {
                it.isVisible = false
            }
            blurView(includeGeeWeight.btnEditGeeWeightKPY)
        }
        includeGeeWeight.btnCancelGeeWeightKPY.setOnClickListener {
            geeWeightStart.forEach {
                it.isVisible = false
            }
            geeWeightEnd.forEach {
                it.isVisible = true
            }
            unBlurView()
        }

        val includeGoldQ = binding.includeAmountList.includeGoldQ
        val goldQStart = listOf(
            includeGoldQ.btnCancelGoldQ,
            includeGoldQ.btnAddGoldQ,
            includeGoldQ.textInputLayoutGoldQ,
            includeGoldQ.view,
            includeGoldQ.view2
        )
        val goldQEnd = listOf(
            includeGoldQ.btnEditGoldQ,
            includeGoldQ.tvGoldQ
        )

        goldQStart.forEach {
            it.isVisible = false
        }

        includeGoldQ.btnEditGoldQ.setOnClickListener {
            goldQStart.forEach {
                it.isVisible = true
            }
            goldQEnd.forEach {
                it.isVisible = false
            }
            blurView(includeGoldQ.btnEditGoldQ)
        }
        includeGoldQ.btnCancelGoldQ.setOnClickListener {
            goldQStart.forEach {
                it.isVisible = false
            }
            goldQEnd.forEach {
                it.isVisible = true
            }
            unBlurView()
        }

        val includePurchasePrice = binding.includeAmountList.includePurchasePrice
        val purchasePriceStart = listOf(
            includePurchasePrice.btnCancelPurchasePrice,
            includePurchasePrice.textInputLayoutPurchasePrice,
            includePurchasePrice.btnAddPurchasePrice,
            includePurchasePrice.view,
            includePurchasePrice.view2
        )
        val purchasePriceEnd = listOf(
            includePurchasePrice.btnEditPurchasePrice,
            includePurchasePrice.tvPurchasePrice,
        )

        purchasePriceStart.forEach {
            it.isVisible = false
        }
        includePurchasePrice.btnEditPurchasePrice.setOnClickListener {
            purchasePriceStart.forEach {
                it.isVisible = true
            }
            purchasePriceEnd.forEach {
                it.isVisible = false
            }
            blurView(includePurchasePrice.btnEditPurchasePrice)
        }
        includePurchasePrice.btnCancelPurchasePrice.setOnClickListener {
            purchasePriceStart.forEach {
                it.isVisible = false
            }
            purchasePriceEnd.forEach {
                it.isVisible = true
            }
            unBlurView()
        }

        val includeMortgagePrice = binding.includeAmountList.includeMortgagePrice
        val mortgagePriceStart = listOf(
            includeMortgagePrice.btnCancelMortgagePrice,
            includeMortgagePrice.btnAddMortgagePrice,
            includeMortgagePrice.view,
            includeMortgagePrice.view2,
            includeMortgagePrice.textInputLayoutMortgagePrice
        )
        val mortgagePriceEnd = listOf(
            includeMortgagePrice.btnEditMortgagePrice,
            includeMortgagePrice.tvMortgagePrice
        )
        mortgagePriceStart.forEach {
            it.isVisible = false
        }
        includeMortgagePrice.btnEditMortgagePrice.setOnClickListener {
            mortgagePriceStart.forEach {
                it.isVisible = true
            }
            mortgagePriceEnd.forEach {
                it.isVisible = false
            }
           blurView(includeMortgagePrice.btnEditMortgagePrice)
        }
        includeMortgagePrice.btnCancelMortgagePrice.setOnClickListener {
            mortgagePriceStart.forEach {
                it.isVisible = false
            }
            mortgagePriceEnd.forEach {
                it.isVisible = true
            }
            unBlurView()
        }

        val includeVoucherPay = binding.includeAmountList.includeVoucherOpenPay
        val voucherPayStart = listOf(
            includeVoucherPay.btnCancelVoucherOpenPay,
            includeVoucherPay.check,
            includeVoucherPay.textInputLayoutVoucherOpenPay,
            includeVoucherPay.textInputLayoutPercentageDisPrice,
            includeVoucherPay.textInputLayoutCalculatePercentageDisPrice,
            includeVoucherPay.tvLblDis,
            includeVoucherPay.tvLblLearnMore,
            includeVoucherPay.btnCalculate,
            includeVoucherPay.btnSaveVoucherOpenPay,
            includeVoucherPay.view,
            includeVoucherPay.view2
        )
        val voucherPayEdit = listOf(
            includeVoucherPay.btnEditVoucherOpenPay,
            includeVoucherPay.tvVoucherOpenPay,
            includeVoucherPay.textInputLayoutCalculatePercentageDisPrice,
            includeVoucherPay.textInputLayoutPercentageDisPrice,
            includeVoucherPay.tvLblDis,
            includeVoucherPay.tvLblLearnMore,
            includeVoucherPay.btnCalculate
        )
        val voucherPayDis = listOf(
            includeVoucherPay.btnEditVoucherOpenPay,
            includeVoucherPay.tvVoucherOpenPay,
        )

        voucherPayStart.forEach {
            it.isVisible = false
        }

        includeVoucherPay.btnEditVoucherOpenPay.setOnClickListener {
            voucherPayStart.forEach {
                it.isVisible = true
            }
            voucherPayEdit.forEach {
                it.isVisible = false
            }
            blurView(includeVoucherPay.btnEditVoucherOpenPay)

        }

        includeVoucherPay.check.setOnClickListener {
            voucherPayStart.forEach {
                it.isVisible = true
            }
            voucherPayEdit.forEach {
                it.isVisible = true
            }
            voucherPayDis.forEach {
                it.isVisible = false
            }

        }

        includeVoucherPay.btnCancelVoucherOpenPay.setOnClickListener {
            voucherPayStart.forEach {
                it.isVisible = false
            }
            voucherPayEdit.forEach {
                it.isVisible = false
            }
            voucherPayDis.forEach {
                it.isVisible = true
            }
            unBlurView()
        }

        val includeVoucherPrice = binding.includeAmountList.includeVoucherOpenPrice
        val voucherPriceStart = listOf(
            includeVoucherPrice.btnCancelVoucherOpenPrice,
            includeVoucherPrice.textInputLayoutVoucherOpenPrice,
            includeVoucherPrice.btnAddVoucherOpenPrice,
            includeVoucherPrice.view,
            includeVoucherPrice.view2
        )
        val voucherPriceEnd = listOf(
            includeVoucherPrice.btnEditVoucherOpenPrice,
            includeVoucherPrice.tvVoucherOpenPrice
        )

        voucherPriceStart.forEach {
            it.isVisible = false
        }
        includeVoucherPrice.btnEditVoucherOpenPrice.setOnClickListener {
            voucherPriceStart.forEach {
                it.isVisible = true
            }
            voucherPriceEnd.forEach {
                it.isVisible = false
            }
           blurView(includeVoucherPrice.btnEditVoucherOpenPrice)
        }
        includeVoucherPrice.btnCancelVoucherOpenPrice.setOnClickListener {
            voucherPriceStart.forEach {
                it.isVisible = false
            }
            voucherPriceEnd.forEach {
                it.isVisible = true
            }
            unBlurView()
        }

        val includePurchaseGoldWeight = binding.includeAmountList.includePurchaseGoldWeight
        val purchaseGoldStart = listOf(
            includePurchaseGoldWeight.btnCancelPurchaseGoldWeight,
            includePurchaseGoldWeight.textInputLayoutPurchaseGoldWeightK,
            includePurchaseGoldWeight.textInputLayoutPurchaseGoldWeightP,
            includePurchaseGoldWeight.textInputLayoutPurchaseGoldWeightY,
            includePurchaseGoldWeight.btnAddPurchaseGoldWeight,
            includePurchaseGoldWeight.view,
            includePurchaseGoldWeight.view2
        )
        val purchaseGoldEnd = listOf(
            includePurchaseGoldWeight.btnEditPurchaseGoldWeight,
            includePurchaseGoldWeight.tvPurchaseGoldWeightK,
            includePurchaseGoldWeight.tvPurchaseGoldWeightP,
            includePurchaseGoldWeight.tvPurchaseGoldWeightY,
        )

        purchaseGoldStart.forEach {
            it.isVisible = false
        }
        includePurchaseGoldWeight.btnEditPurchaseGoldWeight.setOnClickListener {
            purchaseGoldStart.forEach {
                it.isVisible = true
            }
            purchaseGoldEnd.forEach {
                it.isVisible = false
            }
            blurView(includePurchaseGoldWeight.btnEditPurchaseGoldWeight)
        }
        includePurchaseGoldWeight.btnCancelPurchaseGoldWeight.setOnClickListener {
            purchaseGoldStart.forEach {
                it.isVisible = false
            }
            purchaseGoldEnd.forEach {
                it.isVisible = true
            }
            unBlurView()
        }
    }

    private fun blurView(view : View){

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

        myList.forEach {
            if(it.first.id == view.id){
                it.first.isEnabled = true
                it.second.alpha = 1F

            }else{
                it.first.isEnabled = false
                it.second.alpha = 0.3F
            }
        }
    }
    private fun unBlurView(){
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
        myList.forEach { view ->
            view.first.isEnabled = true
            view.second.alpha = 1F
        }
    }

}