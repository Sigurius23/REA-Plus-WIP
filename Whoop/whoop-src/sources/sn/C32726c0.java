package sn;

import io.InterfaceC20035o;
import p465rm.C31537h1;

/* JADX INFO: renamed from: sn.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32726c0 implements InterfaceC32757s, InterfaceC32755r {

    /* JADX INFO: renamed from: w */
    public final InterfaceC32757s f136044w;

    /* JADX INFO: renamed from: x */
    public final long f136045x;

    /* JADX INFO: renamed from: y */
    public InterfaceC32755r f136046y;

    public C32726c0(InterfaceC32757s interfaceC32757s, long j7) {
        this.f136044w = interfaceC32757s;
        this.f136045x = j7;
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: a */
    public final boolean mo91531a() {
        return this.f136044w.mo91531a();
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: b */
    public final void mo102699b(InterfaceC32755r interfaceC32755r, long j7) {
        this.f136046y = interfaceC32755r;
        this.f136044w.mo102699b(this, j7 - this.f136045x);
    }

    @Override // sn.InterfaceC32758s0
    /* JADX INFO: renamed from: c */
    public final void mo97274c(InterfaceC32760t0 interfaceC32760t0) {
        InterfaceC32755r interfaceC32755r = this.f136046y;
        interfaceC32755r.getClass();
        interfaceC32755r.mo97274c(this);
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: d */
    public final long mo91532d() {
        long jMo91532d = this.f136044w.mo91532d();
        if (jMo91532d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo91532d + this.f136045x;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: e */
    public final long mo102700e(long j7) {
        long j13 = this.f136045x;
        return this.f136044w.mo102700e(j7 - j13) + j13;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: f */
    public final long mo102701f() {
        long jMo102701f = this.f136044w.mo102701f();
        if (jMo102701f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jMo102701f + this.f136045x;
    }

    @Override // sn.InterfaceC32755r
    /* JADX INFO: renamed from: g */
    public final void mo97282g(InterfaceC32757s interfaceC32757s) {
        InterfaceC32755r interfaceC32755r = this.f136046y;
        interfaceC32755r.getClass();
        interfaceC32755r.mo97282g(this);
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: h */
    public final void mo102702h() {
        this.f136044w.mo102702h();
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: i */
    public final void mo102703i(long j7) {
        this.f136044w.mo102703i(j7 - this.f136045x);
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: j */
    public final long mo102704j(InterfaceC20035o[] interfaceC20035oArr, boolean[] zArr, InterfaceC32756r0[] interfaceC32756r0Arr, boolean[] zArr2, long j7) {
        InterfaceC32756r0[] interfaceC32756r0Arr2 = new InterfaceC32756r0[interfaceC32756r0Arr.length];
        int i13 = 0;
        while (true) {
            InterfaceC32756r0 interfaceC32756r0 = null;
            if (i13 >= interfaceC32756r0Arr.length) {
                break;
            }
            C32728d0 c32728d0 = (C32728d0) interfaceC32756r0Arr[i13];
            if (c32728d0 != null) {
                interfaceC32756r0 = c32728d0.f136051w;
            }
            interfaceC32756r0Arr2[i13] = interfaceC32756r0;
            i13++;
        }
        InterfaceC32757s interfaceC32757s = this.f136044w;
        long j13 = this.f136045x;
        long jMo102704j = interfaceC32757s.mo102704j(interfaceC20035oArr, zArr, interfaceC32756r0Arr2, zArr2, j7 - j13);
        for (int i14 = 0; i14 < interfaceC32756r0Arr.length; i14++) {
            InterfaceC32756r0 interfaceC32756r1 = interfaceC32756r0Arr2[i14];
            if (interfaceC32756r1 == null) {
                interfaceC32756r0Arr[i14] = null;
            } else {
                InterfaceC32756r0 interfaceC32756r2 = interfaceC32756r0Arr[i14];
                if (interfaceC32756r2 == null || ((C32728d0) interfaceC32756r2).f136051w != interfaceC32756r1) {
                    interfaceC32756r0Arr[i14] = new C32728d0(interfaceC32756r1, j13);
                }
            }
        }
        return jMo102704j + j13;
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: k */
    public final C32768x0 mo102705k() {
        return this.f136044w.mo102705k();
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: m */
    public final long mo91533m() {
        long jMo91533m = this.f136044w.mo91533m();
        if (jMo91533m == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMo91533m + this.f136045x;
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: n */
    public final void mo91534n(long j7) {
        this.f136044w.mo91534n(j7 - this.f136045x);
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: u */
    public final boolean mo91536u(long j7) {
        return this.f136044w.mo91536u(j7 - this.f136045x);
    }

    @Override // sn.InterfaceC32757s
    /* JADX INFO: renamed from: v */
    public final long mo102707v(long j7, C31537h1 c31537h1) {
        long j13 = this.f136045x;
        return this.f136044w.mo102707v(j7 - j13, c31537h1) + j13;
    }
}
