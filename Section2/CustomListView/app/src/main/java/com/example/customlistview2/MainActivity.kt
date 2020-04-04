package com.example.customlistview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SimpleAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // var data = arrayOf("데이터1", "데이터2", "데이터3", "데이터4", "데이터5", "데이터6")

    var imgRes = intArrayOf(R.drawable.imgflag1,R.drawable.imgflag2, R.drawable.imgflag3,
        R.drawable.imgflag4, R.drawable.imgflag5, R.drawable.imgflag6,R.drawable.imgflag7,
        R.drawable.imgflag8)

    var data1 = arrayOf("토고", "프랑스", "스위스", "스페인", "일본", "독일", "브라질", "대한민국")
    var data2 = arrayOf("togo", "france", "swiss", "spain", "japan", "german", "brazil", "korea")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        // var adapter = ArrayAdapter(this,R.layout.row1,data)
        //@android:id/text1

        // var adapter = ArrayAdapter(this,R.layout.row1,R.id.tesxtview2, data)
        // listView.adapter = adapter

        // listView.setOnItemClickListener { adapterView, view, i, l ->
        //     textView.text = data[i]

        var list = ArrayList<HashMap<String, Any>>()

        var idx = 0
        while(idx < data1.size) {
            var map = HashMap<String, Any>()
            map.put("flag", imgRes[idx])
            map.put("data1", data1[idx])
            map.put("data2", data2[idx])

            list.add(map)
            idx++
        }
        // flag를 imageview에 data1,2를 textview2,3에 넣음
        var keys = arrayOf("flag", "data1", "data2")    // 키배열
        var ids = intArrayOf(R.id.imageView, R.id.tesxtview2,R.id.textView3)    // id배열

        var adapter = SimpleAdapter(this, list, R.layout.row, keys, ids)

        listView.adapter = adapter
    }
}
