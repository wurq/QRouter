package com.arch.qrouter.guid.presenter;

import android.view.View;

import com.arch.basemodule.presenter.BasePresenter;
import com.arch.qrouter.R;
import com.arch.qrouter.guid.activity.GuideActivity;
import com.arch.qrouter.mainpage.activity.MainActivity;

/**
 * Created by wurongqiu on 2018/5/31.
 */

public class GuidePresenter extends BasePresenter<GuideActivity>  implements View.OnClickListener{
    public GuidePresenter(GuideActivity target) {
        super(target);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.start_main:
                MainActivity.start(target);
                break;
            default:
                break;
        }
    }

}
