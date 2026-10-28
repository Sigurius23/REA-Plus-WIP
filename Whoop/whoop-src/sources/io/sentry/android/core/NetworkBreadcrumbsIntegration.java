package io.sentry.android.core;

import android.content.Context;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20545t1;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.internal.util.C20102c;
import io.sentry.util.C20579a;
import java.io.Closeable;
import p249jc.AbstractC21598x;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes5.dex */
public final class NetworkBreadcrumbsIntegration implements InterfaceC20545t1, Closeable {

    /* JADX INFO: renamed from: w */
    public final Context f75257w;

    /* JADX INFO: renamed from: x */
    public final C20121k0 f75258x;

    /* JADX INFO: renamed from: y */
    public final C20579a f75259y = new C20579a();

    /* JADX INFO: renamed from: z */
    public volatile C20051a1 f75260z;

    public NetworkBreadcrumbsIntegration(Context context, C20121k0 c20121k0) {
        Context applicationContext = context.getApplicationContext();
        this.f75257w = applicationContext != null ? applicationContext : context;
        this.f75258x = c20121k0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C20535s c20535sM56711a = this.f75259y.m56711a();
        try {
            C20051a1 c20051a1 = this.f75260z;
            this.f75260z = null;
            c20535sM56711a.close();
            if (c20051a1 != null) {
                C20535s c20535sM56711a2 = C20102c.f75512N.m56711a();
                try {
                    C20102c.f75513O.remove(c20051a1);
                    c20535sM56711a2.close();
                } catch (Throwable th3) {
                    try {
                        c20535sM56711a2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
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
        SentryAndroidOptions sentryAndroidOptions = c20513q6 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c20513q6 : null;
        AbstractC29125c.m88510S(sentryAndroidOptions, "SentryAndroidOptions is required");
        InterfaceC20602v0 logger = c20513q6.getLogger();
        EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
        logger.mo16066m(enumC20436n5, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            this.f75258x.getClass();
            C20535s c20535sM56711a = this.f75259y.m56711a();
            try {
                this.f75260z = new C20051a1(this.f75258x, c20513q6.getDateProvider());
                if (C20102c.m55983b(this.f75257w, c20513q6.getLogger(), this.f75258x, this.f75260z)) {
                    c20513q6.getLogger().mo16066m(enumC20436n5, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    AbstractC21598x.m60683i("NetworkBreadcrumbs");
                } else {
                    c20513q6.getLogger().mo16066m(enumC20436n5, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                }
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
}
