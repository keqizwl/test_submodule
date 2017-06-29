package com.zwl.baseframe.business;

/**
 * @author velen
 * @date 2017/3/27
 */
public interface CommonCallback<T> {
    void onSuccess(T t);

    void onError(int code, String message);
}
