package com.hyperaware.android.devtricks.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.hyperaware.android.devtricks.R;

public class LaunchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
    }
    private void initViews() {
        setContentView(R.layout.activity_launch);
        findViewById(R.id.do_a_search).setOnClickListener(
                (v) -> {
                    startActivity(new Intent(LaunchActivity.this, SearchActivity.class));
                }
        );
        ((TextView) findViewById(R.id.api_key)).setText("API key: " + getResources().getString(R.string.some_api_key));
    }
}
