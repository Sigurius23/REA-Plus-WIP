package io.sentry;

import io.sentry.hints.AbstractC20356c;
import io.sentry.hints.InterfaceC20362i;
import io.sentry.hints.InterfaceC20365l;
import io.sentry.protocol.C20501v;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: io.sentry.o7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20448o7 extends AbstractC20356c implements InterfaceC20362i, InterfaceC20365l {

    /* JADX INFO: renamed from: z */
    public final AtomicReference f76545z;

    public C20448o7(long j7, InterfaceC20602v0 interfaceC20602v0) {
        super(j7, interfaceC20602v0);
        this.f76545z = new AtomicReference();
    }

    @Override // io.sentry.hints.AbstractC20356c
    /* JADX INFO: renamed from: f */
    public final boolean mo56063f(C20501v c20501v) {
        C20501v c20501v2 = (C20501v) this.f76545z.get();
        return c20501v2 != null && c20501v2.equals(c20501v);
    }

    @Override // io.sentry.hints.AbstractC20356c
    /* JADX INFO: renamed from: g */
    public final void mo56064g(C20501v c20501v) {
        this.f76545z.set(c20501v);
    }
}
