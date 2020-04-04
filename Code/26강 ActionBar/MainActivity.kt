package kr.co.softcampus.actionbarbasic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.SearchView
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)

        var search_item:MenuItem? = menu?.findItem(R.id.item5)
        var search_view:SearchView = search_item?.actionView as SearchView

        search_view.queryHint = "검색어를 입력해주세요"

        search_view.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextChange(newText: String?): Boolean {
                textView.text = newText
                return true
            }

            override fun onQueryTextSubmit(query: String?): Boolean {
                textView2.text = query
                return false
            }
        })

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.item1 ->
                    textView.text = "메뉴1을 눌렀습니다"
            R.id.item2 ->
                    textView.text = "메뉴2를 눌렀습니다"
            R.id.item3 ->
                    textView.text = "메뉴3을 눌렀습니다"
            R.id.item4 ->
                    textView.text = "메뉴4를 눌렀습니다"
        }
        return super.onOptionsItemSelected(item)
    }
}








