package com.arch.qrouter.mainpage.presenter;

import android.view.View;
import android.view.View.OnClickListener;

import com.arch.basemodule.presenter.BasePresenter;
import com.arch.qrouter.mainpage.activity.MainActivity;

/**
 * Created by wurongqiu on 2018/5/31.
 */

public class MainPresenter extends BasePresenter<MainActivity>  implements OnClickListener{
    public MainPresenter(MainActivity target) {
        super(target);
    }

    @Override
    public void onClick(View v) {

    }
}
