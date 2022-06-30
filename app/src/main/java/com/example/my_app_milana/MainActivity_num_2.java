package com.example.my_app_milana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity_num_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }







    public void startNewActivity(View v){
        Intent intent=new Intent(this, MainActivity_num3.class);

        startActivity(intent);
    }
}