package com.example.customprogressbtn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class MainActivity : AppCompatActivity() {
    lateinit var view: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view=findViewById(R.id.progressBar)
        view.setOnClickListener {
            var pb = ProgressButton(this,view)
            pb.activeButton()
            Handler().postDelayed({
                pb.finishButton()
            },3000)
        }
    }
}