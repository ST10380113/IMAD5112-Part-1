package com.varsitycollegedurbannorth.st10380113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Create variables and get reference to the ID using the View method
        var btnAdd = findViewById<Button>(R.id.btnAdd)

        var tvDisplay = findViewById<TextView>(R.id.tvDisplay)

        var edtNum1 = findViewById<EditText>(R.id.edtNum1)

        var edtNum2 = findViewById<EditText>(R.id.edtNum2)

        var btnSubtract = findViewById<Button>(R.id.btnSubtract)

        var btnMultiply = findViewById<Button>(R.id.btnMultiply)

        var btnDivide = findViewById<Button>(R.id.btnDivide)


        btnAdd.setOnClickListener {

            //create and initialize variables
            val Num1 = edtNum1.text.toString().toInt()
            val Num2 = edtNum2.text.toString().toInt()

            //create and initialize a variable
            //add the two numbers entered to each other
            val Answer = Num1 + Num2

            //create and initialize a variable
            //create a string that contains the entire equation with the numbers entered and the answer
            val Result = "$Num1 + $Num2 = $Answer"

            //display the equation
            tvDisplay.text = Result
        }

        //
        btnSubtract.setOnClickListener {

            //create and initialize variables
            val Num1 = edtNum1.text.toString().toInt()
            val Num2 = edtNum2.text.toString().toInt()

            //create and initialize a variable
            //subtract the two numbers entered from each other
            val Answer = Num1 - Num2

            //create and initialize a variable
            //create a string that contains the entire equation with the numbers entered and the answer
            val Result = "$Num1 - $Num2 = $Answer"

            //display the equation
            tvDisplay.text = Result
        }

        //
        btnMultiply.setOnClickListener {

            //create and initialize variables
            val Num1 = edtNum1.text.toString().toInt()
            val Num2 = edtNum2.text.toString().toInt()

            //create and initialize a variable
            //multiply the two numbers entered with each other
            val Answer = Num1 * Num2

            //create and initialize a variable
            //create a string that contains the entire equation with the numbers entered and the answer
            val Result = "$Num1 x $Num2 = $Answer"

            //display the equation
            tvDisplay.text = Result
        }

        //
        btnDivide.setOnClickListener {

            //create and initialize variables
            val Num1 = edtNum1.text.toString().toInt()
            val Num2 = edtNum2.text.toString().toInt()

            //create and initialize a variable
            //divide the two numbers entered together
            val Answer = Num1 / Num2

            //create and initialize a variable
            //create a string that contains the entire equation with the numbers entered and the answer
            val Result = "$Num1 / $Num2 = $Answer"

            //display the equation
            tvDisplay.text = Result
        }
    }
}