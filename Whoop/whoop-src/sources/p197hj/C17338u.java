package p197hj;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hj.u */
/* JADX INFO: loaded from: classes.dex */
public final class C17338u implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: x */
    public static WeakReference f67143x;

    /* JADX INFO: renamed from: w */
    public static final C17338u f67142w = new C17338u();

    /* JADX INFO: renamed from: y */
    public static final HashSet f67144y = new HashSet();

    /* JADX INFO: renamed from: a */
    public final Activity m49083a() {
        WeakReference weakReference = f67143x;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC22676k.m65750j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        if (AbstractC22676k.m65745e(m49083a(), activity)) {
            return;
        }
        f67143x = new WeakReference(activity);
        Iterator it = f67144y.iterator();
        while (it.hasNext()) {
            ((InterfaceC17318a) it.next()).mo49082a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
    }
}
