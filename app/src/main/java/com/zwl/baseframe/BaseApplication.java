package com.zwl.baseframe;

import android.app.Activity;
import android.app.Application;

import com.zwl.baseframe.domain.ui.implementz.di.component.ActivityCompontent;
import com.zwl.baseframe.domain.ui.implementz.di.module.ActivityModule;
import com.zwl.baseframe.implementz.di.component.AppComponent;
import com.zwl.baseframe.implementz.di.component.DaggerAppComponent;
import com.zwl.baseframe.implementz.di.module.AppModule;


/**
 * @author velen
 * @date 2017/3/23
 */
public class BaseApplication extends Application {
    private static volatile BaseApplication sInstance;
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        initAppComponent();
    }

    private void initAppComponent() {
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(sInstance)).build();
    }

    public AppComponent component() {
        return mAppComponent;
    }

    public ActivityCompontent getSampleActivityComponent(Activity activity){
        return  mAppComponent.newActivityCompontent(new ActivityModule(activity));
    }

    public static BaseApplication getInstance() {
        return sInstance;
    }

}
