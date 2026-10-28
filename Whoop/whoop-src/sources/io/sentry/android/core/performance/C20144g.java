package io.sentry.android.core.performance;

import aa3.C0627i1;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationStartInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.C20535s;
import io.sentry.C20546t2;
import io.sentry.android.core.C20079h;
import io.sentry.android.core.C20121k0;
import io.sentry.android.core.C20159u;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC20108i;
import io.sentry.util.C20579a;
import io.sentry.util.C20584f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p097ds.RunnableC12316s;
import p437qt.C30582e;

/* JADX INFO: renamed from: io.sentry.android.core.performance.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C20144g extends AbstractC20138a {

    /* JADX INFO: renamed from: Q */
    public static volatile C20144g f75659Q;

    /* JADX INFO: renamed from: P */
    public static long f75658P = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: R */
    public static final C20579a f75660R = new C20579a();

    /* JADX INFO: renamed from: w */
    public EnumC20143f f75672w = EnumC20143f.UNKNOWN;

    /* JADX INFO: renamed from: x */
    public final C20584f f75673x = new C20584f(new C30582e(28));

    /* JADX INFO: renamed from: y */
    public volatile long f75674y = -1;

    /* JADX INFO: renamed from: I */
    public C20159u f75665I = null;

    /* JADX INFO: renamed from: J */
    public C20079h f75666J = null;

    /* JADX INFO: renamed from: K */
    public C0627i1 f75667K = null;

    /* JADX INFO: renamed from: L */
    public boolean f75668L = false;

    /* JADX INFO: renamed from: M */
    public boolean f75669M = true;

    /* JADX INFO: renamed from: N */
    public final AtomicInteger f75670N = new AtomicInteger();

    /* JADX INFO: renamed from: O */
    public final AtomicBoolean f75671O = new AtomicBoolean(false);

    /* JADX INFO: renamed from: z */
    public final C20145h f75675z = new C20145h();

    /* JADX INFO: renamed from: E */
    public final C20145h f75661E = new C20145h();

    /* JADX INFO: renamed from: F */
    public final C20145h f75662F = new C20145h();

    /* JADX INFO: renamed from: G */
    public final HashMap f75663G = new HashMap();

    /* JADX INFO: renamed from: H */
    public final ArrayList f75664H = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static void m56041a(C20144g c20144g) {
        if (c20144g.f75670N.get() == 0) {
            c20144g.f75673x.m56716c(Boolean.FALSE);
            C20159u c20159u = c20144g.f75665I;
            if (c20159u != null && c20159u.isRunning()) {
                c20144g.f75665I.close();
                c20144g.f75665I = null;
            }
            C20079h c20079h = c20144g.f75666J;
            if (c20079h == null || !c20079h.f75411I) {
                return;
            }
            c20079h.mo55947a(true);
            c20144g.f75666J = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C20144g m56042c() {
        if (f75659Q == null) {
            C20535s c20535sM56711a = f75660R.m56711a();
            try {
                if (f75659Q == null) {
                    f75659Q = new C20144g();
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
        return f75659Q;
    }

    /* JADX INFO: renamed from: b */
    public final C20145h m56043b(SentryAndroidOptions sentryAndroidOptions) {
        if (this.f75672w != EnumC20143f.UNKNOWN && ((Boolean) this.f75673x.m56714a()).booleanValue()) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                C20145h c20145h = this.f75675z;
                if (c20145h.m56047b() && c20145h.m56046a() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return c20145h;
                }
            }
            C20145h c20145h2 = this.f75661E;
            if (c20145h2.m56047b() && c20145h2.m56046a() <= TimeUnit.MINUTES.toMillis(1L)) {
                return c20145h2;
            }
        }
        return new C20145h();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m56044d() {
        if (!this.f75671O.getAndSet(true)) {
            C20144g c20144gM56042c = m56042c();
            C20145h c20145h = c20144gM56042c.f75661E;
            c20145h.getClass();
            c20145h.f75679z = SystemClock.uptimeMillis();
            C20145h c20145h2 = c20144gM56042c.f75675z;
            c20145h2.getClass();
            c20145h2.f75679z = SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m56045e(Application application) {
        ActivityManager activityManager;
        if (this.f75668L) {
            return;
        }
        this.f75668L = true;
        this.f75673x.m56715b();
        application.registerActivityLifecycleCallbacks(f75659Q);
        if (Build.VERSION.SDK_INT >= 35 && (activityManager = (ActivityManager) application.getSystemService("activity")) != null) {
            List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1);
            if (!historicalProcessStartReasons.isEmpty()) {
                ApplicationStartInfo applicationStartInfo = (ApplicationStartInfo) historicalProcessStartReasons.get(0);
                if (applicationStartInfo.getStartupState() == 0) {
                    if (applicationStartInfo.getStartType() == 1) {
                        this.f75672w = EnumC20143f.COLD;
                    } else {
                        this.f75672w = EnumC20143f.WARM;
                    }
                }
            }
        }
        EnumC20143f enumC20143f = this.f75672w;
        EnumC20143f enumC20143f2 = EnumC20143f.UNKNOWN;
        if (enumC20143f == enumC20143f2) {
            Looper.getMainLooper().getQueue().addIdleHandler(new C20142e(this));
        } else if (enumC20143f == enumC20143f2) {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new RunnableC12316s(this, handler, false, 11));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C20121k0.f75590b.m56022b(activity);
        if (this.f75670N.incrementAndGet() == 1 && !this.f75671O.get()) {
            long jUptimeMillis2 = SystemClock.uptimeMillis() - this.f75675z.f75678y;
            if (!((Boolean) this.f75673x.m56714a()).booleanValue() || jUptimeMillis2 > TimeUnit.MINUTES.toMillis(1L)) {
                this.f75672w = EnumC20143f.WARM;
                this.f75669M = true;
                C20145h c20145h = this.f75675z;
                c20145h.f75676w = null;
                c20145h.f75678y = 0L;
                c20145h.f75679z = 0L;
                c20145h.f75677x = 0L;
                c20145h.m56048c(jUptimeMillis);
                f75658P = jUptimeMillis;
                this.f75663G.clear();
                C20145h c20145h2 = this.f75662F;
                c20145h2.f75676w = null;
                c20145h2.f75678y = 0L;
                c20145h2.f75679z = 0L;
                c20145h2.f75677x = 0L;
            } else if (this.f75672w == EnumC20143f.UNKNOWN) {
                if (bundle != null) {
                    this.f75672w = EnumC20143f.WARM;
                } else if (this.f75674y == -1 || jUptimeMillis <= this.f75674y) {
                    this.f75672w = EnumC20143f.COLD;
                } else {
                    this.f75672w = EnumC20143f.WARM;
                }
            }
        }
        this.f75673x.m56716c(Boolean.TRUE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C20121k0 c20121k0 = C20121k0.f75590b;
        WeakReference weakReference = (WeakReference) c20121k0.f75591a;
        if (weakReference == null || weakReference.get() == activity) {
            c20121k0.f75591a = null;
        }
        if (this.f75670N.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.f75672w = EnumC20143f.WARM;
        this.f75673x.m56716c(Boolean.TRUE);
        this.f75669M = true;
        this.f75671O.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C20121k0 c20121k0 = C20121k0.f75590b;
        WeakReference weakReference = (WeakReference) c20121k0.f75591a;
        if (weakReference == null || weakReference.get() == activity) {
            c20121k0.f75591a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C20121k0.f75590b.m56022b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C20121k0.f75590b.m56022b(activity);
        if (this.f75671O.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            final int i13 = 0;
            ViewTreeObserverOnDrawListenerC20108i.m56001a(activity, new Runnable(this) { // from class: io.sentry.android.core.performance.d

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C20144g f75656x;

                {
                    this.f75656x = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            this.f75656x.m56044d();
                            break;
                        default:
                            this.f75656x.m56044d();
                            break;
                    }
                }
            }, new C20121k0(C20546t2.f76998w));
        } else {
            final int i14 = 1;
            new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.performance.d

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C20144g f75656x;

                {
                    this.f75656x = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            this.f75656x.m56044d();
                            break;
                        default:
                            this.f75656x.m56044d();
                            break;
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C20121k0 c20121k0 = C20121k0.f75590b;
        WeakReference weakReference = (WeakReference) c20121k0.f75591a;
        if (weakReference == null || weakReference.get() == activity) {
            c20121k0.f75591a = null;
        }
    }
}
