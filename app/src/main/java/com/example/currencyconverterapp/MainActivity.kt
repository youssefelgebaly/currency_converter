package com.example.currencyconverterapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val convertBtn :Button = findViewById(R.id.convert_button)
        val amountEt:TextInputEditText = findViewById(R.id.amount_edit_text)
        val resultEt:TextInputEditText = findViewById(R.id.result_edit_text)

        convertBtn.setOnClickListener{
            val amount =amountEt.text.toString().toDouble()
            val result=amount.times(19.85)

            resultEt.setText(result.toString())
        }

    }
}