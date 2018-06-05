package com.arch.qrouter.mainpage.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.arch.basemodule.activity.BaseActivity;
import com.arch.qrouter.R;
import com.arch.qrouter.mainpage.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
