package com.mindorks.example.android_dagger2_example.di.component;

import com.mindorks.example.android_dagger2_example.MainActivity;
import com.mindorks.example.android_dagger2_example.di.PerActivity;
import com.mindorks.example.android_dagger2_example.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by janisharali on 08/12/16.
 */

//Activity Component has ApplicationComponent added
//to use graph that has already been generated in the previous step and do exists because DemoApplication persists untill applicaiton is running

//@PerActivity is a scope and is used
    //to tell Dagger that
    //the Context and Activity provided by ActivityModule will be instantiated each time activitiy is created.
    //so these objects persist until that activity lives and each activity has its own set of these.

    //DataManager will not be created many times because it is marked as singleton

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
