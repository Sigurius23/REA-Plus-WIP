package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20347h1;
import io.sentry.InterfaceC20545t1;
import io.sentry.transport.C20554d;
import java.io.Closeable;
import p249jc.AbstractC21598x;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"NewApi"})
public class AnrV2Integration implements InterfaceC20545t1, Closeable {

    /* JADX INFO: renamed from: w */
    public final Context f75233w;

    /* JADX INFO: renamed from: x */
    public final C20554d f75234x;

    /* JADX INFO: renamed from: y */
    public SentryAndroidOptions f75235y;

    public AnrV2Integration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f75233w = applicationContext != null ? applicationContext : context;
        this.f75234x = C20554d.f77025w;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f75235y;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        SentryAndroidOptions sentryAndroidOptions = c20513q6 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c20513q6 : null;
        AbstractC29125c.m88510S(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f75235y = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f75235y.isAnrEnabled()));
        if (this.f75235y.getCacheDirPath() == null) {
            this.f75235y.getLogger().mo16066m(EnumC20436n5.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f75235y.isAnrEnabled()) {
            try {
                InterfaceC20347h1 executorService = c20513q6.getExecutorService();
                Context context = this.f75233w;
                SentryAndroidOptions sentryAndroidOptions2 = this.f75235y;
                executorService.submit(new RunnableC20083i0(context, sentryAndroidOptions2, this.f75234x, new C20169y(sentryAndroidOptions2)));
            } catch (Throwable th3) {
                c20513q6.getLogger().mo16060j(EnumC20436n5.DEBUG, "Failed to start ANR processor.", th3);
            }
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "AnrV2Integration installed.", new Object[0]);
            AbstractC21598x.m60683i("AnrV2");
        }
    }
}
