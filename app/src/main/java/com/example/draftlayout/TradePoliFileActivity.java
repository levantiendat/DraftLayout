package com.example.draftlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TradePoliFileActivity extends AppCompatActivity {

    lop1adapter adapter;
    ListView listview1;
    ArrayList<Classname> arrayclass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trade_polifile_layout);
        function();
        adddata();
        listview1.setAdapter(adapter);
    }
    private void function(){
        listview1=(ListView) findViewById(R.id.lwclass);
        arrayclass =new ArrayList<>();
        adapter=new lop1adapter(this, R.layout.line1_layout, arrayclass);

    }
    private void adddata(){
        arrayclass.add(new Classname("1020252.2220.21.14",2,5));
        arrayclass.add(new Classname("1023713.2220.21.14",1,3));
        arrayclass.add(new Classname("1022853.2220.21.14A",1,3));
        arrayclass.add(new Classname("1023453.2220.21.13A",0,2));
        arrayclass.add(new Classname("1022654.2220.21.13A",1,3));
        listview1.setAdapter(adapter);
    }
}