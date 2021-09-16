package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {

    private lateinit var dataEmail: Array<String>
    private lateinit var dataPassword: Array<String>
    private var progressBar : ProgressBar? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val editEmail : EditText = findViewById(R.id.edit_Email)
        val editPassword : EditText = findViewById(R.id.edit_Password)
        val btnLogin : Button = findViewById(R.id.btn_Login)
        val btnRegister : Button = findViewById(R.id.btn_Register)
        progressBar = findViewById(R.id.progress_Bar)
        val btnForgetPass : TextView = findViewById(R.id.forgot_Password)
        val radioRemember : RadioButton = findViewById(R.id.remember_Me)
        val builder = AlertDialog.Builder(this).create()
//        builder?.setTitle("Harap isi ")
//        builder?.setMessage("Tentukan Pilihan Anda! ")
//        builder?.setIcon(R.drawable.ic_person)
//        builder?.setCancelable(true)
//        builder?.show()



        val dataEmail = arrayOf("Rifqi","Syarifuddin","Budi")
        val dataPassword = arrayOf("1234","4321","1423")

        btnLogin.setOnClickListener{
            progressBar?.visibility = View.VISIBLE
            signIn(editEmail.text.toString(), editPassword.text.toString())
        }

        btnRegister.setOnClickListener {

            startActivity(Intent(this , RegisterActivity::class.java))
        }


    }
    fun signIn(email: String, password : String){
        for (i in dataEmail.indices){
            val takeDataEmail = dataEmail.get(i)
            val takeDataPass = dataPassword.get(i)
            if (takeDataEmail == email && takeDataPass == password){
                Toast.makeText(this, "Logged In", Toast.LENGTH_SHORT).show()

            }else
                progressBar?.visibility = View.VISIBLE
                Toast.makeText(this, "Akun Salah", Toast.LENGTH_SHORT).show()

        }
    }
}