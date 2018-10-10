package com.example.adil.name_show;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    public String[] mApps = {
            "Instagram",
            "Pinterest",
            "Pocket",
            "Twitter"
    };
    TextView tc;
    ArrayList<String> arrayList=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        tc = (TextView) findViewById(R.id.textView);
        tc.setText("hello" + getIntent().getStringExtra("EDIT"));
       //ListView listView =(ListView)findViewById(R.id.list);
        //String[]  fromColumns  ={ContactsContract.Data.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER};int[]toViews  ={R.id.editText};
        //SimpleCursorAdapter adapter  =new SimpleCursorAdapter(this,R.layout.listview,cursor,fromColumns,  toViews,0);
        //listView  =  getListView();listView.setAdapter(adapter);
        arrayList.add(getIntent().getExtras().getString("data"));
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,arrayList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}