package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.C20402k4;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20418m;
import io.sentry.EnumC20431n0;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20308d1;
import io.sentry.InterfaceC20454p0;
import io.sentry.transport.C20567q;
import p249jc.AbstractC21598x;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC20064c1 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75366w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f75367x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C20513q6 f75368y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f75369z;

    public /* synthetic */ RunnableC20064c1(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, InterfaceC20308d1 interfaceC20308d1, SentryAndroidOptions sentryAndroidOptions) {
        this.f75366w = 2;
        this.f75367x = systemEventsBreadcrumbsIntegration;
        this.f75369z = interfaceC20308d1;
        this.f75368y = sentryAndroidOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75366w) {
            case 0:
                SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.f75367x;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f75368y;
                InterfaceC20308d1 interfaceC20308d1 = (InterfaceC20308d1) this.f75369z;
                try {
                    if (sendCachedEnvelopeIntegration.f75270I.get()) {
                        sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                        return;
                    }
                    if (!sendCachedEnvelopeIntegration.f75269H.getAndSet(true)) {
                        InterfaceC20454p0 connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                        sendCachedEnvelopeIntegration.f75275z = connectionStatusProvider;
                        connectionStatusProvider.mo55986K0(sendCachedEnvelopeIntegration);
                        sendCachedEnvelopeIntegration.f75268G = sendCachedEnvelopeIntegration.f75272w.mo1875t(interfaceC20308d1, sentryAndroidOptions);
                    }
                    InterfaceC20454p0 interfaceC20454p0 = sendCachedEnvelopeIntegration.f75275z;
                    if (interfaceC20454p0 != null && interfaceC20454p0.mo55992l() == EnumC20431n0.DISCONNECTED) {
                        sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                        return;
                    }
                    C20567q c20567qMo56430j = interfaceC20308d1.mo56430j();
                    if (c20567qMo56430j != null && c20567qMo56430j.m56688h(EnumC20418m.All)) {
                        sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                        return;
                    }
                    C20402k4 c20402k4 = sendCachedEnvelopeIntegration.f75268G;
                    if (c20402k4 == null) {
                        sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                        return;
                    } else {
                        c20402k4.m56614a();
                        return;
                    }
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed trying to send cached events.", th3);
                    return;
                }
            case 1:
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.f75367x;
                C20513q6 c20513q6 = this.f75368y;
                String str = (String) this.f75369z;
                C20535s c20535sM56711a = envelopeFileObserverIntegration.f75248z.m56711a();
                try {
                    if (!envelopeFileObserverIntegration.f75247y) {
                        envelopeFileObserverIntegration.m55898b(c20513q6, str);
                        break;
                    }
                    c20535sM56711a.close();
                    return;
                } catch (Throwable th4) {
                    try {
                        c20535sM56711a.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            default:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.f75367x;
                InterfaceC20308d1 interfaceC20308d2 = (InterfaceC20308d1) this.f75369z;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.f75368y;
                C20535s c20535sM56711a2 = systemEventsBreadcrumbsIntegration.f75287K.m56711a();
                try {
                    if (!systemEventsBreadcrumbsIntegration.f75282F && !systemEventsBreadcrumbsIntegration.f75283G && systemEventsBreadcrumbsIntegration.f75290x == null) {
                        systemEventsBreadcrumbsIntegration.f75290x = new C20155s1(systemEventsBreadcrumbsIntegration, interfaceC20308d2, sentryAndroidOptions2);
                        if (systemEventsBreadcrumbsIntegration.f75284H == null) {
                            systemEventsBreadcrumbsIntegration.f75284H = new IntentFilter();
                            for (String str2 : systemEventsBreadcrumbsIntegration.f75281E) {
                                systemEventsBreadcrumbsIntegration.f75284H.addAction(str2);
                            }
                        }
                        if (systemEventsBreadcrumbsIntegration.f75285I == null) {
                            systemEventsBreadcrumbsIntegration.f75285I = new HandlerThread("SystemEventsReceiver", 10);
                            systemEventsBreadcrumbsIntegration.f75285I.start();
                        }
                        try {
                            Handler handler = new Handler(systemEventsBreadcrumbsIntegration.f75285I.getLooper());
                            Context context = systemEventsBreadcrumbsIntegration.f75289w;
                            C20155s1 c20155s1 = systemEventsBreadcrumbsIntegration.f75290x;
                            IntentFilter intentFilter = systemEventsBreadcrumbsIntegration.f75284H;
                            AbstractC29125c.m88510S(sentryAndroidOptions2.getLogger(), "The ILogger object is required.");
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(c20155s1, intentFilter, null, handler, 4);
                            } else {
                                context.registerReceiver(c20155s1, intentFilter, null, handler);
                            }
                            if (!systemEventsBreadcrumbsIntegration.f75286J.getAndSet(true)) {
                                sentryAndroidOptions2.getLogger().mo16066m(EnumC20436n5.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                                AbstractC21598x.m60683i("SystemEventsBreadcrumbs");
                            }
                        } catch (Throwable th6) {
                            sentryAndroidOptions2.setEnableSystemEventBreadcrumbs(false);
                            sentryAndroidOptions2.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th6);
                        }
                        break;
                    }
                    c20535sM56711a2.close();
                    return;
                } catch (Throwable th7) {
                    try {
                        c20535sM56711a2.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
        }
    }

    public /* synthetic */ RunnableC20064c1(Object obj, C20513q6 c20513q6, Object obj2, int i13) {
        this.f75366w = i13;
        this.f75367x = obj;
        this.f75368y = c20513q6;
        this.f75369z = obj2;
    }
}
