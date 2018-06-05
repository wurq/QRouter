package com.arch.app;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;


/**
 * Created by wurongqiu on 2017/4/26.
 * <p>
 * Editor by wangjianbiao on 2017/08/16
 */

public class QRouterApplication extends Application {

    public static final String TAG = "xhx_debug";

    public static final String KILL_LIVE_PROCESS = "killOtherProcess";
    static Handler sMainThreadHandler;
    private static BroadcastReceiver mReceiver;

    @Override
    public void onCreate() {
//        AppPrefs.putSharedBoolean(getApplicationContext(),"test",false);
        super.onCreate();
        long startTime = System.currentTimeMillis();

        Context context = getApplicationContext();
        AppProfile.setContext(context);
//        AppProfile.setStartTime(System.currentTimeMillis() + DataConst.RuntimeStatus.CURRENT_TIME);

    }

    /**
     * 无需同步初始化（在MainActivity显示之前不会使用）
     */
    private void init(){
        long startTime = System.currentTimeMillis();

        // 初始化配置
        initProperties();
        // 内存泄漏 initialize
//        if (LeakCanary.isInAnalyzerProcess(this)) {
//            return;
//        }
    }


    private void initProperties() {

    }

    private void registerModules() {
        // 注册模块
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

}
