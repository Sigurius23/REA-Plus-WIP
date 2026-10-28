package io.sentry;

import io.sentry.util.C20579a;

/* JADX INFO: renamed from: io.sentry.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C20535s implements InterfaceC20368i1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76951w;

    /* JADX INFO: renamed from: x */
    public final Object f76952x;

    public /* synthetic */ C20535s(Object obj, int i13) {
        this.f76951w = i13;
        this.f76952x = obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.f76951w) {
            case 0:
                C20543t.f76997a.set((InterfaceC20308d1) this.f76952x);
                break;
            default:
                ((C20579a) this.f76952x).unlock();
                break;
        }
    }
}
