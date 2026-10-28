package qc3;

import aa3.C0656u0;
import sc3.C32389c;

/* JADX INFO: renamed from: qc3.j1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30251j1 implements InterfaceC30225b, InterfaceC30234e {

    /* JADX INFO: renamed from: a */
    public final C0656u0 f123793a;

    public C30251j1(C0656u0 c0656u0) {
        this.f123793a = c0656u0;
    }

    @Override // qc3.InterfaceC30234e
    /* JADX INFO: renamed from: b */
    public final void mo92506b(C32389c c32389c) {
        this.f123793a.m1637f(c32389c);
    }

    @Override // qc3.InterfaceC30225b
    /* JADX INFO: renamed from: c */
    public final C0656u0 mo92501c() {
        return this.f123793a;
    }

    @Override // qc3.InterfaceC30225b
    /* JADX INFO: renamed from: f */
    public final InterfaceC30225b mo92503f() {
        return new C30251j1(new C0656u0(7));
    }
}
