package com.atatar.castomviewexample

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MyCustomView (context: Context, attrs: AttributeSet): LinearLayout(context, attrs) {

    init {
        inflate(context, R.layout.my_custom_view, this)

        val button: Button = findViewById(R.id.button)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)


//        val attributes = context.obtainStyledAttributes(attrs, R.styleable.BenefitView)
//        imageView.setImageDrawable(attributes.getDrawable(R.styleable.BenefitView_image))
//        textView.text = attributes.getString(R.styleable.BenefitView_text)
//        attributes.recycle()
        button.setOnClickListener {
            Toast.makeText(context,"There was a click on the button", Toast.LENGTH_SHORT).show()
        }
        button1.setOnClickListener {
            button1.text = "There was a click on the button1"
        }
        button2.setOnClickListener {
            button2.text = "There was a click on the button2"
        }
    }


}