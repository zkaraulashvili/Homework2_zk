package com.example.homework2_zk

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class Profile_Activity : AppCompatActivity() {

    val auth = FirebaseAuth.getInstance()
    // get reference to button
    val sOutButton = findViewById<Button>(R.id.signOutButton)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
       //  set on-click listener
        sOutButton.setOnClickListener {
            auth.signOut()
        }
    }
}