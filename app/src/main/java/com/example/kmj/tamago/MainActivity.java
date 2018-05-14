package com.example.kmj.tamago;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    ImageView image;
    Button button;
    int i = 50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView) findViewById(R.id.mainText);
        image=(ImageView) findViewById(R.id.mainImage);
        button=(Button) findViewById(R.id.mainButton);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //count i--;
                i--;
                if(i<0) {
                    Toast.makeText(getApplicationContext(), "다끝남ㅇㅇ", Toast.LENGTH_SHORT).show();
                    i = 0;
                }
                if(i==25){
                    image.setImageResource(R.drawable.ball);
                }

               text.setText(String.valueOf(i));

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=50;
                text.setText(String.valueOf(i));
                //리셋
            }
        });

    }
}

//#1
//클릭
//클릭횟수
//리셋

//#2
//알깨지는거
//100img
//50img
//30img
//10img
