package com.example.asd.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToastPopularMovie(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Popular Movie Message", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showStockHawk(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Stock Hawk Message", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showBuildItBigger(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Build It Bigger Message", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showMakeYourAppMaterial(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Make Your App Material Message", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showGoUbiquitous(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Go Ubiquitous Message", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showCapston(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Capston Message", Toast.LENGTH_SHORT);
        toast.show();
    }
}

