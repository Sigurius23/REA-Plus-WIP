package io.sentry.android.core;

import android.content.Context;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20545t1;
import io.sentry.InterfaceC20602v0;
import io.sentry.util.C20579a;
import java.io.Closeable;
import p009a8.RunnableC0533c;
import p047c9.C4312c;
import p249jc.AbstractC21598x;

/* JADX INFO: loaded from: classes3.dex */
public final class AnrIntegration implements InterfaceC20545t1, Closeable {

    /* JADX INFO: renamed from: E */
    public static C20049a f75227E;

    /* JADX INFO: renamed from: F */
    public static final C20579a f75228F = new C20579a();

    /* JADX INFO: renamed from: w */
    public final Context f75229w;

    /* JADX INFO: renamed from: x */
    public boolean f75230x = false;

    /* JADX INFO: renamed from: y */
    public final C20579a f75231y = new C20579a();

    /* JADX INFO: renamed from: z */
    public C20513q6 f75232z;

    public AnrIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f75229w = applicationContext != null ? applicationContext : context;
    }

    /* JADX INFO: renamed from: b */
    public final void m55896b(SentryAndroidOptions sentryAndroidOptions) {
        C20535s c20535sM56711a = f75228F.m56711a();
        try {
            if (f75227E == null) {
                InterfaceC20602v0 logger = sentryAndroidOptions.getLogger();
                EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
                logger.mo16066m(enumC20436n5, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                C20049a c20049a = new C20049a(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new C4312c(16, this, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.f75229w);
                f75227E = c20049a;
                c20049a.start();
                sentryAndroidOptions.getLogger().mo16066m(enumC20436n5, "AnrIntegration installed.", new Object[0]);
            }
            c20535sM56711a.close();
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C20535s c20535sM56711a = this.f75231y.m56711a();
        try {
            this.f75230x = true;
            c20535sM56711a.close();
            C20535s c20535sM56711a2 = f75228F.m56711a();
            try {
                C20049a c20049a = f75227E;
                if (c20049a != null) {
                    c20049a.interrupt();
                    f75227E = null;
                    C20513q6 c20513q6 = this.f75232z;
                    if (c20513q6 != null) {
                        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                c20535sM56711a2.close();
            } catch (Throwable th3) {
                try {
                    c20535sM56711a2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        this.f75232z = c20513q6;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c20513q6;
        sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            AbstractC21598x.m60683i("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new RunnableC0533c(28, this, sentryAndroidOptions));
            } catch (Throwable th3) {
                sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.DEBUG, "Failed to start AnrIntegration on executor thread.", th3);
            }
        }
    }
}
