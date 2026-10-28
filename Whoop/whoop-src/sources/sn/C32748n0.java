package sn;

import android.net.Uri;
import android.os.Looper;
import g73.C15556d;
import p078d1.C11457j;
import p284ko.C22631o;
import p284ko.InterfaceC22625j0;
import p284ko.InterfaceC22626k;
import p284ko.InterfaceC22628l;
import p309lo.AbstractC24543a;
import p465rm.AbstractC31558o1;
import p465rm.C31539i0;
import p465rm.C31545k0;
import p465rm.C31559p;
import p508ty.C34249c;
import p556vm.InterfaceC36141h;
import p588wm.C37365g;
import q30.C29938w0;
import sm.C32713f;

/* JADX INFO: renamed from: sn.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32748n0 extends AbstractC32721a {

    /* JADX INFO: renamed from: h */
    public final C31545k0 f136178h;

    /* JADX INFO: renamed from: i */
    public final C31539i0 f136179i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC22626k f136180j;

    /* JADX INFO: renamed from: k */
    public final C31559p f136181k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC36141h f136182l;

    /* JADX INFO: renamed from: m */
    public final C15556d f136183m;

    /* JADX INFO: renamed from: n */
    public final int f136184n;

    /* JADX INFO: renamed from: o */
    public boolean f136185o;

    /* JADX INFO: renamed from: p */
    public long f136186p;

    /* JADX INFO: renamed from: q */
    public boolean f136187q;

    /* JADX INFO: renamed from: r */
    public boolean f136188r;

    /* JADX INFO: renamed from: s */
    public InterfaceC22625j0 f136189s;

    public C32748n0(C31545k0 c31545k0, C11457j c11457j, C31559p c31559p, InterfaceC36141h interfaceC36141h, C15556d c15556d, int i13) {
        C31539i0 c31539i0 = c31545k0.f130206x;
        c31539i0.getClass();
        this.f136179i = c31539i0;
        this.f136178h = c31545k0;
        this.f136180j = c11457j;
        this.f136181k = c31559p;
        this.f136182l = interfaceC36141h;
        this.f136183m = c15556d;
        this.f136184n = i13;
        this.f136185o = true;
        this.f136186p = -9223372036854775807L;
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: a */
    public final InterfaceC32757s mo102684a(C32763v c32763v, C22631o c22631o, long j7) {
        InterfaceC22628l interfaceC22628lCreateDataSource = this.f136180j.createDataSource();
        InterfaceC22625j0 interfaceC22625j0 = this.f136189s;
        if (interfaceC22625j0 != null) {
            interfaceC22628lCreateDataSource.mo65561y(interfaceC22625j0);
        }
        Uri uri = this.f136179i.f130173a;
        AbstractC24543a.m71574j(this.f136031g);
        return new C32742k0(uri, interfaceC22628lCreateDataSource, new C29938w0((C37365g) this.f136181k.f130337x), this.f136182l, new C32770z(this.f136028d.f136277c, 0, c32763v), this.f136183m, new C32770z(this.f136027c.f136277c, 0, c32763v), this, c22631o, this.f136184n);
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: f */
    public final C31545k0 mo102689f() {
        return this.f136178h;
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: g */
    public final void mo102690g() {
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: i */
    public final void mo102692i(InterfaceC22625j0 interfaceC22625j0) {
        this.f136189s = interfaceC22625j0;
        InterfaceC36141h interfaceC36141h = this.f136182l;
        interfaceC36141h.prepare();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C32713f c32713f = this.f136031g;
        AbstractC24543a.m71574j(c32713f);
        interfaceC36141h.mo114966c(looperMyLooper, c32713f);
        m102726p();
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: k */
    public final void mo102694k(InterfaceC32757s interfaceC32757s) {
        C32742k0 c32742k0 = (C32742k0) interfaceC32757s;
        if (c32742k0.f136139U) {
            for (C32754q0 c32754q0 : c32742k0.f136136R) {
                c32754q0.m102736g();
                C34249c c34249c = c32754q0.f136219h;
                if (c34249c != null) {
                    c34249c.m108304u(c32754q0.f136216e);
                    c32754q0.f136219h = null;
                    c32754q0.f136218g = null;
                }
            }
        }
        c32742k0.f136128J.m65555c(c32742k0);
        c32742k0.f136133O.removeCallbacksAndMessages(null);
        c32742k0.f136134P = null;
        c32742k0.f136155k0 = true;
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: m */
    public final void mo102696m() {
        this.f136182l.release();
    }

    /* JADX INFO: renamed from: p */
    public final void m102726p() {
        long j7 = this.f136186p;
        boolean z4 = this.f136187q;
        boolean z13 = this.f136188r;
        C31545k0 c31545k0 = this.f136178h;
        AbstractC31558o1 c32764v0 = new C32764v0(-9223372036854775807L, -9223372036854775807L, j7, j7, 0L, 0L, z4, false, false, null, c31545k0, z13 ? c31545k0.f130207y : null);
        if (this.f136185o) {
            c32764v0 = new C32744l0(c32764v0);
        }
        m102693j(c32764v0);
    }

    /* JADX INFO: renamed from: q */
    public final void m102727q(long j7, boolean z4, boolean z13) {
        if (j7 == -9223372036854775807L) {
            j7 = this.f136186p;
        }
        if (!this.f136185o && this.f136186p == j7 && this.f136187q == z4 && this.f136188r == z13) {
            return;
        }
        this.f136186p = j7;
        this.f136187q = z4;
        this.f136188r = z13;
        this.f136185o = false;
        m102726p();
    }
}
