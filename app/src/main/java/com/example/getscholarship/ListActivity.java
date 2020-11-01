package com.example.getscholarship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        mainList.add(new Notice("바꿔요 국가장학금으로","국가","장학금 세부사항"));
        mainList.add(new Notice("모두에게 알립니다","관리자","2020-05-01"));
        mainList.add(new Notice("중요 공지","관리자","2020-05-01"));
        mainList.add(new Notice("개인 위생을 철저히","관리자","2020-04-30"));
        mainList.add(new Notice("코로나 19 이겨냅시다.","관리자","2020-04-05"));
        mainList.add(new Notice("4월 공지","관리자","2020-04-01"));
        mainList.add(new Notice("3월 공지","관리자","2020-03-01"));
        mainList.add(new Notice("2월 공지","관리자","2020-02-01"));
        mainList.add(new Notice("국가장학금 신청하세요","관리자","2020-01-20"));
        mainList.add(new Notice("1월 공지","관리자","2020-01-10"));
        mainList.add(new Notice("서비스를 시작합니다.","관리자","2020-01-01"));

        mainadapter = new ListAdapter(getApplicationContext(), mainList);
        mainListView.setAdapter(mainadapter);




    }
}
