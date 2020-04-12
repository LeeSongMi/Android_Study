package com.example.actionbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.SearchView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)

        var search_item:MenuItem? = menu?.findItem(R.id.item5)
        var search_view:android.widget.SearchView = search_item?.actionView as android.widget.SearchView

        search_view.queryHint = "검색어를 입력해주세요"

        search_view.setOnQueryTextListener(object :android.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextChange(newText: String?): Boolean {
                textView.text = newText
                return false
            }

            override fun onQueryTextSubmit(query: String?): Boolean {
                textView2.text = query
                return false    //return true를 할 경우 키보드가 내려가지 않는다.
            }

        })
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.item1 ->
                textView.text = "메뉴1을 눌렀습니다."
            R.id.item2 ->
                textView.text = "메뉴2을 눌렀습니다."
            R.id.item3 ->
                textView.text = "메뉴3을 눌렀습니다."
            R.id.item4 ->
                textView.text = "메뉴4을 눌렀습니다."
        }
        return false
    }
}
