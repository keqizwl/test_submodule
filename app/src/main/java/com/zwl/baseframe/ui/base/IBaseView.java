package com.zwl.baseframe.ui.base;

/**
 * @author velen
 * @date 2017/3/23
 */
public interface IBaseView {
    void showToast(String message);

    void showProgressDialog(String message);

    void dismissProgressDialog();
}
