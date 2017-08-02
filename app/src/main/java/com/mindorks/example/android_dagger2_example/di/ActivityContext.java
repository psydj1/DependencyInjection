package com.mindorks.example.android_dagger2_example.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by janisharali on 25/12/16.
 */

/*
Qualifier is used to distinguish between objects with the same type but different instances.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityContext {
}
