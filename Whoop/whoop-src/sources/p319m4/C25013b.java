package p319m4;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p136f4.C14050b;
import p136f4.C14051c;
import p136f4.C14054f;

/* JADX INFO: renamed from: m4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C25013b extends AbstractC25021j {

    /* JADX INFO: renamed from: t0 */
    public int f97851t0 = 0;

    /* JADX INFO: renamed from: u0 */
    public boolean f97852u0 = true;

    /* JADX INFO: renamed from: v0 */
    public int f97853v0 = 0;

    /* JADX INFO: renamed from: w0 */
    public boolean f97854w0 = false;

    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: B */
    public final boolean mo73394B() {
        return this.f97854w0;
    }

    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: C */
    public final boolean mo73395C() {
        return this.f97854w0;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m73396Y() {
        int i13;
        int i14;
        int i15;
        boolean z4 = true;
        int i16 = 0;
        while (true) {
            i13 = this.f98022s0;
            if (i16 >= i13) {
                break;
            }
            C25016e c25016e = this.f98021r0[i16];
            if ((this.f97852u0 || c25016e.mo73398d()) && ((((i14 = this.f97851t0) == 0 || i14 == 1) && !c25016e.mo73394B()) || (((i15 = this.f97851t0) == 2 || i15 == 3) && !c25016e.mo73395C()))) {
                z4 = false;
            }
            i16++;
        }
        if (!z4 || i13 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z13 = false;
        for (int i17 = 0; i17 < this.f98022s0; i17++) {
            C25016e c25016e2 = this.f98021r0[i17];
            if (this.f97852u0 || c25016e2.mo73398d()) {
                if (!z13) {
                    int i18 = this.f97851t0;
                    if (i18 == 0) {
                        iMax = c25016e2.mo73439j(2).m73402d();
                    } else if (i18 == 1) {
                        iMax = c25016e2.mo73439j(4).m73402d();
                    } else if (i18 == 2) {
                        iMax = c25016e2.mo73439j(3).m73402d();
                    } else if (i18 == 3) {
                        iMax = c25016e2.mo73439j(5).m73402d();
                    }
                    z13 = true;
                }
                int i19 = this.f97851t0;
                if (i19 == 0) {
                    iMax = Math.min(iMax, c25016e2.mo73439j(2).m73402d());
                } else if (i19 == 1) {
                    iMax = Math.max(iMax, c25016e2.mo73439j(4).m73402d());
                } else if (i19 == 2) {
                    iMax = Math.min(iMax, c25016e2.mo73439j(3).m73402d());
                } else if (i19 == 3) {
                    iMax = Math.max(iMax, c25016e2.mo73439j(5).m73402d());
                }
            }
        }
        int i24 = iMax + this.f97853v0;
        int i25 = this.f97851t0;
        if (i25 == 0 || i25 == 1) {
            m73422L(i24, i24);
        } else {
            m73423M(i24, i24);
        }
        this.f97854w0 = true;
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public final int m73397Z() {
        int i13 = this.f97851t0;
        if (i13 == 0 || i13 == 1) {
            return 0;
        }
        return (i13 == 2 || i13 == 3) ? 1 : -1;
    }

    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: c */
    public final void mo67544c(C14051c c14051c, boolean z4) {
        boolean z13;
        int i13;
        int i14;
        C25015d[] c25015dArr = this.f97898R;
        C25015d c25015d = this.f97890J;
        c25015dArr[0] = c25015d;
        int i15 = 2;
        C25015d c25015d2 = this.f97891K;
        c25015dArr[2] = c25015d2;
        C25015d c25015d3 = this.f97892L;
        c25015dArr[1] = c25015d3;
        C25015d c25015d4 = this.f97893M;
        c25015dArr[3] = c25015d4;
        for (C25015d c25015d5 : c25015dArr) {
            c25015d5.f97880i = c14051c.m40005k(c25015d5);
        }
        int i16 = this.f97851t0;
        if (i16 < 0 || i16 >= 4) {
            return;
        }
        C25015d c25015d6 = c25015dArr[i16];
        if (!this.f97854w0) {
            m73396Y();
        }
        if (this.f97854w0) {
            this.f97854w0 = false;
            int i17 = this.f97851t0;
            if (i17 == 0 || i17 == 1) {
                c14051c.m39998d(c25015d.f97880i, this.f97906Z);
                c14051c.m39998d(c25015d3.f97880i, this.f97906Z);
                return;
            } else {
                if (i17 == 2 || i17 == 3) {
                    c14051c.m39998d(c25015d2.f97880i, this.f97908a0);
                    c14051c.m39998d(c25015d4.f97880i, this.f97908a0);
                    return;
                }
                return;
            }
        }
        int i18 = 0;
        while (true) {
            if (i18 >= this.f98022s0) {
                z13 = false;
                break;
            }
            C25016e c25016e = this.f98021r0[i18];
            if ((this.f97852u0 || c25016e.mo73398d()) && ((((i14 = this.f97851t0) == 0 || i14 == 1) && c25016e.f97940q0[0] == 3 && c25016e.f97890J.f97877f != null && c25016e.f97892L.f97877f != null) || ((i14 == 2 || i14 == 3) && c25016e.f97940q0[1] == 3 && c25016e.f97891K.f97877f != null && c25016e.f97893M.f97877f != null))) {
                z13 = true;
                break;
            }
            i18++;
        }
        boolean z14 = c25015d.m73405g() || c25015d3.m73405g();
        boolean z15 = c25015d2.m73405g() || c25015d4.m73405g();
        int i19 = !(!z13 && (((i13 = this.f97851t0) == 0 && z14) || ((i13 == 2 && z15) || ((i13 == 1 && z14) || (i13 == 3 && z15))))) ? 4 : 5;
        int i24 = 0;
        while (i24 < this.f98022s0) {
            C25016e c25016e2 = this.f98021r0[i24];
            if (this.f97852u0 || c25016e2.mo73398d()) {
                C14054f c14054fM40005k = c14051c.m40005k(c25016e2.f97898R[this.f97851t0]);
                C25015d[] c25015dArr2 = c25016e2.f97898R;
                int i25 = this.f97851t0;
                C25015d c25015d7 = c25015dArr2[i25];
                c25015d7.f97880i = c14054fM40005k;
                C25015d c25015d8 = c25015d7.f97877f;
                int i26 = (c25015d8 == null || c25015d8.f97875d != this) ? 0 : c25015d7.f97878g;
                if (i25 == 0 || i25 == i15) {
                    C14054f c14054f = c25015d6.f97880i;
                    int i27 = this.f97853v0 - i26;
                    C14050b c14050bM40006l = c14051c.m40006l();
                    C14054f c14054fM40007m = c14051c.m40007m();
                    c14054fM40007m.f50184z = 0;
                    c14050bM40006l.m39987c(c14054f, c14054fM40005k, c14054fM40007m, i27);
                    c14051c.m39997c(c14050bM40006l);
                } else {
                    C14054f c14054f2 = c25015d6.f97880i;
                    int i28 = this.f97853v0 + i26;
                    C14050b c14050bM40006l2 = c14051c.m40006l();
                    C14054f c14054fM40007m2 = c14051c.m40007m();
                    c14054fM40007m2.f50184z = 0;
                    c14050bM40006l2.m39986b(c14054f2, c14054fM40005k, c14054fM40007m2, i28);
                    c14051c.m39997c(c14050bM40006l2);
                }
                c14051c.m39999e(c25015d6.f97880i, c14054fM40005k, this.f97853v0 + i26, i19);
            }
            i24++;
            i15 = 2;
        }
        int i29 = this.f97851t0;
        if (i29 == 0) {
            c14051c.m39999e(c25015d3.f97880i, c25015d.f97880i, 0, 8);
            c14051c.m39999e(c25015d.f97880i, this.f97901U.f97892L.f97880i, 0, 4);
            c14051c.m39999e(c25015d.f97880i, this.f97901U.f97890J.f97880i, 0, 0);
            return;
        }
        if (i29 == 1) {
            c14051c.m39999e(c25015d.f97880i, c25015d3.f97880i, 0, 8);
            c14051c.m39999e(c25015d.f97880i, this.f97901U.f97890J.f97880i, 0, 4);
            c14051c.m39999e(c25015d.f97880i, this.f97901U.f97892L.f97880i, 0, 0);
        } else if (i29 == 2) {
            c14051c.m39999e(c25015d4.f97880i, c25015d2.f97880i, 0, 8);
            c14051c.m39999e(c25015d2.f97880i, this.f97901U.f97893M.f97880i, 0, 4);
            c14051c.m39999e(c25015d2.f97880i, this.f97901U.f97891K.f97880i, 0, 0);
        } else if (i29 == 3) {
            c14051c.m39999e(c25015d2.f97880i, c25015d4.f97880i, 0, 8);
            c14051c.m39999e(c25015d2.f97880i, this.f97901U.f97891K.f97880i, 0, 4);
            c14051c.m39999e(c25015d2.f97880i, this.f97901U.f97893M.f97880i, 0, 0);
        }
    }

    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: d */
    public final boolean mo73398d() {
        return true;
    }

    @Override // p319m4.C25016e
    public final String toString() {
        String strM73376i = AbstractC25012a.m73376i(this.f97924i0, " {", new StringBuilder("[Barrier] "));
        for (int i13 = 0; i13 < this.f98022s0; i13++) {
            C25016e c25016e = this.f98021r0[i13];
            if (i13 > 0) {
                strM73376i = AbstractC2875y.m8299l(strM73376i, ", ");
            }
            StringBuilder sbM53374o = AbstractC18489d0.m53374o(strM73376i);
            sbM53374o.append(c25016e.f97924i0);
            strM73376i = sbM53374o.toString();
        }
        return AbstractC2875y.m8299l(strM73376i, "}");
    }
}
