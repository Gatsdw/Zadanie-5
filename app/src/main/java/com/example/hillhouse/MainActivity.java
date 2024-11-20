package com.example.hillhouse;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private int coun = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Counter = findViewById(R.id.Counter);
        Button like = findViewById(R.id.likeButton);
        Button dislike = findViewById(R.id.deleteButton);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coun++;
                Counter.setText(coun +" polubień");
            }
        });
        dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coun--;
                if(coun < 0){
                    coun = 0;
                }
                Counter.setText(coun +" polubień");
            }
        });
    }
}