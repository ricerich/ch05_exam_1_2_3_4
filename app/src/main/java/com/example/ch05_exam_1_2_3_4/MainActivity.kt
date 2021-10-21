package com.example.ch05_exam_1_2_3_4

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        setContentView(R.layout.ch04_1)

        //0.layout객체의 초기설정값(params) 설정
        var params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                                               LinearLayout.LayoutParams.WRAP_CONTENT)

        //1.Layout 만들기(only 코틀린객체로, xml아님!) ->this에 위치설정
        var baseLayout = LinearLayout(this)

        //2.layout의 추가 설정(예:orientation, backgroundcolor 등)
//        baseLayout.setOrientation(LinearLayout.VERTICAL) //자바 스타일(set메소드를 통해 대입)
        baseLayout.orientation = LinearLayout.VERTICAL //코틀린 스타일(멤변에 바로 대입)

        //3.layout을 View에 추가(contentView설정)
        setContentView(baseLayout, params)

        //4.button과 같은 view를 생성(only Kotlin으로) ->this
        var edt1 = EditText(this)
        var btn1 = Button(this)
        var tv1 = TextView(this)

        //5.button 설정(예:text, textSize, textColor등)
        edt1.hint = "여기에 입력해주세요!"
        btn1.text = "클릭~!"
        btn1.setBackgroundColor(Color.YELLOW)
        tv1.text = "결과~!"
        tv1.textSize = 30f
        tv1.setTextColor(Color.MAGENTA)

        //6.button을 layout에 꽂는다
        baseLayout.addView(edt1)
        baseLayout.addView(btn1)
        baseLayout.addView(tv1)

        //7.button 에 이벤트 설정
        btn1.setOnClickListener {

            tv1.text = edt1.text.toString()
        }


    }
}