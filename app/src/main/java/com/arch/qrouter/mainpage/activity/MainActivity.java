package com.arch.qrouter.mainpage.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.arch.basemodule.activity.BaseActivity;
import com.arch.qrouter.R;
import com.arch.qrouter.mainpage.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Router.registerComponent("com.arch.apprecycle.ModuleAApplication");

        Button sync_btn = findViewById(R.id.main_local_sync_btn);
        sync_btn.setOnClickListener(presenter);

        Button async_btn = findViewById(R.id.main_local_async_btn);
        async_btn.setOnClickListener(presenter);

        Button launch_A = findViewById(R.id.launch_A);
        launch_A.setOnClickListener(presenter);
    }

    @Override
    protected void initPresenter() {
        presenter = new MainPresenter(this);
    }

    public static void start(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, MainActivity.class);
        context.startActivity(intent);
    }
}
