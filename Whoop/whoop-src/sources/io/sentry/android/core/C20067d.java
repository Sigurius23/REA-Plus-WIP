package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.RunnableC1283d;
import cl.ExecutorServiceC4794b;
import com.whoop.data.repositories.C6656c;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.android.core.internal.util.C20104e;
import io.sentry.util.C20579a;
import io.sentry.util.C20584f;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import p014aj.C0928c;
import p211i5.C18090c;
import p437qt.C30582e;
import p526ul.AbstractC35057c;
import p684zk.C40787l;

/* JADX INFO: renamed from: io.sentry.android.core.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C20067d {

    /* JADX INFO: renamed from: a */
    public final Object f75376a;

    /* JADX INFO: renamed from: b */
    public final Object f75377b;

    /* JADX INFO: renamed from: c */
    public final Object f75378c;

    /* JADX INFO: renamed from: d */
    public final Object f75379d;

    /* JADX INFO: renamed from: e */
    public final Object f75380e;

    /* JADX INFO: renamed from: f */
    public final Object f75381f;

    /* JADX INFO: renamed from: g */
    public final Object f75382g;

    public C20067d(C30582e c30582e, SentryAndroidOptions sentryAndroidOptions) {
        C20121k0 c20121k0 = new C20121k0();
        this.f75379d = new ConcurrentHashMap();
        this.f75380e = new WeakHashMap();
        this.f75382g = new C20579a();
        this.f75377b = new C20584f(new C6656c(14, c30582e, sentryAndroidOptions.getLogger()));
        this.f75376a = new C20584f(new C18090c(15));
        this.f75378c = sentryAndroidOptions;
        this.f75381f = c20121k0;
    }

    /* JADX INFO: renamed from: a */
    public void m55936a(Activity activity) {
        C20535s c20535sM56711a = ((C20579a) this.f75382g).m56711a();
        try {
            if (!m55938c()) {
                c20535sM56711a.close();
                return;
            }
            m55939d(new RunnableC20059b(this, activity, 0), "FrameMetricsAggregator.add");
            C20062c c20062cM55937b = m55937b();
            if (c20062cM55937b != null) {
                ((WeakHashMap) this.f75380e).put(activity, c20062cM55937b);
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

    /* JADX INFO: renamed from: b */
    public C20062c m55937b() {
        int i13;
        int i14;
        SparseIntArray sparseIntArray;
        if (!m55938c() || !((Boolean) ((C20584f) this.f75377b).m56714a()).booleanValue()) {
            return null;
        }
        SparseIntArray[] metrics = ((FrameMetricsAggregator) ((C20584f) this.f75376a).m56714a()).getMetrics();
        int i15 = 0;
        if (metrics == null || metrics.length <= 0 || (sparseIntArray = metrics[0]) == null) {
            i13 = 0;
            i14 = 0;
        } else {
            int i16 = 0;
            i13 = 0;
            i14 = 0;
            while (i15 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i15);
                int iValueAt = sparseIntArray.valueAt(i15);
                i16 += iValueAt;
                if (iKeyAt > 700) {
                    i14 += iValueAt;
                } else if (iKeyAt > 16) {
                    i13 += iValueAt;
                }
                i15++;
            }
            i15 = i16;
        }
        return new C20062c(i15, i13, i14);
    }

    /* JADX INFO: renamed from: c */
    public boolean m55938c() {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f75378c;
        return ((Boolean) ((C20584f) this.f75377b).m56714a()).booleanValue() && sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2();
    }

    /* JADX INFO: renamed from: d */
    public void m55939d(Runnable runnable, String str) {
        try {
            if (C20104e.f75528a.mo55996a()) {
                runnable.run();
                return;
            }
            C20121k0 c20121k0 = (C20121k0) this.f75381f;
            ((Handler) c20121k0.f75591a).post(new RunnableC1283d(this, runnable, str, 11));
        } catch (Throwable unused) {
            if (str != null) {
                ((SentryAndroidOptions) this.f75378c).getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    public C20067d(ExecutorServiceC4794b executorServiceC4794b, ExecutorServiceC4794b executorServiceC4794b2, ExecutorServiceC4794b executorServiceC4794b3, ExecutorServiceC4794b executorServiceC4794b4, C40787l c40787l, C40787l c40787l2) {
        this.f75382g = AbstractC35057c.m110829a(150, new C0928c(this, 28));
        this.f75376a = executorServiceC4794b;
        this.f75377b = executorServiceC4794b2;
        this.f75378c = executorServiceC4794b3;
        this.f75379d = executorServiceC4794b4;
        this.f75380e = c40787l;
        this.f75381f = c40787l2;
    }
}
