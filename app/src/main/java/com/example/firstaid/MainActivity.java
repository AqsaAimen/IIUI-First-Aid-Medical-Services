package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
ProgressBar progressBar;
//ImageView cardview;
ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //imageview = (ImageView) findViewById(R.id.image);
        //imageview.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
        //final ImageView imageView=new ImageView(MainActivity.this, (AttributeSet) view);
        //init();
        progressBar.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                init();
                progressBar.setVisibility(View.GONE);
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent);

            }
        }, 7000);

        //});

    }
        /*init();
        progressBar.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.GONE);
                Intent intent=new Intent(MainActivity.this,NewActivity.class);
                startActivity(intent);

            }
        },9000);*/
    private void init()
    {
        this.progressBar=findViewById(R.id.progess1);
    }
}