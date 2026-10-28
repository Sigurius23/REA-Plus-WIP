package sn;

import p465rm.C31518b0;
import p465rm.C31521c0;
import p527um.C35073c;
import p619xl.C38445a;

/* JADX INFO: renamed from: sn.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C32723b implements InterfaceC32756r0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC32756r0 f136032w;

    /* JADX INFO: renamed from: x */
    public boolean f136033x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C32725c f136034y;

    public C32723b(C32725c c32725c, InterfaceC32756r0 interfaceC32756r0) {
        this.f136034y = c32725c;
        this.f136032w = interfaceC32756r0;
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: b */
    public final boolean mo79412b() {
        return !this.f136034y.m102706l() && this.f136032w.mo79412b();
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: c */
    public final void mo79413c() {
        this.f136032w.mo79413c();
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: e */
    public final int mo79415e(C38445a c38445a, C35073c c35073c, int i13) {
        C32725c c32725c = this.f136034y;
        if (c32725c.m102706l()) {
            return -3;
        }
        if (this.f136033x) {
            c35073c.f2052x = 4;
            return -4;
        }
        int iMo79415e = this.f136032w.mo79415e(c38445a, c35073c, i13);
        if (iMo79415e != -5) {
            long j7 = c32725c.f136038F;
            if (j7 == Long.MIN_VALUE || ((iMo79415e != -4 || c35073c.f148797F < j7) && !(iMo79415e == -3 && c32725c.mo91533m() == Long.MIN_VALUE && !c35073c.f148796E))) {
                return iMo79415e;
            }
            c35073c.mo49690o();
            c35073c.f2052x = 4;
            this.f136033x = true;
            return -4;
        }
        C31521c0 c31521c0 = (C31521c0) c38445a.f164637y;
        c31521c0.getClass();
        int i14 = c31521c0.f130094c0;
        int i15 = c31521c0.f130093b0;
        if (i15 == 0 && i14 == 0) {
            return -5;
        }
        if (c32725c.f136037E != 0) {
            i15 = 0;
        }
        if (c32725c.f136038F != Long.MIN_VALUE) {
            i14 = 0;
        }
        C31518b0 c31518b0M97113a = c31521c0.m97113a();
        c31518b0M97113a.f130033A = i15;
        c31518b0M97113a.f130034B = i14;
        c38445a.f164637y = new C31521c0(c31518b0M97113a);
        return -5;
    }

    @Override // sn.InterfaceC32756r0
    /* JADX INFO: renamed from: j */
    public final int mo79416j(long j7) {
        if (this.f136034y.m102706l()) {
            return -3;
        }
        return this.f136032w.mo79416j(j7);
    }
}
