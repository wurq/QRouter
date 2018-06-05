package com.arch.componentrouter;

import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.arch.apprecycle.IAppRecycle;

import java.util.HashMap;

/**
 * Created by wurongqiu on 2018/6/3.
 */

public class Router {
    private static final String TAG = "Router";
    //注册的组件的集合
    private static HashMap<String, IAppRecycle> components = new HashMap<>();

    private HashMap<String, Object> pubDataMap = new HashMap<>();

    private static volatile Router instance;

    private Router() {
    }

    public static Router getInstance() {
        if (instance == null) {
            synchronized (Router.class) {
                if (instance == null) {
                    instance = new Router();
                }
            }
        }
        return instance;
    }

    /**
     * 注册组件
     *
     * @param classname 组件名
     */
    public static void registerComponent(@Nullable String classname) {
        if (TextUtils.isEmpty(classname)) {
            return;
        }
        if (components.keySet().contains(classname)) {
            return;
        }
        try {
            Class clazz = Class.forName(classname);
            IAppRecycle appRecycle = (IAppRecycle) clazz.newInstance();
            appRecycle.OnCreate();
            components.put(classname, appRecycle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 反注册组件
     *
     * @param classname 组件名
     */
    public static void unregisterComponent(@Nullable String classname) {
        if (TextUtils.isEmpty(classname)) {
            return;
        }
        if (components.keySet().contains(classname)) {
            components.get(classname).OnFinish();
            components.remove(classname);
            return;
        }
        try {
            Class clazz = Class.forName(classname);
            IAppRecycle applicationLike = (IAppRecycle) clazz.newInstance();
            applicationLike.OnFinish();
            components.remove(classname);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public synchronized void addPubData(String serviceName, Object serviceImpl) {
        if (serviceName == null || serviceImpl == null) {
            return;
        }
        pubDataMap.put(serviceName, serviceImpl);
    }

    public synchronized Object getPubData(String serviceName) {
        if (serviceName == null) {
            return null;
        }
        return pubDataMap.get(serviceName);
    }

    public synchronized void removePubData(String serviceName) {
        if (serviceName == null) {
            return;
        }
        pubDataMap.remove(serviceName);
    }
}
