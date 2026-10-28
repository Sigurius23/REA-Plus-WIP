package io.sentry;

import io.sentry.hints.InterfaceC20357d;
import io.sentry.hints.InterfaceC20359f;
import io.sentry.hints.InterfaceC20361h;
import io.sentry.hints.InterfaceC20364k;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C20571u implements InterfaceC20357d, InterfaceC20361h, InterfaceC20364k, InterfaceC20359f {

    /* JADX INFO: renamed from: E */
    public final InterfaceC20602v0 f77051E;

    /* JADX INFO: renamed from: F */
    public final String f77052F;

    /* JADX INFO: renamed from: G */
    public final Queue f77053G;

    /* JADX INFO: renamed from: w */
    public boolean f77054w = false;

    /* JADX INFO: renamed from: x */
    public boolean f77055x = false;

    /* JADX INFO: renamed from: y */
    public final CountDownLatch f77056y = new CountDownLatch(1);

    /* JADX INFO: renamed from: z */
    public final long f77057z;

    public C20571u(long j7, InterfaceC20602v0 interfaceC20602v0, String str, C20396j7 c20396j7) {
        this.f77057z = j7;
        this.f77052F = str;
        this.f77053G = c20396j7;
        this.f77051E = interfaceC20602v0;
    }

    @Override // io.sentry.hints.InterfaceC20361h
    /* JADX INFO: renamed from: a */
    public final boolean mo56034a() {
        return this.f77054w;
    }

    @Override // io.sentry.hints.InterfaceC20364k
    /* JADX INFO: renamed from: b */
    public final boolean mo56035b() {
        return this.f77055x;
    }

    @Override // io.sentry.hints.InterfaceC20364k
    /* JADX INFO: renamed from: c */
    public final void mo56036c(boolean z4) {
        this.f77055x = z4;
        this.f77056y.countDown();
    }

    @Override // io.sentry.hints.InterfaceC20361h
    /* JADX INFO: renamed from: d */
    public final void mo56037d(boolean z4) {
        this.f77054w = z4;
    }

    @Override // io.sentry.hints.InterfaceC20359f
    /* JADX INFO: renamed from: e */
    public final boolean mo56038e() {
        try {
            return this.f77056y.await(this.f77057z, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            this.f77051E.mo16060j(EnumC20436n5.ERROR, "Exception while awaiting on lock.", e5);
            return false;
        }
    }
}
