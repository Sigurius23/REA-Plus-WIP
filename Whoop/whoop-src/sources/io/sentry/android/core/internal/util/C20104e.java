package io.sentry.android.core.internal.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import io.sentry.util.thread.InterfaceC20598a;
import p027b3.RunnableC2411n;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C20104e implements InterfaceC20598a {

    /* JADX INFO: renamed from: a */
    public static final C20104e f75528a;

    /* JADX INFO: renamed from: b */
    public static volatile long f75529b;

    static {
        C20104e c20104e = new C20104e();
        new Handler(Looper.getMainLooper()).post(new RunnableC2411n(2));
        f75528a = c20104e;
        f75529b = Process.myTid();
    }

    /* JADX INFO: renamed from: d */
    public static long m55995d(Thread thread) {
        return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
    }

    @Override // io.sentry.util.thread.InterfaceC20598a
    /* JADX INFO: renamed from: a */
    public final boolean mo55996a() {
        return m55995d(Looper.getMainLooper().getThread()) == m55995d(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.InterfaceC20598a
    /* JADX INFO: renamed from: b */
    public final String mo55997b() {
        return mo55996a() ? "main" : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.InterfaceC20598a
    /* JADX INFO: renamed from: c */
    public final long mo55998c() {
        return Process.myTid();
    }
}
