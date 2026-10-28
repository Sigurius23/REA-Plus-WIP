package qc3;

import aa3.C0656u0;
import sc3.InterfaceC32397k;

/* JADX INFO: renamed from: qc3.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C30280x implements InterfaceC30225b, InterfaceC30228c {

    /* JADX INFO: renamed from: a */
    public final C0656u0 f123837a;

    public C30280x(C0656u0 c0656u0) {
        this.f123837a = c0656u0;
    }

    @Override // qc3.InterfaceC30225b
    /* JADX INFO: renamed from: c */
    public final C0656u0 mo92501c() {
        return this.f123837a;
    }

    @Override // qc3.InterfaceC30225b
    /* JADX INFO: renamed from: f */
    public final InterfaceC30225b mo92503f() {
        return new C30280x(new C0656u0(7));
    }

    @Override // qc3.InterfaceC30228c
    /* JADX INFO: renamed from: i */
    public final void mo92504i(InterfaceC32397k interfaceC32397k) {
        this.f123837a.m1637f(interfaceC32397k);
    }
}
