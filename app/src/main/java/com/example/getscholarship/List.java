package com.example.getscholarship;



public class List {
    String main_list;
    String main_name;
    String main_connent;


    public List(String main_list, String main_name, String main_connent) {
        this.main_list = main_list;
        this.main_name = main_name;
        this.main_connent = main_connent;
    }

    public String getMain_list() {
        return main_list;
    }

    public void setMain_list(String main_list) {
        this.main_list = main_list;
    }

    public String getMain_name() {
        return main_name;
    }

    public void setMain_name(String main_name) {
        this.main_name = main_name;
    }

    public String getDate() {
        return main_connent;
    }

    public void setDate(String date) {
        this.main_connent = date;
    }
}