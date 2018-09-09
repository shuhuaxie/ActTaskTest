package com.test.taskandactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends BaseAct {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        findViewById(R.id.two_act).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                // start twice
                startActivity(new Intent(MainActivity.this, TestActivity.class));
                startActivity(new Intent(MainActivity.this, TestActivity.class));
            }
        });
        findViewById(R.id.start_myself).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.putExtra("msg", this.toString() + "msg");
                startActivity(intent);
            }
        });
        findViewById(R.id.start_single_top).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Test2Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.start_single_instance).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Test3Activity.class);
                startActivity(intent);
            }
        });
        ((Button) findViewById(R.id.task_info)).setText("taskId:" + this.getTaskId());
        findViewById(R.id.new_task).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                startActivity(intent);
            }
        });
        findViewById(R.id.new_task_2).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Test4Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                startActivity(intent);
            }
        });
        findViewById(R.id.clear_top).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Test5Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    @Override protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String msg = intent.getStringExtra("msg");
        if (!TextUtils.isEmpty(msg)) {
            ((Button) findViewById(R.id.intent_msg)).setText(msg);
        }
    }
}
