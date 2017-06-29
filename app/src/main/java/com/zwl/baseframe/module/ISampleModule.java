package com.zwl.baseframe.module;


import com.zwl.baseframe.business.sample.SampleBean;
import com.zwl.baseframe.model.SampleModel;

import io.reactivex.Observable;
import io.reactivex.functions.Function;


/**
 * @author velen
 * @date 2017/3/23
 */
public interface ISampleModule {
    Function<SampleBean, Observable<SampleModel>> login();
}
