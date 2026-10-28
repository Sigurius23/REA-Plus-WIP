package p333n4;

import java.util.ArrayList;
import java.util.Iterator;
import p319m4.AbstractC25012a;
import p319m4.C25015d;
import p319m4.C25016e;
import p319m4.C25017f;

/* JADX INFO: renamed from: n4.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C26248d extends AbstractC26260p {

    /* JADX INFO: renamed from: k */
    public final ArrayList f104369k;

    /* JADX INFO: renamed from: l */
    public int f104370l;

    public C26248d(C25016e c25016e, int i13) {
        C25016e c25016e2;
        super(c25016e);
        ArrayList<AbstractC26260p> arrayList = new ArrayList();
        this.f104369k = arrayList;
        this.f104410f = i13;
        C25016e c25016e3 = this.f104406b;
        C25016e c25016eM73443n = c25016e3.m73443n(i13);
        while (true) {
            c25016e2 = c25016e3;
            c25016e3 = c25016eM73443n;
            if (c25016e3 == null) {
                break;
            } else {
                c25016eM73443n = c25016e3.m73443n(this.f104410f);
            }
        }
        this.f104406b = c25016e2;
        int i14 = this.f104410f;
        arrayList.add(i14 == 0 ? c25016e2.f97913d : i14 == 1 ? c25016e2.f97915e : null);
        C25016e c25016eM73442m = c25016e2.m73442m(this.f104410f);
        while (c25016eM73442m != null) {
            int i15 = this.f104410f;
            arrayList.add(i15 == 0 ? c25016eM73442m.f97913d : i15 == 1 ? c25016eM73442m.f97915e : null);
            c25016eM73442m = c25016eM73442m.m73442m(this.f104410f);
        }
        for (AbstractC26260p abstractC26260p : arrayList) {
            int i16 = this.f104410f;
            if (i16 == 0) {
                abstractC26260p.f104406b.f97909b = this;
            } else if (i16 == 1) {
                abstractC26260p.f104406b.f97911c = this;
            }
        }
        if (this.f104410f == 0 && this.f104406b.f97901U.f97968w0 && arrayList.size() > 1) {
            this.f104406b = ((AbstractC26260p) AbstractC25012a.m73371d(arrayList, 1)).f104406b;
        }
        this.f104370l = this.f104410f == 0 ? this.f104406b.f97926j0 : this.f104406b.f97928k0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00de A[ADDED_TO_REGION] */
    @Override // p333n4.InterfaceC26249e
    /* JADX INFO: renamed from: a */
    public final void mo77901a(InterfaceC26249e interfaceC26249e) {
        int i13;
        int i14;
        boolean z4;
        float f13;
        int i15;
        int i16;
        int i17;
        int i18;
        float f14;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        float f15;
        C26251g c26251g = this.f104412h;
        if (c26251g.f104389j) {
            C26251g c26251g2 = this.f104413i;
            if (c26251g2.f104389j) {
                C25017f c25017f = this.f104406b.f97901U;
                boolean z13 = c25017f instanceof C25017f ? c25017f.f97968w0 : false;
                int i29 = c26251g2.f104386g - c26251g.f104386g;
                ArrayList arrayList = this.f104369k;
                int size = arrayList.size();
                int i34 = 0;
                while (true) {
                    i13 = -1;
                    i14 = 8;
                    if (i34 >= size) {
                        i34 = -1;
                        break;
                    } else if (((AbstractC26260p) arrayList.get(i34)).f104406b.f97922h0 != 8) {
                        break;
                    } else {
                        i34++;
                    }
                }
                int i35 = size - 1;
                for (int i36 = i35; i36 >= 0; i36--) {
                    if (((AbstractC26260p) arrayList.get(i36)).f104406b.f97922h0 != 8) {
                        i13 = i36;
                        break;
                    }
                }
                int i37 = 0;
                while (true) {
                    if (i37 >= 2) {
                        z4 = z13;
                        f13 = 0.0f;
                        i15 = 0;
                        i16 = 0;
                        i17 = 0;
                        break;
                    }
                    f13 = 0.0f;
                    int i38 = 0;
                    i17 = 0;
                    int i39 = 0;
                    int i44 = 0;
                    while (i38 < size) {
                        AbstractC26260p abstractC26260p = (AbstractC26260p) arrayList.get(i38);
                        C25016e c25016e = abstractC26260p.f104406b;
                        boolean z14 = z13;
                        if (c25016e.f97922h0 == i14) {
                            i27 = i37;
                        } else {
                            i44++;
                            if (i38 > 0 && i38 >= i34) {
                                i17 += abstractC26260p.f104412h.f104385f;
                            }
                            C26252h c26252h = abstractC26260p.f104409e;
                            int i45 = c26252h.f104386g;
                            i27 = i37;
                            boolean z15 = abstractC26260p.f104408d != 3;
                            if (z15) {
                                int i46 = this.f104410f;
                                if (i46 == 0 && !c25016e.f97913d.f104409e.f104389j) {
                                    return;
                                }
                                if (i46 == 1 && !c25016e.f97915e.f104409e.f104389j) {
                                    return;
                                }
                            } else {
                                if (abstractC26260p.f104405a == 1 && i27 == 0) {
                                    i28 = c26252h.f104392m;
                                    i39++;
                                } else {
                                    if (c26252h.f104389j) {
                                        i28 = i45;
                                    }
                                    if (z15) {
                                        i17 += i28;
                                    } else {
                                        i39++;
                                        f15 = c25016e.f97930l0[this.f104410f];
                                        if (f15 >= 0.0f) {
                                            f13 += f15;
                                        }
                                    }
                                    if (i38 >= i35 && i38 < i13) {
                                        i17 += -abstractC26260p.f104413i.f104385f;
                                    }
                                }
                                z15 = true;
                                if (z15) {
                                    i39++;
                                    f15 = c25016e.f97930l0[this.f104410f];
                                    if (f15 >= 0.0f) {
                                        f13 += f15;
                                    }
                                } else {
                                    i17 += i28;
                                }
                                if (i38 >= i35) {
                                }
                            }
                            i28 = i45;
                            if (z15) {
                                i39++;
                                f15 = c25016e.f97930l0[this.f104410f];
                                if (f15 >= 0.0f) {
                                    f13 += f15;
                                }
                            } else {
                                i17 += i28;
                            }
                            if (i38 >= i35) {
                            }
                        }
                        i38++;
                        z13 = z14;
                        i37 = i27;
                        i14 = 8;
                    }
                    z4 = z13;
                    int i47 = i37;
                    if (i17 < i29 || i39 == 0) {
                        i15 = i39;
                        i16 = i44;
                        break;
                    } else {
                        i37 = i47 + 1;
                        z13 = z4;
                        i14 = 8;
                    }
                }
                int i48 = c26251g.f104386g;
                if (z4) {
                    i48 = c26251g2.f104386g;
                }
                float f16 = 0.5f;
                if (i17 > i29) {
                    i48 = z4 ? i48 + ((int) (((i17 - i29) / 2.0f) + 0.5f)) : i48 - ((int) (((i17 - i29) / 2.0f) + 0.5f));
                }
                if (i15 > 0) {
                    float f17 = i29 - i17;
                    int i49 = (int) ((f17 / i15) + 0.5f);
                    int i54 = 0;
                    int i55 = 0;
                    while (i54 < size) {
                        float f18 = f16;
                        AbstractC26260p abstractC26260p2 = (AbstractC26260p) arrayList.get(i54);
                        int i56 = i48;
                        C25016e c25016e2 = abstractC26260p2.f104406b;
                        int i57 = i15;
                        C26252h c26252h2 = abstractC26260p2.f104409e;
                        float f19 = f17;
                        int i58 = i49;
                        if (c25016e2.f97922h0 != 8 && abstractC26260p2.f104408d == 3 && !c26252h2.f104389j) {
                            int i59 = f13 > 0.0f ? (int) (((c25016e2.f97930l0[this.f104410f] * f19) / f13) + f18) : i58;
                            if (this.f104410f == 0) {
                                i25 = c25016e2.f97946w;
                                i26 = c25016e2.f97945v;
                            } else {
                                i25 = c25016e2.f97949z;
                                i26 = c25016e2.f97948y;
                            }
                            int iMax = Math.max(i26, abstractC26260p2.f104405a == 1 ? Math.min(i59, c26252h2.f104392m) : i59);
                            if (i25 > 0) {
                                iMax = Math.min(i25, iMax);
                            }
                            if (iMax != i59) {
                                i55++;
                                i59 = iMax;
                            }
                            c26252h2.mo77918d(i59);
                        }
                        i54++;
                        i48 = i56;
                        f16 = f18;
                        i15 = i57;
                        f17 = f19;
                        i49 = i58;
                    }
                    i18 = i48;
                    f14 = f16;
                    int i64 = i15;
                    if (i55 > 0) {
                        i15 = i64 - i55;
                        i17 = 0;
                        for (int i65 = 0; i65 < size; i65++) {
                            AbstractC26260p abstractC26260p3 = (AbstractC26260p) arrayList.get(i65);
                            if (abstractC26260p3.f104406b.f97922h0 != 8) {
                                if (i65 > 0 && i65 >= i34) {
                                    i17 += abstractC26260p3.f104412h.f104385f;
                                }
                                i17 += abstractC26260p3.f104409e.f104386g;
                                if (i65 < i35 && i65 < i13) {
                                    i17 += -abstractC26260p3.f104413i.f104385f;
                                }
                            }
                        }
                    } else {
                        i15 = i64;
                    }
                    i24 = 2;
                    if (this.f104370l == 2 && i55 == 0) {
                        i19 = 0;
                        this.f104370l = 0;
                    } else {
                        i19 = 0;
                    }
                } else {
                    i18 = i48;
                    f14 = 0.5f;
                    i19 = 0;
                    i24 = 2;
                }
                if (i17 > i29) {
                    this.f104370l = i24;
                }
                if (i16 > 0 && i15 == 0 && i34 == i13) {
                    this.f104370l = i24;
                }
                int i66 = this.f104370l;
                if (i66 == 1) {
                    int i67 = i16 > 1 ? (i29 - i17) / (i16 - 1) : i16 == 1 ? (i29 - i17) / 2 : i19;
                    if (i15 > 0) {
                        i67 = i19;
                    }
                    int i68 = i18;
                    for (int i69 = i19; i69 < size; i69++) {
                        AbstractC26260p abstractC26260p4 = (AbstractC26260p) arrayList.get(z4 ? size - (i69 + 1) : i69);
                        C25016e c25016e3 = abstractC26260p4.f104406b;
                        C26251g c26251g3 = abstractC26260p4.f104413i;
                        C26251g c26251g4 = abstractC26260p4.f104412h;
                        if (c25016e3.f97922h0 == 8) {
                            c26251g4.mo77918d(i68);
                            c26251g3.mo77918d(i68);
                        } else {
                            if (i69 > 0) {
                                i68 = z4 ? i68 - i67 : i68 + i67;
                            }
                            if (i69 > 0 && i69 >= i34) {
                                i68 = z4 ? i68 - c26251g4.f104385f : i68 + c26251g4.f104385f;
                            }
                            if (z4) {
                                c26251g3.mo77918d(i68);
                            } else {
                                c26251g4.mo77918d(i68);
                            }
                            C26252h c26252h3 = abstractC26260p4.f104409e;
                            int i74 = c26252h3.f104386g;
                            if (abstractC26260p4.f104408d == 3 && abstractC26260p4.f104405a == 1) {
                                i74 = c26252h3.f104392m;
                            }
                            i68 = z4 ? i68 - i74 : i68 + i74;
                            if (z4) {
                                c26251g4.mo77918d(i68);
                            } else {
                                c26251g3.mo77918d(i68);
                            }
                            abstractC26260p4.f104411g = true;
                            if (i69 < i35 && i69 < i13) {
                                i68 = z4 ? i68 - (-c26251g3.f104385f) : i68 + (-c26251g3.f104385f);
                            }
                        }
                    }
                    return;
                }
                if (i66 == 0) {
                    int i75 = (i29 - i17) / (i16 + 1);
                    if (i15 > 0) {
                        i75 = i19;
                    }
                    int i76 = i18;
                    for (int i77 = i19; i77 < size; i77++) {
                        AbstractC26260p abstractC26260p5 = (AbstractC26260p) arrayList.get(z4 ? size - (i77 + 1) : i77);
                        C25016e c25016e4 = abstractC26260p5.f104406b;
                        C26251g c26251g5 = abstractC26260p5.f104413i;
                        C26251g c26251g6 = abstractC26260p5.f104412h;
                        if (c25016e4.f97922h0 == 8) {
                            c26251g6.mo77918d(i76);
                            c26251g5.mo77918d(i76);
                        } else {
                            int i78 = z4 ? i76 - i75 : i76 + i75;
                            if (i77 > 0 && i77 >= i34) {
                                i78 = z4 ? i78 - c26251g6.f104385f : i78 + c26251g6.f104385f;
                            }
                            if (z4) {
                                c26251g5.mo77918d(i78);
                            } else {
                                c26251g6.mo77918d(i78);
                            }
                            C26252h c26252h4 = abstractC26260p5.f104409e;
                            int iMin = c26252h4.f104386g;
                            if (abstractC26260p5.f104408d == 3 && abstractC26260p5.f104405a == 1) {
                                iMin = Math.min(iMin, c26252h4.f104392m);
                            }
                            i76 = z4 ? i78 - iMin : i78 + iMin;
                            if (z4) {
                                c26251g6.mo77918d(i76);
                            } else {
                                c26251g5.mo77918d(i76);
                            }
                            if (i77 < i35 && i77 < i13) {
                                i76 = z4 ? i76 - (-c26251g5.f104385f) : i76 + (-c26251g5.f104385f);
                            }
                        }
                    }
                    return;
                }
                if (i66 == 2) {
                    float f24 = this.f104410f == 0 ? this.f104406b.f97916e0 : this.f104406b.f97918f0;
                    if (z4) {
                        f24 = 1.0f - f24;
                    }
                    int i79 = (int) (((i29 - i17) * f24) + f14);
                    if (i79 < 0 || i15 > 0) {
                        i79 = i19;
                    }
                    int i83 = z4 ? i18 - i79 : i18 + i79;
                    for (int i84 = i19; i84 < size; i84++) {
                        AbstractC26260p abstractC26260p6 = (AbstractC26260p) arrayList.get(z4 ? size - (i84 + 1) : i84);
                        C25016e c25016e5 = abstractC26260p6.f104406b;
                        C26251g c26251g7 = abstractC26260p6.f104413i;
                        C26251g c26251g8 = abstractC26260p6.f104412h;
                        if (c25016e5.f97922h0 == 8) {
                            c26251g8.mo77918d(i83);
                            c26251g7.mo77918d(i83);
                        } else {
                            if (i84 > 0 && i84 >= i34) {
                                i83 = z4 ? i83 - c26251g8.f104385f : i83 + c26251g8.f104385f;
                            }
                            if (z4) {
                                c26251g7.mo77918d(i83);
                            } else {
                                c26251g8.mo77918d(i83);
                            }
                            C26252h c26252h5 = abstractC26260p6.f104409e;
                            int i85 = c26252h5.f104386g;
                            if (abstractC26260p6.f104408d == 3 && abstractC26260p6.f104405a == 1) {
                                i85 = c26252h5.f104392m;
                            }
                            i83 = z4 ? i83 - i85 : i83 + i85;
                            if (z4) {
                                c26251g8.mo77918d(i83);
                            } else {
                                c26251g7.mo77918d(i83);
                            }
                            if (i84 < i35 && i84 < i13) {
                                i83 = z4 ? i83 - (-c26251g7.f104385f) : i83 + (-c26251g7.f104385f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: d */
    public final void mo77902d() {
        ArrayList arrayList = this.f104369k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC26260p) it.next()).mo77902d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C25016e c25016e = ((AbstractC26260p) arrayList.get(0)).f104406b;
        C25016e c25016e2 = ((AbstractC26260p) arrayList.get(size - 1)).f104406b;
        int i13 = this.f104410f;
        C26251g c26251g = this.f104413i;
        C26251g c26251g2 = this.f104412h;
        if (i13 == 0) {
            C25015d c25015d = c25016e.f97890J;
            C25015d c25015d2 = c25016e2.f97892L;
            C26251g c26251gM77941i = AbstractC26260p.m77941i(c25015d, 0);
            int iM73403e = c25015d.m73403e();
            C25016e c25016eM77907m = m77907m();
            if (c25016eM77907m != null) {
                iM73403e = c25016eM77907m.f97890J.m73403e();
            }
            if (c26251gM77941i != null) {
                AbstractC26260p.m77939b(c26251g2, c26251gM77941i, iM73403e);
            }
            C26251g c26251gM77941i2 = AbstractC26260p.m77941i(c25015d2, 0);
            int iM73403e2 = c25015d2.m73403e();
            C25016e c25016eM77908n = m77908n();
            if (c25016eM77908n != null) {
                iM73403e2 = c25016eM77908n.f97892L.m73403e();
            }
            if (c26251gM77941i2 != null) {
                AbstractC26260p.m77939b(c26251g, c26251gM77941i2, -iM73403e2);
            }
        } else {
            C25015d c25015d3 = c25016e.f97891K;
            C25015d c25015d4 = c25016e2.f97893M;
            C26251g c26251gM77941i3 = AbstractC26260p.m77941i(c25015d3, 1);
            int iM73403e3 = c25015d3.m73403e();
            C25016e c25016eM77907m2 = m77907m();
            if (c25016eM77907m2 != null) {
                iM73403e3 = c25016eM77907m2.f97891K.m73403e();
            }
            if (c26251gM77941i3 != null) {
                AbstractC26260p.m77939b(c26251g2, c26251gM77941i3, iM73403e3);
            }
            C26251g c26251gM77941i4 = AbstractC26260p.m77941i(c25015d4, 1);
            int iM73403e4 = c25015d4.m73403e();
            C25016e c25016eM77908n2 = m77908n();
            if (c25016eM77908n2 != null) {
                iM73403e4 = c25016eM77908n2.f97893M.m73403e();
            }
            if (c26251gM77941i4 != null) {
                AbstractC26260p.m77939b(c26251g, c26251gM77941i4, -iM73403e4);
            }
        }
        c26251g2.f104380a = this;
        c26251g.f104380a = this;
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: e */
    public final void mo77903e() {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f104369k;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((AbstractC26260p) arrayList.get(i13)).mo77903e();
            i13++;
        }
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: f */
    public final void mo77904f() {
        this.f104407c = null;
        Iterator it = this.f104369k.iterator();
        while (it.hasNext()) {
            ((AbstractC26260p) it.next()).mo77904f();
        }
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: j */
    public final long mo77905j() {
        ArrayList arrayList = this.f104369k;
        int size = arrayList.size();
        long jMo77905j = 0;
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC26260p abstractC26260p = (AbstractC26260p) arrayList.get(i13);
            jMo77905j = ((long) abstractC26260p.f104413i.f104385f) + abstractC26260p.mo77905j() + jMo77905j + ((long) abstractC26260p.f104412h.f104385f);
        }
        return jMo77905j;
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: k */
    public final boolean mo77906k() {
        ArrayList arrayList = this.f104369k;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (!((AbstractC26260p) arrayList.get(i13)).mo77906k()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final C25016e m77907m() {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f104369k;
            if (i13 >= arrayList.size()) {
                return null;
            }
            C25016e c25016e = ((AbstractC26260p) arrayList.get(i13)).f104406b;
            if (c25016e.f97922h0 != 8) {
                return c25016e;
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final C25016e m77908n() {
        ArrayList arrayList = this.f104369k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C25016e c25016e = ((AbstractC26260p) arrayList.get(size)).f104406b;
            if (c25016e.f97922h0 != 8) {
                return c25016e;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ChainRun ");
        sb4.append(this.f104410f == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC26260p abstractC26260p : this.f104369k) {
            sb4.append("<");
            sb4.append(abstractC26260p);
            sb4.append("> ");
        }
        return sb4.toString();
    }
}
