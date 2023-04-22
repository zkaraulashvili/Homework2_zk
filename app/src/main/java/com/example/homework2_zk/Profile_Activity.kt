package com.example.homework2_zk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Profile_Activity : AppCompatActivity() {
    /*
    val auth = FirebaseAuth.getInstance()
    // get reference to button
    val sOutButton = findViewById<Button>(R.id.signOutButton)

*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        // set on-click listener
  /*      sOutButton.setOnClickListener {
            auth.signOut()
        }*/
    }
}