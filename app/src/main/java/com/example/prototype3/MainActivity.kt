package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        login_btn.setOnClickListener {
            val email = mail_login.text.toString()
            val pass = pass_login.text.toString()

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email,pass)
                .addOnCompleteListener {
                    if (!it.isSuccessful) return@addOnCompleteListener
                    val intent = Intent(this,Main_menu::class.java)
                    startActivity(intent)
                }

                .addOnFailureListener{
                    Toast.makeText(this,"Email or Pass Wrong", Toast.LENGTH_SHORT).show()
                    return@addOnFailureListener
                }
        }
        register.setOnClickListener {
            val intent = Intent(this,Register_acc::class.java)
            startActivity(intent)
        }






    }
}
