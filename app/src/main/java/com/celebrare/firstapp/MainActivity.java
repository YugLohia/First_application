package com.celebrare.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    TextView hello;
    Button roll;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello = findViewById(R.id.textView2);
        roll=findViewById(R.id.button2);
        img=findViewById(R.id.imageView2);
        Toast.makeText(MainActivity.this,"hello... wrong...",Toast.LENGTH_SHORT).show();
        Random random = new Random();

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// 1 6

                int temp = random.nextInt(6)+1;

                switch (temp){
                    case 1:
                        img.setImageResource(R.drawable.img);
                        break;
                    case 2:
                        img.setImageResource(R.drawable.img_1);
                        break;
                    case 3:
                        img.setImageResource(R.drawable.img_2);
                        break;
                    case 4:
                        img.setImageResource(R.drawable.img_3);
                        break;
                    case 5:
                        img.setImageResource(R.drawable.img_4);
                        break;
                    case 6:
                        img.setImageResource(R.drawable.img_5);
                        break;
                    default:
                        Toast.makeText(MainActivity.this,"Something went wrong...",Toast.LENGTH_SHORT).show();

                }

                String ans = String.valueOf(temp);
                hello.setText(ans);

            }
        });

    }


}