package com.arch.qrouter.mainpage.presenter;

import android.view.View;
import android.view.View.OnClickListener;

import com.arch.basemodule.presenter.BasePresenter;
import com.arch.componentrouter.Router;
import com.arch.componentrouter.ui.UIRouter;
import com.arch.qrouter.R;
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
        switch (v.getId()) {
            case R.id.main_local_sync_btn:
                Router.registerComponent("com.arch.apprecycle.ModuleAApplication");
                break;
            case R.id.main_local_async_btn:
                Router.unregisterComponent("com.arch.apprecycle.ModuleAApplication");
                break;

            case R.id.launch_A:
                goToAActivityWithUri();

                break;
            default:
                break;
        }
    }

    // UI transfer with URI
    private void goToAActivityWithUri() {
//        Author author = new Author();
//        author.setName("Barack Obama");
//        author.setCounty("New York");
        UIRouter.getInstance().openUri(target,
                "DDComp://ModuleARouter/main?bookName=NYTIME&author="
                        /*+ JsonService.Factory.getInstance().create().toJsonString(author)*/, null);
    }
}
