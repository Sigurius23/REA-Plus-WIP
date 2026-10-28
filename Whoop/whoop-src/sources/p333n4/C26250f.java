package p333n4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25272z;
import ne3.C26611e0;
import p319m4.AbstractC25021j;
import p319m4.C25015d;
import p319m4.C25016e;
import p319m4.C25017f;
import p319m4.C25020i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C26250f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f104371a;

    /* JADX INFO: renamed from: b */
    public boolean f104372b;

    /* JADX INFO: renamed from: c */
    public boolean f104373c;

    /* JADX INFO: renamed from: d */
    public Object f104374d;

    /* JADX INFO: renamed from: e */
    public Object f104375e;

    /* JADX INFO: renamed from: f */
    public Serializable f104376f;

    /* JADX INFO: renamed from: g */
    public Serializable f104377g;

    /* JADX INFO: renamed from: h */
    public Object f104378h;

    /* JADX INFO: renamed from: i */
    public Object f104379i;

    /* JADX INFO: renamed from: a */
    public void m77909a(C26251g c26251g, int i13, ArrayList arrayList, C26257m c26257m) {
        AbstractC26260p abstractC26260p = c26251g.f104383d;
        C26257m c26257m2 = abstractC26260p.f104407c;
        C26251g c26251g2 = abstractC26260p.f104413i;
        C26251g c26251g3 = abstractC26260p.f104412h;
        if (c26257m2 == null) {
            C25017f c25017f = (C25017f) this.f104374d;
            if (abstractC26260p == c25017f.f97913d || abstractC26260p == c25017f.f97915e) {
                return;
            }
            if (c26257m == null) {
                c26257m = new C26257m(abstractC26260p);
                arrayList.add(c26257m);
            }
            abstractC26260p.f104407c = c26257m;
            c26257m.m77932a(abstractC26260p);
            for (InterfaceC26249e interfaceC26249e : c26251g3.f104390k) {
                if (interfaceC26249e instanceof C26251g) {
                    m77909a((C26251g) interfaceC26249e, i13, arrayList, c26257m);
                }
            }
            for (InterfaceC26249e interfaceC26249e2 : c26251g2.f104390k) {
                if (interfaceC26249e2 instanceof C26251g) {
                    m77909a((C26251g) interfaceC26249e2, i13, arrayList, c26257m);
                }
            }
            if (i13 == 1 && (abstractC26260p instanceof C26258n)) {
                for (InterfaceC26249e interfaceC26249e3 : ((C26258n) abstractC26260p).f104397k.f104390k) {
                    if (interfaceC26249e3 instanceof C26251g) {
                        m77909a((C26251g) interfaceC26249e3, i13, arrayList, c26257m);
                    }
                }
            }
            Iterator it = c26251g3.f104391l.iterator();
            while (it.hasNext()) {
                m77909a((C26251g) it.next(), i13, arrayList, c26257m);
            }
            Iterator it3 = c26251g2.f104391l.iterator();
            while (it3.hasNext()) {
                m77909a((C26251g) it3.next(), i13, arrayList, c26257m);
            }
            if (i13 == 1 && (abstractC26260p instanceof C26258n)) {
                Iterator it4 = ((C26258n) abstractC26260p).f104397k.f104391l.iterator();
                while (it4.hasNext()) {
                    m77909a((C26251g) it4.next(), i13, arrayList, c26257m);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01be  */
    /* JADX WARN: Code duplicated, block: B:105:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:114:0x021a  */
    /* JADX WARN: Code duplicated, block: B:123:0x025d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0303  */
    /* JADX WARN: Code duplicated, block: B:149:0x0315  */
    /* JADX WARN: Code duplicated, block: B:150:0x0328  */
    /* JADX WARN: Code duplicated, block: B:156:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0226 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0268 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x000a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a4 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: b */
    public void m77910b(C25017f c25017f) {
        int i13;
        int iM73445r;
        int iM73441l;
        int iM73441l2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        float f13;
        int i34;
        int i35;
        ArrayList<C25016e> arrayList = c25017f.f97963r0;
        int[] iArr = c25017f.f97940q0;
        for (C25016e c25016e : arrayList) {
            int[] iArr2 = c25016e.f97940q0;
            C25015d[] c25015dArr = c25016e.f97898R;
            C25015d c25015d = c25016e.f97893M;
            C25015d c25015d2 = c25016e.f97891K;
            C25015d c25015d3 = c25016e.f97892L;
            C25015d c25015d4 = c25016e.f97890J;
            int i36 = iArr2[0];
            int i37 = iArr2[1];
            if (c25016e.f97922h0 == 8) {
                c25016e.f97907a = true;
            } else {
                float f14 = c25016e.f97947x;
                if (f14 < 1.0f && i36 == 3) {
                    c25016e.f97942s = 2;
                }
                float f15 = c25016e.f97881A;
                if (f15 < 1.0f && i37 == 3) {
                    c25016e.f97943t = 2;
                }
                if (c25016e.f97904X > 0.0f) {
                    if (i36 == 3 && (i37 == 2 || i37 == 1)) {
                        c25016e.f97942s = 3;
                    } else if (i37 == 3 && (i36 == 2 || i36 == 1)) {
                        c25016e.f97943t = 3;
                    } else if (i36 == 3 && i37 == 3) {
                        if (c25016e.f97942s == 0) {
                            c25016e.f97942s = 3;
                        }
                        if (c25016e.f97943t == 0) {
                            c25016e.f97943t = 3;
                        }
                    }
                }
                if (i36 == 3 && c25016e.f97942s == 1 && (c25015d4.f97877f == null || c25015d3.f97877f == null)) {
                    i36 = 2;
                }
                if (i37 == 3 && c25016e.f97943t == 1 && (c25015d2.f97877f == null || c25015d.f97877f == null)) {
                    i37 = 2;
                }
                C26256l c26256l = c25016e.f97913d;
                c26256l.f104408d = i36;
                int i38 = c25016e.f97942s;
                c26256l.f104405a = i38;
                C26258n c26258n = c25016e.f97915e;
                c26258n.f104408d = i37;
                int i39 = c25016e.f97943t;
                c26258n.f104405a = i39;
                if (i36 == 4 || i36 == 1) {
                    if (i37 == 4) {
                        if (i37 != 1) {
                            i15 = 2;
                            if (i37 != 2) {
                                if (i36 != 3) {
                                    i16 = i37;
                                    i17 = 1;
                                } else if (i37 == i15 && i37 != 1) {
                                    i16 = i37;
                                    i18 = 3;
                                    i17 = 1;
                                    if (i16 != i18) {
                                        i19 = i16;
                                        i24 = i15;
                                        i25 = 1;
                                        i26 = i36;
                                    } else if (i36 == i15 && i36 != i17) {
                                        i27 = i18;
                                        i19 = i16;
                                        i24 = i15;
                                        i25 = 1;
                                        i26 = i36;
                                        if (i26 != i27 && i19 == i27) {
                                            if (i38 == i25 || i39 == i25) {
                                                m77914f(i24, 0, i24, 0, c25016e);
                                                c25016e.f97913d.f104409e.f104392m = c25016e.m73445r();
                                                c25016e.f97915e.f104409e.f104392m = c25016e.m73441l();
                                            } else if (i39 == 2 && i38 == 2 && iArr[0] == i17 && iArr[i25] == i17) {
                                                m77914f(i17, (int) ((f14 * c25017f.m73445r()) + 0.5f), i17, (int) ((f15 * c25017f.m73441l()) + 0.5f), c25016e);
                                                c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                                                c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                                                c25016e.f97907a = true;
                                            }
                                        }
                                    } else if (i39 == i18) {
                                        if (i36 == i15) {
                                            m77914f(i15, 0, i15, 0, c25016e);
                                        }
                                        int iM73445r2 = c25016e.m73445r();
                                        f13 = c25016e.f97904X;
                                        if (c25016e.f97905Y == -1) {
                                            f13 = 1.0f / f13;
                                        }
                                        m77914f(i17, iM73445r2, i17, (int) ((iM73445r2 * f13) + 0.5f), c25016e);
                                        c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                                        c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                                        c25016e.f97907a = true;
                                    } else {
                                        i19 = i16;
                                        i17 = i17;
                                        i28 = i15;
                                        if (i39 == 1) {
                                            m77914f(i36, 0, i28, 0, c25016e);
                                            c25016e.f97915e.f104409e.f104392m = c25016e.m73441l();
                                        } else {
                                            i26 = i36;
                                            if (i39 == 2) {
                                                i29 = iArr[1];
                                                if (i29 != i17 || i29 == 4) {
                                                    m77914f(i26, c25016e.m73445r(), i17, (int) ((f15 * c25017f.m73441l()) + 0.5f), c25016e);
                                                    c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                                                    c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                                                    c25016e.f97907a = true;
                                                } else {
                                                    i24 = i28;
                                                    i25 = 1;
                                                }
                                            } else if (c25015dArr[2].f97877f != null || c25015dArr[3].f97877f == null) {
                                                m77914f(i28, 0, i19, 0, c25016e);
                                                c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                                                c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                                                c25016e.f97907a = true;
                                            } else {
                                                i24 = i28;
                                                i25 = 1;
                                            }
                                        }
                                    }
                                    i27 = 3;
                                    if (i26 != i27) {
                                    }
                                } else if (i38 == 3) {
                                    if (i37 == i15) {
                                        m77914f(i15, 0, i15, 0, c25016e);
                                    }
                                    int iM73441l3 = c25016e.m73441l();
                                    m77914f(1, (int) ((iM73441l3 * c25016e.f97904X) + 0.5f), 1, iM73441l3, c25016e);
                                    c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                                    c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                                    c25016e.f97907a = true;
                                } else {
                                    i34 = i15;
                                    if (i38 == 1) {
                                        m77914f(i34, 0, i37, 0, c25016e);
                                        c25016e.f97913d.f104409e.f104392m = c25016e.m73445r();
                                    } else {
                                        i15 = i34;
                                        if (i38 == 2) {
                                            i35 = iArr[0];
                                            if (i35 != 1 || i35 == 4) {
                                                m77914f(1, (int) ((f14 * c25017f.m73445r()) + 0.5f), i37, c25016e.m73441l(), c25016e);
                                                c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                                                c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                                                c25016e.f97907a = true;
                                            } else {
                                                i17 = 1;
                                                i16 = i37;
                                            }
                                        } else {
                                            i17 = 1;
                                            i16 = i37;
                                            if (c25015dArr[0].f97877f != null || c25015dArr[1].f97877f == null) {
                                                m77914f(i15, 0, i16, 0, c25016e);
                                                c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                                                c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                                                c25016e.f97907a = true;
                                            }
                                        }
                                    }
                                }
                                i18 = 3;
                                if (i16 != i18) {
                                    if (i36 == i15) {
                                    }
                                    if (i39 == i18) {
                                        if (i36 == i15) {
                                            m77914f(i15, 0, i15, 0, c25016e);
                                        }
                                        int iM73445r3 = c25016e.m73445r();
                                        f13 = c25016e.f97904X;
                                        if (c25016e.f97905Y == -1) {
                                            f13 = 1.0f / f13;
                                        }
                                        m77914f(i17, iM73445r3, i17, (int) ((iM73445r3 * f13) + 0.5f), c25016e);
                                        c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                                        c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                                        c25016e.f97907a = true;
                                    } else {
                                        i19 = i16;
                                        i17 = i17;
                                        i28 = i15;
                                        if (i39 == 1) {
                                            m77914f(i36, 0, i28, 0, c25016e);
                                            c25016e.f97915e.f104409e.f104392m = c25016e.m73441l();
                                        } else {
                                            i26 = i36;
                                            if (i39 == 2) {
                                                i29 = iArr[1];
                                                if (i29 != i17) {
                                                }
                                                m77914f(i26, c25016e.m73445r(), i17, (int) ((f15 * c25017f.m73441l()) + 0.5f), c25016e);
                                                c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                                                c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                                                c25016e.f97907a = true;
                                            } else {
                                                if (c25015dArr[2].f97877f != null) {
                                                }
                                                m77914f(i28, 0, i19, 0, c25016e);
                                                c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                                                c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                                                c25016e.f97907a = true;
                                            }
                                        }
                                    }
                                } else {
                                    i19 = i16;
                                    i24 = i15;
                                    i25 = 1;
                                    i26 = i36;
                                }
                                i27 = 3;
                                if (i26 != i27) {
                                }
                            }
                        } else {
                            i13 = 1;
                        }
                        iM73445r = c25016e.m73445r();
                        if (i36 == 4) {
                            iM73445r = (c25017f.m73445r() - c25015d4.f97878g) - c25015d3.f97878g;
                            i36 = i13;
                        }
                        iM73441l = c25016e.m73441l();
                        if (i37 == 4) {
                            iM73441l2 = (c25017f.m73441l() - c25015d2.f97878g) - c25015d.f97878g;
                            i14 = i13;
                        } else {
                            iM73441l2 = iM73441l;
                            i14 = i37;
                        }
                        m77914f(i36, iM73445r, i14, iM73441l2, c25016e);
                        c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                        c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                        c25016e.f97907a = true;
                    }
                    i13 = 1;
                    iM73445r = c25016e.m73445r();
                    if (i36 == 4) {
                        iM73445r = (c25017f.m73445r() - c25015d4.f97878g) - c25015d3.f97878g;
                        i36 = i13;
                    }
                    iM73441l = c25016e.m73441l();
                    if (i37 == 4) {
                        iM73441l2 = (c25017f.m73441l() - c25015d2.f97878g) - c25015d.f97878g;
                        i14 = i13;
                    } else {
                        iM73441l2 = iM73441l;
                        i14 = i37;
                    }
                    m77914f(i36, iM73445r, i14, iM73441l2, c25016e);
                    c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                    c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                    c25016e.f97907a = true;
                } else {
                    i15 = 2;
                    if (i36 == 2) {
                        if (i37 == 4) {
                            if (i37 != 1) {
                                i15 = 2;
                                if (i37 != 2) {
                                }
                            } else {
                                i13 = 1;
                            }
                            iM73445r = c25016e.m73445r();
                            if (i36 == 4) {
                                iM73445r = (c25017f.m73445r() - c25015d4.f97878g) - c25015d3.f97878g;
                                i36 = i13;
                            }
                            iM73441l = c25016e.m73441l();
                            if (i37 == 4) {
                                iM73441l2 = (c25017f.m73441l() - c25015d2.f97878g) - c25015d.f97878g;
                                i14 = i13;
                            } else {
                                iM73441l2 = iM73441l;
                                i14 = i37;
                            }
                            m77914f(i36, iM73445r, i14, iM73441l2, c25016e);
                            c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                            c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                            c25016e.f97907a = true;
                        }
                        i13 = 1;
                        iM73445r = c25016e.m73445r();
                        if (i36 == 4) {
                            iM73445r = (c25017f.m73445r() - c25015d4.f97878g) - c25015d3.f97878g;
                            i36 = i13;
                        }
                        iM73441l = c25016e.m73441l();
                        if (i37 == 4) {
                            iM73441l2 = (c25017f.m73441l() - c25015d2.f97878g) - c25015d.f97878g;
                            i14 = i13;
                        } else {
                            iM73441l2 = iM73441l;
                            i14 = i37;
                        }
                        m77914f(i36, iM73445r, i14, iM73441l2, c25016e);
                        c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                        c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                        c25016e.f97907a = true;
                    }
                    if (i36 != 3) {
                        if (i37 == i15) {
                        }
                        if (i38 == 3) {
                            if (i37 == i15) {
                                m77914f(i15, 0, i15, 0, c25016e);
                            }
                            int iM73441l4 = c25016e.m73441l();
                            m77914f(1, (int) ((iM73441l4 * c25016e.f97904X) + 0.5f), 1, iM73441l4, c25016e);
                            c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                            c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                            c25016e.f97907a = true;
                        } else {
                            i34 = i15;
                            if (i38 == 1) {
                                m77914f(i34, 0, i37, 0, c25016e);
                                c25016e.f97913d.f104409e.f104392m = c25016e.m73445r();
                            } else {
                                i15 = i34;
                                if (i38 == 2) {
                                    i35 = iArr[0];
                                    if (i35 != 1) {
                                    }
                                    m77914f(1, (int) ((f14 * c25017f.m73445r()) + 0.5f), i37, c25016e.m73441l(), c25016e);
                                    c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                                    c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                                    c25016e.f97907a = true;
                                } else {
                                    i17 = 1;
                                    i16 = i37;
                                    if (c25015dArr[0].f97877f != null) {
                                    }
                                    m77914f(i15, 0, i16, 0, c25016e);
                                    c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                                    c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                                    c25016e.f97907a = true;
                                }
                            }
                        }
                    } else {
                        i16 = i37;
                        i17 = 1;
                    }
                    i18 = 3;
                    if (i16 != i18) {
                        if (i36 == i15) {
                        }
                        if (i39 == i18) {
                            if (i36 == i15) {
                                m77914f(i15, 0, i15, 0, c25016e);
                            }
                            int iM73445r4 = c25016e.m73445r();
                            f13 = c25016e.f97904X;
                            if (c25016e.f97905Y == -1) {
                                f13 = 1.0f / f13;
                            }
                            m77914f(i17, iM73445r4, i17, (int) ((iM73445r4 * f13) + 0.5f), c25016e);
                            c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                            c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                            c25016e.f97907a = true;
                        } else {
                            i19 = i16;
                            i17 = i17;
                            i28 = i15;
                            if (i39 == 1) {
                                m77914f(i36, 0, i28, 0, c25016e);
                                c25016e.f97915e.f104409e.f104392m = c25016e.m73441l();
                            } else {
                                i26 = i36;
                                if (i39 == 2) {
                                    i29 = iArr[1];
                                    if (i29 != i17) {
                                    }
                                    m77914f(i26, c25016e.m73445r(), i17, (int) ((f15 * c25017f.m73441l()) + 0.5f), c25016e);
                                    c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                                    c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                                    c25016e.f97907a = true;
                                } else {
                                    if (c25015dArr[2].f97877f != null) {
                                    }
                                    m77914f(i28, 0, i19, 0, c25016e);
                                    c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                                    c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                                    c25016e.f97907a = true;
                                }
                            }
                        }
                    } else {
                        i19 = i16;
                        i24 = i15;
                        i25 = 1;
                        i26 = i36;
                    }
                    i27 = 3;
                    if (i26 != i27) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m77911c() {
        C25017f c25017f = (C25017f) this.f104374d;
        ArrayList arrayList = (ArrayList) this.f104377g;
        ArrayList<AbstractC26260p> arrayList2 = (ArrayList) this.f104376f;
        arrayList2.clear();
        C25017f c25017f2 = (C25017f) this.f104375e;
        c25017f2.f97913d.mo77904f();
        c25017f2.f97915e.mo77904f();
        arrayList2.add(c25017f2.f97913d);
        arrayList2.add(c25017f2.f97915e);
        HashSet hashSet = null;
        for (C25016e c25016e : c25017f2.f97963r0) {
            if (c25016e instanceof C25020i) {
                arrayList2.add(new C26254j((C25020i) c25016e));
            } else {
                if (c25016e.m73452y()) {
                    if (c25016e.f97909b == null) {
                        c25016e.f97909b = new C26248d(c25016e, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c25016e.f97909b);
                } else {
                    arrayList2.add(c25016e.f97913d);
                }
                if (c25016e.m73453z()) {
                    if (c25016e.f97911c == null) {
                        c25016e.f97911c = new C26248d(c25016e, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c25016e.f97911c);
                } else {
                    arrayList2.add(c25016e.f97915e);
                }
                if (c25016e instanceof AbstractC25021j) {
                    arrayList2.add(new C26255k(c25016e));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((AbstractC26260p) it.next()).mo77904f();
        }
        for (AbstractC26260p abstractC26260p : arrayList2) {
            if (abstractC26260p.f104406b != c25017f2) {
                abstractC26260p.mo77902d();
            }
        }
        arrayList.clear();
        m77913e(c25017f.f97913d, 0, arrayList);
        m77913e(c25017f.f97915e, 1, arrayList);
        this.f104372b = false;
    }

    /* JADX INFO: renamed from: d */
    public int m77912d(C25017f c25017f, int i13) {
        ArrayList arrayList = (ArrayList) this.f104377g;
        int size = arrayList.size();
        long jMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            jMax = Math.max(jMax, ((C26257m) arrayList.get(i14)).m77933b(c25017f, i13));
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: e */
    public void m77913e(AbstractC26260p abstractC26260p, int i13, ArrayList arrayList) {
        C26251g c26251g = abstractC26260p.f104412h;
        C26251g c26251g2 = abstractC26260p.f104413i;
        for (InterfaceC26249e interfaceC26249e : c26251g.f104390k) {
            if (interfaceC26249e instanceof C26251g) {
                m77909a((C26251g) interfaceC26249e, i13, arrayList, null);
            } else if (interfaceC26249e instanceof AbstractC26260p) {
                m77909a(((AbstractC26260p) interfaceC26249e).f104412h, i13, arrayList, null);
            }
        }
        for (InterfaceC26249e interfaceC26249e2 : c26251g2.f104390k) {
            if (interfaceC26249e2 instanceof C26251g) {
                m77909a((C26251g) interfaceC26249e2, i13, arrayList, null);
            } else if (interfaceC26249e2 instanceof AbstractC26260p) {
                m77909a(((AbstractC26260p) interfaceC26249e2).f104413i, i13, arrayList, null);
            }
        }
        if (i13 == 1) {
            for (InterfaceC26249e interfaceC26249e3 : ((C26258n) abstractC26260p).f104397k.f104390k) {
                if (interfaceC26249e3 instanceof C26251g) {
                    m77909a((C26251g) interfaceC26249e3, i13, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m77914f(int i13, int i14, int i15, int i16, C25016e c25016e) {
        C26246b c26246b = (C26246b) this.f104379i;
        c26246b.f104359a = i13;
        c26246b.f104360b = i15;
        c26246b.f104361c = i14;
        c26246b.f104362d = i16;
        ((InterfaceC26247c) this.f104378h).mo3624a(c25016e, c26246b);
        c25016e.m73429S(c26246b.f104363e);
        c25016e.m73424N(c26246b.f104364f);
        c25016e.f97886F = c26246b.f104366h;
        c25016e.m73420J(c26246b.f104365g);
    }

    /* JADX INFO: renamed from: g */
    public void m77915g() {
        C26245a c26245a;
        for (C25016e c25016e : ((C25017f) this.f104374d).f97963r0) {
            if (!c25016e.f97907a) {
                int[] iArr = c25016e.f97940q0;
                boolean z4 = false;
                int i13 = iArr[0];
                int i14 = iArr[1];
                int i15 = c25016e.f97942s;
                int i16 = c25016e.f97943t;
                boolean z13 = i13 == 2 || (i13 == 3 && i15 == 1);
                if (i14 == 2 || (i14 == 3 && i16 == 1)) {
                    z4 = true;
                }
                C26252h c26252h = c25016e.f97913d.f104409e;
                boolean z14 = c26252h.f104389j;
                C26252h c26252h2 = c25016e.f97915e.f104409e;
                boolean z15 = c26252h2.f104389j;
                boolean z16 = z13;
                if (z14 && z15) {
                    m77914f(1, c26252h.f104386g, 1, c26252h2.f104386g, c25016e);
                    c25016e.f97907a = true;
                } else if (z14 && z4) {
                    m77914f(1, c26252h.f104386g, 2, c26252h2.f104386g, c25016e);
                    if (i14 == 3) {
                        c25016e.f97915e.f104409e.f104392m = c25016e.m73441l();
                    } else {
                        c25016e.f97915e.f104409e.mo77918d(c25016e.m73441l());
                        c25016e.f97907a = true;
                    }
                } else if (z15 && z16) {
                    m77914f(2, c26252h.f104386g, 1, c26252h2.f104386g, c25016e);
                    if (i13 == 3) {
                        c25016e.f97913d.f104409e.f104392m = c25016e.m73445r();
                    } else {
                        c25016e.f97913d.f104409e.mo77918d(c25016e.m73445r());
                        c25016e.f97907a = true;
                    }
                }
                if (c25016e.f97907a && (c26245a = c25016e.f97915e.f104398l) != null) {
                    c26245a.mo77918d(c25016e.f97910b0);
                }
            }
        }
    }

    public String toString() {
        switch (this.f104371a) {
            case 1:
                Map map = (Map) this.f104379i;
                Long l7 = (Long) this.f104378h;
                Long l12 = (Long) this.f104377g;
                Long l13 = (Long) this.f104376f;
                Long l14 = (Long) this.f104375e;
                ArrayList arrayList = new ArrayList();
                if (this.f104372b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f104373c) {
                    arrayList.add("isDirectory");
                }
                if (l14 != null) {
                    arrayList.add("byteCount=" + l14.longValue());
                }
                if (l13 != null) {
                    arrayList.add("createdAt=" + l13.longValue());
                }
                if (l12 != null) {
                    arrayList.add("lastModifiedAt=" + l12.longValue());
                }
                if (l7 != null) {
                    arrayList.add("lastAccessedAt=" + l7.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return AbstractC25265s.m74110N0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public C26250f(C25017f c25017f) {
        this.f104371a = 0;
        this.f104372b = true;
        this.f104373c = true;
        this.f104376f = new ArrayList();
        new ArrayList();
        this.f104378h = null;
        this.f104379i = new C26246b();
        this.f104377g = new ArrayList();
        this.f104374d = c25017f;
        this.f104375e = c25017f;
    }

    public C26250f(boolean z4, boolean z13, C26611e0 c26611e0, Long l7, Long l12, Long l13, Long l14, Map extras) {
        this.f104371a = 1;
        AbstractC22676k.m65750j(extras, "extras");
        this.f104372b = z4;
        this.f104373c = z13;
        this.f104374d = c26611e0;
        this.f104375e = l7;
        this.f104376f = l12;
        this.f104377g = l13;
        this.f104378h = l14;
        this.f104379i = AbstractC25247g0.m74001j0(extras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26250f(boolean z4, boolean z13, C26611e0 c26611e0, Long l7, Long l12, Long l13, Long l14) {
        this(z4, z13, c26611e0, l7, l12, l13, l14, C25272z.f99163w);
        this.f104371a = 1;
    }
}
