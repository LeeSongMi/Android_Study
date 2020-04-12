package com.example.popupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{ view ->
            var pop = PopupMenu(this, textView) //textView에다 팝업메뉴를 띄우겠다
            menuInflater.inflate(R.menu.popup_menu, pop.menu)

            // var listener = PopupListener()
            // pop.setOnMenuItemClickListener(listener)
            // 위의 주석 두줄을 아래처럼 한줄로 만들 수 있다.
            pop.setOnMenuItemClickListener { item ->
                when(item.itemId ){
                    R.id.item1 ->
                        textView.text = "메뉴 1번을 눌렀습니다."
                    R.id.item2 ->
                        textView.text = "메뉴 2번을 눌렀습니다."

                    R.id.item3 ->
                        textView.text = "메뉴 3번을 눌렀습니다."
                }
                false
            }
            pop.show()
        }
    }

    inner class PopupListener:PopupMenu.OnMenuItemClickListener{
        override fun onMenuItemClick(p0: MenuItem?): Boolean {
            when(p0?.itemId){
                R.id.item1 ->
                    textView.text = "메뉴 1번을 눌렀습니다"
                R.id.item2 ->
                    textView.text = "메뉴 2번을 눌렀습니다"
                R.id.item3 ->
                    textView.text = "메뉴 3번을 눌렀습니다"
            }
        }
    }
}
