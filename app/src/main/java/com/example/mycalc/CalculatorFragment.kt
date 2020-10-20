package com.example.mycalc

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_calculator.*


class CalculatorFragment : Fragment(R.layout.fragment_calculator) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonDelete.setOnClickListener{
            val countString = textResult.text.toString()
            textResult.text = "0"
        }

        buttonOne.setOnClickListener {
            val countString = textResult.text.toString()
            var countString2: String = countString
            countString2 = countString2.first().toString()
            var number: Int = countString2.toInt()
            var count: String
            if (number == 0) {
                count = "1"
            } else {
                count =  countString + "1" }
            textResult.text = count

        }


        buttonTwo.setOnClickListener{
            val countString = textResult.text.toString()
            var count: String
            var countString2: String = countString
            countString2 = countString2.first().toString()
            var number: Int = countString2.toInt()
            if (number == 0) {
                count = "2"
            } else {
                count =  countString + "2" }
            textResult.text = count
        }


        buttonThree.setOnClickListener {
            val countString = textResult.text.toString()
            var countString2: String = countString
            countString2 = countString2.first().toString()
            var number: Int = countString2.toInt()
            var count: String
            if (number == 0) {
                count = "3"
            } else {
                count =  countString + "3" }
            textResult.text = count
        }

        buttonFour.setOnClickListener {
            val countString = textResult.text.toString()
            var countString2: String = countString
            countString2 = countString2.first().toString()
            var number: Int = countString2.toInt()
            var count: String
            if (number == 0) {
                count = "4"
            } else {
                count =  countString + "4" }
            textResult.text = count
        }

        buttonFive.setOnClickListener {
            val countString = textResult.text.toString()
            var countString2: String = countString
            countString2 = countString2.first().toString()
            var number: Int = countString2.toInt()
            var count: String
            if (number == 0) {
                count = "5"
            } else {
                count =  countString + "5" }
            textResult.text = count
        }

        buttonSix.setOnClickListener {
            val countString = textResult.text.toString()
            var countString2: String = countString
            countString2 = countString2.first().toString()
            var number: Int = countString2.toInt()
            var count: String
            if (number == 0) {
                count = "6"
            } else {
                count =  countString + "6" }
            textResult.text = count
        }



       buttonEight.setOnClickListener {
           val countString = textResult.text.toString()
           var countString2: String = countString
           countString2 = countString2.first().toString()
           var number: Int = countString2.toInt()
           var count: String
           if (number == 0) {
               count = "8"
           } else {
               count =  countString + "8" }
           textResult.text = count
       }

        buttonNine.setOnClickListener {
            val countString = textResult.text.toString()
            var countString2: String = countString
            countString2 = countString2.first().toString()
            var number: Int = countString2.toInt()
            var count: String
            if (number == 0) {
                count = "9"
            } else {
                count =  countString + "9" }
            textResult.text = count
        }

        buttonZero.setOnClickListener {
            val countString = textResult.text.toString()
            var countString2: String = countString
            countString2 = countString2.first().toString()
            var number: Int = countString2.toInt()
            var count: String
            if (number == 0) {
                count = "0"
            } else {
                count =  countString + "0" }
            textResult.text = count
        }



        buttonPlus.setOnClickListener {
            val countString = textResult.text.toString()
            var count: String = countString + "+"
            textResult.text = count
        }

        buttonMinus.setOnClickListener {
            val countString = textResult.text.toString()
            var count: String = countString + "-"
            textResult.text = count
        }

        buttonDivide.setOnClickListener {
            val countString = textResult.text.toString()
            var count: String = countString + "/"
            textResult.text = count
        }

        buttonMultiply.setOnClickListener {
            val countString = textResult.text.toString()
            var count: String = countString + "*"
            textResult.text = count
        }

        buttonEqual.setOnClickListener {
            val countString = textResult.text.toString()
            val s: List<String>
            val result: Int
            if (countString.toString().contains("+")) {
                s = countString.split("+")
                result = s[0].toInt() + s[1].toInt()
            } else if (countString.toString().contains("-")) {
                s = countString.split("-")
                result = s[0].toInt() - s[1].toInt()
            } else if (countString.toString().contains("*")) {
                s = countString.split("*")
                result = s[0].toInt() * s[1].toInt()
            } else {
                s = countString.split("/")
                result = s[0].toInt() / s[1].toInt()
            }

            textResult.text = result.toString()
        }
    }





}