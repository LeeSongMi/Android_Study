package com.wooz.song.view_basic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // var text2:TextView? = null;
    // 코틀린은 변수에 널값을 넣을 수 없다.
    // 널값을 넣어야할 시 ? 를 붙여줘야한다.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // text2 = findViewById(R.id.textView2)

        // text2?.text = "문자열2"
        // text2?.setText("문자열2")

        /* 라디오 버튼
        button.setOnClickListener { view ->
            when (group1.checkedRadioButtonId) {
                R.id.radioButton ->
                    textView.text = "라디오 1-1이 선택되었습니다."
                R.id.radioButton2 ->
                    textView.text = "라디오 1-2이 선택되었습니다."
                R.id.radioButton3 ->
                    textView.text = "라디오 1-3이 선택되었습니다."
            }

            when (group2.checkedRadioButtonId) {
                R.id.radioButton4 ->
                    textView.text = "라디오 2-1이 선택되었습니다."
                R.id.radioButton5 ->
                    textView.text = "라디오 2-2이 선택되었습니다."
                R.id.radioButton6 ->
                    textView.text = "라디오 2-3이 선택되었습니다."
            }
        }


        var listener = RadioListener()
        group1.setOnCheckedChangeListener(listener)
        group2.setOnCheckedChangeListener(listener)


        group1.setOnCheckedChangeListener { radioGroup, i ->
            when(i) {
                R.id.radioButton ->
                    textView.text = "체크이벤트 : 라디오 1-1체크"
                R.id.radioButton2 ->
                    textView.text = "체크이벤트 : 라디오 1-2체크"
                R.id.radioButton3 ->
                    textView.text = "체크이벤트 : 라디오 1-3체크"
            }
        }
        group2.setOnCheckedChangeListener { radioGroup2, i ->
            when(i) {
                R.id.radioButton4 ->
                    textView.text = "체크이벤트 : 라디오 2-1체크"
                R.id.radioButton5 ->
                    textView.text = "체크이벤트 : 라디오 2-2체크"
                R.id.radioButton6 ->
                    textView.text = "체크이벤트 : 라디오 2-3체크"
            }
        }

        button2.setOnClickListener { view ->
            radioButton3.isChecked = true
            radioButton6.isChecked = true
        }

        */
    }

    /* 라디오 버튼 클래스
    inner class RadioListener: RadioGroup.OnCheckedChangeListener{
        override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
            when(p0?.id){
                R.id.group1 ->
                    when(p1) {
                        R.id.radioButton ->
                            textView.text = "체크이벤트 : 라디오 1-1체크"
                        R.id.radioButton2 ->
                            textView.text = "체크이벤트 : 라디오 1-2체크"
                        R.id.radioButton3 ->
                            textView.text = "체크이벤트 : 라디오 1-3체크"
                    }

                R.id.group2 ->
                    when(p1) {
                        R.id.radioButton4 ->
                            textView.text = "체크이벤트 : 라디오 2-1체크"
                        R.id.radioButton5 ->
                            textView.text = "체크이벤트 : 라디오 2-2체크"
                        R.id.radioButton6 ->
                            textView.text = "체크이벤트 : 라디오 2-3체크"
                    }
            }
        }
    }
    */
}
