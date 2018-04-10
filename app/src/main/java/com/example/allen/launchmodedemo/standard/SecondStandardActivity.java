package com.example.allen.launchmodedemo.standard;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

import com.example.allen.launchmodedemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 第二个标准启动的Activity
 * Created by Allen on 2018/3/29.
 */

public class SecondStandardActivity extends AppCompatActivity {

    private static final String TAG = "SecondStandardActivity";
    @BindView(R.id.btn_open_next)
    Button btnOpenNext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_second);
        ButterKnife.bind(this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "-->onNewIntent");
    }

    @OnClick(R.id.btn_open_next)
    public void onViewClicked() {
        startActivity(new Intent(this, StandardActivity.class));
    }
}
