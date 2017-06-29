package com.zwl.baseframe.ui.base;

import android.app.ProgressDialog;
import android.view.LayoutInflater;
import android.widget.Toast;

/**
 * Created by weilong zhou on 2016/6/7.
 * Email:zhouwlong@gmail.com
 */

public abstract interface IComponentFactory {
    public abstract ProgressDialog createWaitingDialog();
    public abstract Toast createToast();
    public abstract LayoutInflater createLayoutInflator();
}
