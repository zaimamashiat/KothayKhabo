package com.example.kothaykhabo // Replace with your actual package name

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.app.LoginRegisterActivity
import com.example.kothaykhabo.R
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var logoutButton: Button
    private lateinit var mAuth: FirebaseAuth

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login) // Ensure this matches your layout file name

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance()

        // Initialize views
        logoutButton = findViewById(R.id.logoutButton)

        // Check if user is logged in
        if (mAuth.currentUser == null) {
            // If not logged in, navigate to LoginRegisterActivity
            val intent = Intent(this, LoginRegisterActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Logout button action
        logoutButton.setOnClickListener {
            mAuth.signOut()
            // Navigate back to login screen
            val intent = Intent(this, LoginRegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
