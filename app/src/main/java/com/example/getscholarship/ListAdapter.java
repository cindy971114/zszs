package com.example.getscholarship;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;




import android.content.Context;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.TextView;

        import java.util.List;

public class ListAdapter extends BaseAdapter {

    private Context context;
    private java.util.List<Notice> noticeList;

    public ListAdapter(Context context, List<Notice> noticeList) {
        this.context = context;
        this.noticeList = noticeList;
    }

    @Override
    public int getCount() {
        return noticeList.size();
    }

    @Override
    public Object getItem(int i) {
        return noticeList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v =View.inflate(context,R.layout.notice, null);
        TextView noticeText =(TextView) v.findViewById(R.id.noticeText);
        TextView nametext =(TextView) v.findViewById(R.id.nameText);
        TextView dateText =(TextView) v.findViewById(R.id.dateText);

        noticeText.setText(noticeList.get(i).getNotice());
        nametext.setText(noticeList.get(i).getName());
        dateText.setText(noticeList.get(i).getDate());

        v.setTag(noticeList.get(i).getNotice());
        return v;
    }




}
