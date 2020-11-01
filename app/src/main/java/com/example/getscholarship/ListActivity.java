package com.example.getscholarship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private ListView mainListView;
    private ListAdapter mainadapter;

    private List<Notice> mainList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        mainListView = (ListView) findViewById(R.id.mainListView);
        mainList = new ArrayList<Notice>();
        mainList.add(new Notice("국가장학금 1유형","국가","국가장학금 소득구분"));
        mainList.add(new Notice("국가장학금 2유형","국가","국가장학금 소득구분"));
        mainList.add(new Notice("국가장학금 푸른등대","국가","국가장학금 소득구분"));
        mainList.add(new Notice("국가장학금 대통령과학장학금","국가","국가장학금 소득구분"));
        mainList.add(new Notice("국가장학금 인문100년장학금","국가","국가장학금 성적우수"));
        mainList.add(new Notice("국가장학금 일반상환 학자금대출","국가","국가장학금 성적우수"));
        mainList.add(new Notice("국가장학금 취업후상환 학자금대출","국가","국가장학금 성적우수"));
        mainList.add(new Notice("국가장학금 구가우수장학금(이공계)","국가","국가장학금 성적우수"));

        mainList.add(new Notice("한밭대 성적우수 A","교내","한밭대학교 성적우수"));
        mainList.add(new Notice("한밭대 성적우수 B","교내","한밭대학교 성적우수"));
        mainList.add(new Notice("한밭대 성적우수 C","교내","한밭대학교 성적우수"));
        mainList.add(new Notice("한밭대 성취 A","교내","한밭대학교 기타"));
        mainList.add(new Notice("한밭대 성취 B","교내","한밭대학교 기타"));
        mainList.add(new Notice("한밭대 생활보호 장학금","교내","한밭대학교 소득구분"));
        mainList.add(new Notice("한밭대 디딤돌 A","교내","한밭대학교 장애인"));
        mainList.add(new Notice("한밭대 디딤돌 B","교내","한밭대학교 장애인"));
        mainList.add(new Notice("한밭대 근로","교내","한밭대학교 기타"));
        mainList.add(new Notice("충남대 성적우수","교내","충남대학교 성적우수"));
        mainList.add(new Notice("충남대 학업증진","교내","충남대학교 성적우수"));
        mainList.add(new Notice("충남대 영탑 A","교내","충남대학교 장애인"));
        mainList.add(new Notice("충남대 영탑B","교내","충남대학교 장애인"));



        mainadapter = new ListAdapter(getApplicationContext(), mainList);
        mainListView.setAdapter(mainadapter);
    }

}
