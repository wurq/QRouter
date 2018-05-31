package com.arch.basemodule.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import com.arch.basemodule.presenter.BaseFragmentPresenter;


/**
 * Created by wurongqiu on 2017/4/25.
 * <p>
 * 基础的MVPFragment
 */

public abstract class BaseFragment<T extends BaseFragmentPresenter> extends Fragment {

    public String mFragmentTitle = "";
    public boolean mIsCreated = false;
    protected T presenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (presenter != null) {
            presenter.onAttach();
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initPresenter();
        if (presenter != null) {
            presenter.onCreate();
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mIsCreated = true;
    }

//    @Override
//    protected int getLayoutId() {
//        return 0;
//    }
//
//    @Override
//    protected void initData() {
//
//    }

//    @Override
//    protected void initView(Bundle savedInstanceState) {
//
//    }

//    @Override
//    protected void initComplete() {
//        super.initComplete();
//        if (presenter != null) {
//            presenter.onCreateView();
//        }
//    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (presenter != null) {
            presenter.onActivityCreated(savedInstanceState);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        if (presenter != null) {
            presenter.onStart();
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        if (getUserVisibleHint()) {
//            onVisibilityChangedToUser(true, false);
        }
        if (presenter != null) {
            presenter.onResume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (getUserVisibleHint()) {
//            onVisibilityChangedToUser(false, false);
        }
        if (presenter != null) {
            presenter.onPause();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (presenter != null) {
            presenter.onStop();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (presenter != null) {
            presenter.onDestroyView();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.onDestroy();
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if (presenter != null) {
            presenter.onDetach();
        }
    }

    abstract protected void initPresenter();
}
