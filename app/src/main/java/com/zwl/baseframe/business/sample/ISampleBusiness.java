package com.zwl.baseframe.business.sample;


import com.zwl.baseframe.business.CommonCallback;
import com.zwl.baseframe.model.SampleModel;

/**
 * @author velen
 * @date 2017/3/23
 */
public interface ISampleBusiness {

    void login(final String email, final String pwd, CommonCallback<SampleModel> commonCallback);
}
