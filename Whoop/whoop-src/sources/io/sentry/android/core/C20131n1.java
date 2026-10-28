package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.HandlerThread;
import java.lang.ref.WeakReference;
import p047c9.C4312c;

/* JADX INFO: renamed from: io.sentry.android.core.n1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20131n1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: w */
    public final WeakReference f75625w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AlertDialogC20134o1 f75626x;

    public C20131n1(AlertDialogC20134o1 alertDialogC20134o1, WeakReference weakReference) {
        this.f75626x = alertDialogC20134o1;
        this.f75625w = weakReference;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Activity activity2;
        if (activity == this.f75625w.get()) {
            AlertDialogC20134o1 alertDialogC20134o1 = this.f75626x;
            C20122k1 c20122k1 = alertDialogC20134o1.f75628E;
            if (c20122k1 != null) {
                c20122k1.m56025c();
                HandlerThread handlerThread = c20122k1.f75594c;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    c20122k1.f75594c = null;
                    c20122k1.f75595d = null;
                }
                alertDialogC20134o1.f75628E = null;
            }
            if (alertDialogC20134o1.f75629F != null) {
                Context context = alertDialogC20134o1.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity2 = null;
                        break;
                    } else {
                        if (context instanceof Activity) {
                            activity2 = (Activity) context;
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity2 != null) {
                    activity2.getApplication().unregisterActivityLifecycleCallbacks(alertDialogC20134o1.f75629F);
                }
                alertDialogC20134o1.f75629F = null;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C20122k1 c20122k1;
        if (activity != this.f75625w.get() || (c20122k1 = this.f75626x.f75628E) == null) {
            return;
        }
        c20122k1.m56025c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AlertDialogC20134o1 alertDialogC20134o1;
        C20122k1 c20122k1;
        WeakReference weakReference = this.f75625w;
        if (activity != weakReference.get() || (c20122k1 = (alertDialogC20134o1 = this.f75626x).f75628E) == null) {
            return;
        }
        c20122k1.m56024b(activity, new C4312c(17, alertDialogC20134o1, weakReference));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
