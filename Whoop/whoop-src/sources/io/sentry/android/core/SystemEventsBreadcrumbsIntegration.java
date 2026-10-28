package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.HandlerThread;
import androidx.lifecycle.RunnableC1645z0;
import io.sentry.C20371i4;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20545t1;
import io.sentry.util.C20579a;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes5.dex */
public final class SystemEventsBreadcrumbsIntegration implements InterfaceC20545t1, Closeable, InterfaceC20060b0 {

    /* JADX INFO: renamed from: E */
    public final String[] f75281E;

    /* JADX INFO: renamed from: F */
    public volatile boolean f75282F = false;

    /* JADX INFO: renamed from: G */
    public volatile boolean f75283G = false;

    /* JADX INFO: renamed from: H */
    public volatile IntentFilter f75284H = null;

    /* JADX INFO: renamed from: I */
    public volatile HandlerThread f75285I = null;

    /* JADX INFO: renamed from: J */
    public final AtomicBoolean f75286J = new AtomicBoolean(false);

    /* JADX INFO: renamed from: K */
    public final C20579a f75287K = new C20579a();

    /* JADX INFO: renamed from: L */
    public C20152r1 f75288L;

    /* JADX INFO: renamed from: w */
    public final Context f75289w;

    /* JADX INFO: renamed from: x */
    public volatile C20155s1 f75290x;

    /* JADX INFO: renamed from: y */
    public SentryAndroidOptions f75291y;

    /* JADX INFO: renamed from: z */
    public C20371i4 f75292z;

    public SystemEventsBreadcrumbsIntegration(Context context) {
        String[] strArr = {"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
        Context applicationContext = context.getApplicationContext();
        this.f75289w = applicationContext == null ? context : applicationContext;
        this.f75281E = strArr;
    }

    /* JADX INFO: renamed from: b */
    public final void m55907b(C20371i4 c20371i4, SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f75282F && !this.f75283G && this.f75290x == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new RunnableC20064c1(this, c20371i4, sentryAndroidOptions));
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C20535s c20535sM56711a = this.f75287K.m56711a();
        try {
            this.f75282F = true;
            this.f75284H = null;
            if (this.f75285I != null) {
                this.f75285I.quit();
            }
            this.f75285I = null;
            c20535sM56711a.close();
            C20071e0.f75391E.m55944k(this);
            SentryAndroidOptions sentryAndroidOptions = this.f75291y;
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new RunnableC1645z0(this, 9));
                } catch (RejectedExecutionException unused) {
                    m55908h(this.f75291y);
                }
            }
            SentryAndroidOptions sentryAndroidOptions2 = this.f75291y;
            if (sentryAndroidOptions2 != null) {
                sentryAndroidOptions2.getLogger().mo16066m(EnumC20436n5.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m55908h(SentryAndroidOptions sentryAndroidOptions) {
        C20535s c20535sM56711a = this.f75287K.m56711a();
        try {
            this.f75283G = true;
            C20155s1 c20155s1 = this.f75290x;
            this.f75290x = null;
            c20535sM56711a.close();
            if (c20155s1 != null) {
                try {
                    this.f75289w.unregisterReceiver(c20155s1);
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Failed to unregister SystemEventsBroadcastReceiver", new Object[0]);
                }
            }
        } catch (Throwable th4) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @Override // io.sentry.android.core.InterfaceC20060b0
    /* JADX INFO: renamed from: i */
    public final void mo55909i() {
        if (this.f75292z == null || this.f75291y == null) {
            return;
        }
        this.f75283G = false;
        m55907b(this.f75292z, this.f75291y);
    }

    @Override // io.sentry.android.core.InterfaceC20060b0
    /* JADX INFO: renamed from: k */
    public final void mo55910k() {
        SentryAndroidOptions sentryAndroidOptions = this.f75291y;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new RunnableC1645z0(this, 9));
        } catch (RejectedExecutionException unused) {
            m55908h(this.f75291y);
        }
    }

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        SentryAndroidOptions sentryAndroidOptions = c20513q6 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c20513q6 : null;
        AbstractC29125c.m88510S(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f75291y = sentryAndroidOptions;
        this.f75292z = C20371i4.f76402a;
        sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f75291y.isEnableSystemEventBreadcrumbs()));
        if (this.f75291y.isEnableSystemEventBreadcrumbs()) {
            C20071e0.f75391E.m55941b(this);
            if (AbstractC20118j0.m56013g()) {
                m55907b(this.f75292z, this.f75291y);
            }
        }
    }
}
