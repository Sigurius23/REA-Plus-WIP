package p333n4;

import java.util.ArrayList;
import p108e4.AbstractC12682p;
import p319m4.AbstractC25021j;
import p319m4.C25015d;
import p319m4.C25016e;
import p319m4.C25017f;

/* JADX INFO: renamed from: n4.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C26256l extends AbstractC26260p {

    /* JADX INFO: renamed from: k */
    public static final int[] f104394k = new int[2];

    public C26256l(C25016e c25016e) {
        super(c25016e);
        this.f104412h.f104384e = 4;
        this.f104413i.f104384e = 5;
        this.f104410f = 0;
    }

    /* JADX INFO: renamed from: m */
    public static void m77928m(int[] iArr, int i13, int i14, int i15, int i16, float f13, int i17) {
        int i18 = i14 - i13;
        int i19 = i16 - i15;
        if (i17 != -1) {
            if (i17 == 0) {
                iArr[0] = (int) ((i19 * f13) + 0.5f);
                iArr[1] = i19;
                return;
            } else {
                if (i17 != 1) {
                    return;
                }
                iArr[0] = i18;
                iArr[1] = (int) ((i18 * f13) + 0.5f);
                return;
            }
        }
        int i24 = (int) ((i19 * f13) + 0.5f);
        int i25 = (int) ((i18 / f13) + 0.5f);
        if (i24 <= i18) {
            iArr[0] = i24;
            iArr[1] = i19;
        } else if (i25 <= i19) {
            iArr[0] = i18;
            iArr[1] = i25;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // p333n4.InterfaceC26249e
    /* JADX INFO: renamed from: a */
    public final void mo77901a(InterfaceC26249e interfaceC26249e) {
        float f13;
        int iM77943g;
        int i13;
        int iM77943g2;
        float f14;
        float f15;
        float f16;
        int i14;
        if (AbstractC12682p.m35485e(this.f104414j) == 3) {
            C25016e c25016e = this.f104406b;
            m77944l(c25016e.f97890J, c25016e.f97892L, 0);
            return;
        }
        C26252h c26252h = this.f104409e;
        boolean z4 = c26252h.f104389j;
        C26251g c26251g = this.f104412h;
        C26251g c26251g2 = this.f104413i;
        if (z4 || this.f104408d != 3) {
            f13 = 0.5f;
        } else {
            C25016e c25016e2 = this.f104406b;
            int i15 = c25016e2.f97942s;
            if (i15 == 2) {
                f13 = 0.5f;
                C25017f c25017f = c25016e2.f97901U;
                if (c25017f != null) {
                    C26252h c26252h2 = c25017f.f97913d.f104409e;
                    if (c26252h2.f104389j) {
                        c26252h.mo77918d((int) ((c26252h2.f104386g * c25016e2.f97947x) + 0.5f));
                    }
                }
            } else if (i15 == 3) {
                int i16 = c25016e2.f97943t;
                if (i16 == 0 || i16 == 3) {
                    C26258n c26258n = c25016e2.f97915e;
                    C26251g c26251g3 = c26258n.f104412h;
                    C26251g c26251g4 = c26258n.f104413i;
                    boolean z13 = c25016e2.f97890J.f97877f != null;
                    boolean z14 = c25016e2.f97891K.f97877f != null;
                    boolean z15 = c25016e2.f97892L.f97877f != null;
                    boolean z16 = c25016e2.f97893M.f97877f != null;
                    f13 = 0.5f;
                    int i17 = c25016e2.f97905Y;
                    if (z13 && z14 && z15 && z16) {
                        float f17 = c25016e2.f97904X;
                        boolean z17 = c26251g3.f104389j;
                        ArrayList arrayList = c26251g3.f104391l;
                        int[] iArr = f104394k;
                        if (z17 && c26251g4.f104389j) {
                            if (c26251g.f104382c && c26251g2.f104382c) {
                                m77928m(iArr, ((C26251g) c26251g.f104391l.get(0)).f104386g + c26251g.f104385f, ((C26251g) c26251g2.f104391l.get(0)).f104386g - c26251g2.f104385f, c26251g3.f104386g + c26251g3.f104385f, c26251g4.f104386g - c26251g4.f104385f, f17, i17);
                                c26252h.mo77918d(iArr[0]);
                                this.f104406b.f97915e.f104409e.mo77918d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (c26251g.f104389j && c26251g2.f104389j) {
                            if (!c26251g3.f104382c || !c26251g4.f104382c) {
                                return;
                            }
                            m77928m(iArr, c26251g.f104386g + c26251g.f104385f, c26251g2.f104386g - c26251g2.f104385f, ((C26251g) arrayList.get(0)).f104386g + c26251g3.f104385f, ((C26251g) c26251g4.f104391l.get(0)).f104386g - c26251g4.f104385f, f17, i17);
                            c26252h.mo77918d(iArr[0]);
                            this.f104406b.f97915e.f104409e.mo77918d(iArr[1]);
                        }
                        if (!c26251g.f104382c || !c26251g2.f104382c || !c26251g3.f104382c || !c26251g4.f104382c) {
                            return;
                        }
                        m77928m(iArr, ((C26251g) c26251g.f104391l.get(0)).f104386g + c26251g.f104385f, ((C26251g) c26251g2.f104391l.get(0)).f104386g - c26251g2.f104385f, ((C26251g) arrayList.get(0)).f104386g + c26251g3.f104385f, ((C26251g) c26251g4.f104391l.get(0)).f104386g - c26251g4.f104385f, f17, i17);
                        c26252h.mo77918d(iArr[0]);
                        this.f104406b.f97915e.f104409e.mo77918d(iArr[1]);
                    } else if (z13 && z15) {
                        if (!c26251g.f104382c || !c26251g2.f104382c) {
                            return;
                        }
                        float f18 = c25016e2.f97904X;
                        int i18 = ((C26251g) c26251g.f104391l.get(0)).f104386g + c26251g.f104385f;
                        int i19 = ((C26251g) c26251g2.f104391l.get(0)).f104386g - c26251g2.f104385f;
                        if (i17 == -1 || i17 == 0) {
                            int iM77943g3 = m77943g(i19 - i18, 0);
                            int i24 = (int) ((iM77943g3 * f18) + 0.5f);
                            int iM77943g4 = m77943g(i24, 1);
                            if (i24 != iM77943g4) {
                                iM77943g3 = (int) ((iM77943g4 / f18) + 0.5f);
                            }
                            c26252h.mo77918d(iM77943g3);
                            this.f104406b.f97915e.f104409e.mo77918d(iM77943g4);
                        } else if (i17 == 1) {
                            int iM77943g5 = m77943g(i19 - i18, 0);
                            int i25 = (int) ((iM77943g5 / f18) + 0.5f);
                            int iM77943g6 = m77943g(i25, 1);
                            if (i25 != iM77943g6) {
                                iM77943g5 = (int) ((iM77943g6 * f18) + 0.5f);
                            }
                            c26252h.mo77918d(iM77943g5);
                            this.f104406b.f97915e.f104409e.mo77918d(iM77943g6);
                        }
                    } else if (z14 && z16) {
                        if (!c26251g3.f104382c || !c26251g4.f104382c) {
                            return;
                        }
                        float f19 = c25016e2.f97904X;
                        int i26 = ((C26251g) c26251g3.f104391l.get(0)).f104386g + c26251g3.f104385f;
                        int i27 = ((C26251g) c26251g4.f104391l.get(0)).f104386g - c26251g4.f104385f;
                        if (i17 == -1) {
                            iM77943g = m77943g(i27 - i26, 1);
                            i13 = (int) ((iM77943g / f19) + 0.5f);
                            iM77943g2 = m77943g(i13, 0);
                            if (i13 != iM77943g2) {
                                iM77943g = (int) ((iM77943g2 * f19) + 0.5f);
                            }
                            c26252h.mo77918d(iM77943g2);
                            this.f104406b.f97915e.f104409e.mo77918d(iM77943g);
                        } else if (i17 == 0) {
                            int iM77943g7 = m77943g(i27 - i26, 1);
                            int i28 = (int) ((iM77943g7 * f19) + 0.5f);
                            int iM77943g8 = m77943g(i28, 0);
                            if (i28 != iM77943g8) {
                                iM77943g7 = (int) ((iM77943g8 / f19) + 0.5f);
                            }
                            c26252h.mo77918d(iM77943g8);
                            this.f104406b.f97915e.f104409e.mo77918d(iM77943g7);
                        } else if (i17 == 1) {
                            iM77943g = m77943g(i27 - i26, 1);
                            i13 = (int) ((iM77943g / f19) + 0.5f);
                            iM77943g2 = m77943g(i13, 0);
                            if (i13 != iM77943g2) {
                                iM77943g = (int) ((iM77943g2 * f19) + 0.5f);
                            }
                            c26252h.mo77918d(iM77943g2);
                            this.f104406b.f97915e.f104409e.mo77918d(iM77943g);
                        }
                    }
                } else {
                    int i29 = c25016e2.f97905Y;
                    if (i29 != -1) {
                        if (i29 == 0) {
                            f16 = c25016e2.f97915e.f104409e.f104386g / c25016e2.f97904X;
                            i14 = (int) (f16 + 0.5f);
                        } else if (i29 != 1) {
                            i14 = 0;
                        } else {
                            f14 = c25016e2.f97915e.f104409e.f104386g;
                            f15 = c25016e2.f97904X;
                        }
                        c26252h.mo77918d(i14);
                        f13 = 0.5f;
                    } else {
                        f14 = c25016e2.f97915e.f104409e.f104386g;
                        f15 = c25016e2.f97904X;
                    }
                    f16 = f14 * f15;
                    i14 = (int) (f16 + 0.5f);
                    c26252h.mo77918d(i14);
                    f13 = 0.5f;
                }
            } else {
                f13 = 0.5f;
            }
        }
        boolean z18 = c26251g.f104382c;
        ArrayList arrayList2 = c26251g.f104391l;
        if (z18) {
            boolean z19 = c26251g2.f104382c;
            ArrayList arrayList3 = c26251g2.f104391l;
            if (z19) {
                if (c26251g.f104389j && c26251g2.f104389j && c26252h.f104389j) {
                    return;
                }
                if (!c26252h.f104389j && this.f104408d == 3) {
                    C25016e c25016e3 = this.f104406b;
                    if (c25016e3.f97942s == 0 && !c25016e3.m73452y()) {
                        C26251g c26251g5 = (C26251g) arrayList2.get(0);
                        C26251g c26251g6 = (C26251g) arrayList3.get(0);
                        int i34 = c26251g5.f104386g + c26251g.f104385f;
                        int i35 = c26251g6.f104386g + c26251g2.f104385f;
                        c26251g.mo77918d(i34);
                        c26251g2.mo77918d(i35);
                        c26252h.mo77918d(i35 - i34);
                        return;
                    }
                }
                if (!c26252h.f104389j && this.f104408d == 3 && this.f104405a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((C26251g) arrayList3.get(0)).f104386g + c26251g2.f104385f) - (((C26251g) arrayList2.get(0)).f104386g + c26251g.f104385f), c26252h.f104392m);
                    C25016e c25016e4 = this.f104406b;
                    int i36 = c25016e4.f97946w;
                    int iMax = Math.max(c25016e4.f97945v, iMin);
                    if (i36 > 0) {
                        iMax = Math.min(i36, iMax);
                    }
                    c26252h.mo77918d(iMax);
                }
                if (c26252h.f104389j) {
                    C26251g c26251g7 = (C26251g) arrayList2.get(0);
                    C26251g c26251g8 = (C26251g) arrayList3.get(0);
                    int i37 = c26251g7.f104386g;
                    int i38 = c26251g.f104385f + i37;
                    int i39 = c26251g8.f104386g;
                    int i44 = c26251g2.f104385f + i39;
                    float f24 = this.f104406b.f97916e0;
                    if (c26251g7 == c26251g8) {
                        f24 = f13;
                    } else {
                        i37 = i38;
                        i39 = i44;
                    }
                    c26251g.mo77918d((int) ((((i39 - i37) - c26252h.f104386g) * f24) + i37 + f13));
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
        int i13;
        C25017f c25017f2;
        C25017f c25017f3;
        int i14;
        C25016e c25016e2 = this.f104406b;
        boolean z4 = c25016e2.f97907a;
        C26252h c26252h = this.f104409e;
        if (z4) {
            c26252h.mo77918d(c25016e2.m73445r());
        }
        boolean z13 = c26252h.f104389j;
        ArrayList arrayList = c26252h.f104390k;
        ArrayList arrayList2 = c26252h.f104391l;
        C26251g c26251g = this.f104413i;
        C26251g c26251g2 = this.f104412h;
        if (!z13) {
            C25016e c25016e3 = this.f104406b;
            int i15 = c25016e3.f97940q0[0];
            this.f104408d = i15;
            if (i15 != 3) {
                if (i15 == 4 && (c25017f3 = c25016e3.f97901U) != null && ((i14 = c25017f3.f97940q0[0]) == 1 || i14 == 4)) {
                    int iM73445r = (c25017f3.m73445r() - this.f104406b.f97890J.m73403e()) - this.f104406b.f97892L.m73403e();
                    AbstractC26260p.m77939b(c26251g2, c25017f3.f97913d.f104412h, this.f104406b.f97890J.m73403e());
                    AbstractC26260p.m77939b(c26251g, c25017f3.f97913d.f104413i, -this.f104406b.f97892L.m73403e());
                    c26252h.mo77918d(iM73445r);
                    return;
                }
                if (i15 == 1) {
                    c26252h.mo77918d(c25016e3.m73445r());
                }
            }
        } else if (this.f104408d == 4 && (c25017f = (c25016e = this.f104406b).f97901U) != null && ((i13 = c25017f.f97940q0[0]) == 1 || i13 == 4)) {
            AbstractC26260p.m77939b(c26251g2, c25017f.f97913d.f104412h, c25016e.f97890J.m73403e());
            AbstractC26260p.m77939b(c26251g, c25017f.f97913d.f104413i, -this.f104406b.f97892L.m73403e());
            return;
        }
        if (c26252h.f104389j) {
            C25016e c25016e4 = this.f104406b;
            if (c25016e4.f97907a) {
                C25015d[] c25015dArr = c25016e4.f97898R;
                C25015d c25015d = c25015dArr[0];
                C25015d c25015d2 = c25015d.f97877f;
                if (c25015d2 != null && c25015dArr[1].f97877f != null) {
                    if (c25016e4.m73452y()) {
                        c26251g2.f104385f = this.f104406b.f97898R[0].m73403e();
                        c26251g.f104385f = -this.f104406b.f97898R[1].m73403e();
                        return;
                    }
                    C26251g c26251gM77940h = AbstractC26260p.m77940h(this.f104406b.f97898R[0]);
                    if (c26251gM77940h != null) {
                        AbstractC26260p.m77939b(c26251g2, c26251gM77940h, this.f104406b.f97898R[0].m73403e());
                    }
                    C26251g c26251gM77940h2 = AbstractC26260p.m77940h(this.f104406b.f97898R[1]);
                    if (c26251gM77940h2 != null) {
                        AbstractC26260p.m77939b(c26251g, c26251gM77940h2, -this.f104406b.f97898R[1].m73403e());
                    }
                    c26251g2.f104381b = true;
                    c26251g.f104381b = true;
                    return;
                }
                if (c25015d2 != null) {
                    C26251g c26251gM77940h3 = AbstractC26260p.m77940h(c25015d);
                    if (c26251gM77940h3 != null) {
                        AbstractC26260p.m77939b(c26251g2, c26251gM77940h3, this.f104406b.f97898R[0].m73403e());
                        AbstractC26260p.m77939b(c26251g, c26251g2, c26252h.f104386g);
                        return;
                    }
                    return;
                }
                C25015d c25015d3 = c25015dArr[1];
                if (c25015d3.f97877f != null) {
                    C26251g c26251gM77940h4 = AbstractC26260p.m77940h(c25015d3);
                    if (c26251gM77940h4 != null) {
                        AbstractC26260p.m77939b(c26251g, c26251gM77940h4, -this.f104406b.f97898R[1].m73403e());
                        AbstractC26260p.m77939b(c26251g2, c26251g, -c26252h.f104386g);
                        return;
                    }
                    return;
                }
                if ((c25016e4 instanceof AbstractC25021j) || c25016e4.f97901U == null || c25016e4.mo73439j(7).f97877f != null) {
                    return;
                }
                C25016e c25016e5 = this.f104406b;
                AbstractC26260p.m77939b(c26251g2, c25016e5.f97901U.f97913d.f104412h, c25016e5.m73446s());
                AbstractC26260p.m77939b(c26251g, c26251g2, c26252h.f104386g);
                return;
            }
        }
        if (this.f104408d == 3) {
            C25016e c25016e6 = this.f104406b;
            int i16 = c25016e6.f97942s;
            if (i16 == 2) {
                C25017f c25017f4 = c25016e6.f97901U;
                if (c25017f4 != null) {
                    C26252h c26252h2 = c25017f4.f97915e.f104409e;
                    arrayList2.add(c26252h2);
                    c26252h2.f104390k.add(c26252h);
                    c26252h.f104381b = true;
                    arrayList.add(c26251g2);
                    arrayList.add(c26251g);
                }
            } else if (i16 == 3) {
                if (c25016e6.f97943t == 3) {
                    c26251g2.f104380a = this;
                    c26251g.f104380a = this;
                    C26258n c26258n = c25016e6.f97915e;
                    c26258n.f104412h.f104380a = this;
                    c26258n.f104413i.f104380a = this;
                    c26252h.f104380a = this;
                    if (c25016e6.m73453z()) {
                        arrayList2.add(this.f104406b.f97915e.f104409e);
                        this.f104406b.f97915e.f104409e.f104390k.add(c26252h);
                        C26258n c26258n2 = this.f104406b.f97915e;
                        c26258n2.f104409e.f104380a = this;
                        arrayList2.add(c26258n2.f104412h);
                        arrayList2.add(this.f104406b.f97915e.f104413i);
                        this.f104406b.f97915e.f104412h.f104390k.add(c26252h);
                        this.f104406b.f97915e.f104413i.f104390k.add(c26252h);
                    } else if (this.f104406b.m73452y()) {
                        this.f104406b.f97915e.f104409e.f104391l.add(c26252h);
                        arrayList.add(this.f104406b.f97915e.f104409e);
                    } else {
                        this.f104406b.f97915e.f104409e.f104391l.add(c26252h);
                    }
                } else {
                    C26252h c26252h3 = c25016e6.f97915e.f104409e;
                    arrayList2.add(c26252h3);
                    c26252h3.f104390k.add(c26252h);
                    this.f104406b.f97915e.f104412h.f104390k.add(c26252h);
                    this.f104406b.f97915e.f104413i.f104390k.add(c26252h);
                    c26252h.f104381b = true;
                    arrayList.add(c26251g2);
                    arrayList.add(c26251g);
                    c26251g2.f104391l.add(c26252h);
                    c26251g.f104391l.add(c26252h);
                }
            }
        }
        C25016e c25016e7 = this.f104406b;
        C25015d[] c25015dArr2 = c25016e7.f97898R;
        C25015d c25015d4 = c25015dArr2[0];
        C25015d c25015d5 = c25015d4.f97877f;
        if (c25015d5 != null && c25015dArr2[1].f97877f != null) {
            if (c25016e7.m73452y()) {
                c26251g2.f104385f = this.f104406b.f97898R[0].m73403e();
                c26251g.f104385f = -this.f104406b.f97898R[1].m73403e();
                return;
            }
            C26251g c26251gM77940h5 = AbstractC26260p.m77940h(this.f104406b.f97898R[0]);
            C26251g c26251gM77940h6 = AbstractC26260p.m77940h(this.f104406b.f97898R[1]);
            if (c26251gM77940h5 != null) {
                c26251gM77940h5.m77916b(this);
            }
            if (c26251gM77940h6 != null) {
                c26251gM77940h6.m77916b(this);
            }
            this.f104414j = 4;
            return;
        }
        if (c25015d5 != null) {
            C26251g c26251gM77940h7 = AbstractC26260p.m77940h(c25015d4);
            if (c26251gM77940h7 != null) {
                AbstractC26260p.m77939b(c26251g2, c26251gM77940h7, this.f104406b.f97898R[0].m73403e());
                m77942c(c26251g, c26251g2, 1, c26252h);
                return;
            }
            return;
        }
        C25015d c25015d6 = c25015dArr2[1];
        if (c25015d6.f97877f != null) {
            C26251g c26251gM77940h8 = AbstractC26260p.m77940h(c25015d6);
            if (c26251gM77940h8 != null) {
                AbstractC26260p.m77939b(c26251g, c26251gM77940h8, -this.f104406b.f97898R[1].m73403e());
                m77942c(c26251g2, c26251g, -1, c26252h);
                return;
            }
            return;
        }
        if ((c25016e7 instanceof AbstractC25021j) || (c25017f2 = c25016e7.f97901U) == null) {
            return;
        }
        AbstractC26260p.m77939b(c26251g2, c25017f2.f97913d.f104412h, c25016e7.m73446s());
        m77942c(c26251g, c26251g2, 1, c26252h);
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: e */
    public final void mo77903e() {
        C26251g c26251g = this.f104412h;
        if (c26251g.f104389j) {
            this.f104406b.f97906Z = c26251g.f104386g;
        }
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: f */
    public final void mo77904f() {
        this.f104407c = null;
        this.f104412h.m77917c();
        this.f104413i.m77917c();
        this.f104409e.m77917c();
        this.f104411g = false;
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: k */
    public final boolean mo77906k() {
        return this.f104408d != 3 || this.f104406b.f97942s == 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m77929n() {
        this.f104411g = false;
        C26251g c26251g = this.f104412h;
        c26251g.m77917c();
        c26251g.f104389j = false;
        C26251g c26251g2 = this.f104413i;
        c26251g2.m77917c();
        c26251g2.f104389j = false;
        this.f104409e.f104389j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f104406b.f97924i0;
    }
}
