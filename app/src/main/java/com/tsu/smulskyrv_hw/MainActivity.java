package com.tsu.smulskyrv_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "OnStart вызван");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "onStop вызван");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity", "onRestart вызван");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "onDestroy вызван");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "onResume вызван");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHelloHero = findViewById(R.id.btn_to_hello_hero);
        btnHelloHero.setOnClickListener(new ButtonHelloHeroListener());

        Button btnThreeBtn = findViewById(R.id.btn_to_three_btn);
        btnThreeBtn.setOnClickListener(new ButtonThreeBtnListener());

        Button btnComponents = findViewById(R.id.btn_to_components);
        btnComponents.setOnClickListener(new ButtonComponentsListener());

        Button btnSomePrograms = findViewById(R.id.btn_to_some_programs);
        btnSomePrograms.setOnClickListener(new ButtonSomeProgramsListener());
    }


    public class ButtonHelloHeroListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), HelloHeroActivity.class);
            startActivity(intent);
        }
    }

    public class ButtonThreeBtnListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), ThreeBtnActivity.class);
            startActivity(intent);
        }
    }

    public class ButtonComponentsListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), ComponentsActivity.class);
            startActivity(intent);
        }
    }

    public class ButtonSomeProgramsListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DataAnimCalcGpsActivity.class);
            startActivity(intent);
        }
    }






}
