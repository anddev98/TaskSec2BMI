package com.sematec.tasksec2bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bmi_main.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.*
import kotlin.math.roundToInt
import kotlin.math.roundToLong

class BmiMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_main)
        val Height = edtHeight.text
        val Weight = edtWeight.text
        val Age = edtAge.text
        var bmi: Float = 0F
        var dHeight: Float = 0F
        var dWeight: Float = 0F
        var chk: Boolean = false
        fun checkInput(): Boolean {
            when {
                Height.isEmpty() -> {
                    Toast.makeText(
                            baseContext,
                            "Please Enter Height ",
                            Toast.LENGTH_LONG
                    ).show()
                    return false
                }
                Weight.isEmpty() -> {
                    Toast.makeText(
                            baseContext,
                            "Please Enter Weight ",
                            Toast.LENGTH_LONG
                    ).show()
                    return false
                }
                Age.isEmpty() -> {
                    Toast.makeText(
                            baseContext,
                            "Please Enter Age ",
                            Toast.LENGTH_LONG
                    ).show()
                    return false
                }
                else ->
                    return true
            }
        }
        btnCalculate.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                chk = checkInput()
                if (chk) {
                    dHeight = Height.toString().toFloat()
                    dWeight = Weight.toString().toFloat()
                    dHeight *= dHeight
                    bmi = dWeight / dHeight
                    bmi *= 10000
                    txtBmiCalc.text = bmi.toString()

                    when (bmi) {
                        in 18.0..18.5 -> {
                            txtBmiResult.text = "Underweight"
                        }
                        in 18.5..24.9 -> {
                            txtBmiResult.text = "Normal"
                        }
                        in 24.9..29.9 -> {
                            txtBmiResult.text = "Overweight"
                        }
                        else -> {
                            txtBmiResult.text = "Obese"
                        }
                    }
                }
            }
        })
    }
}
