package com.tsu.smulskyrv_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DataAnimCalcGpsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_anim_calc_gps);

        Button btnDataStorage = findViewById(R.id.btn_to_data);
        btnDataStorage.setOnClickListener(new ButtonDataStorageListener());

        Button btnAnim = findViewById(R.id.btn_to_anim);
        btnAnim.setOnClickListener(new ButtonAnimListener());

        Button btnCalc = findViewById(R.id.btn_to_calc);
        btnCalc.setOnClickListener(new ButtonCalcListener());
    }

    public class ButtonDataStorageListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DataStorageAndWorkingWithFilesActivity.class);
            startActivity(intent);
        }
    }

    public class ButtonAnimListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), AnimActivity.class);
            startActivity(intent);
        }
    }

    public class ButtonCalcListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), CalculatorActivity.class);
            startActivity(intent);
        }
    }



}