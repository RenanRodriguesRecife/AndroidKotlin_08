package com.example.login

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener{
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()

            if(username.equals("user") && password.equals("pass")){
                Toast.makeText(applicationContext,"Login OK", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext,"Login Inválido", Toast.LENGTH_LONG).show()
            }
            binding.editUsername.setText("")
            binding.editPassword.setText("")
        }



    }
}