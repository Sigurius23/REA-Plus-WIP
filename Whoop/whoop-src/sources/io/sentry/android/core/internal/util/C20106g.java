package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p270k2.C22128b;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C20106g {

    /* JADX INFO: renamed from: a */
    public long f75533a;

    /* JADX INFO: renamed from: b */
    public int f75534b;

    /* JADX INFO: renamed from: c */
    public Object f75535c;

    /* JADX INFO: renamed from: d */
    public Object f75536d;

    /* JADX INFO: renamed from: e */
    public final Object f75537e;

    public C20106g(long j7, int i13) {
        this.f75536d = new AtomicInteger(0);
        this.f75537e = new AtomicLong(0L);
        this.f75535c = C20103d.f75527w;
        this.f75533a = j7;
        this.f75534b = i13 <= 0 ? 1 : i13;
    }

    /* JADX INFO: renamed from: a */
    public boolean m56000a() {
        AtomicInteger atomicInteger = (AtomicInteger) this.f75536d;
        ((C20103d) this.f75535c).getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = (AtomicLong) this.f75537e;
        if (atomicLong.get() == 0 || atomicLong.get() + this.f75533a <= jUptimeMillis) {
            atomicInteger.set(0);
            atomicLong.set(jUptimeMillis);
            return false;
        }
        if (atomicInteger.incrementAndGet() < this.f75534b) {
            return false;
        }
        atomicInteger.set(0);
        return true;
    }

    public C20106g() {
        EnumC39181m enumC39181m = EnumC39181m.f168423w;
        this.f75533a = 0L;
        this.f75534b = 0;
        this.f75537e = new C22128b();
    }
}
