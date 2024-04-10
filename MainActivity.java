package com.best.cy.layoutinflatetest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View v) {
        doInflateLayout();
    }

        // image.xml 에 정의된 레이아웃을 메인 액티비티의 레이아웃 일부로 추가하는 메소드 정의

    void doInflateLayout() {
        // XML 레이아웃에 정의되어 있는 partXml 객체를 참조한다.
        LinearLayout partXml = (LinearLayout) findViewById(R.id.partXml);

       //getSystemService를 사용하여 LayoutInflater 객체를 얻는다.
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 인플레이션 실행
        inflater.inflate(R.layout.image, partXml, true);
    }
}

