package com.zwl.baseframe.di.module;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

/**
 * @author velen
 * @date 2017/3/23
 */
@Module
public class AppModule {
    private Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    public Application provideApplication() {
        return mApplication;
    }
}
