package a13;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a13.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0143a implements Application.ActivityLifecycleCallbacks {
    private int activityCount;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC22676k.m65750j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bunlde) {
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(bunlde, "bunlde");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        int i13 = this.activityCount;
        this.activityCount = i13 + 1;
        if (i13 == 0) {
            onFirstActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        int i13 = this.activityCount - 1;
        this.activityCount = i13;
        if (i13 == 0) {
            onLastActivityStopped(activity);
        }
    }

    public void onFirstActivityStarted(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
    }

    public abstract void onLastActivityStopped(Activity activity);
}
