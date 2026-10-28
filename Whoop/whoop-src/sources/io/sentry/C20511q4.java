package io.sentry;

import io.sentry.util.AbstractC20587i;

/* JADX INFO: renamed from: io.sentry.q4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20511q4 implements InterfaceC20606v4 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20606v4 f76853a;

    public C20511q4() {
        if (AbstractC20587i.f77090a || !AbstractC20587i.f77091b) {
            this.f76853a = new C20636y5();
        } else {
            this.f76853a = new C20403k5();
        }
    }

    @Override // io.sentry.InterfaceC20606v4
    public final AbstractC20576u4 now() {
        return this.f76853a.now();
    }
}
