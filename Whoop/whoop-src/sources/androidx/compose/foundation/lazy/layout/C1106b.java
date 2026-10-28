package androidx.compose.foundation.lazy.layout;

import androidx.compose.p018ui.Modifier;
import bc3.InterfaceC2994c0;
import java.util.ArrayList;
import java.util.Collections;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25269w;
import p002a0.AbstractC0015d1;
import p002a0.AbstractC0018e1;
import p002a0.C0057v0;
import p002a0.C0059w0;
import p004a2.AbstractC0152a;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p012ab.C0682h0;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p208i2.InterfaceC17883f0;
import p293l2.C23226c;
import p389p0.AbstractC28560y;
import p389p0.C28550t;
import p389p0.C28554v;
import p389p0.C28556w;
import p389p0.C28558x;
import p389p0.InterfaceC28518e0;
import p636y3.C39169a;
import p636y3.C39178j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1106b {

    /* JADX INFO: renamed from: a */
    public final C0057v0 f4613a;

    /* JADX INFO: renamed from: b */
    public C0682h0 f4614b;

    /* JADX INFO: renamed from: c */
    public int f4615c;

    /* JADX INFO: renamed from: d */
    public final C0059w0 f4616d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f4617e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f4618f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f4619g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f4620h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f4621i;

    /* JADX INFO: renamed from: j */
    public C28554v f4622j;

    /* JADX INFO: renamed from: k */
    public final Modifier f4623k;

    public C1106b() {
        long[] jArr = AbstractC0015d1.f36a;
        this.f4613a = new C0057v0();
        C0059w0 c0059w0 = AbstractC0018e1.f44a;
        this.f4616d = new C0059w0();
        this.f4617e = new ArrayList();
        this.f4618f = new ArrayList();
        this.f4619g = new ArrayList();
        this.f4620h = new ArrayList();
        this.f4621i = new ArrayList();
        this.f4623k = new AbstractC0207h1(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* JADX INFO: renamed from: w */
            public final C1106b f4607w;

            {
                this.f4607w = this;
            }

            @Override // p005a3.AbstractC0207h1
            public final AbstractC2316v create() {
                return new C28554v(this.f4607w);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && AbstractC22676k.m65745e(this.f4607w, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f4607w);
            }

            public final int hashCode() {
                return this.f4607w.hashCode();
            }

            @Override // p005a3.AbstractC0207h1
            public final void inspectableProperties(C2404l2 c2404l2) {
                c2404l2.m7401c("DisplayingDisappearingItemsElement");
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f4607w + ')';
            }

            @Override // p005a3.AbstractC0207h1
            public final void update(AbstractC2316v abstractC2316v) {
                ((C28554v) abstractC2316v).m86861X0(this.f4607w);
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public static void m3435c(InterfaceC28518e0 interfaceC28518e0, int i13, C28556w c28556w) {
        int i14 = 0;
        long jMo77547j = interfaceC28518e0.mo77547j(0);
        long jM124791a = interfaceC28518e0.mo77542e() ? C39178j.m124791a(0, i13, jMo77547j, 1) : C39178j.m124791a(i13, 0, jMo77547j, 2);
        C28550t[] c28550tArrM86864a = c28556w.m86864a();
        int length = c28550tArrM86864a.length;
        int i15 = 0;
        while (i14 < length) {
            C28550t c28550t = c28550tArrM86864a[i14];
            int i16 = i15 + 1;
            if (c28550t != null) {
                c28550t.m86860n(C39178j.m124794d(jM124791a, C39178j.m124793c(interfaceC28518e0.mo77547j(i15), jMo77547j)));
            }
            i14++;
            i15 = i16;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m3436h(int[] iArr, InterfaceC28518e0 interfaceC28518e0) {
        int iMo77548k = interfaceC28518e0.mo77548k();
        int iMo77543f = interfaceC28518e0.mo77543f() + iMo77548k;
        int iMax = 0;
        while (iMo77548k < iMo77543f) {
            int iMo77544g = interfaceC28518e0.mo77544g() + iArr[iMo77548k];
            iArr[iMo77548k] = iMo77544g;
            iMax = Math.max(iMax, iMo77544g);
            iMo77548k++;
        }
        return iMax;
    }

    /* JADX INFO: renamed from: a */
    public final C28550t m3437a(int i13, Object obj) {
        C28550t[] c28550tArrM86864a;
        C28556w c28556w = (C28556w) this.f4613a.m129g(obj);
        if (c28556w == null || (c28550tArrM86864a = c28556w.m86864a()) == null) {
            return null;
        }
        return c28550tArrM86864a[i13];
    }

    /* JADX INFO: renamed from: b */
    public final long m3438b() {
        ArrayList arrayList = this.f4621i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i13 = 0; i13 < size; i13++) {
            C28550t c28550t = (C28550t) arrayList.get(i13);
            C23226c c23226cM86850d = c28550t.m86850d();
            if (c23226cM86850d != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (c28550t.m86851e() >> 32)) + ((int) (c23226cM86850d.f91985u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (c28550t.m86851e() & 4294967295L)) + ((int) (c23226cM86850d.f91985u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Code duplicated, block: B:246:0x00ce A[EDGE_INSN: B:246:0x00ce->B:45:0x00ce BREAK  A[LOOP:2: B:32:0x0094->B:44:0x00cb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb A[LOOP:2: B:32:0x0094->B:44:0x00cb, LOOP_END] */
    /* JADX INFO: renamed from: d */
    public final void m3439d(int i13, int i14, int i15, ArrayList arrayList, C0682h0 c0682h0, AbstractC0152a abstractC0152a, boolean z4, boolean z13, int i16, boolean z14, int i17, int i18, InterfaceC2994c0 interfaceC2994c0, InterfaceC17883f0 interfaceC17883f0) {
        C0057v0 c0057v0;
        long j7;
        long j13;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr;
        C0059w0 c0059w0;
        ArrayList arrayList5;
        C0682h0 c0682h1;
        int[] iArr2;
        int iM86868e;
        int iM86869f;
        ArrayList arrayList6;
        long[] jArr;
        int i19;
        long[] jArr2;
        long j14;
        C0059w0 c0059w1;
        int i24;
        ArrayList arrayList7 = arrayList;
        int i25 = i16;
        C0682h0 c0682h2 = this.f4614b;
        this.f4614b = c0682h0;
        int size = arrayList7.size();
        int i26 = 0;
        loop0: while (true) {
            c0057v0 = this.f4613a;
            if (i26 >= size) {
                if (!c0057v0.m131i()) {
                    break;
                }
                m3440e();
                return;
            }
            InterfaceC28518e0 interfaceC28518e0 = (InterfaceC28518e0) arrayList7.get(i26);
            int iMo77539b = interfaceC28518e0.mo77539b();
            for (int i27 = 0; i27 < iMo77539b; i27++) {
                if (AbstractC28560y.m86881h(interfaceC28518e0.mo77545h(i27)) != null) {
                    break loop0;
                }
            }
            i26++;
        }
        int i28 = this.f4615c;
        InterfaceC28518e0 interfaceC28518e1 = (InterfaceC28518e0) AbstractC25265s.m74100H0(arrayList7);
        this.f4615c = interfaceC28518e1 != null ? interfaceC28518e1.getIndex() : 0;
        if (z4) {
            j7 = 4294967295L;
            j13 = (((long) i13) & 4294967295L) | (((long) 0) << 32);
        } else {
            j7 = 4294967295L;
            j13 = (((long) i13) << 32) | (((long) 0) & 4294967295L);
        }
        boolean z15 = z13 || !z14;
        Object[] objArr = c0057v0.f171b;
        long[] jArr3 = c0057v0.f170a;
        int length = jArr3.length - 2;
        C0059w0 c0059w2 = this.f4616d;
        boolean z16 = z15;
        if (length >= 0) {
            int i29 = 0;
            while (true) {
                long j15 = jArr3[i29];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i29 != length) {
                        break;
                        break;
                    }
                    i29++;
                } else {
                    int i34 = 8 - ((~(i29 - length)) >>> 31);
                    for (int i35 = 0; i35 < i34; i35++) {
                        if ((j15 & 255) < 128) {
                            c0059w2.m136a(objArr[(i29 << 3) + i35]);
                        }
                        j15 >>= 8;
                    }
                    if (i34 != 8) {
                        break;
                    } else if (i29 != length) {
                        break;
                    } else {
                        i29++;
                    }
                }
            }
        }
        int size2 = arrayList7.size();
        int i36 = 0;
        while (true) {
            arrayList2 = this.f4621i;
            arrayList3 = this.f4618f;
            arrayList4 = this.f4617e;
            if (i36 >= size2) {
                break;
            }
            InterfaceC28518e0 interfaceC28518e2 = (InterfaceC28518e0) arrayList7.get(i36);
            int i37 = size2;
            c0059w2.m147l(interfaceC28518e2.getKey());
            int iMo77539b2 = interfaceC28518e2.mo77539b();
            int i38 = i36;
            int i39 = 0;
            while (true) {
                if (i39 >= iMo77539b2) {
                    m3441f(interfaceC28518e2.getKey());
                    break;
                }
                if (AbstractC28560y.m86881h(interfaceC28518e2.mo77545h(i39)) != null) {
                    C28556w c28556w = (C28556w) c0057v0.m129g(interfaceC28518e2.getKey());
                    int iM1699n = c0682h2 != null ? c0682h2.m1699n(interfaceC28518e2.getKey()) : -1;
                    boolean z17 = iM1699n == -1 && c0682h2 != null;
                    if (c28556w != null) {
                        boolean z18 = z17;
                        if (!z16) {
                            break;
                        }
                        C28556w.m86863k(c28556w, interfaceC28518e2, interfaceC2994c0, interfaceC17883f0, i17, i18);
                        C28550t[] c28550tArrM86864a = c28556w.m86864a();
                        int length2 = c28550tArrM86864a.length;
                        int i44 = 0;
                        while (i44 < length2) {
                            C28550t c28550t = c28550tArrM86864a[i44];
                            C28550t[] c28550tArr = c28550tArrM86864a;
                            int i45 = length2;
                            if (c28550t != null) {
                                long jM86851e = c28550t.m86851e();
                                int i46 = C28550t.f115500t;
                                AbstractC28560y.m86885o();
                                if (!C39178j.m124792b(jM86851e, C28550t.f115499s)) {
                                    c28550t.m86860n(C39178j.m124794d(c28550t.m86851e(), j13));
                                }
                            }
                            i44++;
                            c28550tArrM86864a = c28550tArr;
                            length2 = i45;
                        }
                        if (z18) {
                            for (C28550t c28550t2 : c28556w.m86864a()) {
                                if (c28550t2 != null) {
                                    if (c28550t2.m86853g()) {
                                        arrayList2.remove(c28550t2);
                                        C28554v c28554v = this.f4622j;
                                        if (c28554v != null) {
                                            AbstractC0201g.m508h(c28554v);
                                        }
                                    }
                                    c28550t2.m86847a();
                                }
                            }
                        }
                        m3442g(interfaceC28518e2, false);
                        break;
                    }
                    C28556w c28556w2 = new C28556w(this);
                    C28556w.m86863k(c28556w2, interfaceC28518e2, interfaceC2994c0, interfaceC17883f0, i17, i18);
                    boolean z19 = z17;
                    c0057v0.m135m(interfaceC28518e2.getKey(), c28556w2);
                    if (interfaceC28518e2.getIndex() != iM1699n && iM1699n != -1) {
                        if (iM1699n < i28) {
                            arrayList4.add(interfaceC28518e2);
                            break;
                        } else {
                            arrayList3.add(interfaceC28518e2);
                            break;
                        }
                    }
                    long jMo77547j = interfaceC28518e2.mo77547j(0);
                    m3435c(interfaceC28518e2, (int) (interfaceC28518e2.mo77542e() ? jMo77547j & j7 : jMo77547j >> 32), c28556w2);
                    if (!z19) {
                        break;
                    }
                    C28550t[] c28550tArrM86864a2 = c28556w2.m86864a();
                    for (C28550t c28550t3 : c28550tArrM86864a2) {
                        if (c28550t3 != null) {
                            c28550t3.m86847a();
                        }
                    }
                    break;
                }
                i39++;
            }
            i36 = i38 + 1;
            arrayList7 = arrayList;
            size2 = i37;
        }
        int[] iArr3 = new int[i25];
        if (z16 && c0682h2 != null) {
            if (arrayList4.isEmpty()) {
                i24 = 0;
            } else {
                if (arrayList4.size() > 1) {
                    AbstractC25269w.m74166l0(arrayList4, new C28558x(c0682h2, 2));
                }
                int size3 = arrayList4.size();
                for (int i47 = 0; i47 < size3; i47++) {
                    InterfaceC28518e0 interfaceC28518e3 = (InterfaceC28518e0) arrayList4.get(i47);
                    int iM3436h = i17 - m3436h(iArr3, interfaceC28518e3);
                    Object objM129g = c0057v0.m129g(interfaceC28518e3.getKey());
                    AbstractC22676k.m65747g(objM129g);
                    m3435c(interfaceC28518e3, iM3436h, (C28556w) objM129g);
                    m3442g(interfaceC28518e3, false);
                }
                i24 = 0;
                AbstractC25260n.m74074o0(iArr3, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    AbstractC25269w.m74166l0(arrayList3, new C28558x(c0682h2, i24));
                }
                int size4 = arrayList3.size();
                for (int i48 = 0; i48 < size4; i48++) {
                    InterfaceC28518e0 interfaceC28518e4 = (InterfaceC28518e0) arrayList3.get(i48);
                    int iM3436h2 = (m3436h(iArr3, interfaceC28518e4) + i18) - interfaceC28518e4.mo77544g();
                    Object objM129g2 = c0057v0.m129g(interfaceC28518e4.getKey());
                    AbstractC22676k.m65747g(objM129g2);
                    m3435c(interfaceC28518e4, iM3436h2, (C28556w) objM129g2);
                    m3442g(interfaceC28518e4, false);
                }
                AbstractC25260n.m74074o0(iArr3, 0);
            }
        }
        Object[] objArr2 = c0059w2.f178b;
        long[] jArr4 = c0059w2.f177a;
        int length3 = jArr4.length - 2;
        ArrayList arrayList8 = this.f4620h;
        ArrayList arrayList9 = this.f4619g;
        if (length3 >= 0) {
            arrayList5 = arrayList3;
            int i49 = 0;
            while (true) {
                long j16 = jArr4[i49];
                iArr = iArr3;
                Object[] objArr3 = objArr2;
                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i54 = 8 - ((~(i49 - length3)) >>> 31);
                    int i55 = 0;
                    while (i55 < i54) {
                        if ((j16 & 255) < 128) {
                            i19 = i55;
                            Object obj = objArr3[(i49 << 3) + i55];
                            jArr2 = jArr4;
                            C28556w c28556w3 = (C28556w) c0057v0.m129g(obj);
                            if (c28556w3 != null) {
                                c0059w1 = c0059w2;
                                j14 = j16;
                                int iM1699n2 = c0682h0.m1699n(obj);
                                c28556w3.m86872i(Math.min(i25, c28556w3.m86870g()));
                                c28556w3.m86871h(Math.min(i25 - c28556w3.m86870g(), c28556w3.m86867d()));
                                if (iM1699n2 == -1) {
                                    C28550t[] c28550tArrM86864a3 = c28556w3.m86864a();
                                    int length4 = c28550tArrM86864a3.length;
                                    int i56 = 0;
                                    boolean z24 = false;
                                    int i57 = 0;
                                    while (i56 < length4) {
                                        C28556w c28556w4 = c28556w3;
                                        C28550t c28550t4 = c28550tArrM86864a3[i56];
                                        int i58 = i57 + 1;
                                        if (c28550t4 != null) {
                                            if (c28550t4.m86853g()) {
                                                z24 = true;
                                            } else if (c28550t4.m86852f()) {
                                                c28550t4.m86855i();
                                                c28556w4.m86864a()[i57] = null;
                                                arrayList2.remove(c28550t4);
                                                C28554v c28554v2 = this.f4622j;
                                                if (c28554v2 != null) {
                                                    AbstractC0201g.m508h(c28554v2);
                                                }
                                            } else {
                                                if (c28550t4.m86850d() != null) {
                                                    c28550t4.m86848b();
                                                }
                                                if (c28550t4.m86853g()) {
                                                    arrayList2.add(c28550t4);
                                                    C28554v c28554v3 = this.f4622j;
                                                    if (c28554v3 != null) {
                                                        AbstractC0201g.m508h(c28554v3);
                                                    }
                                                    z24 = true;
                                                } else {
                                                    c28550t4.m86855i();
                                                    c28556w4.m86864a()[i57] = null;
                                                }
                                            }
                                        }
                                        i56++;
                                        c28556w3 = c28556w4;
                                        i57 = i58;
                                    }
                                    if (!z24) {
                                        m3441f(obj);
                                    }
                                    arrayList2 = arrayList2;
                                } else {
                                    C39169a c39169aM86865b = c28556w3.m86865b();
                                    AbstractC22676k.m65747g(c39169aM86865b);
                                    ArrayList arrayList10 = arrayList2;
                                    InterfaceC28518e0 interfaceC28518e0Mo398w = abstractC0152a.mo398w(iM1699n2, c28556w3.m86867d(), c39169aM86865b.f168407a, c28556w3.m86870g());
                                    interfaceC28518e0Mo398w.mo77546i();
                                    C28550t[] c28550tArrM86864a4 = c28556w3.m86864a();
                                    int length5 = c28550tArrM86864a4.length;
                                    int i59 = 0;
                                    while (true) {
                                        if (i59 < length5) {
                                            C28550t c28550t5 = c28550tArrM86864a4[i59];
                                            C28550t[] c28550tArr2 = c28550tArrM86864a4;
                                            if (c28550t5 != null) {
                                                boolean zM86854h = c28550t5.m86854h();
                                                arrayList2 = arrayList10;
                                                if (zM86854h) {
                                                }
                                            } else {
                                                arrayList2 = arrayList10;
                                            }
                                            i59++;
                                            arrayList10 = arrayList2;
                                            c28550tArrM86864a4 = c28550tArr2;
                                        } else {
                                            arrayList2 = arrayList10;
                                            if (c0682h2 != null && iM1699n2 == c0682h2.m1699n(obj)) {
                                                m3441f(obj);
                                            }
                                        }
                                        c28556w3.m86873j(interfaceC28518e0Mo398w, interfaceC2994c0, interfaceC17883f0, i17, i18, c28556w3.m86866c());
                                        if (iM1699n2 < this.f4615c) {
                                            arrayList9.add(interfaceC28518e0Mo398w);
                                        } else {
                                            arrayList8.add(interfaceC28518e0Mo398w);
                                        }
                                    }
                                }
                            }
                            j16 = j14 >> 8;
                            i55 = i19 + 1;
                            i25 = i16;
                            c0059w2 = c0059w1;
                            jArr4 = jArr2;
                            arrayList2 = arrayList2;
                        } else {
                            i19 = i55;
                            jArr2 = jArr4;
                        }
                        c0059w1 = c0059w2;
                        j14 = j16;
                        j16 = j14 >> 8;
                        i55 = i19 + 1;
                        i25 = i16;
                        c0059w2 = c0059w1;
                        jArr4 = jArr2;
                        arrayList2 = arrayList2;
                    }
                    arrayList6 = arrayList2;
                    jArr = jArr4;
                    c0059w0 = c0059w2;
                    c0682h1 = c0682h0;
                    if (i54 != 8) {
                        break;
                    }
                } else {
                    arrayList6 = arrayList2;
                    jArr = jArr4;
                    c0059w0 = c0059w2;
                    c0682h1 = c0682h0;
                }
                if (i49 == length3) {
                    break;
                }
                i49++;
                i25 = i16;
                iArr3 = iArr;
                objArr2 = objArr3;
                c0059w2 = c0059w0;
                jArr4 = jArr;
                arrayList2 = arrayList6;
            }
        } else {
            iArr = iArr3;
            c0059w0 = c0059w2;
            arrayList5 = arrayList3;
            c0682h1 = c0682h0;
        }
        if (arrayList9.isEmpty()) {
            iArr2 = iArr;
        } else {
            if (arrayList9.size() > 1) {
                AbstractC25269w.m74166l0(arrayList9, new C28558x(c0682h1, 3));
            }
            int size5 = arrayList9.size();
            int i64 = 0;
            while (i64 < size5) {
                InterfaceC28518e0 interfaceC28518e5 = (InterfaceC28518e0) arrayList9.get(i64);
                Object objM129g3 = c0057v0.m129g(interfaceC28518e5.getKey());
                AbstractC22676k.m65747g(objM129g3);
                C28556w c28556w5 = (C28556w) objM129g3;
                int[] iArr4 = iArr;
                int iM3436h3 = m3436h(iArr4, interfaceC28518e5);
                if (z13) {
                    InterfaceC28518e0 interfaceC28518e6 = (InterfaceC28518e0) AbstractC25265s.m74096F0(arrayList);
                    long jMo77547j2 = interfaceC28518e6.mo77547j(0);
                    iM86869f = (int) (interfaceC28518e6.mo77542e() ? jMo77547j2 & j7 : jMo77547j2 >> 32);
                } else {
                    iM86869f = c28556w5.m86869f();
                }
                interfaceC28518e5.mo77538a(iM86869f - iM3436h3, c28556w5.m86866c(), i14, i15);
                if (z16) {
                    m3442g(interfaceC28518e5, true);
                }
                i64++;
                iArr = iArr4;
            }
            iArr2 = iArr;
            AbstractC25260n.m74074o0(iArr2, 0);
        }
        if (!arrayList8.isEmpty()) {
            int i65 = 1;
            if (arrayList8.size() > 1) {
                AbstractC25269w.m74166l0(arrayList8, new C28558x(c0682h1, i65));
            }
            int size6 = arrayList8.size();
            for (int i66 = 0; i66 < size6; i66++) {
                InterfaceC28518e0 interfaceC28518e7 = (InterfaceC28518e0) arrayList8.get(i66);
                Object objM129g4 = c0057v0.m129g(interfaceC28518e7.getKey());
                AbstractC22676k.m65747g(objM129g4);
                C28556w c28556w6 = (C28556w) objM129g4;
                int iM3436h4 = m3436h(iArr2, interfaceC28518e7);
                if (z13) {
                    InterfaceC28518e0 interfaceC28518e8 = (InterfaceC28518e0) AbstractC25265s.m74112P0(arrayList);
                    long jMo77547j3 = interfaceC28518e8.mo77547j(0);
                    iM86868e = interfaceC28518e8.mo77544g() + ((int) (interfaceC28518e8.mo77542e() ? jMo77547j3 & j7 : jMo77547j3 >> 32));
                } else {
                    iM86868e = c28556w6.m86868e();
                }
                interfaceC28518e7.mo77538a((iM86868e - interfaceC28518e7.mo77544g()) + iM3436h4, c28556w6.m86866c(), i14, i15);
                if (z16) {
                    m3442g(interfaceC28518e7, true);
                }
            }
        }
        Collections.reverse(arrayList9);
        arrayList.addAll(0, arrayList9);
        arrayList.addAll(arrayList8);
        arrayList4.clear();
        arrayList5.clear();
        arrayList9.clear();
        arrayList8.clear();
        c0059w0.m137b();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0059 A[LOOP:0: B:7:0x0013->B:22:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c A[EDGE_INSN: B:26:0x005c->B:23:0x005c BREAK  A[LOOP:0: B:7:0x0013->B:22:0x0059], SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final void m3440e() {
        C0057v0 c0057v0 = this.f4613a;
        if (c0057v0.m132j()) {
            Object[] objArr = c0057v0.f172c;
            long[] jArr = c0057v0.f170a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j7 = jArr[i13];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i13 != length) {
                            break;
                            break;
                        }
                        i13++;
                    } else {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((255 & j7) < 128) {
                                for (C28550t c28550t : ((C28556w) objArr[(i13 << 3) + i15]).m86864a()) {
                                    if (c28550t != null) {
                                        c28550t.m86855i();
                                    }
                                }
                            }
                            j7 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        } else if (i13 != length) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
            c0057v0.m123a();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3441f(Object obj) {
        C28550t[] c28550tArrM86864a;
        C28556w c28556w = (C28556w) this.f4613a.m133k(obj);
        if (c28556w == null || (c28550tArrM86864a = c28556w.m86864a()) == null) {
            return;
        }
        for (C28550t c28550t : c28550tArrM86864a) {
            if (c28550t != null) {
                c28550t.m86855i();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3442g(InterfaceC28518e0 interfaceC28518e0, boolean z4) {
        Object objM129g = this.f4613a.m129g(interfaceC28518e0.getKey());
        AbstractC22676k.m65747g(objM129g);
        C28550t[] c28550tArrM86864a = ((C28556w) objM129g).m86864a();
        int length = c28550tArrM86864a.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            C28550t c28550t = c28550tArrM86864a[i13];
            int i15 = i14 + 1;
            if (c28550t != null) {
                long jMo77547j = interfaceC28518e0.mo77547j(i14);
                long jM86851e = c28550t.m86851e();
                int i16 = C28550t.f115500t;
                AbstractC28560y.m86885o();
                if (!C39178j.m124792b(jM86851e, C28550t.f115499s) && !C39178j.m124792b(jM86851e, jMo77547j)) {
                    c28550t.m86849c(C39178j.m124793c(jMo77547j, jM86851e), z4);
                }
                c28550t.m86860n(jMo77547j);
            }
            i13++;
            i14 = i15;
        }
    }
}
