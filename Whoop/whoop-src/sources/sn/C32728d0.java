package sn;

import p527um.C35073c;
import p619xl.C38445a;

/* JADX INFO: renamed from: sn.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32728d0 implements InterfaceC32756r0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC32756r0 f136051w;

    /* JADX INFO: renamed from: x */
    public final long f136052x;

    public C32728d0(InterfaceC32756r0 interfaceC32756r0, long j7) {
        this.f136051w = interfaceC32756r0;
        this.f136052x = j7;
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: b */
    public final boolean mo79412b() {
        return this.f136051w.mo79412b();
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: c */
    public final void mo79413c() {
        this.f136051w.mo79413c();
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: e */
    public final int mo79415e(C38445a c38445a, C35073c c35073c, int i13) {
        int iMo79415e = this.f136051w.mo79415e(c38445a, c35073c, i13);
        if (iMo79415e == -4) {
            c35073c.f148797F = Math.max(0L, c35073c.f148797F + this.f136052x);
        }
        return iMo79415e;
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: j */
    public final int mo79416j(long j7) {
        return this.f136051w.mo79416j(j7 - this.f136052x);
    }
}
