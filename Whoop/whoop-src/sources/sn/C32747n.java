package sn;

import io.InterfaceC20035o;
import p284ko.C22631o;
import p309lo.AbstractC24567y;
import p465rm.C31537h1;

/* JADX INFO: renamed from: sn.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C32747n implements InterfaceC32757s, InterfaceC32755r {

    /* JADX INFO: renamed from: E */
    public InterfaceC32757s f136171E;

    /* JADX INFO: renamed from: F */
    public InterfaceC32755r f136172F;

    /* JADX INFO: renamed from: G */
    public long f136173G = -9223372036854775807L;

    /* JADX INFO: renamed from: w */
    public final C32763v f136174w;

    /* JADX INFO: renamed from: x */
    public final long f136175x;

    /* JADX INFO: renamed from: y */
    public final C22631o f136176y;

    /* JADX INFO: renamed from: z */
    public AbstractC32721a f136177z;

    public C32747n(C32763v c32763v, C22631o c22631o, long j7) {
        this.f136174w = c32763v;
        this.f136176y = c22631o;
        this.f136175x = j7;
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: a */
    public final boolean mo91531a() {
        InterfaceC32757s interfaceC32757s = this.f136171E;
        return interfaceC32757s != null && interfaceC32757s.mo91531a();
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: b */
    public final void mo102699b(InterfaceC32755r interfaceC32755r, long j7) {
        this.f136172F = interfaceC32755r;
        InterfaceC32757s interfaceC32757s = this.f136171E;
        if (interfaceC32757s != null) {
            long j13 = this.f136173G;
            if (j13 == -9223372036854775807L) {
                j13 = this.f136175x;
            }
            interfaceC32757s.mo102699b(this, j13);
        }
    }

    @Override // sn.InterfaceC32758s0
    /* JADX INFO: renamed from: c */
    public final void mo97274c(InterfaceC32760t0 interfaceC32760t0) {
        InterfaceC32755r interfaceC32755r = this.f136172F;
        int i13 = AbstractC24567y.f95875a;
        interfaceC32755r.mo97274c(this);
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: d */
    public final long mo91532d() {
        InterfaceC32757s interfaceC32757s = this.f136171E;
        int i13 = AbstractC24567y.f95875a;
        return interfaceC32757s.mo91532d();
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: e */
    public final long mo102700e(long j7) {
        InterfaceC32757s interfaceC32757s = this.f136171E;
        int i13 = AbstractC24567y.f95875a;
        return interfaceC32757s.mo102700e(j7);
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: f */
    public final long mo102701f() {
        InterfaceC32757s interfaceC32757s = this.f136171E;
        int i13 = AbstractC24567y.f95875a;
        return interfaceC32757s.mo102701f();
    }

    @Override // sn.InterfaceC32755r
    /* JADX INFO: renamed from: g */
    public final void mo97282g(InterfaceC32757s interfaceC32757s) {
        InterfaceC32755r interfaceC32755r = this.f136172F;
        int i13 = AbstractC24567y.f95875a;
        interfaceC32755r.mo97282g(this);
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: h */
    public final void mo102702h() {
        InterfaceC32757s interfaceC32757s = this.f136171E;
        if (interfaceC32757s != null) {
            interfaceC32757s.mo102702h();
            return;
        }
        AbstractC32721a abstractC32721a = this.f136177z;
        if (abstractC32721a != null) {
            abstractC32721a.mo102690g();
        }
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: i */
    public final void mo102703i(long j7) {
        InterfaceC32757s interfaceC32757s = this.f136171E;
        int i13 = AbstractC24567y.f95875a;
        interfaceC32757s.mo102703i(j7);
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: j */
    public final long mo102704j(InterfaceC20035o[] interfaceC20035oArr, boolean[] zArr, InterfaceC32756r0[] interfaceC32756r0Arr, boolean[] zArr2, long j7) {
        long j13;
        long j14 = this.f136173G;
        if (j14 == -9223372036854775807L || j7 != this.f136175x) {
            j13 = j7;
        } else {
            this.f136173G = -9223372036854775807L;
            j13 = j14;
        }
        InterfaceC32757s interfaceC32757s = this.f136171E;
        int i13 = AbstractC24567y.f95875a;
        return interfaceC32757s.mo102704j(interfaceC20035oArr, zArr, interfaceC32756r0Arr, zArr2, j13);
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: k */
    public final C32768x0 mo102705k() {
        InterfaceC32757s interfaceC32757s = this.f136171E;
        int i13 = AbstractC24567y.f95875a;
        return interfaceC32757s.mo102705k();
    }

    /* JADX INFO: renamed from: l */
    public final void m102725l(C32763v c32763v) {
        long j7 = this.f136173G;
        if (j7 == -9223372036854775807L) {
            j7 = this.f136175x;
        }
        AbstractC32721a abstractC32721a = this.f136177z;
        abstractC32721a.getClass();
        InterfaceC32757s interfaceC32757sMo102684a = abstractC32721a.mo102684a(c32763v, this.f136176y, j7);
        this.f136171E = interfaceC32757sMo102684a;
        if (this.f136172F != null) {
            interfaceC32757sMo102684a.mo102699b(this, j7);
        }
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: m */
    public final long mo91533m() {
        InterfaceC32757s interfaceC32757s = this.f136171E;
        int i13 = AbstractC24567y.f95875a;
        return interfaceC32757s.mo91533m();
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: n */
    public final void mo91534n(long j7) {
        InterfaceC32757s interfaceC32757s = this.f136171E;
        int i13 = AbstractC24567y.f95875a;
        interfaceC32757s.mo91534n(j7);
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: u */
    public final boolean mo91536u(long j7) {
        InterfaceC32757s interfaceC32757s = this.f136171E;
        return interfaceC32757s != null && interfaceC32757s.mo91536u(j7);
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: v */
    public final long mo102707v(long j7, C31537h1 c31537h1) {
        InterfaceC32757s interfaceC32757s = this.f136171E;
        int i13 = AbstractC24567y.f95875a;
        return interfaceC32757s.mo102707v(j7, c31537h1);
    }
}
