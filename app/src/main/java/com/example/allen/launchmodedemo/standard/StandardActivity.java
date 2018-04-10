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
 * 标准启动模式Activity实例
 * Created by Allen on 2018/3/28.
 */

public class StandardActivity extends AppCompatActivity {

    private static final String TAG = "StandardActivity";
    @BindView(R.id.btn_open_next)
    Button btnOpenNext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);
        ButterKnife.bind(this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "-->onNewIntent");
    }

    @OnClick(R.id.btn_open_next)
    public void onViewClicked() {
        startActivity(new Intent(this, SecondStandardActivity.class));
    }
}
