package p319m4;

import java.util.ArrayList;
import p108e4.AbstractC12682p;
import p136f4.C14050b;
import p136f4.C14051c;
import p136f4.C14054f;

/* JADX INFO: renamed from: m4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C25020i extends C25016e {

    /* JADX INFO: renamed from: r0 */
    public float f98015r0 = -1.0f;

    /* JADX INFO: renamed from: s0 */
    public int f98016s0 = -1;

    /* JADX INFO: renamed from: t0 */
    public int f98017t0 = -1;

    /* JADX INFO: renamed from: u0 */
    public C25015d f98018u0 = this.f97891K;

    /* JADX INFO: renamed from: v0 */
    public int f98019v0 = 0;

    /* JADX INFO: renamed from: w0 */
    public boolean f98020w0;

    public C25020i() {
        this.f97899S.clear();
        this.f97899S.add(this.f98018u0);
        int length = this.f97898R.length;
        for (int i13 = 0; i13 < length; i13++) {
            this.f97898R[i13] = this.f98018u0;
        }
    }

    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: B */
    public final boolean mo73394B() {
        return this.f98020w0;
    }

    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: C */
    public final boolean mo73395C() {
        return this.f98020w0;
    }

    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: U */
    public final void mo73431U(C14051c c14051c, boolean z4) {
        if (this.f97901U == null) {
            return;
        }
        C25015d c25015d = this.f98018u0;
        c14051c.getClass();
        int iM39994n = C14051c.m39994n(c25015d);
        if (this.f98019v0 == 1) {
            this.f97906Z = iM39994n;
            this.f97908a0 = 0;
            m73424N(this.f97901U.m73441l());
            m73429S(0);
            return;
        }
        this.f97906Z = 0;
        this.f97908a0 = iM39994n;
        m73429S(this.f97901U.m73445r());
        m73424N(0);
    }

    /* JADX INFO: renamed from: V */
    public final void m73470V(int i13) {
        this.f98018u0.m73410l(i13);
        this.f98020w0 = true;
    }

    /* JADX INFO: renamed from: W */
    public final void m73471W(int i13) {
        if (this.f98019v0 == i13) {
            return;
        }
        this.f98019v0 = i13;
        ArrayList arrayList = this.f97899S;
        arrayList.clear();
        if (this.f98019v0 == 1) {
            this.f98018u0 = this.f97890J;
        } else {
            this.f98018u0 = this.f97891K;
        }
        arrayList.add(this.f98018u0);
        C25015d[] c25015dArr = this.f97898R;
        int length = c25015dArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            c25015dArr[i14] = this.f98018u0;
        }
    }

    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: c */
    public final void mo67544c(C14051c c14051c, boolean z4) {
        C25017f c25017f = this.f97901U;
        if (c25017f == null) {
            return;
        }
        Object objMo73439j = c25017f.mo73439j(2);
        Object objMo73439j2 = c25017f.mo73439j(4);
        C25017f c25017f2 = this.f97901U;
        boolean z13 = c25017f2 != null && c25017f2.f97940q0[0] == 2;
        if (this.f98019v0 == 0) {
            objMo73439j = c25017f.mo73439j(3);
            objMo73439j2 = c25017f.mo73439j(5);
            C25017f c25017f3 = this.f97901U;
            z13 = c25017f3 != null && c25017f3.f97940q0[1] == 2;
        }
        if (this.f98020w0) {
            C25015d c25015d = this.f98018u0;
            if (c25015d.f97874c) {
                C14054f c14054fM40005k = c14051c.m40005k(c25015d);
                c14051c.m39998d(c14054fM40005k, this.f98018u0.m73402d());
                if (this.f98016s0 != -1) {
                    if (z13) {
                        c14051c.m40000f(c14051c.m40005k(objMo73439j2), c14054fM40005k, 0, 5);
                    }
                } else if (this.f98017t0 != -1 && z13) {
                    C14054f c14054fM40005k2 = c14051c.m40005k(objMo73439j2);
                    c14051c.m40000f(c14054fM40005k, c14051c.m40005k(objMo73439j), 0, 5);
                    c14051c.m40000f(c14054fM40005k2, c14054fM40005k, 0, 5);
                }
                this.f98020w0 = false;
                return;
            }
        }
        if (this.f98016s0 != -1) {
            C14054f c14054fM40005k3 = c14051c.m40005k(this.f98018u0);
            c14051c.m39999e(c14054fM40005k3, c14051c.m40005k(objMo73439j), this.f98016s0, 8);
            if (z13) {
                c14051c.m40000f(c14051c.m40005k(objMo73439j2), c14054fM40005k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f98017t0 != -1) {
            C14054f c14054fM40005k4 = c14051c.m40005k(this.f98018u0);
            C14054f c14054fM40005k5 = c14051c.m40005k(objMo73439j2);
            c14051c.m39999e(c14054fM40005k4, c14054fM40005k5, -this.f98017t0, 8);
            if (z13) {
                c14051c.m40000f(c14054fM40005k4, c14051c.m40005k(objMo73439j), 0, 5);
                c14051c.m40000f(c14054fM40005k5, c14054fM40005k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f98015r0 != -1.0f) {
            C14054f c14054fM40005k6 = c14051c.m40005k(this.f98018u0);
            C14054f c14054fM40005k7 = c14051c.m40005k(objMo73439j2);
            float f13 = this.f98015r0;
            C14050b c14050bM40006l = c14051c.m40006l();
            c14050bM40006l.f50151d.m39983g(c14054fM40005k6, -1.0f);
            c14050bM40006l.f50151d.m39983g(c14054fM40005k7, f13);
            c14051c.m39997c(c14050bM40006l);
        }
    }

    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: d */
    public final boolean mo73398d() {
        return true;
    }

    @Override // p319m4.C25016e
    /* JADX INFO: renamed from: j */
    public final C25015d mo73439j(int i13) {
        int iM35485e = AbstractC12682p.m35485e(i13);
        if (iM35485e != 1) {
            if (iM35485e != 2) {
                if (iM35485e != 3) {
                    if (iM35485e != 4) {
                        return null;
                    }
                }
            }
            if (this.f98019v0 == 0) {
                return this.f98018u0;
            }
            return null;
        }
        if (this.f98019v0 == 1) {
            return this.f98018u0;
        }
        return null;
    }
}
