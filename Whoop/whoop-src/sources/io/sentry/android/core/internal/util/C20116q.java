package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.lifecycle.RunnableC1605m;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.C20121k0;
import io.sentry.android.core.C20156t;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C20116q implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: O */
    public static final long f75561O = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: P */
    public static final long f75562P = TimeUnit.MILLISECONDS.toNanos(700);

    /* JADX INFO: renamed from: Q */
    public static final /* synthetic */ int f75563Q = 0;

    /* JADX INFO: renamed from: E */
    public WeakReference f75564E;

    /* JADX INFO: renamed from: F */
    public final ConcurrentHashMap f75565F;

    /* JADX INFO: renamed from: G */
    public final boolean f75566G;

    /* JADX INFO: renamed from: H */
    public final C20103d f75567H;

    /* JADX INFO: renamed from: I */
    public final WindowOnFrameMetricsAvailableListenerC20113n f75568I;

    /* JADX INFO: renamed from: J */
    public Choreographer f75569J;

    /* JADX INFO: renamed from: K */
    public final Field f75570K;

    /* JADX INFO: renamed from: L */
    public long f75571L;

    /* JADX INFO: renamed from: M */
    public long f75572M;

    /* JADX INFO: renamed from: N */
    public final ConcurrentSkipListSet f75573N;

    /* JADX INFO: renamed from: w */
    public final C20121k0 f75574w;

    /* JADX INFO: renamed from: x */
    public final CopyOnWriteArraySet f75575x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC20602v0 f75576y;

    /* JADX INFO: renamed from: z */
    public final Handler f75577z;

    /* JADX WARN: Type inference failed for: r4v5, types: [io.sentry.android.core.internal.util.n] */
    public C20116q(Context context, final C20156t c20156t, final C20121k0 c20121k0) {
        C20103d c20103d = new C20103d();
        this.f75575x = new CopyOnWriteArraySet();
        this.f75565F = new ConcurrentHashMap();
        this.f75566G = false;
        this.f75571L = 0L;
        this.f75572M = 0L;
        this.f75573N = new ConcurrentSkipListSet();
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        AbstractC29125c.m88510S(c20156t, "Logger is required");
        this.f75576y = c20156t;
        AbstractC29125c.m88510S(c20121k0, "BuildInfoProvider is required");
        this.f75574w = c20121k0;
        this.f75567H = c20103d;
        if (context instanceof Application) {
            this.f75566G = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.m
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th3) {
                    c20156t.mo16060j(EnumC20436n5.ERROR, "Error during frames measurements.", th3);
                }
            });
            handlerThread.start();
            this.f75577z = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new RunnableC1605m(12, this, c20156t));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f75570K = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                c20156t.mo16060j(EnumC20436n5.ERROR, "Unable to get the frame timestamp from the choreographer: ", e5);
            }
            this.f75568I = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.n
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i13) {
                    C20116q.m56004a(this.f75557a, c20121k0, window, frameMetrics);
                }
            };
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m56004a(C20116q c20116q, C20121k0 c20121k0, Window window, FrameMetrics frameMetrics) {
        ConcurrentSkipListSet concurrentSkipListSet = c20116q.f75573N;
        long jNanoTime = System.nanoTime();
        c20121k0.getClass();
        float refreshRate = Build.VERSION.SDK_INT >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        float f13 = f75561O;
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long jMax = Math.max(0L, metric - ((long) (f13 / refreshRate)));
        c20116q.f75574w.getClass();
        long metric2 = frameMetrics.getMetric(10);
        if (metric2 < 0) {
            metric2 = jNanoTime - metric;
        }
        long jMax2 = Math.max(metric2, c20116q.f75572M);
        if (jMax2 == c20116q.f75571L) {
            return;
        }
        c20116q.f75571L = jMax2;
        long j7 = jMax2 + metric;
        c20116q.f75572M = j7;
        boolean z4 = metric > ((long) (f13 / (refreshRate - 1.0f)));
        boolean z13 = z4 && metric > f75562P;
        if (jMax > 0) {
            long j13 = j7 - 300000000000L;
            concurrentSkipListSet.headSet(new C20114o(j13, j13)).clear();
            if (concurrentSkipListSet.size() < 3600) {
                concurrentSkipListSet.add(new C20114o(jMax2, c20116q.f75572M));
            }
        }
        Iterator it = c20116q.f75565F.values().iterator();
        while (it.hasNext()) {
            long j14 = metric;
            long j15 = jMax;
            ((InterfaceC20115p) it.next()).mo56003c(jMax2, c20116q.f75572M, j14, j15, z4, z13, refreshRate);
            jMax = j15;
            metric = j14;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m56005b(String str) {
        if (this.f75566G) {
            ConcurrentHashMap concurrentHashMap = this.f75565F;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.f75564E;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new RunnableC20111l(this, window, 1));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m56006c() {
        WeakReference weakReference = this.f75564E;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.f75566G || this.f75565F.isEmpty() || this.f75577z == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC20111l(this, window, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference weakReference = this.f75564E;
        if (weakReference == null || weakReference.get() != window) {
            this.f75564E = new WeakReference(window);
            m56006c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        new Handler(Looper.getMainLooper()).post(new RunnableC20111l(this, activity.getWindow(), 1));
        WeakReference weakReference = this.f75564E;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f75564E = null;
    }
}
