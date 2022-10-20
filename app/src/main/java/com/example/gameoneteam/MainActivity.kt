package com.example.gameoneteam

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
        setTitle("SARS-COV")
    }

    fun playGameClick(view: View) {
        val intent: Intent = Intent(this@MainActivity, GameWindow::class.java)
        when(view.id){
            R.id.button -> startActivity(intent)
        }
    }
}