package p123en;

import p309lo.AbstractC24567y;
import p588wm.C37373o;
import p588wm.C37375q;
import p588wm.InterfaceC37374p;

/* JADX INFO: renamed from: en.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C13354a implements InterfaceC37374p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13355b f46668a;

    public C13354a(C13355b c13355b) {
        this.f46668a = c13355b;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: c */
    public final C37373o mo3112c(long j7) {
        C13355b c13355b = this.f46668a;
        long j13 = (((long) ((AbstractC13361h) c13355b.f46677M).f46701f) * j7) / 1000000;
        long j14 = c13355b.f46679x;
        long j15 = c13355b.f46680y;
        C37375q c37375q = new C37375q(j7, AbstractC24567y.m71678i(((((j15 - j14) * j13) / c13355b.f46669E) + j14) - 30000, j14, j15 - 1));
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
        C13355b c13355b = this.f46668a;
        return (c13355b.f46669E * 1000000) / ((long) ((AbstractC13361h) c13355b.f46677M).f46701f);
    }
}
