package com.example.kothaykhabo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.app.LoginRegisterActivity

class OpenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.opening_page)

        // Use Handler to create a delay
        Handler().postDelayed({
            // Start LoginRegisterActivity
            val intent = Intent(this, LoginRegisterActivity::class.java)
            startActivity(intent)
            // Close this activity so user can't go back to it
            finish()
        }, 2000) // 2000 milliseconds = 2 seconds
    }
}
