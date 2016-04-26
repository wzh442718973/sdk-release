package com.tune.ma.application;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;

/**
 * Created by johng on 12/22/15.
 */
@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
public class TuneActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        // Not capturing onCreate
    }

    @Override
    public void onActivityStarted(Activity activity) {
        TuneActivity.onStart(activity);
    }

    @Override
    public void onActivityResumed(Activity activity) {
        TuneActivity.onResume(activity);
    }

    @Override
    public void onActivityPaused(Activity activity) {
        // Not capturing onPause
    }

    @Override
    public void onActivityStopped(Activity activity) {
        TuneActivity.onStop(activity);
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        // Not capturing onSaveInstanceState
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        // Not capturing onDestroy
    }
}
