package com.example.optionmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //메뉴 만드는 법 1.xml에서 생성 2.코드로 생성 두가지 방법이 있다.
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //xml에서 메뉴 만든 후 가져오기
        // menuInflater.inflate(R.menu.option_menu, menu)

        //코드로 메뉴 만들기
        // 매개변수 1= 메뉴안에서 순서, 2= 클릭한 메뉴 아이디값, 4 = 메뉴에 표시될 문자열
        menu?.add(Menu.NONE, Menu.FIRST +1, Menu.NONE, "코드메뉴1")
        menu?.add(Menu.NONE, Menu.FIRST +2, Menu.NONE, "코드메뉴2")
        //서브메뉴 생성
        var sub:Menu? = menu?.addSubMenu("메뉴4")
        sub?.add(Menu.NONE, Menu.FIRST+3, Menu.NONE, "코드메뉴3-1")
        sub?.add(Menu.NONE, Menu.FIRST+4, Menu.NONE, "코드메뉴3-2")
        return true
    }

    // item 매개변수= 클릭한 메뉴 아이템 객체
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        // 터치한 메뉴의 정보가 답겨져있는 객체의 아이디
        /* xml로 만든 메뉴 처리
        when(item?.itemId){
            R.id.item1 ->
                textView.text = "메뉴1을 눌렀습니다."
            R.id.item2_1 ->
                textView.text = "메뉴2-1을 눌렀습니다."
            R.id.item2_2 ->
                textView.text = "메뉴2-2을 눌렀습니다."
            R.id.item3 ->
                textView.text = "메뉴3을 눌렀습니다."
        }
         */
        // 코드로 메뉴를 만드는 방법
        when(item?.itemId){
            Menu.FIRST + 1->
                textView.text = "코드메뉴 1을 눌렀습니다."
            Menu.FIRST + 2->
                textView.text = "코드메뉴 2을 눌렀습니다."
            Menu.FIRST + 3->
                textView.text = "코드메뉴 3-1을 눌렀습니다."
            Menu.FIRST + 4->
                textView.text = "코드메뉴 3-2을 눌렀습니다."

        }


        return super.onOptionsItemSelected(item)
    }
}
