package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.mapbox.common.module.RunnableC5445c;
import io.getstream.chat.android.models.MessageType;
import io.sentry.C20315e;
import io.sentry.C20337g0;
import io.sentry.C20371i4;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20545t1;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.internal.util.C20106g;
import java.io.Closeable;
import p249jc.AbstractC21598x;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes5.dex */
public final class AppComponentsBreadcrumbsIntegration implements InterfaceC20545t1, Closeable, ComponentCallbacks2 {

    /* JADX INFO: renamed from: E */
    public static final C20337g0 f75236E = new C20337g0();

    /* JADX INFO: renamed from: w */
    public final Context f75237w;

    /* JADX INFO: renamed from: x */
    public C20371i4 f75238x;

    /* JADX INFO: renamed from: y */
    public SentryAndroidOptions f75239y;

    /* JADX INFO: renamed from: z */
    public final C20106g f75240z = new C20106g(60000, 0);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f75237w = applicationContext != null ? applicationContext : context;
    }

    /* JADX INFO: renamed from: b */
    public final void m55897b(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f75239y;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th3) {
                this.f75239y.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f75237w.unregisterComponentCallbacks(this);
        } catch (Throwable th3) {
            SentryAndroidOptions sentryAndroidOptions = this.f75239y;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo16058i(EnumC20436n5.DEBUG, th3, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f75239y;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().mo16066m(EnumC20436n5.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        this.f75238x = C20371i4.f76402a;
        SentryAndroidOptions sentryAndroidOptions = c20513q6 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c20513q6 : null;
        AbstractC29125c.m88510S(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f75239y = sentryAndroidOptions;
        InterfaceC20602v0 logger = sentryAndroidOptions.getLogger();
        EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
        logger.mo16066m(enumC20436n5, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f75239y.isEnableAppComponentBreadcrumbs()));
        if (this.f75239y.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f75237w.registerComponentCallbacks(this);
                c20513q6.getLogger().mo16066m(enumC20436n5, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                AbstractC21598x.m60683i("AppComponentsBreadcrumbs");
            } catch (Throwable th3) {
                this.f75239y.setEnableAppComponentBreadcrumbs(false);
                c20513q6.getLogger().mo16058i(EnumC20436n5.INFO, th3, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        m55897b(new RunnableC5445c(this, System.currentTimeMillis(), configuration, 3));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(final int i13) {
        if (i13 >= 40 && !this.f75240z.m56000a()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            m55897b(new Runnable() { // from class: io.sentry.android.core.a0
                @Override // java.lang.Runnable
                public final void run() {
                    AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = this.f75315w;
                    if (appComponentsBreadcrumbsIntegration.f75238x != null) {
                        C20315e c20315e = new C20315e(jCurrentTimeMillis);
                        c20315e.f76286E = MessageType.SYSTEM;
                        c20315e.f76288G = "device.event";
                        c20315e.f76295z = "Low memory";
                        c20315e.m56470c("LOW_MEMORY", "action");
                        c20315e.m56470c(Integer.valueOf(i13), "level");
                        c20315e.f76290I = EnumC20436n5.WARNING;
                        appComponentsBreadcrumbsIntegration.f75238x.mo56429i(c20315e, AppComponentsBreadcrumbsIntegration.f75236E);
                    }
                }
            });
        }
    }
}
