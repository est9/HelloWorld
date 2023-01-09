package com.example.helloworld

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnEnviar.setOnClickListener { checkValue() }
    }

    fun checkValue(){
        if(etNombre.text.isNotEmpty()){
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("INTENT_NAME", etNombre.text)
            startActivity(intent)
        }
        else{
            showErrorName()
        }
    }

    fun showErrorName(){
        Toast.makeText(this, "El nombre de usuario no puede estar vacio", Toast.LENGTH_SHORT).show()
    }
}