package com.example.contextmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
//리스트뷰를 위해서 주로 사용한다
class MainActivity : AppCompatActivity() {

    var data = arrayOf("리스트1","리스트2","리스트3","리스트4","리스트5")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,data);
        listView.adapter = adapter

        // i = 사용자가 터치한 항목의 인덱스 번호
        listView.setOnItemClickListener { adapterView, view, i, l ->
            textView.text = "${i}번째 항목을 터치했습니다"
        }

        registerForContextMenu(textView)
        registerForContextMenu(listView)
    }

    // view? = 사용자가 길게 누른  뷰의 객체
    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)

        when(v?.id){
            R.id.textView -> {
                menu?.setHeaderTitle("텍스트뷰의 메뉴")
                menuInflater.inflate(R.menu.textview_menu, menu)
            }
            R.id.listView -> {
                menu?.setHeaderTitle("리스트뷰의 메뉴")
                menuInflater.inflate(R.menu.listview_menu,menu)
                var info = menuInfo as AdapterView.AdapterContextMenuInfo
                // 만약 짝수번째 항목이라면
                if(info.position %2 == 0){
                    menu?.add(Menu.NONE, Menu.FIRST +100, Menu.NONE, "리스트뷰 메뉴3")
                }
            }

        }
    }

    // 사용자가 길게 누른 뷰의 주소값이 넘어오지를 않는다 알아낼 방법이없다
    // 메뉴아이템의 아이디 값은 전부다 다르게 만들어야한다.
    override fun onContextItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.textview_item1 ->
                textView.text = "텍스트뷰의 컨텍스트 메뉴1\n"
            R.id.textview_item2 ->
                textView.text = "텍스트뷰의 컨텍스트 메뉴2"
            R.id.listView_item1 -> {
                textView.text = "리스트뷰의 컨텍스트 메뉴1"
                var info = item?.menuInfo as AdapterView.AdapterContextMenuInfo
                textView.append("${info.position}번째 항목")
            }
            R.id.listView_item2 -> {
                textView.text = "리스트뷰의 컨텍스트 메뉴2\n"
                var info = item?.menuInfo as AdapterView.AdapterContextMenuInfo
                textView.append("${info.position}번째 항목")
            }
        }
        return super.onContextItemSelected(item)
    }
}
