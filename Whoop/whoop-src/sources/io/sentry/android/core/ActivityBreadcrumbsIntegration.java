package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import io.sentry.C20315e;
import io.sentry.C20337g0;
import io.sentry.C20371i4;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20545t1;
import io.sentry.InterfaceC20602v0;
import io.sentry.util.C20579a;
import java.io.Closeable;
import live.hms.video.media.tracks.HMSTrackSource;
import p249jc.AbstractC21598x;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivityBreadcrumbsIntegration implements InterfaceC20545t1, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: w */
    public final Application f75204w;

    /* JADX INFO: renamed from: x */
    public C20371i4 f75205x;

    /* JADX INFO: renamed from: y */
    public boolean f75206y;

    /* JADX INFO: renamed from: z */
    public final C20579a f75207z = new C20579a();

    public ActivityBreadcrumbsIntegration(Application application) {
        this.f75204w = application;
    }

    /* JADX INFO: renamed from: b */
    public final void m55889b(Activity activity, String str) {
        if (this.f75205x == null) {
            return;
        }
        C20315e c20315e = new C20315e();
        c20315e.f76286E = NotificationCompat.CATEGORY_NAVIGATION;
        c20315e.m56470c(str, "state");
        c20315e.m56470c(activity.getClass().getSimpleName(), HMSTrackSource.SCREEN);
        c20315e.f76288G = "ui.lifecycle";
        c20315e.f76290I = EnumC20436n5.INFO;
        C20337g0 c20337g0 = new C20337g0();
        c20337g0.m56493d(activity, "android:activity");
        this.f75205x.mo56429i(c20315e, c20337g0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f75206y) {
            this.f75204w.unregisterActivityLifecycleCallbacks(this);
            C20371i4 c20371i4 = this.f75205x;
            if (c20371i4 != null) {
                c20371i4.mo56432l().getLogger().mo16066m(EnumC20436n5.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        SentryAndroidOptions sentryAndroidOptions = c20513q6 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c20513q6 : null;
        AbstractC29125c.m88510S(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f75205x = C20371i4.f76402a;
        this.f75206y = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        InterfaceC20602v0 logger = c20513q6.getLogger();
        EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
        logger.mo16066m(enumC20436n5, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f75206y));
        if (this.f75206y) {
            this.f75204w.registerActivityLifecycleCallbacks(this);
            c20513q6.getLogger().mo16066m(enumC20436n5, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            AbstractC21598x.m60683i("ActivityBreadcrumbs");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C20535s c20535sM56711a = this.f75207z.m56711a();
        try {
            m55889b(activity, AnalyticsRequestV2.PARAM_CREATED);
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C20535s c20535sM56711a = this.f75207z.m56711a();
        try {
            m55889b(activity, "destroyed");
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C20535s c20535sM56711a = this.f75207z.m56711a();
        try {
            m55889b(activity, "paused");
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C20535s c20535sM56711a = this.f75207z.m56711a();
        try {
            m55889b(activity, "resumed");
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C20535s c20535sM56711a = this.f75207z.m56711a();
        try {
            m55889b(activity, "saveInstanceState");
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C20535s c20535sM56711a = this.f75207z.m56711a();
        try {
            m55889b(activity, "started");
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C20535s c20535sM56711a = this.f75207z.m56711a();
        try {
            m55889b(activity, "stopped");
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
