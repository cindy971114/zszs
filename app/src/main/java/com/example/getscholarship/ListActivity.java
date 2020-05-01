package com.example.getscholarship;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private ListView noticeListView;
    private NoticeListAdapter adapter;

    private List<Notice> noticeList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        noticeListView = (ListView) findViewById(R.id.noticeListView);
        noticeList = new ArrayList<Notice>();
        noticeList.add(new Notice("으랏차장학금","대전시","마감일2020-06-01"));
        noticeList.add(new Notice("아싸장학금","청주시","마감일2020-06-01"));
        noticeList.add(new Notice("집갈래장학금","대전시","마감일2020-06-01"));
        noticeList.add(new Notice("살려줘장학금","대전시","마감일2020-06-01"));
        noticeList.add(new Notice("그만해장학금","대전시","마감일2020-06-01"));
        noticeList.add(new Notice("그만해장학금","대전시","마감일2020-06-01"));
        noticeList.add(new Notice("그만해장학금","대전시","마감일2020-06-01"));
        noticeList.add(new Notice("그만해장학금","대전시","마감일2020-06-01"));
        noticeList.add(new Notice("그만해장학금","대전시","마감일2020-06-01"));
        noticeList.add(new Notice("그만해장학금","대전시","마감일2020-06-01"));
        noticeList.add(new Notice("그만해장학금","대전시","마감일2020-06-01"));
        noticeList.add(new Notice("그만해장학금","대전시","마감일2020-06-01"));
        noticeList.add(new Notice("그만해장학금","대전시","마감일2020-06-01"));




        adapter = new NoticeListAdapter(getApplicationContext(),noticeList);
        noticeListView.setAdapter(adapter);
    }
}
