package com.tsu.smulskyrv_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ThreeBtnActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ThreeBtnActivity", "onStart() вызван");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ThreeBtnActivity", "onStop вызван");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ThreeBtnActivity", "onRestart вызван");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ThreeBtnActivity", "onDestroy вызван");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ThreeBtnActivity", "onResume вызван");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_btn);
    }

}
