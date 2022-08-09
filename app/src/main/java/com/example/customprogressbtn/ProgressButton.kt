package com.example.customprogressbtn

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.constraintlayout.widget.ConstraintLayout

class ProgressButton(context: Context, view :View) {
    val layout = view.findViewById<ConstraintLayout>(R.id.layout)
     var text = view.findViewById<TextView>(R.id.textView)
    var progress = view.findViewById<ProgressBar>(R.id.progress)

    fun activeButton(){
        progress.visibility=View.VISIBLE
        text.text="Please wait ..."

    }
    fun finishButton(){
        text.text="Download Complete"
        progress.visibility=View.GONE
        layout.setBackgroundColor(layout.resources.getColor(R.color.purple_500))
    }
}