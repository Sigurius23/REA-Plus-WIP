package io.sentry;

/* JADX INFO: renamed from: io.sentry.u1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20573u1 implements InterfaceC20639z0 {

    /* JADX INFO: renamed from: a */
    public final Runtime f77058a = Runtime.getRuntime();

    @Override // io.sentry.InterfaceC20639z0
    /* JADX INFO: renamed from: a */
    public final void mo55960a() {
    }

    @Override // io.sentry.InterfaceC20639z0
    /* JADX INFO: renamed from: b */
    public final void mo55961b(C20422m3 c20422m3) {
        Runtime runtime = this.f77058a;
        c20422m3.f76499b = Long.valueOf(runtime.totalMemory() - runtime.freeMemory());
    }
}
