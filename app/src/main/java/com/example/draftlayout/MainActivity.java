package com.example.draftlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnsi,btnsu,btnpro,btnadpro,btnrp,btndetail,btntrade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsi=(Button) findViewById(R.id.button1);
        btnsu=(Button) findViewById(R.id.button2);
        btnpro=(Button) findViewById(R.id.button3);
        btnadpro=(Button) findViewById(R.id.button4);
        btnrp=(Button) findViewById(R.id.button5);
        btndetail=(Button) findViewById(R.id.button6);
        btntrade=(Button) findViewById(R.id.button7);
        btnsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SigninActivity.class);
                startActivity(intent);
            }
        });
        btnsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (MainActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
        btnpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
        btnadpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, AdminProfileActivity.class);
                startActivity(intent);
            }
        });
        btnrp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ReportActivity.class);
                startActivity(intent);
            }
        });
        btndetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AvailableClassActivity.class);
                startActivity(intent);
            }
        });
        btntrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TradePoliFileActivity.class);
                startActivity(intent);
            }
        });
    }
}