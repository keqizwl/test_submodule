package com.zwl.baseframe.di.component;

import android.app.Activity;

import com.zwl.baseframe.di.module.ActivityModule;
import com.zwl.baseframe.di.scope.ActivityScope;
import com.zwl.baseframe.ui.sample.SampleActivity;

import dagger.Subcomponent;

/**
 * @author velen
 * @date 2017/3/23
 */
@ActivityScope
@Subcomponent(modules = {ActivityModule.class})
public interface ActivityCompontent {
    void inject(SampleActivity sampleActivity);

    Activity context();
}
