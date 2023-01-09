package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class Ventana2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana2)
        btnRegresar.setOnClickListener{ onBackPressed()}
    }

    fun getAndShowName(){
        val bundle = intent.extras
        val name = bundle?.get("INTENT_NAME")
        tvNombre.text = "Bienvenido $name"
    }
}