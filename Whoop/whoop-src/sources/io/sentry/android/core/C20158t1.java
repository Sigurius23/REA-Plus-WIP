package io.sentry.android.core;

import io.sentry.InterfaceC20602v0;
import io.sentry.hints.AbstractC20356c;
import io.sentry.hints.InterfaceC20355b;
import io.sentry.hints.InterfaceC20360g;
import io.sentry.protocol.C20501v;

/* JADX INFO: renamed from: io.sentry.android.core.t1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20158t1 extends AbstractC20356c implements InterfaceC20355b, InterfaceC20360g {

    /* JADX INFO: renamed from: E */
    public final boolean f75727E;

    /* JADX INFO: renamed from: z */
    public final long f75728z;

    public C20158t1(long j7, InterfaceC20602v0 interfaceC20602v0, long j13, boolean z4) {
        super(j7, interfaceC20602v0);
        this.f75728z = j13;
        this.f75727E = z4;
    }

    @Override // io.sentry.hints.InterfaceC20355b
    /* JADX INFO: renamed from: a */
    public final boolean mo56062a() {
        return this.f75727E;
    }

    @Override // io.sentry.hints.AbstractC20356c
    /* JADX INFO: renamed from: f */
    public final boolean mo56063f(C20501v c20501v) {
        return true;
    }

    @Override // io.sentry.hints.AbstractC20356c
    /* JADX INFO: renamed from: g */
    public final void mo56064g(C20501v c20501v) {
    }
}
