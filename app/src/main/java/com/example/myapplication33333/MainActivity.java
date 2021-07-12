package com.example.myapplication33333;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.logmodule.LogUtils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        Toast.makeText(this, LogUtils.getLog(), Toast.LENGTH_SHORT).show();
    }
}