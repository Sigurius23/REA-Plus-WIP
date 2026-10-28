package io.sentry.android.core;

import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20545t1;
import io.sentry.InterfaceC20602v0;
import java.io.Closeable;
import p249jc.AbstractC21598x;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes5.dex */
public final class NdkIntegration implements InterfaceC20545t1, Closeable {

    /* JADX INFO: renamed from: w */
    public final Class f75255w;

    /* JADX INFO: renamed from: x */
    public SentryAndroidOptions f75256x;

    public NdkIntegration(Class cls) {
        this.f75255w = cls;
    }

    /* JADX INFO: renamed from: b */
    public static void m55899b(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f75256x;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.f75255w;
        try {
            if (cls != null) {
                cls.getMethod("close", null).invoke(null, null);
                this.f75256x.getLogger().mo16066m(EnumC20436n5.DEBUG, "NdkIntegration removed.", new Object[0]);
            }
        } catch (NoSuchMethodException e5) {
            this.f75256x.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to invoke the SentryNdk.close method.", e5);
        } catch (Throwable th3) {
            this.f75256x.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to close SentryNdk.", th3);
        } finally {
            m55899b(this.f75256x);
        }
    }

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        Class cls;
        SentryAndroidOptions sentryAndroidOptions = c20513q6 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c20513q6 : null;
        AbstractC29125c.m88510S(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f75256x = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        InterfaceC20602v0 logger = this.f75256x.getLogger();
        EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
        logger.mo16066m(enumC20436n5, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || (cls = this.f75255w) == null) {
            m55899b(this.f75256x);
            return;
        }
        if (this.f75256x.getCacheDirPath() == null) {
            this.f75256x.getLogger().mo16066m(EnumC20436n5.ERROR, "No cache dir path is defined in options.", new Object[0]);
            m55899b(this.f75256x);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f75256x);
            this.f75256x.getLogger().mo16066m(enumC20436n5, "NdkIntegration installed.", new Object[0]);
            AbstractC21598x.m60683i("Ndk");
        } catch (NoSuchMethodException e5) {
            m55899b(this.f75256x);
            this.f75256x.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to invoke the SentryNdk.init method.", e5);
        } catch (Throwable th3) {
            m55899b(this.f75256x);
            this.f75256x.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to initialize SentryNdk.", th3);
        }
    }
}
