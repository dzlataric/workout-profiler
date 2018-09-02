package com.workout.profiler;

import android.app.Application;
import android.content.Context;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

public class WorkoutProfilerApp extends Application {

    public static Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();

        appContext = getApplicationContext();
        Fabric.with(this, new Crashlytics());

        // TODO Init db here...

    }

    public static Context getAppContext() {
        return appContext;
    }

}
