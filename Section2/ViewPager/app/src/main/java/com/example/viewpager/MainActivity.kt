package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var view_list = ArrayList<View>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view_list.add(layoutInflater.inflate(R.layout.view1, null))
        view_list.add(layoutInflater.inflate(R.layout.view2, null))
        view_list.add(layoutInflater.inflate(R.layout.view3, null))

        pager.adapter = CustomAdapter()

        pager.addOnPageChangeListener(object  : ViewPager.OnPageChangeListener{
            //
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                // position = 혀재뷰의 인덱스 번호
                textView.text = "${position} 번째 뷰가 나타났습니다."
            }
            // 스크롤 상태가 변경되었을때 호출
            override fun onPageScrollStateChanged(state: Int) {

            }
            // 페이지를 클릭했을때 반응
            override fun onPageSelected(position: Int) {

            }
        })
    }

    inner class CustomAdapter : PagerAdapter() {
        // viewpager를 통해서 보여주게 될 뷰의 개수를 반환
        override fun getCount(): Int {
            return view_list.size
        }

        // 현재 객체가 보여주게될 객체와 일치하는지를 구분
        override fun isViewFromObject(view: View, `object`: Any): Boolean {
            // 매개변수 = 보여줄 뷰 객체의 주소값, 자기 필요에의해 만들어지는 여러가지 객체들
            // `` 특수문자 키워드ㄹ 변수 생성
            return view == `object`
        }

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            // 두번쨰 매개변수 = 현재 보여질 항목의 인덱스 번호
            pager.addView(view_list[position])
            return view_list[position]
        }

        // 안보여지는 애를 제거하는 메소드 이게 없으면 정상작동하지 않는다.
        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            pager.removeView(`object` as View)
        }
    }
}
