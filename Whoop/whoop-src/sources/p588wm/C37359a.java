package p588wm;

import p499t9.C33624d;

/* JADX INFO: renamed from: wm.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C37359a implements InterfaceC37374p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC37360b f159830a;

    /* JADX INFO: renamed from: b */
    public final long f159831b;

    /* JADX INFO: renamed from: c */
    public final long f159832c;

    /* JADX INFO: renamed from: d */
    public final long f159833d;

    /* JADX INFO: renamed from: e */
    public final long f159834e;

    /* JADX INFO: renamed from: f */
    public final long f159835f;

    public C37359a(InterfaceC37360b interfaceC37360b, long j7, long j13, long j14, long j15, long j16) {
        this.f159830a = interfaceC37360b;
        this.f159831b = j7;
        this.f159832c = j13;
        this.f159833d = j14;
        this.f159834e = j15;
        this.f159835f = j16;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: c */
    public final C37373o mo3112c(long j7) {
        C37375q c37375q = new C37375q(j7, C33624d.m106248b(this.f159830a.mo106244d(j7), 0L, this.f159832c, this.f159833d, this.f159834e, this.f159835f));
        return new C37373o(c37375q, c37375q);
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: e */
    public final boolean mo3113e() {
        return true;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: f */
    public final long mo3114f() {
        return this.f159831b;
    }
}
