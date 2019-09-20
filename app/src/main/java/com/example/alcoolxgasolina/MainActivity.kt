package com.example.alcoolxgasolina

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var btCalculo = findViewById<Button>(R.id.btCalculo).also {
//            it.setOnClickListener(this)
//        }

        var btCalculo = findViewById<Button>(R.id.btCalculo)
        btCalculo.setOnClickListener { view ->
            // do something when the button is clicked
        }

    }



    override fun onClick(v: View?) {

        val eTGasolina: EditText = findViewById(R.id.eTGasolina)
        val eTAlcool: EditText = findViewById(R.id.eTAlcool)
        val tvResultado: TextView = findViewById(R.id.tvResultado)

        val gas: String = eTGasolina.text.toString()
        val al: String = eTAlcool.text.toString()

        var resultado: String = getString(R.string.resultadoInvalido)

        if (gas.isNotEmpty() && al.isNotEmpty()) {

            resultado = if ((gas.toDouble() * 0.7) < al.toDouble()) {
                getString(R.string.resultadoGasolina)
            } else
                getString(R.string.resultadoAlcool)
        }
        tvResultado.text = resultado
    }

}
