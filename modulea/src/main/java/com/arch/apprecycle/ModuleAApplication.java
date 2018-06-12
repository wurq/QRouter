package com.arch.apprecycle;


import com.arch.componentrouter.ui.UIRouter;

/**
 * Created by wurongqiu on 2018/6/6.
 */

public class ModuleAApplication implements IAppRecycle {

    UIRouter uiRouter = UIRouter.getInstance();

    @Override
    public void OnCreate() {
        uiRouter.registerUI("ModuleARouter");
    }

    @Override
    public void OnFinish() {
        uiRouter.unregisterUI("modulea");
    }
}
