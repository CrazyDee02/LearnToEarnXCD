package com.xcd.learntoearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Introduction3 extends AppCompatActivity {
    private View first;
    private View second;
    private View third;
    private View fourth;
    private View fifth;
    private TextView Text1;
    private TextView Text2;
    private TextView Text3;
    private TextView Text4;
    private Button startTest;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private TextView a1;
    private SharedPreferences s1;
    private SharedPreferences.Editor e1;
    private ImageButton homeBtn;
    private ImageButton returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction3);
        s1 = getSharedPreferences("Storage", MODE_PRIVATE);
        s1.getInt("progress2",MODE_PRIVATE);
        returnBtn = findViewById(R.id.returnbtn);
        homeBtn = findViewById(R.id.homebtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Introduction3.this,introduction.class);
                startActivity(intent);
            }
        });
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Introduction3.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Text1 = findViewById(R.id.Text1);
        Text1.setText(R.string.Text7);
        Text2 = findViewById(R.id.Text2);
        Text2.setText(R.string.Text8);
        Text3 = findViewById(R.id.Text3);
        Text3.setText(R.string.Text9);
        Text4 = findViewById(R.id.Text4);
        Text4.setText(R.string.Text10);
        first= findViewById(R.id.first);
        second=findViewById(R.id.second);
        third=findViewById(R.id.third);
        fourth=findViewById(R.id.fourth);
        fifth = findViewById(R.id.fifth);
        final View arrays[] = new View[]{first, second, third, fourth,fifth};
        startTest = findViewById(R.id.startTest);
        startTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            e1 = s1.edit();
            e1.putInt("progress2",1);
            e1.apply();
            Text1.setText(null);
            Text2.setText(null);
            Text3.setText(null);
            Text4.setText(null);

            }
        });

    }
}


