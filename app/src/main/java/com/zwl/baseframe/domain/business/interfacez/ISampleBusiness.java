package com.zwl.baseframe.domain.business.interfacez;


import com.zwl.baseframe.implementz.CommonCallback;
import com.zwl.baseframe.domain.business.model.SampleModel;

/**
 * @author velen
 * @date 2017/3/23
 */
public interface ISampleBusiness {

    void login(final String email, final String pwd, CommonCallback<SampleModel> commonCallback);
}
