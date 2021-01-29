package com.tsu.smulskyrv_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloHeroActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("HelloHeroActivity", "OnStart вызван");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("HelloHeroActivity", "onStop вызван");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("HelloHeroActivity", "onRestart вызван");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("HelloHeroActivity", "onDestroy вызван");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("HelloHeroActivity", "onResume вызван");
    }

    private Button btnFrags;
    private Button btnBabes;
    private int fCount = 0;
    private int bCount = 0;
    private TextView mHelloTextView;
    private TextView fragsTextView;
    private TextView babesTextView;
    private EditText mNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_hero);
        btnFrags = findViewById(R.id.btn_frags);
        btnBabes = findViewById(R.id.btn_babes);
        mHelloTextView = findViewById(R.id.txt_name);
        fragsTextView = findViewById(R.id.txt_count_frags);
        babesTextView = findViewById(R.id.txt_count_hearts);
        mNameEditText = findViewById(R.id.plain_txt_name);
    }
    public void onClick(View view) {
        if (mNameEditText.getText().length() == 0) {
            mHelloTextView.setText("Hello Hero!");
        } else {
            mHelloTextView.setText("Привет, " + mNameEditText.getText());
        }

    btnFrags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            fragsTextView.setText("Я насчитал " + ++fCount + " фрагов");
            }
        }
    );

    btnBabes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                babesTextView.setText("Я насчитал " + ++bCount + " сердец");
            }
        }
    );
    }





}