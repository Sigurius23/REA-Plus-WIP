package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import io.sentry.C20371i4;
import io.sentry.C20513q6;
import io.sentry.EnumC20374i7;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20545t1;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.internal.gestures.C20092h;
import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC20091g;
import io.sentry.android.core.internal.gestures.WindowCallbackC20086b;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p249jc.AbstractC21598x;
import p437qt.C30582e;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes5.dex */
public final class UserInteractionIntegration implements InterfaceC20545t1, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: w */
    public final Application f75298w;

    /* JADX INFO: renamed from: x */
    public C20371i4 f75299x;

    /* JADX INFO: renamed from: E */
    public final WeakHashMap f75296E = new WeakHashMap();

    /* JADX INFO: renamed from: F */
    public final Object f75297F = new Object();

    /* JADX INFO: renamed from: y */
    public SentryAndroidOptions f75300y;

    /* JADX INFO: renamed from: z */
    public final boolean f75301z = C30582e.m93819n(this.f75300y, "androidx.lifecycle.Lifecycle");

    public UserInteractionIntegration(Application application) {
        this.f75298w = application;
    }

    /* JADX INFO: renamed from: b */
    public final void m55911b(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f75300y;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f75299x == null || this.f75300y == null) {
            return;
        }
        synchronized (this.f75297F) {
            try {
                WeakReference weakReference = (WeakReference) this.f75296E.get(window);
                if (weakReference == null || weakReference.get() == null) {
                    Window.Callback callback = window.getCallback();
                    if (callback == null) {
                        callback = new WindowCallbackC20086b();
                    }
                    C20092h c20092h = new C20092h(callback, activity, new GestureDetectorOnGestureListenerC20091g(activity, this.f75299x, this.f75300y), this.f75300y);
                    window.setCallback(c20092h);
                    synchronized (this.f75297F) {
                        this.f75296E.put(window, new WeakReference(c20092h));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList<Window> arrayList;
        this.f75298w.unregisterActivityLifecycleCallbacks(this);
        synchronized (this.f75297F) {
            arrayList = new ArrayList(this.f75296E.keySet());
        }
        for (Window window : arrayList) {
            if (window != null) {
                m55912h(window);
            }
        }
        synchronized (this.f75297F) {
            this.f75296E.clear();
        }
        SentryAndroidOptions sentryAndroidOptions = this.f75300y;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m55912h(Window window) {
        C20092h c20092h;
        Window.Callback callback = window.getCallback();
        if (callback instanceof C20092h) {
            C20092h c20092h2 = (C20092h) callback;
            c20092h2.f75476G = true;
            c20092h2.f75478y.m55969d(EnumC20374i7.CANCELLED);
            c20092h2.f75479z.m55965a();
            Window.Callback callback2 = c20092h2.f75477x;
            if (callback2 instanceof WindowCallbackC20086b) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
            synchronized (this.f75297F) {
                this.f75296E.remove(window);
            }
            return;
        }
        synchronized (this.f75297F) {
            try {
                WeakReference weakReference = (WeakReference) this.f75296E.remove(window);
                c20092h = weakReference != null ? (C20092h) weakReference.get() : null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (c20092h != null) {
            c20092h.f75476G = true;
            c20092h.f75478y.m55969d(EnumC20374i7.CANCELLED);
            c20092h.f75479z.m55965a();
        }
    }

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        SentryAndroidOptions sentryAndroidOptions = c20513q6 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c20513q6 : null;
        AbstractC29125c.m88510S(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f75300y = sentryAndroidOptions;
        this.f75299x = C20371i4.f76402a;
        boolean z4 = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.f75300y.isEnableUserInteractionTracing();
        InterfaceC20602v0 logger = this.f75300y.getLogger();
        EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
        logger.mo16066m(enumC20436n5, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z4));
        if (z4) {
            this.f75298w.registerActivityLifecycleCallbacks(this);
            this.f75300y.getLogger().mo16066m(enumC20436n5, "UserInteractionIntegration installed.", new Object[0]);
            AbstractC21598x.m60683i("UserInteraction");
            if (this.f75301z) {
                WeakReference weakReference = (WeakReference) C20121k0.f75590b.f75591a;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if ((activity instanceof InterfaceC1585g0) && ((InterfaceC1585g0) activity).getLifecycle().getCurrentState() == EnumC1635w.f6323E) {
                    m55911b(activity);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            m55912h(window);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f75300y;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.INFO, "Window was null in stopTracking", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m55911b(activity);
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
