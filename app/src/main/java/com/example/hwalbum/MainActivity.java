package com.example.hwalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        Button btnNext = findViewById(R.id.btnNext);
        Button btnBack = findViewById(R.id.btnBack);
        final Random random = new Random();
        TextView txtSite = findViewById(R.id.txtInfo);
        String randomNumber = String.valueOf(random.nextInt(100));
        String info = "http://myfile.org/"+randomNumber;
        txtSite.setText(info);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            finish();
            }
        });
    }
}