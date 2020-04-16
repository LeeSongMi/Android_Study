package com.example.toast

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{ view ->
            var t1 = Toast.makeText(this, "토스트 메시지입니다.", Toast.LENGTH_SHORT)
            t1.show()
        }
        button2.setOnClickListener { view ->
            var v1 = layoutInflater.inflate(R.layout.custom_toast, null)

            v1?.setBackgroundResource(android.R.drawable.toast_frame)
            var image_view:ImageView? = v1.findViewById<ImageView>(R.id.imageView)
            image_view?.setImageResource(R.drawable.img_android)

            var text_view : TextView? = v1.findViewById<TextView>(R.id.textView)
            text_view?.text = "토스트 메시지입니다."
            text_view?.setTextColor(Color.WHITE)

            var t2 = Toast(this)

            t2.setGravity(Gravity.CENTER, 0, 0)
            t2.show()
        }

    }
}
