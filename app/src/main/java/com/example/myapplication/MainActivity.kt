package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var dataEmail: Array<String>
    private lateinit var dataPassword: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editEmail : EditText = findViewById(R.id.edit_Email)
        val editPassword : EditText = findViewById(R.id.edit_Password)
        val btnLogin : Button = findViewById(R.id.btn_Login)
        val btnRegister : Button = findViewById(R.id.btn_Register)
        val btnForgetPass : TextView = findViewById(R.id.forgot_Password)
        val radioRemember : RadioButton = findViewById(R.id.remember_Me)

        val dataEmail = arrayOf("Rifqi","Syarifuddin","Budi")
        val dataPassword = arrayOf("1234","4321","1423")

        btnLogin.setOnClickListener{
            signIn(editEmail.text.toString(), editPassword.text.toString())
        }


    }
    fun signIn(email: String, password : String){
        for (i in dataEmail.indices){
            val takeDataEmail = dataEmail.get(i)
            val takeDataPass = dataPassword.get(i)
            if (takeDataEmail == email && takeDataPass == password){
                Toast.makeText(this, "Logged In", Toast.LENGTH_SHORT).show()
            }else
                Toast.makeText(this, "Akun Salah", Toast.LENGTH_SHORT).show()

        }
    }
}