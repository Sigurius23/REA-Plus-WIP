package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import com.google.crypto.tink.internal.C5101l0;
import io.sentry.C20047a6;
import io.sentry.C20310d3;
import io.sentry.C20370i3;
import io.sentry.C20421m2;
import io.sentry.C20430n;
import io.sentry.C20433n2;
import io.sentry.C20443o2;
import io.sentry.C20456p2;
import io.sentry.C20513q6;
import io.sentry.C20514r;
import io.sentry.C20535s;
import io.sentry.C20604v2;
import io.sentry.EnumC20341g4;
import io.sentry.EnumC20436n5;
import io.sentry.EnumC20644z5;
import io.sentry.InterfaceC20259b1;
import io.sentry.InterfaceC20262b4;
import io.sentry.InterfaceC20406l;
import io.sentry.InterfaceC20432n1;
import io.sentry.InterfaceC20435n4;
import io.sentry.android.core.anr.AbstractC20057e;
import io.sentry.android.core.cache.C20066b;
import io.sentry.android.core.internal.gestures.C20085a;
import io.sentry.android.core.internal.modules.C20095a;
import io.sentry.android.core.internal.util.C20102c;
import io.sentry.android.core.internal.util.C20104e;
import io.sentry.android.core.internal.util.C20116q;
import io.sentry.android.core.performance.C20144g;
import io.sentry.android.core.performance.C20145h;
import io.sentry.android.replay.C20200d;
import io.sentry.cache.C20282e;
import io.sentry.cache.C20283f;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.internal.debugmeta.C20377b;
import io.sentry.internal.modules.C20386e;
import io.sentry.protocol.C20501v;
import io.sentry.transport.C20559i;
import io.sentry.transport.C20561k;
import io.sentry.util.C20584f;
import io.sentry.util.thread.C20599b;
import java.io.File;
import java.util.ArrayList;
import p037bu.C3632c;
import p437qt.C30582e;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.f */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20073f implements InterfaceC20262b4, InterfaceC20435n4 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f75396w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f75397x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f75398y;

    public /* synthetic */ C20073f(Object obj, Object obj2, Object obj3) {
        this.f75396w = obj;
        this.f75397x = obj2;
        this.f75398y = obj3;
    }

    @Override // io.sentry.InterfaceC20435n4
    /* JADX INFO: renamed from: b */
    public void mo11179b(C20513q6 c20513q6) {
        long j7;
        C20156t c20156t = (C20156t) this.f75396w;
        Context context = (Context) this.f75397x;
        InterfaceC20435n4 interfaceC20435n4 = (InterfaceC20435n4) this.f75398y;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c20513q6;
        boolean zM93819n = C30582e.m93819n(sentryAndroidOptions, "timber.log.Timber");
        boolean z4 = C30582e.m93819n(sentryAndroidOptions, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks") && C30582e.m93819n(sentryAndroidOptions, "io.sentry.android.fragment.FragmentLifecycleIntegration");
        boolean z13 = zM93819n && C30582e.m93819n(sentryAndroidOptions, "io.sentry.android.timber.SentryTimberIntegration");
        boolean zM93819n2 = C30582e.m93819n(sentryAndroidOptions, "io.sentry.android.replay.ReplayIntegration");
        boolean zM93819n3 = C30582e.m93819n(sentryAndroidOptions, "io.sentry.android.distribution.DistributionIntegration");
        C20121k0 c20121k0 = new C20121k0(c20156t);
        C30582e c30582e = new C30582e(29);
        C20067d c20067d = new C20067d(c30582e, sentryAndroidOptions);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        sentryAndroidOptions.setLogger(c20156t);
        sentryAndroidOptions.setFatalLogger(new C20156t(2));
        sentryAndroidOptions.setDefaultScopeType(EnumC20341g4.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(EnumC20644z5.OFF);
        sentryAndroidOptions.setDateProvider(new C20072e1());
        sentryAndroidOptions.getLogs().f76412b = new C20156t(4);
        sentryAndroidOptions.getMetrics().f76450b = new C20156t(5);
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new C20116q(applicationContext, c20156t, c20121k0));
        AbstractC20164v0.m56073a(applicationContext, c20121k0, sentryAndroidOptions);
        sentryAndroidOptions.setCacheDirPath(new File(applicationContext.getCacheDir(), "sentry").getAbsolutePath());
        AbstractC20057e.f75352a.set(true);
        PackageInfo packageInfoM56012f = AbstractC20118j0.m56012f(applicationContext, c20121k0);
        if (packageInfoM56012f != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(packageInfoM56012f.packageName + "@" + packageInfoM56012f.versionName + "+" + Long.toString(packageInfoM56012f.getLongVersionCode()));
            }
            String str = packageInfoM56012f.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(AbstractC20157t0.m56061a(applicationContext));
            } catch (RuntimeException e5) {
                sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Could not generate distinct Id.", e5);
            }
        }
        C20071e0 c20071e0 = C20071e0.f75391E;
        if (c20071e0.f75393x == null) {
            C20535s c20535sM56711a = c20071e0.f75392w.m56711a();
            try {
                c20071e0.m55943i(sentryAndroidOptions.getLogger());
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
        sentryAndroidOptions.activate();
        AbstractC20147q.m56049a(context, sentryAndroidOptions, c20121k0, c30582e, c20067d, z4, z13, zM93819n2, zM93819n3);
        try {
            interfaceC20435n4.mo11179b(sentryAndroidOptions);
        } catch (Throwable th5) {
            sentryAndroidOptions.getLogger().mo16060j(EnumC20436n5.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th5);
        }
        C20144g c20144gM56042c = C20144g.m56042c();
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            C20145h c20145h = c20144gM56042c.f75675z;
            j7 = 0;
            if (c20145h.f75678y == 0) {
                c20145h.m56048c(Process.getStartUptimeMillis());
            }
        } else {
            j7 = 0;
        }
        if (context.getApplicationContext() instanceof Application) {
            c20144gM56042c.m56045e((Application) context.getApplicationContext());
        }
        C20145h c20145h2 = c20144gM56042c.f75661E;
        if (c20145h2.f75678y == j7) {
            c20145h2.m56048c(AbstractC20069d1.f75385a);
        }
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof C20559i)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new C20066b(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof C20433n2) {
            sentryAndroidOptions.setConnectionStatusProvider(new C20102c(context, sentryAndroidOptions, c20121k0));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new C20283f(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new C20282e(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new C20430n(sentryAndroidOptions, 0));
        sentryAndroidOptions.addEventProcessor(new C20124l0(context, c20121k0, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C20061b1(sentryAndroidOptions, c20067d));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, c20121k0, zM93819n2));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C20077g0(context, c20121k0, sentryAndroidOptions));
        if (sentryAndroidOptions.getTransportGate() instanceof C20561k) {
            C20121k0 c20121k1 = new C20121k0();
            c20121k1.f75591a = sentryAndroidOptions;
            sentryAndroidOptions.setTransportGate(c20121k1);
        }
        C20144g c20144gM56042c2 = C20144g.m56042c();
        if (sentryAndroidOptions.getModulesLoader() instanceof C20386e) {
            sentryAndroidOptions.setModulesLoader(new C20095a(context, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof C20377b) {
            sentryAndroidOptions.setDebugMetaLoader(new C5101l0(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof C20370i3) {
            sentryAndroidOptions.setVersionDetector(new C3632c(sentryAndroidOptions));
        }
        C20584f c20584f = new C20584f(new C20047a6(c30582e, sentryAndroidOptions));
        boolean zM93819n4 = C30582e.m93819n(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new C20085a(c20584f));
            if (zM93819n4 && C30582e.m93819n(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zM93819n4 && C30582e.m93819n(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof C20599b) {
            sentryAndroidOptions.setThreadChecker(C20104e.f75528a);
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof C20310d3) {
            sentryAndroidOptions.setSocketTagger(C20156t.f75721x);
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new C20126m());
            sentryAndroidOptions.addPerformanceCollector(new C20082i(sentryAndroidOptions.getLogger()));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                C20116q frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                AbstractC29125c.m88510S(frameMetricsCollector, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.addPerformanceCollector(new C20149q1(sentryAndroidOptions, frameMetricsCollector));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof C20421m2) {
            sentryAndroidOptions.setCompositePerformanceCollector(new C20514r(sentryAndroidOptions));
        }
        if (zM93819n2 && (sentryAndroidOptions.getReplayController().getF75797N() instanceof C20604v2)) {
            sentryAndroidOptions.getReplayController().mo56097h(new C20200d(sentryAndroidOptions));
        }
        C20535s c20535sM56711a2 = C20144g.f75660R.m56711a();
        try {
            C20159u c20159u = c20144gM56042c2.f75665I;
            C20079h c20079h = c20144gM56042c2.f75666J;
            c20144gM56042c2.f75665I = null;
            c20144gM56042c2.f75666J = null;
            c20535sM56711a2.close();
            InterfaceC20406l compositePerformanceCollector = sentryAndroidOptions.getCompositePerformanceCollector();
            if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
                sentryAndroidOptions.setContinuousProfiler(C20443o2.f76525w);
                if (c20079h != null) {
                    c20079h.mo55947a(true);
                }
                if (c20159u != null) {
                    sentryAndroidOptions.setTransactionProfiler(c20159u);
                } else {
                    C20116q frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                    AbstractC29125c.m88510S(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
                    sentryAndroidOptions.setTransactionProfiler(new C20159u(context, sentryAndroidOptions, c20121k0, frameMetricsCollector2));
                }
            } else {
                sentryAndroidOptions.setTransactionProfiler(C20456p2.f76555y);
                if (c20159u != null) {
                    c20159u.close();
                }
                if (c20079h != null) {
                    sentryAndroidOptions.setContinuousProfiler(c20079h);
                    C20501v c20501v = c20079h.f75417O;
                    if (c20079h.f75411I && !c20501v.equals(C20501v.f76802x)) {
                        compositePerformanceCollector.mo56620f(c20501v.toString());
                    }
                } else {
                    C20116q frameMetricsCollector3 = sentryAndroidOptions.getFrameMetricsCollector();
                    AbstractC29125c.m88510S(frameMetricsCollector3, "options.getFrameMetricsCollector is required");
                    sentryAndroidOptions.setContinuousProfiler(new C20079h(c20121k0, frameMetricsCollector3, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), new C20135p(sentryAndroidOptions, 0)));
                }
            }
            AbstractC20069d1.m55940a(sentryAndroidOptions, z4, z13);
        } catch (Throwable th6) {
            try {
                c20535sM56711a2.close();
                throw th6;
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
                throw th6;
            }
        }
    }

    @Override // io.sentry.InterfaceC20262b4
    /* JADX INFO: renamed from: g */
    public void mo8622g(InterfaceC20432n1 interfaceC20432n1) {
        ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) this.f75396w;
        InterfaceC20259b1 interfaceC20259b1 = (InterfaceC20259b1) this.f75397x;
        InterfaceC20432n1 interfaceC20432n2 = (InterfaceC20432n1) this.f75398y;
        if (interfaceC20432n1 == null) {
            interfaceC20259b1.mo56180B(interfaceC20432n2);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f75226z;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC20432n2.getName());
        }
    }
}
