package com.app.cmp.mvp.activity;

import android.os.Bundle;
import android.widget.ImageView;

import com.app.cmp.R;
import com.app.cmp.mvp.presenter.MainPresenter;
import com.app.cmp.mvp.view.MainContractView;
import com.app.library.frame.imageloader.ImageLoaderProxy;
import com.app.library.mvp.activity.BaseMvpActivity;
import butterknife.BindView;

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContractView.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int applyContent() {
        return R.layout.c1_activity_main;
    }

    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter(this);
    }
}
