package com.mindorks.example.android_dagger2_example.di.component;

import android.app.Application;
import android.content.Context;

import com.mindorks.example.android_dagger2_example.DemoApplication;
import com.mindorks.example.android_dagger2_example.data.DataManager;
import com.mindorks.example.android_dagger2_example.data.DbHelper;
import com.mindorks.example.android_dagger2_example.data.SharedPrefsHelper;
import com.mindorks.example.android_dagger2_example.di.ApplicationContext;
import com.mindorks.example.android_dagger2_example.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;


/**
 * Created by janisharali on 08/12/16.
 */

//it is an interface which is implemented by dagger

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    //why that?
    //when dependencies are provided through field injection, we need to tell Dagger to scan this class through the implementation of this interface
    void inject(DemoApplication demoApplication);

    //the rest are the methods which are used to access dependencies that exist on the dependency graph

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}
