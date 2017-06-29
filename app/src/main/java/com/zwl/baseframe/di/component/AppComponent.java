package com.zwl.baseframe.di.component;

import android.app.Application;

import com.zwl.baseframe.BaseApplication;
import com.zwl.baseframe.di.module.ActivityModule;
import com.zwl.baseframe.di.module.AppModule;
import com.zwl.baseframe.di.scope.AppScope;

import dagger.Component;

/**
 * @author velen
 * @date 2017/3/23
 */
@AppScope
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(BaseApplication application);

    Application context();

    ActivityCompontent newActivityCompontent(ActivityModule activityModule);
}
