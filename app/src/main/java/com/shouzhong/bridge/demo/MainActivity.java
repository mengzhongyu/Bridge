package com.shouzhong.bridge.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.shouzhong.bridge.ActivityStack;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickEventBus(View v) {
        Intent intent = new Intent(this, EventBusTest1Activity.class);
        startActivity(intent);
    }

    public void onClickAct(View v) {
        Intent intent = new Intent(this, ActTest1Activity.class);
        intent.putExtra("unique_id", ActivityStack.getUniqueId(this));
        startActivity(intent);
    }

    public void onClickFrgm(View v) {
        Intent intent = new Intent(this, FrgmTest1Activity.class);
        startActivity(intent);
    }
}
