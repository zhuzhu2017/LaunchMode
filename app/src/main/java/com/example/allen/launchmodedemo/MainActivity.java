package com.example.allen.launchmodedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.allen.launchmodedemo.standard.StandardActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_mode_standard)
    Button btnModeStandard;
    @BindView(R.id.btn_mode_singleTop)
    Button btnModeSingleTop;
    @BindView(R.id.btn_mode_singleTask)
    Button btnModeSingleTask;
    @BindView(R.id.btn_mode_singleInstance)
    Button btnModeSingleInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_mode_standard, R.id.btn_mode_singleTop, R.id.btn_mode_singleTask, R.id.btn_mode_singleInstance})
    public void onViewClicked(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btn_mode_standard:    //标准模式
                intent = new Intent(this, StandardActivity.class);
                break;
            case R.id.btn_mode_singleTop:   //栈顶复用模式
                break;
            case R.id.btn_mode_singleTask:  //栈内复用模式
                break;
            case R.id.btn_mode_singleInstance:  //单实例模式
                break;
        }
        if (intent != null) startActivity(intent);
    }
}
