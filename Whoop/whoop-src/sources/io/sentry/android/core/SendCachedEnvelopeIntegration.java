package io.sentry.android.core;

import io.sentry.C20371i4;
import io.sentry.C20402k4;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20431n0;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20411l4;
import io.sentry.InterfaceC20441o0;
import io.sentry.InterfaceC20454p0;
import io.sentry.InterfaceC20545t1;
import io.sentry.InterfaceC20602v0;
import io.sentry.util.C20579a;
import io.sentry.util.C20584f;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p249jc.AbstractC21598x;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes5.dex */
final class SendCachedEnvelopeIntegration implements InterfaceC20545t1, InterfaceC20441o0, Closeable {

    /* JADX INFO: renamed from: E */
    public C20371i4 f75266E;

    /* JADX INFO: renamed from: F */
    public SentryAndroidOptions f75267F;

    /* JADX INFO: renamed from: G */
    public C20402k4 f75268G;

    /* JADX INFO: renamed from: w */
    public final InterfaceC20411l4 f75272w;

    /* JADX INFO: renamed from: x */
    public final C20584f f75273x;

    /* JADX INFO: renamed from: z */
    public InterfaceC20454p0 f75275z;

    /* JADX INFO: renamed from: y */
    public final AtomicBoolean f75274y = new AtomicBoolean(false);

    /* JADX INFO: renamed from: H */
    public final AtomicBoolean f75269H = new AtomicBoolean(false);

    /* JADX INFO: renamed from: I */
    public final AtomicBoolean f75270I = new AtomicBoolean(false);

    /* JADX INFO: renamed from: J */
    public final C20579a f75271J = new C20579a();

    public SendCachedEnvelopeIntegration(InterfaceC20411l4 interfaceC20411l4, C20584f c20584f) {
        this.f75272w = interfaceC20411l4;
        this.f75273x = c20584f;
    }

    @Override // io.sentry.InterfaceC20441o0
    /* JADX INFO: renamed from: b */
    public final void mo55903b(EnumC20431n0 enumC20431n0) {
        SentryAndroidOptions sentryAndroidOptions;
        C20371i4 c20371i4 = this.f75266E;
        if (c20371i4 == null || (sentryAndroidOptions = this.f75267F) == null || enumC20431n0 == EnumC20431n0.DISCONNECTED) {
            return;
        }
        m55904h(c20371i4, sentryAndroidOptions);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f75270I.set(true);
        InterfaceC20454p0 interfaceC20454p0 = this.f75275z;
        if (interfaceC20454p0 != null) {
            interfaceC20454p0.mo55988W0(this);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m55904h(C20371i4 c20371i4, SentryAndroidOptions sentryAndroidOptions) {
        try {
            C20535s c20535sM56711a = this.f75271J.m56711a();
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new RunnableC20064c1(this, sentryAndroidOptions, c20371i4, 0));
                if (((Boolean) this.f75273x.m56714a()).booleanValue() && this.f75274y.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                c20535sM56711a.close();
            } catch (Throwable th3) {
                try {
                    c20535sM56711a.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (RejectedExecutionException e5) {
            sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e5);
        } catch (Throwable th5) {
            sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to call the executor. Cached events will not be sent", th5);
        }
    }

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        C20371i4 c20371i4 = C20371i4.f76402a;
        this.f75266E = c20371i4;
        SentryAndroidOptions sentryAndroidOptions = c20513q6 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c20513q6 : null;
        AbstractC29125c.m88510S(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f75267F = sentryAndroidOptions;
        String cacheDirPath = c20513q6.getCacheDirPath();
        InterfaceC20602v0 logger = c20513q6.getLogger();
        this.f75272w.getClass();
        if (!InterfaceC20411l4.m56625y(logger, cacheDirPath)) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            AbstractC21598x.m60683i("SendCachedEnvelope");
            m55904h(c20371i4, this.f75267F);
        }
    }
}
