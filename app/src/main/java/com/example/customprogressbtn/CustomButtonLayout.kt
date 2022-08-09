package com.example.customprogressbtn

import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import android.widget.LinearLayout

class CustomButtonLayout (
    context: Context,
    attrs: AttributeSet
) : LinearLayout(context, attrs) {
    init {
        inflate(context, R.layout.custom_button_layout, this)

        val customAttributesStyle = context.obtainStyledAttributes(attrs, R.styleable.CustomButtonLayout, 0, 0)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        try {
            button1.text = customAttributesStyle.getString(R.styleable.CustomButtonLayout_button1Text)
            button2.text = customAttributesStyle.getString(R.styleable.CustomButtonLayout_button2Text)
        } finally {
            customAttributesStyle.recycle()
        }

        button1.setOnClickListener {
            // Handle button1 click event...
        }

        button2.setOnClickListener {
            // Handle button2 click event...
        }
    }
}