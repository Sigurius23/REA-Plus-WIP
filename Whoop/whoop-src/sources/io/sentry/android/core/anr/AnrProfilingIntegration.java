package io.sentry.android.core.anr;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.RunnableC1645z0;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.C20546t2;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20545t1;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.C20071e0;
import io.sentry.android.core.InterfaceC20060b0;
import io.sentry.android.core.RunnableC20151r0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.AbstractC20589k;
import io.sentry.util.C20579a;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p249jc.AbstractC21598x;
import pf.AbstractC29125c;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes5.dex */
public class AnrProfilingIntegration implements InterfaceC20545t1, Closeable, InterfaceC20060b0, Runnable {

    /* JADX INFO: renamed from: H */
    public volatile C20056d f75326H;

    /* JADX INFO: renamed from: J */
    public volatile SentryAndroidOptions f75328J;

    /* JADX INFO: renamed from: N */
    public volatile Handler f75332N;

    /* JADX INFO: renamed from: O */
    public volatile Thread f75333O;

    /* JADX INFO: renamed from: w */
    public final AtomicBoolean f75334w = new AtomicBoolean(true);

    /* JADX INFO: renamed from: x */
    public final RunnableC1645z0 f75335x = new RunnableC1645z0(this, 10);

    /* JADX INFO: renamed from: y */
    public final C20579a f75336y = new C20579a();

    /* JADX INFO: renamed from: z */
    public final C20579a f75337z = new C20579a();

    /* JADX INFO: renamed from: E */
    public volatile long f75323E = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: F */
    public final AtomicInteger f75324F = new AtomicInteger();

    /* JADX INFO: renamed from: G */
    public volatile EnumC20052a f75325G = EnumC20052a.IDLE;

    /* JADX INFO: renamed from: I */
    public volatile InterfaceC20602v0 f75327I = C20546t2.f76998w;

    /* JADX INFO: renamed from: K */
    public volatile Thread f75329K = null;

    /* JADX INFO: renamed from: L */
    public volatile boolean f75330L = false;

    /* JADX INFO: renamed from: M */
    public volatile boolean f75331M = false;

    /* JADX INFO: renamed from: io.sentry.android.core.anr.AnrProfilingIntegration$a */
    public enum EnumC20052a {
        IDLE,
        SUSPICIOUS,
        ANR_DETECTED
    }

