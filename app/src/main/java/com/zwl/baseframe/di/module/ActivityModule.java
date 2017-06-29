package com.zwl.baseframe.di.module;

import android.app.Activity;

import com.zwl.baseframe.ui.sample.SampleContract;
import com.zwl.baseframe.ui.sample.SamplePresenter;

import dagger.Module;
import dagger.Provides;

/**
 * @author velen
 * @date 2017/3/23
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    public Activity provideActivity() {
        return mActivity;
    }

    @Provides
    public SampleContract.ILoginPresenter provideLoginPresent(SamplePresenter samplePresenter) {
        return samplePresenter;
    }
}
