package com.arch.componentrouter.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/**
 * Created by wurongqiu on 2018/6/3.
 */

public interface IComponentRouter {

    boolean openUri(Context context, String url, Bundle bundle);

    boolean openUri(Context context, Uri uri, Bundle bundle);

    boolean openUri(Context context, String url, Bundle bundle, Integer requestCode);

    boolean openUri(Context context, Uri uri, Bundle bundle, Integer requestCode);

    boolean verifyUri(Uri uri);
}
