package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.HandlerThread;
import hn.C17508p;
import io.sentry.C20513q6;
import io.sentry.C20546t2;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20545t1;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import p249jc.AbstractC21598x;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes5.dex */
public final class FeedbackShakeIntegration implements InterfaceC20545t1, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: F */
    public volatile Runnable f75250F;

    /* JADX INFO: renamed from: w */
    public final Application f75251w;

    /* JADX INFO: renamed from: y */
    public SentryAndroidOptions f75253y;

    /* JADX INFO: renamed from: z */
    public volatile WeakReference f75254z;

    /* JADX INFO: renamed from: E */
    public volatile boolean f75249E = false;

    /* JADX INFO: renamed from: x */
    public final C20122k1 f75252x = new C20122k1(C20546t2.f76998w);

    public FeedbackShakeIntegration(Application application) {
        this.f75251w = application;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f75251w.unregisterActivityLifecycleCallbacks(this);
        C20122k1 c20122k1 = this.f75252x;
        c20122k1.m56025c();
        HandlerThread handlerThread = c20122k1.f75594c;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            c20122k1.f75594c = null;
            c20122k1.f75595d = null;
        }
        if (this.f75249E) {
            this.f75249E = false;
            SentryAndroidOptions sentryAndroidOptions = this.f75253y;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().f76410h = this.f75250F;
            }
            this.f75250F = null;
        }
        this.f75254z = null;
    }

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        SentryAndroidOptions sentryAndroidOptions = c20513q6 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c20513q6 : null;
        AbstractC29125c.m88510S(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f75253y = sentryAndroidOptions;
        if (sentryAndroidOptions.getFeedbackOptions().f76409g) {
            C20122k1 c20122k1 = this.f75252x;
            Application application = this.f75251w;
            c20122k1.f75597f = this.f75253y.getLogger();
            c20122k1.m56023a(application);
            AbstractC21598x.m60683i("FeedbackShake");
            this.f75251w.registerActivityLifecycleCallbacks(this);
            this.f75253y.getLogger().mo16066m(EnumC20436n5.DEBUG, "FeedbackShakeIntegration installed.", new Object[0]);
            WeakReference weakReference = (WeakReference) C20121k0.f75590b.f75591a;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity != null) {
                this.f75254z = new WeakReference(activity);
                C20122k1 c20122k2 = this.f75252x;
                if (this.f75253y == null) {
                    return;
                }
                c20122k2.m56025c();
                c20122k2.m56024b(activity, new C17508p(this, 16));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Activity activity2 = this.f75254z != null ? (Activity) this.f75254z.get() : null;
        if (this.f75249E && activity == activity2) {
            this.f75249E = false;
            this.f75254z = null;
            SentryAndroidOptions sentryAndroidOptions = this.f75253y;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().f76410h = this.f75250F;
            }
            this.f75250F = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity == (this.f75254z != null ? (Activity) this.f75254z.get() : null)) {
            this.f75252x.m56025c();
            if (this.f75249E) {
                return;
            }
            this.f75254z = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Activity activity2 = this.f75254z != null ? (Activity) this.f75254z.get() : null;
        if (this.f75249E && activity2 != null && activity2 != activity) {
            this.f75249E = false;
            SentryAndroidOptions sentryAndroidOptions = this.f75253y;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getFeedbackOptions().f76410h = this.f75250F;
            }
            this.f75250F = null;
        }
        this.f75254z = new WeakReference(activity);
        C20122k1 c20122k1 = this.f75252x;
        if (this.f75253y == null) {
            return;
        }
        c20122k1.m56025c();
        c20122k1.m56024b(activity, new C17508p(this, 16));
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
