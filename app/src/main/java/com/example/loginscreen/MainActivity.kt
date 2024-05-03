package com.example.loginscreen

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    lateinit var usernameInput : EditText
    lateinit var passwordInput : EditText
    lateinit var loginBtn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_email)
        passwordInput = findViewById(R.id.username_pass)
        loginBtn = findViewById(R.id.giris_button)


        // Kullanıcı adı ve şifre bilgileri
        val correctUsername = "1"
        val correctPassword = "1"

// Kullanıcının girdiği bilgiler


        loginBtn.setOnClickListener {
            // Kullanıcı adı ve şifre kontrolü
            val enteredUsername = usernameInput.text.toString()
            val enteredPassword = passwordInput.text.toString()
            if (enteredUsername == correctUsername || enteredPassword == correctPassword) {
                // Doğru kullanıcı adı ve şifre
                // Giriş başarılı, istediğiniz işlemleri buraya yazabilirsiniz
                println("Giriş başarılı!")
            } else {
                // Yanlış kullanıcı adı veya şifre
                println("Hatalı kullanıcı adı veya şifre!")
            }
        }



    }
}