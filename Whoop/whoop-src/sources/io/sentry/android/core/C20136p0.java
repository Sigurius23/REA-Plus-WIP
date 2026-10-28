package io.sentry.android.core;

import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.hints.InterfaceC20357d;
import io.sentry.hints.InterfaceC20359f;
import io.sentry.hints.InterfaceC20361h;
import io.sentry.hints.InterfaceC20364k;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.android.core.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20136p0 implements InterfaceC20357d, InterfaceC20361h, InterfaceC20364k, InterfaceC20359f {

    /* JADX INFO: renamed from: E */
    public final InterfaceC20602v0 f75636E;

    /* JADX INFO: renamed from: w */
    public boolean f75637w;

    /* JADX INFO: renamed from: x */
    public boolean f75638x;

    /* JADX INFO: renamed from: y */
    public CountDownLatch f75639y;

    /* JADX INFO: renamed from: z */
    public final long f75640z;

    public C20136p0(long j7, InterfaceC20602v0 interfaceC20602v0) {
        m56039f();
        this.f75640z = j7;
        AbstractC29125c.m88510S(interfaceC20602v0, "ILogger is required.");
        this.f75636E = interfaceC20602v0;
    }

    @Override // io.sentry.hints.InterfaceC20361h
    /* JADX INFO: renamed from: a */
    public final boolean mo56034a() {
        return this.f75637w;
    }

    @Override // io.sentry.hints.InterfaceC20364k
    /* JADX INFO: renamed from: b */
    public final boolean mo56035b() {
        return this.f75638x;
    }

    @Override // io.sentry.hints.InterfaceC20364k
    /* JADX INFO: renamed from: c */
    public final void mo56036c(boolean z4) {
        this.f75638x = z4;
        this.f75639y.countDown();
    }

    @Override // io.sentry.hints.InterfaceC20361h
    /* JADX INFO: renamed from: d */
    public final void mo56037d(boolean z4) {
        this.f75637w = z4;
    }

    @Override // io.sentry.hints.InterfaceC20359f
    /* JADX INFO: renamed from: e */
    public final boolean mo56038e() {
        try {
            return this.f75639y.await(this.f75640z, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            this.f75636E.mo16060j(EnumC20436n5.ERROR, "Exception while awaiting on lock.", e5);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m56039f() {
        this.f75639y = new CountDownLatch(1);
        this.f75637w = false;
        this.f75638x = false;
    }
}
