package com.tsu.smulskyrv_hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class ComponentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);

        final Button btnStart = findViewById(R.id.button_start);
        final Button btnStop = findViewById(R.id.button_stop);

        // запуск службы
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // используем явный вызов службы
                startService(
                        new Intent(ComponentsActivity.this, PlayService.class));
            }
        });

        // остановка службы
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(
                        new Intent(ComponentsActivity.this, PlayService.class));
            }
        });
    }


    public static final String WHERE_MY_HERO_ACTION = "com.tsu.smulskyrv_hw.action.HERO";
    public static final String ALARM_MESSAGE = "Нужен срочно герой!";

    public void sendMessage(View view) {
        Intent intent = new Intent();
        intent.setAction(WHERE_MY_HERO_ACTION);
        intent.putExtra("com.tsu.smulskyrv_hw.broadcast.Message", ALARM_MESSAGE);
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(intent);
    }




}