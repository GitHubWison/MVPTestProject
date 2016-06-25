package com.example.dexxu.mvptestproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.dexxu.mvptestproject.login.view.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private TextView login_test_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        login_test_textview = (TextView)findViewById(R.id.login_test_textview);
        login_test_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("hello","tonext");
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
            }
        });
    }
}
