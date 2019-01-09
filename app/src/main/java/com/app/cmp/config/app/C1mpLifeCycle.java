package com.app.cmp.config.app;

import android.content.Context;
import android.util.Log;

import com.app.cmp.BuildConfig;
import com.app.cmp.config.db.DbApiProxy;
import com.app.cmp.config.db.GreenDaoApi;
import com.app.cmp.config.request.HttpApiProxy;
import com.app.cmp.config.request.RetrofitApi;
import com.app.library.app.AppLifecycle;

public class C1mpLifeCycle implements AppLifecycle {
    @Override
    public void onAttach(Context applicationContext) {
        Log.e("TAG","初始化:"+C1mpLifeCycle.class.getSimpleName());
        HttpApiProxy.init(new RetrofitApi());
        DbApiProxy.init(new GreenDaoApi(applicationContext,"a.db"));

    }
}