    /* JADX INFO: renamed from: b */
    public final void m55916b(Thread thread) {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f75323E;
        if (jUptimeMillis < 1000) {
            this.f75325G = EnumC20052a.IDLE;
            this.f75330L = false;
        }
        if (this.f75325G == EnumC20052a.IDLE && jUptimeMillis > 1000) {
            InterfaceC20602v0 interfaceC20602v0 = this.f75327I;
            EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
            if (interfaceC20602v0.mo16069o(enumC20436n5)) {
                this.f75327I.mo16066m(enumC20436n5, "ANR: main thread is suspicious", new Object[0]);
            }
            this.f75325G = EnumC20052a.SUSPICIOUS;
            SentryAndroidOptions sentryAndroidOptions = this.f75328J;
            Double anrProfilingSampleRate = sentryAndroidOptions != null ? sentryAndroidOptions.getAnrProfilingSampleRate() : null;
            if (anrProfilingSampleRate != null && AbstractC20589k.m56722a().m56721c() < anrProfilingSampleRate.doubleValue()) {
                this.f75330L = true;
            }
            if (this.f75330L) {
                this.f75324F.set(0);
                m55917h().m55922h();
            }
        }
        if (this.f75330L && (this.f75325G == EnumC20052a.SUSPICIOUS || this.f75325G == EnumC20052a.ANR_DETECTED)) {
            if (this.f75324F.get() < 151) {
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                C20058f c20058f = new C20058f(System.currentTimeMillis(), thread.getStackTrace());
                long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis2;
                InterfaceC20602v0 interfaceC20602v1 = this.f75327I;
                EnumC20436n5 enumC20436n6 = EnumC20436n5.DEBUG;
                if (interfaceC20602v1.mo16069o(enumC20436n6)) {
                    this.f75327I.mo16066m(enumC20436n6, AbstractC31061c.m95636l(jUptimeMillis3, "AnrWatchdog: capturing main thread stacktrace took ", "ms"), new Object[0]);
                }
                if (this.f75334w.get()) {
                    this.f75324F.incrementAndGet();
                    m55917h().m55921b(c20058f);
                }
            } else {
                InterfaceC20602v0 interfaceC20602v2 = this.f75327I;
                EnumC20436n5 enumC20436n7 = EnumC20436n5.DEBUG;
                if (interfaceC20602v2.mo16069o(enumC20436n7)) {
                    this.f75327I.mo16066m(enumC20436n7, "ANR: reached maximum number of collected stack traces, skipping further collection", new Object[0]);
                }
            }
        }
        if (this.f75325G != EnumC20052a.SUSPICIOUS || jUptimeMillis <= 4000) {
            return;
        }
        InterfaceC20602v0 interfaceC20602v3 = this.f75327I;
        EnumC20436n5 enumC20436n8 = EnumC20436n5.DEBUG;
        if (interfaceC20602v3.mo16069o(enumC20436n8)) {
            this.f75327I.mo16066m(enumC20436n8, "ANR: main thread ANR threshold reached", new Object[0]);
        }
        this.f75325G = EnumC20052a.ANR_DETECTED;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f75334w.set(false);
        C20071e0.f75391E.m55944k(this);
        Handler handler = this.f75332N;
        if (handler != null) {
            handler.removeCallbacks(this.f75335x);
        }
        Thread thread = this.f75329K;
        if (thread != null) {
            synchronized (this) {
                notifyAll();
            }
            thread.interrupt();
        }
        SentryAndroidOptions sentryAndroidOptions = this.f75328J;
        C20535s c20535sM56711a = this.f75337z.m56711a();
        try {
            C20056d c20056d = this.f75326H;
            this.f75326H = null;
            c20535sM56711a.close();
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new RunnableC20151r0(2, this, c20056d));
                } catch (Throwable unused) {
                    this.f75327I.mo16066m(EnumC20436n5.WARNING, "Failed to submit AnrProfileManager close", new Object[0]);
                }
            }
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public final C20056d m55917h() {
        C20535s c20535sM56711a = this.f75337z.m56711a();
        try {
            if (this.f75326H == null) {
                SentryAndroidOptions sentryAndroidOptions = this.f75328J;
                AbstractC29125c.m88510S(sentryAndroidOptions, "Options can't be null");
                String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
                if (cacheDirPath == null) {
                    throw new IllegalStateException("cacheDirPath is required for ANR profiling");
                }
                File file = new File(cacheDirPath);
                AbstractC20057e.m55925b(file);
                this.f75326H = new C20056d(sentryAndroidOptions, new File(file, "anr_profile"));
            }
            C20056d c20056d = this.f75326H;
            c20535sM56711a.close();
            return c20056d;
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.android.core.InterfaceC20060b0
    /* JADX INFO: renamed from: i */
    public final void mo55909i() {
        if (this.f75334w.get()) {
            C20535s c20535sM56711a = this.f75336y.m56711a();
            try {
                if (this.f75331M) {
                    c20535sM56711a.close();
                    return;
                }
                this.f75331M = true;
                this.f75335x.run();
                Thread thread = this.f75329K;
                if (thread != null && thread.isAlive()) {
                    synchronized (this) {
                        notifyAll();
                    }
                }
                if (thread == null || !thread.isAlive()) {
                    Thread thread2 = new Thread(this, "AnrProfilingIntegration");
                    thread2.setDaemon(true);
                    thread2.start();
                    this.f75329K = thread2;
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

    @Override // io.sentry.android.core.InterfaceC20060b0
    /* JADX INFO: renamed from: k */
    public final void mo55910k() {
        if (this.f75334w.get()) {
            C20535s c20535sM56711a = this.f75336y.m56711a();
            try {
                this.f75331M = false;
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

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        SentryAndroidOptions sentryAndroidOptions = c20513q6 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c20513q6 : null;
        AbstractC29125c.m88510S(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f75328J = sentryAndroidOptions;
        this.f75327I = c20513q6.getLogger();
        if (this.f75328J.isAnrProfilingEnabled()) {
            if (this.f75328J.getCacheDirPath() == null) {
                this.f75327I.mo16066m(EnumC20436n5.WARNING, "ANR Profiling is enabled but cacheDirPath is not set", new Object[0]);
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            this.f75333O = mainLooper.getThread();
            this.f75332N = new Handler(mainLooper);
            AbstractC21598x.m60683i("AnrProfiling");
            C20071e0.f75391E.m55941b(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = this.f75332N;
        Thread thread = this.f75333O;
        if (handler == null || thread == null) {
            return;
        }
        while (this.f75334w.get() && !Thread.currentThread().isInterrupted()) {
            try {
                try {
                    if (this.f75331M) {
                        m55916b(thread);
                        handler.removeCallbacks(this.f75335x);
                        handler.post(this.f75335x);
                        Thread.sleep(66L);
                    } else {
                        synchronized (this) {
                            while (!this.f75331M && this.f75334w.get()) {
                                try {
                                    wait();
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        this.f75335x.run();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            } catch (Throwable th4) {
                this.f75327I.mo16060j(EnumC20436n5.WARNING, "Failed to execute AnrStacktraceIntegration", th4);
                return;
            }
        }
    }
}
