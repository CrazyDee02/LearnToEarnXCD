package com.xcd.learntoearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Theory extends AppCompatActivity {
    private ImageButton homeBtn;
    private ImageButton introductionBtn;
    private ImageButton returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);
        returnBtn = findViewById(R.id.returnbtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Theory.this,MainActivity.class);
                startActivity(intent);
            }
        });
        homeBtn = findViewById(R.id.homebtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Theory.this , MainActivity.class);
                startActivity(intent);
            }
        });
        introductionBtn = findViewById(R.id.introduction);
        introductionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Theory.this , introduction.class);
                startActivity(intent);
            }
        });

    }
}
