package io.sentry.android.core;

import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20545t1;
import io.sentry.InterfaceC20602v0;
import io.sentry.util.C20579a;
import java.io.Closeable;
import p249jc.AbstractC21598x;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes5.dex */
public final class AppLifecycleIntegration implements InterfaceC20545t1, Closeable {

    /* JADX INFO: renamed from: w */
    public final C20579a f75241w = new C20579a();

    /* JADX INFO: renamed from: x */
    public volatile C20160u0 f75242x;

    /* JADX INFO: renamed from: y */
    public SentryAndroidOptions f75243y;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C20535s c20535sM56711a = this.f75241w.m56711a();
        try {
            C20160u0 c20160u0 = this.f75242x;
            this.f75242x = null;
            c20535sM56711a.close();
            if (c20160u0 != null) {
                C20071e0.f75391E.m55944k(c20160u0);
                SentryAndroidOptions sentryAndroidOptions = this.f75243y;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
            }
            C20071e0.f75391E.m55945m();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        SentryAndroidOptions sentryAndroidOptions = c20513q6 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c20513q6 : null;
        AbstractC29125c.m88510S(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f75243y = sentryAndroidOptions;
        InterfaceC20602v0 logger = sentryAndroidOptions.getLogger();
        EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
        logger.mo16066m(enumC20436n5, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f75243y.isEnableAutoSessionTracking()));
        this.f75243y.getLogger().mo16066m(enumC20436n5, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f75243y.isEnableAppLifecycleBreadcrumbs()));
        if (this.f75243y.isEnableAutoSessionTracking() || this.f75243y.isEnableAppLifecycleBreadcrumbs()) {
            C20535s c20535sM56711a = this.f75241w.m56711a();
            try {
                if (this.f75242x != null) {
                    c20535sM56711a.close();
                    return;
                }
                this.f75242x = new C20160u0(this.f75243y.getSessionTrackingIntervalMillis(), this.f75243y.isEnableAutoSessionTracking(), this.f75243y.isEnableAppLifecycleBreadcrumbs());
                C20071e0.f75391E.m55941b(this.f75242x);
                c20535sM56711a.close();
                c20513q6.getLogger().mo16066m(enumC20436n5, "AppLifecycleIntegration installed.", new Object[0]);
                AbstractC21598x.m60683i("AppLifecycle");
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
}
