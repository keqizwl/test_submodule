package com.zwl.baseframe.domain.ui.base;

import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.widget.Toast;


/**
 * @author velen
 * @date 2017/3/23
 */
public abstract class BaseActivity extends AppCompatActivity implements IBaseView {

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    protected BaseActivity mActivity;

    private IComponentFactory mComponentFactory;
    private ProgressDialog mWaittingDialog;
    private Toast mToast;
    private LayoutInflater mLayoutInflater;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
            localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | localLayoutParams.flags);
        }

        mActivity = this;

        mComponentFactory = new BaseComponentFactory(this);

        injectActivity();
    }

    //注入Activity的代码写在这里
    protected abstract void injectActivity();

    @Override
    public void showToast(String message) {
        if (TextUtils.isEmpty(message)) {
            return;
        }

        if (mToast == null) {
            mToast = mComponentFactory.createToast();
        }

        if (mToast != null) {
            mToast.setText(message);
            mToast.setDuration(Toast.LENGTH_LONG);
            mToast.show();
        }
    }

    @Override
    public void showProgressDialog(final String message) {
        if (TextUtils.isEmpty(message)) {
            
            return;
        }

        if (mWaittingDialog == null) {
            mWaittingDialog = mComponentFactory.createWaitingDialog();
        }

        if (mWaittingDialog != null) {
            mWaittingDialog.setMessage(message);
            mWaittingDialog.show();
        }

    }

    @Override
    public void dismissProgressDialog() {
        if (mWaittingDialog != null) {
            mWaittingDialog.dismiss();
        }
    }

    public void setComponentFactory(IComponentFactory mComponentFactory) {
        this.mComponentFactory = mComponentFactory;
    }
}
