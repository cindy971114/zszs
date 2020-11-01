package com.example.getscholarship;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MatchingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matching);
    }

    private ArrayAdapter typeAdapter;
    private Spinner typeSpinner;
    private ArrayAdapter anniverAdapter;
    private Spinner anniverSpinner;

    private String scholUniversity="";
    private String scholType="";
    private String scholAnniver="";






}

