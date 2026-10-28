package p333n4;

import java.util.ArrayList;
import p108e4.AbstractC12682p;
import p319m4.AbstractC25021j;
import p319m4.C25015d;
import p319m4.C25016e;
import p319m4.C25017f;

/* JADX INFO: renamed from: n4.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C26258n extends AbstractC26260p {

    /* JADX INFO: renamed from: k */
    public final C26251g f104397k;

    /* JADX INFO: renamed from: l */
    public C26245a f104398l;

    public C26258n(C25016e c25016e) {
        super(c25016e);
        C26251g c26251g = new C26251g(this);
        this.f104397k = c26251g;
        this.f104398l = null;
        this.f104412h.f104384e = 6;
        this.f104413i.f104384e = 7;
        c26251g.f104384e = 8;
        this.f104410f = 1;
    }

    @Override // p333n4.InterfaceC26249e
    /* JADX INFO: renamed from: a */
    public final void mo77901a(InterfaceC26249e interfaceC26249e) {
        float f13;
        float f14;
        float f15;
        int i13;
        if (AbstractC12682p.m35485e(this.f104414j) == 3) {
            C25016e c25016e = this.f104406b;
            m77944l(c25016e.f97891K, c25016e.f97893M, 1);
            return;
        }
        C26252h c26252h = this.f104409e;
        if (c26252h.f104382c && !c26252h.f104389j && this.f104408d == 3) {
            C25016e c25016e2 = this.f104406b;
            int i14 = c25016e2.f97943t;
            if (i14 == 2) {
                C25017f c25017f = c25016e2.f97901U;
                if (c25017f != null) {
                    C26252h c26252h2 = c25017f.f97915e.f104409e;
                    if (c26252h2.f104389j) {
                        c26252h.mo77918d((int) ((c26252h2.f104386g * c25016e2.f97881A) + 0.5f));
                    }
                }
            } else if (i14 == 3) {
                C26252h c26252h3 = c25016e2.f97913d.f104409e;
                if (c26252h3.f104389j) {
                    int i15 = c25016e2.f97905Y;
                    if (i15 != -1) {
                        if (i15 == 0) {
                            f15 = c26252h3.f104386g * c25016e2.f97904X;
                            i13 = (int) (f15 + 0.5f);
                        } else if (i15 != 1) {
                            i13 = 0;
                        } else {
                            f13 = c26252h3.f104386g;
                            f14 = c25016e2.f97904X;
                        }
                        c26252h.mo77918d(i13);
                    } else {
                        f13 = c26252h3.f104386g;
                        f14 = c25016e2.f97904X;
                    }
                    f15 = f13 / f14;
                    i13 = (int) (f15 + 0.5f);
                    c26252h.mo77918d(i13);
                }
            }
        }
        C26251g c26251g = this.f104412h;
        boolean z4 = c26251g.f104382c;
        ArrayList arrayList = c26251g.f104391l;
        if (z4) {
            C26251g c26251g2 = this.f104413i;
            boolean z13 = c26251g2.f104382c;
            ArrayList arrayList2 = c26251g2.f104391l;
            if (z13) {
                if (c26251g.f104389j && c26251g2.f104389j && c26252h.f104389j) {
                    return;
                }
                if (!c26252h.f104389j && this.f104408d == 3) {
                    C25016e c25016e3 = this.f104406b;
                    if (c25016e3.f97942s == 0 && !c25016e3.m73453z()) {
                        C26251g c26251g3 = (C26251g) arrayList.get(0);
                        C26251g c26251g4 = (C26251g) arrayList2.get(0);
                        int i16 = c26251g3.f104386g + c26251g.f104385f;
                        int i17 = c26251g4.f104386g + c26251g2.f104385f;
                        c26251g.mo77918d(i16);
                        c26251g2.mo77918d(i17);
                        c26252h.mo77918d(i17 - i16);
                        return;
                    }
                }
                if (!c26252h.f104389j && this.f104408d == 3 && this.f104405a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C26251g c26251g5 = (C26251g) arrayList.get(0);
                    int i18 = (((C26251g) arrayList2.get(0)).f104386g + c26251g2.f104385f) - (c26251g5.f104386g + c26251g.f104385f);
                    int i19 = c26252h.f104392m;
                    if (i18 < i19) {
                        c26252h.mo77918d(i18);
                    } else {
                        c26252h.mo77918d(i19);
                    }
                }
                if (c26252h.f104389j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C26251g c26251g6 = (C26251g) arrayList.get(0);
                    C26251g c26251g7 = (C26251g) arrayList2.get(0);
                    int i24 = c26251g6.f104386g;
                    int i25 = c26251g.f104385f + i24;
                    int i26 = c26251g7.f104386g;
                    int i27 = c26251g2.f104385f + i26;
                    float f16 = this.f104406b.f97918f0;
                    if (c26251g6 == c26251g7) {
                        f16 = 0.5f;
                    } else {
                        i24 = i25;
                        i26 = i27;
                    }
                    c26251g.mo77918d((int) ((((i26 - i24) - c26252h.f104386g) * f16) + i24 + 0.5f));
                    c26251g2.mo77918d(c26251g.f104386g + c26252h.f104386g);
                }
            }
        }
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: d */
    public final void mo77902d() {
        C25016e c25016e;
        C25017f c25017f;
        C25017f c25017f2;
        C25017f c25017f3;
        C25016e c25016e2 = this.f104406b;
        boolean z4 = c25016e2.f97907a;
        C26252h c26252h = this.f104409e;
        if (z4) {
            c26252h.mo77918d(c25016e2.m73441l());
        }
        boolean z13 = c26252h.f104389j;
        ArrayList arrayList = c26252h.f104390k;
        ArrayList arrayList2 = c26252h.f104391l;
        C26251g c26251g = this.f104413i;
        C26251g c26251g2 = this.f104412h;
        if (!z13) {
            C25016e c25016e3 = this.f104406b;
            this.f104408d = c25016e3.f97940q0[1];
            if (c25016e3.f97886F) {
                this.f104398l = new C26245a(this);
            }
            int i13 = this.f104408d;
            if (i13 != 3) {
                if (i13 == 4 && (c25017f3 = this.f104406b.f97901U) != null && c25017f3.f97940q0[1] == 1) {
                    int iM73441l = (c25017f3.m73441l() - this.f104406b.f97891K.m73403e()) - this.f104406b.f97893M.m73403e();
                    AbstractC26260p.m77939b(c26251g2, c25017f3.f97915e.f104412h, this.f104406b.f97891K.m73403e());
                    AbstractC26260p.m77939b(c26251g, c25017f3.f97915e.f104413i, -this.f104406b.f97893M.m73403e());
                    c26252h.mo77918d(iM73441l);
                    return;
                }
                if (i13 == 1) {
                    c26252h.mo77918d(this.f104406b.m73441l());
                }
            }
        } else if (this.f104408d == 4 && (c25017f = (c25016e = this.f104406b).f97901U) != null && c25017f.f97940q0[1] == 1) {
            AbstractC26260p.m77939b(c26251g2, c25017f.f97915e.f104412h, c25016e.f97891K.m73403e());
            AbstractC26260p.m77939b(c26251g, c25017f.f97915e.f104413i, -this.f104406b.f97893M.m73403e());
            return;
        }
        boolean z14 = c26252h.f104389j;
        C26251g c26251g3 = this.f104397k;
        if (z14) {
            C25016e c25016e4 = this.f104406b;
            if (c25016e4.f97907a) {
                C25015d[] c25015dArr = c25016e4.f97898R;
                C25015d c25015d = c25015dArr[2];
                C25015d c25015d2 = c25015d.f97877f;
                if (c25015d2 != null && c25015dArr[3].f97877f != null) {
                    if (c25016e4.m73453z()) {
                        c26251g2.f104385f = this.f104406b.f97898R[2].m73403e();
                        c26251g.f104385f = -this.f104406b.f97898R[3].m73403e();
                    } else {
                        C26251g c26251gM77940h = AbstractC26260p.m77940h(this.f104406b.f97898R[2]);
                        if (c26251gM77940h != null) {
                            AbstractC26260p.m77939b(c26251g2, c26251gM77940h, this.f104406b.f97898R[2].m73403e());
                        }
                        C26251g c26251gM77940h2 = AbstractC26260p.m77940h(this.f104406b.f97898R[3]);
                        if (c26251gM77940h2 != null) {
                            AbstractC26260p.m77939b(c26251g, c26251gM77940h2, -this.f104406b.f97898R[3].m73403e());
                        }
                        c26251g2.f104381b = true;
                        c26251g.f104381b = true;
                    }
                    C25016e c25016e5 = this.f104406b;
                    if (c25016e5.f97886F) {
                        AbstractC26260p.m77939b(c26251g3, c26251g2, c25016e5.f97910b0);
                        return;
                    }
                    return;
                }
                if (c25015d2 != null) {
                    C26251g c26251gM77940h3 = AbstractC26260p.m77940h(c25015d);
                    if (c26251gM77940h3 != null) {
                        AbstractC26260p.m77939b(c26251g2, c26251gM77940h3, this.f104406b.f97898R[2].m73403e());
                        AbstractC26260p.m77939b(c26251g, c26251g2, c26252h.f104386g);
                        C25016e c25016e6 = this.f104406b;
                        if (c25016e6.f97886F) {
                            AbstractC26260p.m77939b(c26251g3, c26251g2, c25016e6.f97910b0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C25015d c25015d3 = c25015dArr[3];
                if (c25015d3.f97877f != null) {
                    C26251g c26251gM77940h4 = AbstractC26260p.m77940h(c25015d3);
                    if (c26251gM77940h4 != null) {
                        AbstractC26260p.m77939b(c26251g, c26251gM77940h4, -this.f104406b.f97898R[3].m73403e());
                        AbstractC26260p.m77939b(c26251g2, c26251g, -c26252h.f104386g);
                    }
                    C25016e c25016e7 = this.f104406b;
                    if (c25016e7.f97886F) {
                        AbstractC26260p.m77939b(c26251g3, c26251g2, c25016e7.f97910b0);
                        return;
                    }
                    return;
                }
                C25015d c25015d4 = c25015dArr[4];
                if (c25015d4.f97877f != null) {
                    C26251g c26251gM77940h5 = AbstractC26260p.m77940h(c25015d4);
                    if (c26251gM77940h5 != null) {
                        AbstractC26260p.m77939b(c26251g3, c26251gM77940h5, 0);
                        AbstractC26260p.m77939b(c26251g2, c26251g3, -this.f104406b.f97910b0);
                        AbstractC26260p.m77939b(c26251g, c26251g2, c26252h.f104386g);
                        return;
                    }
                    return;
                }
                if ((c25016e4 instanceof AbstractC25021j) || c25016e4.f97901U == null || c25016e4.mo73439j(7).f97877f != null) {
                    return;
                }
                C25016e c25016e8 = this.f104406b;
                AbstractC26260p.m77939b(c26251g2, c25016e8.f97901U.f97915e.f104412h, c25016e8.m73447t());
                AbstractC26260p.m77939b(c26251g, c26251g2, c26252h.f104386g);
                C25016e c25016e9 = this.f104406b;
                if (c25016e9.f97886F) {
                    AbstractC26260p.m77939b(c26251g3, c26251g2, c25016e9.f97910b0);
                    return;
                }
                return;
            }
        }
        if (z14 || this.f104408d != 3) {
            c26252h.m77916b(this);
        } else {
            C25016e c25016e10 = this.f104406b;
            int i14 = c25016e10.f97943t;
            if (i14 == 2) {
                C25017f c25017f4 = c25016e10.f97901U;
                if (c25017f4 != null) {
                    C26252h c26252h2 = c25017f4.f97915e.f104409e;
                    arrayList2.add(c26252h2);
                    c26252h2.f104390k.add(c26252h);
                    c26252h.f104381b = true;
                    arrayList.add(c26251g2);
                    arrayList.add(c26251g);
                }
            } else if (i14 == 3 && !c25016e10.m73453z()) {
                C25016e c25016e11 = this.f104406b;
                if (c25016e11.f97942s != 3) {
                    C26252h c26252h3 = c25016e11.f97913d.f104409e;
                    arrayList2.add(c26252h3);
                    c26252h3.f104390k.add(c26252h);
                    c26252h.f104381b = true;
                    arrayList.add(c26251g2);
                    arrayList.add(c26251g);
                }
            }
        }
        C25016e c25016e12 = this.f104406b;
        C25015d[] c25015dArr2 = c25016e12.f97898R;
        C25015d c25015d5 = c25015dArr2[2];
        C25015d c25015d6 = c25015d5.f97877f;
        if (c25015d6 != null && c25015dArr2[3].f97877f != null) {
            if (c25016e12.m73453z()) {
                c26251g2.f104385f = this.f104406b.f97898R[2].m73403e();
                c26251g.f104385f = -this.f104406b.f97898R[3].m73403e();
            } else {
                C26251g c26251gM77940h6 = AbstractC26260p.m77940h(this.f104406b.f97898R[2]);
                C26251g c26251gM77940h7 = AbstractC26260p.m77940h(this.f104406b.f97898R[3]);
                if (c26251gM77940h6 != null) {
                    c26251gM77940h6.m77916b(this);
                }
                if (c26251gM77940h7 != null) {
                    c26251gM77940h7.m77916b(this);
                }
                this.f104414j = 4;
            }
            if (this.f104406b.f97886F) {
                m77942c(c26251g3, c26251g2, 1, this.f104398l);
            }
        } else if (c25015d6 != null) {
            C26251g c26251gM77940h8 = AbstractC26260p.m77940h(c25015d5);
            if (c26251gM77940h8 != null) {
                AbstractC26260p.m77939b(c26251g2, c26251gM77940h8, this.f104406b.f97898R[2].m73403e());
                m77942c(c26251g, c26251g2, 1, c26252h);
                if (this.f104406b.f97886F) {
                    m77942c(c26251g3, c26251g2, 1, this.f104398l);
                }
                if (this.f104408d == 3) {
                    C25016e c25016e13 = this.f104406b;
                    if (c25016e13.f97904X > 0.0f) {
                        C26256l c26256l = c25016e13.f97913d;
                        if (c26256l.f104408d == 3) {
                            c26256l.f104409e.f104390k.add(c26252h);
                            arrayList2.add(this.f104406b.f97913d.f104409e);
                            c26252h.f104380a = this;
                        }
                    }
                }
            }
        } else {
            C25015d c25015d7 = c25015dArr2[3];
            if (c25015d7.f97877f != null) {
                C26251g c26251gM77940h9 = AbstractC26260p.m77940h(c25015d7);
                if (c26251gM77940h9 != null) {
                    AbstractC26260p.m77939b(c26251g, c26251gM77940h9, -this.f104406b.f97898R[3].m73403e());
                    m77942c(c26251g2, c26251g, -1, c26252h);
                    if (this.f104406b.f97886F) {
                        m77942c(c26251g3, c26251g2, 1, this.f104398l);
                    }
                }
            } else {
                C25015d c25015d8 = c25015dArr2[4];
                if (c25015d8.f97877f != null) {
                    C26251g c26251gM77940h10 = AbstractC26260p.m77940h(c25015d8);
                    if (c26251gM77940h10 != null) {
                        AbstractC26260p.m77939b(c26251g3, c26251gM77940h10, 0);
                        m77942c(c26251g2, c26251g3, -1, this.f104398l);
                        m77942c(c26251g, c26251g2, 1, c26252h);
                    }
                } else if (!(c25016e12 instanceof AbstractC25021j) && (c25017f2 = c25016e12.f97901U) != null) {
                    AbstractC26260p.m77939b(c26251g2, c25017f2.f97915e.f104412h, c25016e12.m73447t());
                    m77942c(c26251g, c26251g2, 1, c26252h);
                    if (this.f104406b.f97886F) {
                        m77942c(c26251g3, c26251g2, 1, this.f104398l);
                    }
                    if (this.f104408d == 3) {
                        C25016e c25016e14 = this.f104406b;
                        if (c25016e14.f97904X > 0.0f) {
                            C26256l c26256l2 = c25016e14.f97913d;
                            if (c26256l2.f104408d == 3) {
                                c26256l2.f104409e.f104390k.add(c26252h);
                                arrayList2.add(this.f104406b.f97913d.f104409e);
                                c26252h.f104380a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c26252h.f104382c = true;
        }
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: e */
    public final void mo77903e() {
        C26251g c26251g = this.f104412h;
        if (c26251g.f104389j) {
            this.f104406b.f97908a0 = c26251g.f104386g;
        }
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: f */
    public final void mo77904f() {
        this.f104407c = null;
        this.f104412h.m77917c();
        this.f104413i.m77917c();
        this.f104397k.m77917c();
        this.f104409e.m77917c();
        this.f104411g = false;
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: k */
    public final boolean mo77906k() {
        return this.f104408d != 3 || this.f104406b.f97943t == 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m77934m() {
        this.f104411g = false;
        C26251g c26251g = this.f104412h;
        c26251g.m77917c();
        c26251g.f104389j = false;
        C26251g c26251g2 = this.f104413i;
        c26251g2.m77917c();
        c26251g2.f104389j = false;
        C26251g c26251g3 = this.f104397k;
        c26251g3.m77917c();
        c26251g3.f104389j = false;
        this.f104409e.f104389j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f104406b.f97924i0;
    }
}
