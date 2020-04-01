package com.wooz.song.lisstview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var data = arrayOf("리스트1", "리스트2", "리스트3", "리스트4", "리스트5",
            "리스트6", "리스트7", "리스트8", "리스트9", "리스트10", "리스트11", "리스트12")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        // 어떠한 정보를, 어떠한 모양으로, 몇개를 보여주겠다.
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        listview.adapter = adapter
        */
        listview.setOnItemClickListener { adapterView, view, i, l ->
            textView.text = data[i]
        }
    }

    inner class ListListener : AdapterView.OnItemClickListener{
        override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            textView.text = data[p2]
        }
    }
}
