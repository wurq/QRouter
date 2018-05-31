package com.arch.qrouter.activity;

import android.os.Bundle;

import com.arch.basemodule.activity.BaseActivity;
import com.arch.qrouter.R;
import com.arch.qrouter.presenter.MainPresenter;

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
}
