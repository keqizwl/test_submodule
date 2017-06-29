package com.zwl.baseframe.business.sample;


import com.zwl.baseframe.business.CommonCallback;
import com.zwl.baseframe.model.SampleModel;
import com.zwl.baseframe.module.SampleModuleImpl;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


/**
 * @author velen
 * @date 2017/3/23
 */

public class SampleBusinessImpl implements ISampleBusiness {
    @Inject
    SampleModuleImpl mAccountModule;

    @Inject
    public SampleBusinessImpl() {

    }

    @Override
    public void login(final String email, final String pwd, CommonCallback<SampleModel> commonCallback) {
        Observable.just(new SampleBean(email, pwd))
                .subscribeOn(Schedulers.io())
                .flatMap(mAccountModule.login())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe((result) -> {
                    commonCallback.onSuccess(result);
                }, (e) -> {
                    commonCallback.onError(0, e.getMessage());
                });
    }
}
