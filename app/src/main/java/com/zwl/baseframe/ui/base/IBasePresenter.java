package com.zwl.baseframe.ui.base;

/**
 * @author velen
 * @date 2017/3/23
 */
public interface IBasePresenter<T extends IBaseView> {

    void start();

    void setView(T t);
}
