package p299l9;

import p010a9.C0580e;
import p516u8.C34608o;
import p516u8.C34610p;
import qg3.C30352d;

/* JADX INFO: renamed from: l9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C23484b implements InterfaceC23540z0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC23540z0 f92966w;

    /* JADX INFO: renamed from: x */
    public boolean f92967x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23487c f92968y;

    public C23484b(C23487c c23487c, InterfaceC23540z0 interfaceC23540z0) {
        this.f92968y = c23487c;
        this.f92966w = interfaceC23540z0;
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: b */
    public final boolean mo36169b() {
        return !this.f92968y.m68052g() && this.f92966w.mo36169b();
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: c */
    public final void mo36170c() {
        this.f92966w.mo36170c();
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: j */
    public final int mo36171j(long j7) {
        if (this.f92968y.m68052g()) {
            return -3;
        }
        return this.f92966w.mo36171j(j7);
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: l */
    public final int mo36172l(C30352d c30352d, C0580e c0580e, int i13) {
        C23487c c23487c = this.f92968y;
        if (c23487c.m68052g()) {
            return -3;
        }
        if (this.f92967x) {
            c0580e.f2052x = 4;
            return -4;
        }
        long jMo36129m = c23487c.mo36129m();
        int iMo36172l = this.f92966w.mo36172l(c30352d, c0580e, i13);
        if (iMo36172l != -5) {
            long j7 = c23487c.f92970F;
            if (j7 == Long.MIN_VALUE || ((iMo36172l != -4 || c0580e.f2065G < j7) && !(iMo36172l == -3 && jMo36129m == Long.MIN_VALUE && !c0580e.f2064F))) {
                return iMo36172l;
            }
            c0580e.mo1506o();
            c0580e.f2052x = 4;
            this.f92967x = true;
            return -4;
        }
        C34610p c34610p = (C34610p) c30352d.f124536y;
        c34610p.getClass();
        int i14 = c34610p.f145763H;
        int i15 = c34610p.f145762G;
        if (i15 == 0 && i14 == 0) {
            return -5;
        }
        if (c23487c.f92969E != 0) {
            i15 = 0;
        }
        if (c23487c.f92970F != Long.MIN_VALUE) {
            i14 = 0;
        }
        C34608o c34608oM109410a = c34610p.m109410a();
        c34608oM109410a.f145722F = i15;
        c34608oM109410a.f145723G = i14;
        c30352d.f124536y = new C34610p(c34608oM109410a);
        return -5;
    }
}
