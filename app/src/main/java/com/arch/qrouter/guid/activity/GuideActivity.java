package com.arch.qrouter.guid.activity;

import android.os.Bundle;
import android.widget.Button;

import com.arch.basemodule.activity.BaseActivity;
import com.arch.qrouter.R;
import com.arch.qrouter.guid.presenter.GuidePresenter;

public class GuideActivity extends BaseActivity<GuidePresenter> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        Button btn = findViewById(R.id.start_main);
        btn.setOnClickListener(presenter);
    }

    @Override
    protected void initPresenter() {
        presenter = new GuidePresenter(this);
    }
}
