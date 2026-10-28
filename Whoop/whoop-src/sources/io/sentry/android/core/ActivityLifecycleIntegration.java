package io.sentry.android.core;

import aa3.C0627i1;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.RunnableC1605m;
import hn.C17508p;
import io.sentry.AbstractC20576u4;
import io.sentry.C20325f0;
import io.sentry.C20340g3;
import io.sentry.C20344g7;
import io.sentry.C20371i4;
import io.sentry.C20426m7;
import io.sentry.C20438n7;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.C20577u5;
import io.sentry.C20628x5;
import io.sentry.EnumC20374i7;
import io.sentry.EnumC20400k2;
import io.sentry.EnumC20436n5;
import io.sentry.EnumC20537s1;
import io.sentry.InterfaceC20408l1;
import io.sentry.InterfaceC20432n1;
import io.sentry.InterfaceC20545t1;
import io.sentry.RunnableC20277c7;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC20108i;
import io.sentry.android.core.performance.C20139b;
import io.sentry.android.core.performance.C20140c;
import io.sentry.android.core.performance.C20144g;
import io.sentry.android.core.performance.C20145h;
import io.sentry.android.core.performance.EnumC20143f;
import io.sentry.protocol.EnumC20479g0;
import io.sentry.util.C20579a;
import io.sentry.util.C20584f;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p037bu.C3633d;
import p117eh.C13184a;
import p211i5.C18090c;
import p213i7.C18194g;
import p249jc.AbstractC21598x;
import p505ts.AbstractC34132o;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivityLifecycleIntegration implements InterfaceC20545t1, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: G */
    public final boolean f75210G;

    /* JADX INFO: renamed from: J */
    public InterfaceC20408l1 f75213J;

    /* JADX INFO: renamed from: Q */
    public final C20067d f75220Q;

    /* JADX INFO: renamed from: w */
    public final Application f75223w;

    /* JADX INFO: renamed from: x */
    public final C20121k0 f75224x;

    /* JADX INFO: renamed from: y */
    public C20371i4 f75225y;

    /* JADX INFO: renamed from: z */
    public SentryAndroidOptions f75226z;

    /* JADX INFO: renamed from: E */
    public boolean f75208E = false;

    /* JADX INFO: renamed from: F */
    public boolean f75209F = false;

    /* JADX INFO: renamed from: H */
    public boolean f75211H = false;

    /* JADX INFO: renamed from: I */
    public C20325f0 f75212I = null;

    /* JADX INFO: renamed from: K */
    public final WeakHashMap f75214K = new WeakHashMap();

    /* JADX INFO: renamed from: L */
    public final WeakHashMap f75215L = new WeakHashMap();

    /* JADX INFO: renamed from: M */
    public final WeakHashMap f75216M = new WeakHashMap();

    /* JADX INFO: renamed from: N */
    public AbstractC20576u4 f75217N = new C20628x5(new Date(0), 0);

    /* JADX INFO: renamed from: O */
    public Future f75218O = null;

    /* JADX INFO: renamed from: P */
    public final WeakHashMap f75219P = new WeakHashMap();

    /* JADX INFO: renamed from: R */
    public final C20579a f75221R = new C20579a();

    /* JADX INFO: renamed from: S */
    public final C20579a f75222S = new C20579a();

    public ActivityLifecycleIntegration(Application application, C20121k0 c20121k0, C20067d c20067d) {
        this.f75223w = application;
        this.f75224x = c20121k0;
        this.f75220Q = c20067d;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f75210G = true;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m55890h(InterfaceC20408l1 interfaceC20408l1, InterfaceC20408l1 interfaceC20408l2) {
        if (interfaceC20408l1 == null || interfaceC20408l1.mo56452e()) {
            return;
        }
        String description = interfaceC20408l1.getDescription();
        if (description == null || !description.endsWith(" - Deadline Exceeded")) {
            description = interfaceC20408l1.getDescription() + " - Deadline Exceeded";
        }
        interfaceC20408l1.setDescription(description);
        AbstractC20576u4 abstractC20576u4Mo56463u = interfaceC20408l2 != null ? interfaceC20408l2.mo56463u() : null;
        if (abstractC20576u4Mo56463u == null) {
            abstractC20576u4Mo56463u = interfaceC20408l1.mo56466x();
        }
        m55891i(interfaceC20408l1, abstractC20576u4Mo56463u, EnumC20374i7.DEADLINE_EXCEEDED);
    }

    /* JADX INFO: renamed from: i */
    public static void m55891i(InterfaceC20408l1 interfaceC20408l1, AbstractC20576u4 abstractC20576u4, EnumC20374i7 enumC20374i7) {
        if (interfaceC20408l1 == null || interfaceC20408l1.mo56452e()) {
            return;
        }
        if (enumC20374i7 == null) {
            enumC20374i7 = interfaceC20408l1.mo56450c() != null ? interfaceC20408l1.mo56450c() : EnumC20374i7.OK;
        }
        interfaceC20408l1.mo56464v(enumC20374i7, abstractC20576u4);
    }

    /* JADX INFO: renamed from: b */
    public final void m55892b() {
        C20577u5 c20577u5;
        C20145h c20145hM56043b = C20144g.m56042c().m56043b(this.f75226z);
        if (c20145hM56043b.f75679z != 0) {
            c20577u5 = new C20577u5((c20145hM56043b.m56047b() ? c20145hM56043b.f75677x + c20145hM56043b.m56046a() : 0L) * 1000000);
        } else {
            c20577u5 = null;
        }
        if (!this.f75208E || c20577u5 == null) {
            return;
        }
        m55891i(this.f75213J, c20577u5, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f75223w.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f75226z;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        C20067d c20067d = this.f75220Q;
        C20535s c20535sM56711a = ((C20579a) c20067d.f75382g).m56711a();
        try {
            if (c20067d.m55938c()) {
                c20067d.m55939d(new RunnableC20277c7(c20067d, 2), "FrameMetricsAggregator.stop");
                ((FrameMetricsAggregator) ((C20584f) c20067d.f75376a).m56714a()).reset();
            }
            ((ConcurrentHashMap) c20067d.f75379d).clear();
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

    /* JADX INFO: renamed from: k */
    public final void m55893k(InterfaceC20432n1 interfaceC20432n1, InterfaceC20408l1 interfaceC20408l1, InterfaceC20408l1 interfaceC20408l2) {
        if (interfaceC20432n1 == null || interfaceC20432n1.mo56452e()) {
            return;
        }
        EnumC20374i7 enumC20374i7 = EnumC20374i7.DEADLINE_EXCEEDED;
        if (interfaceC20408l1 != null && !interfaceC20408l1.mo56452e()) {
            interfaceC20408l1.mo56456l(enumC20374i7);
        }
        m55890h(interfaceC20408l2, interfaceC20408l1);
        Future future = this.f75218O;
        if (future != null) {
            future.cancel(false);
            this.f75218O = null;
        }
        EnumC20374i7 enumC20374i7Mo56450c = interfaceC20432n1.mo56450c();
        if (enumC20374i7Mo56450c == null) {
            enumC20374i7Mo56450c = EnumC20374i7.OK;
        }
        interfaceC20432n1.mo56456l(enumC20374i7Mo56450c);
        C20371i4 c20371i4 = this.f75225y;
        if (c20371i4 != null) {
            c20371i4.mo56439s(new C17508p(this, interfaceC20432n1));
        }
    }

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        SentryAndroidOptions sentryAndroidOptions = c20513q6 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c20513q6 : null;
        AbstractC29125c.m88510S(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f75226z = sentryAndroidOptions;
        this.f75225y = C20371i4.f76402a;
        this.f75208E = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.f75212I = this.f75226z.getFullyDisplayedReporter();
        this.f75209F = this.f75226z.isEnableTimeToFullDisplayTracing();
        this.f75223w.registerActivityLifecycleCallbacks(this);
        this.f75226z.getLogger().mo16066m(EnumC20436n5.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        AbstractC21598x.m60683i("ActivityLifecycle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C20325f0 c20325f0;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.f75210G) {
            onActivityPreCreated(activity, bundle);
        }
        C20535s c20535sM56711a = this.f75221R.m56711a();
        try {
            if (this.f75225y != null && (sentryAndroidOptions = this.f75226z) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                this.f75225y.mo56439s(new C20344g7(AbstractC34132o.m107893v(activity), 1));
            }
            m55895x(activity);
            InterfaceC20408l1 interfaceC20408l1 = (InterfaceC20408l1) this.f75214K.get(activity);
            InterfaceC20408l1 interfaceC20408l2 = (InterfaceC20408l1) this.f75215L.get(activity);
            this.f75211H = true;
            if (this.f75208E && interfaceC20408l1 != null && interfaceC20408l2 != null && (c20325f0 = this.f75212I) != null) {
                c20325f0.f76334a.add(new C18090c(16));
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakHashMap weakHashMap = this.f75215L;
        WeakHashMap weakHashMap2 = this.f75214K;
        WeakHashMap weakHashMap3 = this.f75216M;
        C20535s c20535sM56711a = this.f75221R.m56711a();
        try {
            C20139b c20139b = (C20139b) weakHashMap3.remove(activity);
            if (c20139b != null) {
                InterfaceC20408l1 interfaceC20408l1 = c20139b.f75651d;
                if (interfaceC20408l1 != null && !interfaceC20408l1.mo56452e()) {
                    c20139b.f75651d.mo56456l(EnumC20374i7.CANCELLED);
                }
                c20139b.f75651d = null;
                InterfaceC20408l1 interfaceC20408l2 = c20139b.f75652e;
                if (interfaceC20408l2 != null && !interfaceC20408l2.mo56452e()) {
                    c20139b.f75652e.mo56456l(EnumC20374i7.CANCELLED);
                }
                c20139b.f75652e = null;
            }
            boolean z4 = this.f75208E;
            WeakHashMap weakHashMap4 = this.f75219P;
            if (z4) {
                InterfaceC20408l1 interfaceC20408l3 = this.f75213J;
                EnumC20374i7 enumC20374i7 = EnumC20374i7.CANCELLED;
                if (interfaceC20408l3 != null && !interfaceC20408l3.mo56452e()) {
                    interfaceC20408l3.mo56456l(enumC20374i7);
                }
                InterfaceC20408l1 interfaceC20408l4 = (InterfaceC20408l1) weakHashMap2.get(activity);
                InterfaceC20408l1 interfaceC20408l5 = (InterfaceC20408l1) weakHashMap.get(activity);
                EnumC20374i7 enumC20374i8 = EnumC20374i7.DEADLINE_EXCEEDED;
                if (interfaceC20408l4 != null && !interfaceC20408l4.mo56452e()) {
                    interfaceC20408l4.mo56456l(enumC20374i8);
                }
                m55890h(interfaceC20408l5, interfaceC20408l4);
                Future future = this.f75218O;
                if (future != null) {
                    future.cancel(false);
                    this.f75218O = null;
                }
                if (this.f75208E) {
                    m55893k((InterfaceC20432n1) weakHashMap4.get(activity), null, null);
                }
                this.f75213J = null;
                weakHashMap2.remove(activity);
                weakHashMap.remove(activity);
            }
            weakHashMap4.remove(activity);
            if (weakHashMap4.isEmpty() && !activity.isChangingConfigurations()) {
                this.f75211H = false;
                this.f75217N = new C20628x5(new Date(0L), 0L);
                weakHashMap3.clear();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C20535s c20535sM56711a = this.f75221R.m56711a();
        try {
            if (!this.f75210G) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        C20139b c20139b = (C20139b) this.f75216M.get(activity);
        if (c20139b != null) {
            InterfaceC20408l1 interfaceC20408l1 = this.f75213J;
            if (interfaceC20408l1 == null) {
                interfaceC20408l1 = (InterfaceC20408l1) this.f75219P.get(activity);
            }
            if (c20139b.f75649b == null || interfaceC20408l1 == null) {
                return;
            }
            InterfaceC20408l1 interfaceC20408l1M56040a = C20139b.m56040a(interfaceC20408l1, c20139b.f75648a.concat(".onCreate"), c20139b.f75649b);
            c20139b.f75651d = interfaceC20408l1M56040a;
            interfaceC20408l1M56040a.mo56453g();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        C20139b c20139b = (C20139b) this.f75216M.get(activity);
        if (c20139b != null) {
            InterfaceC20408l1 interfaceC20408l1 = this.f75213J;
            if (interfaceC20408l1 == null) {
                interfaceC20408l1 = (InterfaceC20408l1) this.f75219P.get(activity);
            }
            if (c20139b.f75650c != null && interfaceC20408l1 != null) {
                InterfaceC20408l1 interfaceC20408l1M56040a = C20139b.m56040a(interfaceC20408l1, c20139b.f75648a.concat(".onStart"), c20139b.f75650c);
                c20139b.f75652e = interfaceC20408l1M56040a;
                interfaceC20408l1M56040a.mo56453g();
            }
            InterfaceC20408l1 interfaceC20408l2 = c20139b.f75651d;
            if (interfaceC20408l2 == null || c20139b.f75652e == null) {
                return;
            }
            AbstractC20576u4 abstractC20576u4Mo56463u = interfaceC20408l2.mo56463u();
            AbstractC20576u4 abstractC20576u4Mo56463u2 = c20139b.f75652e.mo56463u();
            if (abstractC20576u4Mo56463u == null || abstractC20576u4Mo56463u2 == null) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            AbstractC20117j.f75578a.getClass();
            C20628x5 c20628x5 = new C20628x5();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long millis = timeUnit.toMillis(c20628x5.mo56692b(c20139b.f75651d.mo56466x()));
            long millis2 = timeUnit.toMillis(c20628x5.mo56692b(abstractC20576u4Mo56463u));
            long millis3 = timeUnit.toMillis(c20628x5.mo56692b(c20139b.f75652e.mo56466x()));
            long millis4 = timeUnit.toMillis(c20628x5.mo56692b(abstractC20576u4Mo56463u2));
            C20140c c20140c = new C20140c();
            String description = c20139b.f75651d.getDescription();
            long millis5 = timeUnit.toMillis(c20139b.f75651d.mo56466x().mo56606d());
            C20145h c20145h = c20140c.f75653w;
            c20145h.f75676w = description;
            c20145h.f75677x = millis5;
            c20145h.f75678y = jUptimeMillis - millis;
            c20145h.f75679z = jUptimeMillis - millis2;
            String description2 = c20139b.f75652e.getDescription();
            long millis6 = timeUnit.toMillis(c20139b.f75652e.mo56466x().mo56606d());
            C20145h c20145h2 = c20140c.f75654x;
            c20145h2.f75676w = description2;
            c20145h2.f75677x = millis6;
            c20145h2.f75678y = jUptimeMillis - millis3;
            c20145h2.f75679z = jUptimeMillis - millis4;
            C20144g.m56042c().f75664H.add(c20140c);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC20576u4 c20628x5;
        C20139b c20139b = new C20139b(activity.getClass().getName());
        this.f75216M.put(activity, c20139b);
        if (this.f75211H) {
            return;
        }
        C20371i4 c20371i4 = this.f75225y;
        if (c20371i4 != null) {
            c20628x5 = c20371i4.mo56432l().getDateProvider().now();
        } else {
            AbstractC20117j.f75578a.getClass();
            c20628x5 = new C20628x5();
        }
        this.f75217N = c20628x5;
        c20139b.f75649b = c20628x5;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        AbstractC20576u4 c20628x5;
        this.f75211H = true;
        C20371i4 c20371i4 = this.f75225y;
        if (c20371i4 != null) {
            c20628x5 = c20371i4.mo56432l().getDateProvider().now();
        } else {
            AbstractC20117j.f75578a.getClass();
            c20628x5 = new C20628x5();
        }
        this.f75217N = c20628x5;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        AbstractC20576u4 c20628x5;
        C20139b c20139b = (C20139b) this.f75216M.get(activity);
        if (c20139b != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f75226z;
            if (sentryAndroidOptions != null) {
                c20628x5 = sentryAndroidOptions.getDateProvider().now();
            } else {
                AbstractC20117j.f75578a.getClass();
                c20628x5 = new C20628x5();
            }
            c20139b.f75650c = c20628x5;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C20535s c20535sM56711a = this.f75221R.m56711a();
        try {
            if (!this.f75210G) {
                onActivityPostStarted(activity);
            }
            if (this.f75208E) {
                final InterfaceC20408l1 interfaceC20408l1 = (InterfaceC20408l1) this.f75214K.get(activity);
                final InterfaceC20408l1 interfaceC20408l2 = (InterfaceC20408l1) this.f75215L.get(activity);
                if (activity.getWindow() != null) {
                    final int i13 = 0;
                    ViewTreeObserverOnDrawListenerC20108i.m56001a(activity, new Runnable(this) { // from class: io.sentry.android.core.e

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ ActivityLifecycleIntegration f75388x;

                        {
                            this.f75388x = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    this.f75388x.m55894s(interfaceC20408l2, interfaceC20408l1);
                                    break;
                                default:
                                    this.f75388x.m55894s(interfaceC20408l2, interfaceC20408l1);
                                    break;
                            }
                        }
                    }, this.f75224x);
                } else {
                    final int i14 = 1;
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.e

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ ActivityLifecycleIntegration f75388x;

                        {
                            this.f75388x = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    this.f75388x.m55894s(interfaceC20408l2, interfaceC20408l1);
                                    break;
                                default:
                                    this.f75388x.m55894s(interfaceC20408l2, interfaceC20408l1);
                                    break;
                            }
                        }
                    });
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C20535s c20535sM56711a = this.f75221R.m56711a();
        try {
            if (!this.f75210G) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.f75208E) {
                this.f75220Q.m55936a(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX INFO: renamed from: s */
    public final void m55894s(InterfaceC20408l1 interfaceC20408l1, InterfaceC20408l1 interfaceC20408l2) {
        C20144g c20144gM56042c = C20144g.m56042c();
        C20145h c20145h = c20144gM56042c.f75675z;
        C20145h c20145h2 = c20144gM56042c.f75661E;
        if (c20145h.m56047b() && c20145h.f75679z == 0) {
            c20145h.f75679z = SystemClock.uptimeMillis();
        }
        if (c20145h2.m56047b() && c20145h2.f75679z == 0) {
            c20145h2.f75679z = SystemClock.uptimeMillis();
        }
        m55892b();
        C20535s c20535sM56711a = this.f75222S.m56711a();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.f75226z;
            if (sentryAndroidOptions != null && interfaceC20408l2 != null) {
                AbstractC20576u4 abstractC20576u4Now = sentryAndroidOptions.getDateProvider().now();
                interfaceC20408l2.mo56461s("time_to_initial_display", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(abstractC20576u4Now.mo56692b(interfaceC20408l2.mo56466x()))), EnumC20400k2.MILLISECOND);
                m55891i(interfaceC20408l2, abstractC20576u4Now, null);
            } else if (interfaceC20408l2 != null && !interfaceC20408l2.mo56452e()) {
                interfaceC20408l2.mo56453g();
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

    /* JADX INFO: renamed from: x */
    public final void m55895x(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        Boolean boolValueOf;
        C20577u5 c20577u5;
        AbstractC20576u4 abstractC20576u4;
        C13184a c13184a;
        InterfaceC20432n1 interfaceC20432n1;
        WeakReference weakReference = new WeakReference(activity);
        if (this.f75225y != null) {
            WeakHashMap weakHashMap3 = this.f75219P;
            if (weakHashMap3.containsKey(activity)) {
                return;
            }
            if (!this.f75208E) {
                weakHashMap3.put(activity, C20340g3.f76358a);
                if (this.f75226z.isEnableAutoTraceIdGeneration()) {
                    this.f75225y.mo56439s(new C18194g(18));
                    return;
                }
                return;
            }
            Iterator it = weakHashMap3.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                weakHashMap = this.f75215L;
                weakHashMap2 = this.f75214K;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                m55893k((InterfaceC20432n1) entry.getValue(), (InterfaceC20408l1) weakHashMap2.get(entry.getKey()), (InterfaceC20408l1) weakHashMap.get(entry.getKey()));
            }
            String simpleName = activity.getClass().getSimpleName();
            C20145h c20145hM56043b = C20144g.m56042c().m56043b(this.f75226z);
            C0627i1 c0627i1 = null;
            if (AbstractC20118j0.m56013g() && c20145hM56043b.m56047b()) {
                C20577u5 c20577u6 = c20145hM56043b.m56047b() ? new C20577u5(c20145hM56043b.f75677x * 1000000) : null;
                boolValueOf = Boolean.valueOf(C20144g.m56042c().f75672w == EnumC20143f.COLD);
                c20577u5 = c20577u6;
            } else {
                boolValueOf = null;
                c20577u5 = null;
            }
            C20438n7 c20438n7 = new C20438n7();
            long deadlineTimeout = this.f75226z.getDeadlineTimeout();
            c20438n7.f76521h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
            if (this.f75226z.isEnableActivityLifecycleTracingAutoFinish()) {
                c20438n7.f76520g = this.f75226z.getIdleTimeout();
                c20438n7.f45696a = true;
            }
            c20438n7.f76519f = true;
            c20438n7.f76522i = new C20073f(this, weakReference, simpleName);
            if (this.f75211H || c20577u5 == null || boolValueOf == null) {
                abstractC20576u4 = this.f75217N;
            } else {
                C0627i1 c0627i2 = C20144g.m56042c().f75667K;
                C20144g.m56042c().f75667K = null;
                c0627i1 = c0627i2;
                abstractC20576u4 = c20577u5;
            }
            c20438n7.f45697b = abstractC20576u4;
            c20438n7.f76518e = c0627i1 != null;
            c20438n7.f45699d = "auto.ui.activity";
            InterfaceC20432n1 interfaceC20432n1Mo56444x = this.f75225y.mo56444x(new C20426m7(simpleName, EnumC20479g0.COMPONENT, "ui.load", c0627i1), c20438n7);
            C13184a c13184a2 = new C13184a(1);
            c13184a2.f45699d = "auto.ui.activity";
            if (this.f75211H || c20577u5 == null || boolValueOf == null) {
                c13184a = c13184a2;
            } else {
                InterfaceC20408l1 interfaceC20408l1Mo56460q = interfaceC20432n1Mo56444x.mo56460q(boolValueOf.booleanValue() ? "app.start.cold" : "app.start.warm", boolValueOf.booleanValue() ? "Cold Start" : "Warm Start", c20577u5, EnumC20537s1.SENTRY, c13184a2);
                interfaceC20432n1Mo56444x = interfaceC20432n1Mo56444x;
                c13184a = c13184a2;
                this.f75213J = interfaceC20408l1Mo56460q;
                m55892b();
            }
            String strConcat = simpleName.concat(" initial display");
            EnumC20537s1 enumC20537s1 = EnumC20537s1.SENTRY;
            AbstractC20576u4 abstractC20576u5 = abstractC20576u4;
            InterfaceC20408l1 interfaceC20408l1Mo56460q2 = interfaceC20432n1Mo56444x.mo56460q("ui.load.initial_display", strConcat, abstractC20576u5, enumC20537s1, c13184a);
            weakHashMap2.put(activity, interfaceC20408l1Mo56460q2);
            if (!this.f75209F || this.f75212I == null || this.f75226z == null) {
                interfaceC20432n1 = interfaceC20432n1Mo56444x;
            } else {
                InterfaceC20408l1 interfaceC20408l1Mo56460q3 = interfaceC20432n1Mo56444x.mo56460q("ui.load.full_display", simpleName.concat(" full display"), abstractC20576u5, enumC20537s1, c13184a);
                interfaceC20432n1 = interfaceC20432n1Mo56444x;
                try {
                    weakHashMap.put(activity, interfaceC20408l1Mo56460q3);
                    this.f75218O = this.f75226z.getExecutorService().mo56218c(new RunnableC1605m(this, interfaceC20408l1Mo56460q3, interfaceC20408l1Mo56460q2), 25000L);
                } catch (RejectedExecutionException e5) {
                    this.f75226z.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e5);
                }
            }
            this.f75225y.mo56439s(new C3633d(3, this, interfaceC20432n1));
            weakHashMap3.put(activity, interfaceC20432n1);
        }
    }
}
