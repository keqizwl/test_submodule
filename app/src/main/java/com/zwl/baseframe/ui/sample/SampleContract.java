package com.zwl.baseframe.ui.sample;


import com.zwl.baseframe.model.SampleModel2;
import com.zwl.baseframe.ui.base.IBasePresenter;
import com.zwl.baseframe.ui.base.IBaseView;

/**
 * @author velen
 * @date 2017/3/23
 */
public class SampleContract {
    public interface ILoginView extends IBaseView {
        void setUser(SampleModel2 sampleModel2);
    }

    public interface ILoginPresenter extends IBasePresenter<ILoginView> {
        void handleLogin(String email, String pwd);
    }
}
