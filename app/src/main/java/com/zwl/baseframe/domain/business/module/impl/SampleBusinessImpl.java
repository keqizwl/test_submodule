package com.zwl.baseframe.domain.business.module.impl;


import com.zwl.baseframe.domain.business.interfacez.ISampleBusiness;
import com.zwl.baseframe.domain.business.model.SampleModel;
import com.zwl.baseframe.implementz.CommonCallback;

import javax.inject.Inject;


/**
 * @author velen
 * @date 2017/3/23
 */

public class SampleBusinessImpl implements ISampleBusiness {
//    @Inject
//    ISampleModule mAccountModule;
//
//    @Inject
//    ISampleStore mSampleStorer;

    @Inject
    public SampleBusinessImpl() {

    }

    @Override
    public void login(final String email, final String pwd, CommonCallback<SampleModel> commonCallback) {

//        Observable.just(new SampleBean(email, pwd))
//                .subscribeOn(Schedulers.io())
//                .flatMap(mAccountModule.login())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe((result) -> {
//                    mSampleStorer.storeSampleModel(result);
//                    commonCallback.onSuccess(result);
//                }, (e) -> {
//                    commonCallback.onError(0, e.getMessage());
//                });
    }
}
