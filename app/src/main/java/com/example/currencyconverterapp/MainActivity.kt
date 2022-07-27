package com.example.currencyconverterapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private val EGP ="EGP"
    private val USD = "USD"
    private val AED = "AED"
    private val GBP = "GBP"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val convertBtn :Button = findViewById(R.id.convert_button)
        val amountEt:TextInputEditText = findViewById(R.id.amount_edit_text)
        val resultEt:TextInputEditText = findViewById(R.id.result_edit_text)
        val toDropDownMenu: AutoCompleteTextView =findViewById(R.id.currency_menu)

        val listOfCountry = listOf(EGP,USD,AED,GBP)
        val adapter = ArrayAdapter(this, R.layout.drop_down_list_item,listOfCountry)
        toDropDownMenu.setAdapter(adapter)


        convertBtn.setOnClickListener{
            val amount =amountEt.text.toString().toDouble()

            val currencyToField =toDropDownMenu.text.toString()

            var result =when(currencyToField){
                EGP->amount.times(19.85)
                AED->amount.times(3.67)
                GBP->amount.times(0.83)
                else->amount.times(1)
            }
            resultEt.setText(result.toString())
        }

    }
}