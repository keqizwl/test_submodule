package com.zwl.baseframe.domain.ui.base;

import android.app.ProgressDialog;
import android.view.LayoutInflater;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/7/13.
 */
public class BaseComponentFactory implements IComponentFactory {
    private BaseActivity baseActivity;

    public BaseComponentFactory(BaseActivity activity) {
        baseActivity = activity;
    }

    @Override
    public ProgressDialog createWaitingDialog() {
        return new ProgressDialog(baseActivity);
    }

    @Override
    public Toast createToast() {
        return Toast.makeText(baseActivity, "", Toast.LENGTH_LONG);
    }

    @Override
    public LayoutInflater createLayoutInflator() {
        return LayoutInflater.from(baseActivity);
    }
}
