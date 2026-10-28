package io.sentry;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: io.sentry.b3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20261b3 implements InterfaceC20347h1 {

    /* JADX INFO: renamed from: a */
    public static final C20261b3 f76085a = new C20261b3();

    @Override // io.sentry.InterfaceC20347h1
    /* JADX INFO: renamed from: a */
    public final void mo56216a(long j7) {
    }

    @Override // io.sentry.InterfaceC20347h1
    /* JADX INFO: renamed from: b */
    public final void mo56217b() {
    }

    @Override // io.sentry.InterfaceC20347h1
    /* JADX INFO: renamed from: c */
    public final Future mo56218c(Runnable runnable, long j7) {
        return new FutureTask(new CallableC20346h0(1));
    }

    @Override // io.sentry.InterfaceC20347h1
    public final boolean isClosed() {
        return false;
    }

    @Override // io.sentry.InterfaceC20347h1
    public final Future submit(Runnable runnable) {
        return new FutureTask(new CallableC20346h0(1));
    }
}
