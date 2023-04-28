package com.example.application_2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var txtNumero1: EditText
    lateinit var txtNumero2: EditText
    lateinit var btnSumar : Button
    lateinit var btnRestar: Button
    lateinit var btnDividir: Button
    lateinit var btnMultiplicar: Button
    lateinit var txtResultado : EditText


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNumero1 = findViewById(R.id.txtNumero1)
        txtNumero2 = findViewById(R.id.txtNumero2)
        btnSumar = findViewById(R.id.btnSumar)
        btnRestar = findViewById(R.id.btnRestar)
        btnDividir = findViewById(R.id.btnDividir)
        btnMultiplicar = findViewById(R.id.btnMultiplicar)
        txtResultado = findViewById(R.id.txtResultado)

        btnSumar.setOnClickListener(View.OnClickListener {
            val x = Integer.parseInt(txtNumero1.text.toString())
            val p = Integer.parseInt(txtNumero2.text.toString())

            txtResultado.setText("Resultado:" + sumar(x,p))

        })
        //btnRestar.setOnClickListener(View.OnClickListener {
        //    val x = Integer.parseInt(txtNumero1.text.toString())
        //    val p = Integer.parseInt(txtNumero2.text.toString())

            //txtResultado.setText("Resultant: + restar(x,p)")
    //})

    fun sumar(num1:String,num2:String):String{
        return num1 + num2
    }
    fun restar(num1:Int,num2:Int):Int{
        return num1 - num2
    }
    fun dividir(num1:Int, num2:Int):Int{
        return num1/num2
    }
    fun multiplicar(num1:Int,num2:Int):Int{
        return num1 * num2
    }

}

    private fun sumar(x: Int, p: Int): Any? {

    }


