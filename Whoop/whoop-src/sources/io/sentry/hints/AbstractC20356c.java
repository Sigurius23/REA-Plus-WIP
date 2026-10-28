package io.sentry.hints;

import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.protocol.C20501v;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.hints.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20356c implements InterfaceC20359f {

    /* JADX INFO: renamed from: w */
    public final CountDownLatch f76388w = new CountDownLatch(1);

    /* JADX INFO: renamed from: x */
    public final long f76389x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC20602v0 f76390y;

    public AbstractC20356c(long j7, InterfaceC20602v0 interfaceC20602v0) {
        this.f76389x = j7;
        this.f76390y = interfaceC20602v0;
    }

    @Override // io.sentry.hints.InterfaceC20359f
    /* JADX INFO: renamed from: e */
    public final boolean mo56038e() {
        try {
            return this.f76388w.await(this.f76389x, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            this.f76390y.mo16060j(EnumC20436n5.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e5);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo56063f(C20501v c20501v);

    /* JADX INFO: renamed from: g */
    public abstract void mo56064g(C20501v c20501v);
}
