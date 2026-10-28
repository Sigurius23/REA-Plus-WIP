package p005a3;

import androidx.compose.p018ui.node.NodeCoordinator;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0246r0 {

    /* JADX INFO: renamed from: a */
    public final C0230n0 f839a;

    /* JADX INFO: renamed from: b */
    public boolean f840b;

    /* JADX INFO: renamed from: c */
    public boolean f841c;

    /* JADX INFO: renamed from: e */
    public boolean f843e;

    /* JADX INFO: renamed from: f */
    public boolean f844f;

    /* JADX INFO: renamed from: g */
    public boolean f845g;

    /* JADX INFO: renamed from: h */
    public int f846h;

    /* JADX INFO: renamed from: i */
    public int f847i;

    /* JADX INFO: renamed from: j */
    public boolean f848j;

    /* JADX INFO: renamed from: k */
    public boolean f849k;

    /* JADX INFO: renamed from: l */
    public int f850l;

    /* JADX INFO: renamed from: m */
    public boolean f851m;

    /* JADX INFO: renamed from: n */
    public boolean f852n;

    /* JADX INFO: renamed from: o */
    public int f853o;

    /* JADX INFO: renamed from: q */
    public C0187c1 f855q;

    /* JADX INFO: renamed from: d */
    public EnumC0206h0 f842d = EnumC0206h0.f689E;

    /* JADX INFO: renamed from: p */
    public final C0203g1 f854p = new C0203g1(this);

    public C0246r0(C0230n0 c0230n0) {
        this.f839a = c0230n0;
    }

    /* JADX INFO: renamed from: a */
    public final NodeCoordinator m753a() {
        return (NodeCoordinator) this.f839a.f783e0.f741e;
    }

    /* JADX INFO: renamed from: b */
    public final void m754b() {
        EnumC0206h0 enumC0206h0M646v = this.f839a.m646v();
        if (enumC0206h0M646v == EnumC0206h0.f693y || enumC0206h0M646v == EnumC0206h0.f694z) {
            if (this.f854p.f675b0) {
                m759g(true);
            } else {
                m758f(true);
            }
        }
        if (enumC0206h0M646v == EnumC0206h0.f694z) {
            C0187c1 c0187c1 = this.f855q;
            if (c0187c1 == null || !c0187c1.f604V) {
                m760h(true);
            } else {
                m761i(true);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m755c(long j7) {
        C0187c1 c0187c1 = this.f855q;
        if (c0187c1 != null) {
            EnumC0206h0 enumC0206h0 = EnumC0206h0.f692x;
            C0246r0 c0246r0 = c0187c1.f588F;
            c0246r0.f842d = enumC0206h0;
            C0203g1 c0203g1 = c0246r0.f854p;
            C0230n0 c0230n0 = c0246r0.f839a;
            c0246r0.f843e = false;
            C0188c2 snapshotObserver = AbstractC0242q0.m750a(c0230n0).getSnapshotObserver();
            C0179a1 c0179a1 = new C0179a1(c0187c1, j7);
            snapshotObserver.getClass();
            if (c0230n0.f759G != null) {
                snapshotObserver.m457a(c0230n0, snapshotObserver.f609b, c0179a1);
            } else {
                snapshotObserver.m457a(c0230n0, snapshotObserver.f610c, c0179a1);
            }
            c0246r0.f844f = true;
            c0246r0.f845g = true;
            if (AbstractC0201g.m511k(c0230n0)) {
                c0203g1.f670W = true;
                c0203g1.f671X = true;
            } else {
                c0203g1.f669V = true;
            }
            c0246r0.f842d = EnumC0206h0.f689E;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m756d(int i13) {
        int i14 = this.f850l;
        this.f850l = i13;
        if ((i14 == 0) != (i13 == 0)) {
            C0230n0 c0230n0M588G = this.f839a.m588G();
            C0246r0 c0246r0M643t = c0230n0M588G != null ? c0230n0M588G.m643t() : null;
            if (c0246r0M643t != null) {
                if (i13 == 0) {
                    c0246r0M643t.m756d(c0246r0M643t.f850l - 1);
                } else {
                    c0246r0M643t.m756d(c0246r0M643t.f850l + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m757e(int i13) {
        int i14 = this.f853o;
        this.f853o = i13;
        if ((i14 == 0) != (i13 == 0)) {
            C0230n0 c0230n0M588G = this.f839a.m588G();
            C0246r0 c0246r0M643t = c0230n0M588G != null ? c0230n0M588G.m643t() : null;
            if (c0246r0M643t != null) {
                if (i13 == 0) {
                    c0246r0M643t.m757e(c0246r0M643t.f853o - 1);
                } else {
                    c0246r0M643t.m757e(c0246r0M643t.f853o + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m758f(boolean z4) {
        if (this.f849k != z4) {
            this.f849k = z4;
            if (z4 && !this.f848j) {
                m756d(this.f850l + 1);
            } else {
                if (z4 || this.f848j) {
                    return;
                }
                m756d(this.f850l - 1);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m759g(boolean z4) {
        if (this.f848j != z4) {
            this.f848j = z4;
            if (z4 && !this.f849k) {
                m756d(this.f850l + 1);
            } else {
                if (z4 || this.f849k) {
                    return;
                }
                m756d(this.f850l - 1);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m760h(boolean z4) {
        if (this.f852n != z4) {
            this.f852n = z4;
            if (z4 && !this.f851m) {
                m757e(this.f853o + 1);
            } else {
                if (z4 || this.f851m) {
                    return;
                }
                m757e(this.f853o - 1);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m761i(boolean z4) {
        if (this.f851m != z4) {
            this.f851m = z4;
            if (z4 && !this.f852n) {
                m757e(this.f853o + 1);
            } else {
                if (z4 || this.f852n) {
                    return;
                }
                m757e(this.f853o - 1);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m762j() {
        C0203g1 c0203g1 = this.f854p;
        C0246r0 c0246r0 = c0203g1.f653F;
        Object obj = c0203g1.f666S;
        C0230n0 c0230n0 = this.f839a;
        if ((obj != null || c0246r0.m753a().mo454p() != null) && c0203g1.f665R) {
            c0203g1.f665R = false;
            c0203g1.f666S = c0246r0.m753a().mo454p();
            C0230n0 c0230n0M588G = c0230n0.m588G();
            if (c0230n0M588G != null) {
                C0230n0.m575v0(c0230n0M588G, false, 7);
            }
        }
        C0187c1 c0187c1 = this.f855q;
        if (c0187c1 != null) {
            C0246r0 c0246r1 = c0187c1.f588F;
            if (c0187c1.f606X == null) {
                AbstractC0265x0 abstractC0265x0Mo3530e1 = c0246r1.m753a().mo3530e1();
                AbstractC22676k.m65747g(abstractC0265x0Mo3530e1);
                if (abstractC0265x0Mo3530e1.f904O.mo454p() == null) {
                    return;
                }
            }
            if (c0187c1.f605W) {
                c0187c1.f605W = false;
                AbstractC0265x0 abstractC0265x0Mo3530e2 = c0246r1.m753a().mo3530e1();
                AbstractC22676k.m65747g(abstractC0265x0Mo3530e2);
                c0187c1.f606X = abstractC0265x0Mo3530e2.f904O.mo454p();
                if (AbstractC0201g.m511k(c0230n0)) {
                    C0230n0 c0230n0M588G2 = c0230n0.m588G();
                    if (c0230n0M588G2 != null) {
                        C0230n0.m575v0(c0230n0M588G2, false, 7);
                        return;
                    }
                    return;
                }
                C0230n0 c0230n0M588G3 = c0230n0.m588G();
                if (c0230n0M588G3 != null) {
                    C0230n0.m574t0(c0230n0M588G3, false, 7);
                }
            }
        }
    }
}
