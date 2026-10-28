package qc3;

import aa3.C0656u0;
import sc3.InterfaceC32397k;

/* JADX INFO: renamed from: qc3.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30232d0 implements InterfaceC30225b, InterfaceC30231d {

    /* JADX INFO: renamed from: a */
    public final C0656u0 f123770a;

    public C30232d0(C0656u0 c0656u0) {
        this.f123770a = c0656u0;
    }

    @Override // qc3.InterfaceC30225b
    /* JADX INFO: renamed from: c */
    public final C0656u0 mo92501c() {
        return this.f123770a;
    }

    @Override // qc3.InterfaceC30231d
    /* JADX INFO: renamed from: d */
    public final void mo92502d(InterfaceC32397k interfaceC32397k) {
        this.f123770a.m1637f(interfaceC32397k);
    }

    @Override // qc3.InterfaceC30225b
    /* JADX INFO: renamed from: f */
    public final InterfaceC30225b mo92503f() {
        return new C30232d0(new C0656u0(7));
    }
}
