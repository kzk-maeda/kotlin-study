package com.webserva.wings.android.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get Button Object
        val btClick = findViewById<Button>(R.id.btClick)

        // Create Listener Class Instance
        val helloListener = HelloListener()

        // Set Listener to Button
        btClick.setOnClickListener(helloListener)

    }

    private inner class HelloListener : View.OnClickListener {
        override fun onClick(view: View) {
            // Get Object
            val input = findViewById<EditText>(R.id.etName)
            val output = findViewById<TextView>(R.id.tvOutput)

            when(view.id) {
                R.id.btClick -> {
                    // Get text inputed in EditText
                    val inputStr = input.text.toString()

                    // Display message
                    output.text = inputStr + "さん、こんにちは！"
                }
                R.id.btClear -> {
                    input.setText("")
                    output.text = ""
                }
            }

        }
    }

}
