package com.example.getscholarship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NotificationActivity extends AppCompatActivity {
    private ListView noticeListView;
    private NoticeListAdapter adapter;

    private List<Notice> noticeList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        noticeListView = (ListView) findViewById(R.id.noticeListView);
        noticeList = new ArrayList<Notice>();
        noticeList.add(new Notice("후원해주세요","관리자","2020-05-01"));
        noticeList.add(new Notice("모두에게 알립니다","관리자","2020-05-01"));
        noticeList.add(new Notice("중요 공지","관리자","2020-05-01"));
        noticeList.add(new Notice("개인 위생을 철저히","관리자","2020-04-30"));
        noticeList.add(new Notice("코로나 19 이겨냅시다.","관리자","2020-04-05"));
        noticeList.add(new Notice("4월 공지","관리자","2020-04-01"));
        noticeList.add(new Notice("3월 공지","관리자","2020-03-01"));
        noticeList.add(new Notice("2월 공지","관리자","2020-02-01"));
        noticeList.add(new Notice("국가장학금 신청하세요","관리자","2020-01-20"));
        noticeList.add(new Notice("1월 공지","관리자","2020-01-10"));
        noticeList.add(new Notice("서비스를 시작합니다.","관리자","2020-01-01"));

        adapter = new NoticeListAdapter(getApplicationContext(),noticeList);
        noticeListView.setAdapter(adapter);
    }
}
