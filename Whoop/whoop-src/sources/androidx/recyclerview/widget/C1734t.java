package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C1734t {

    /* JADX INFO: renamed from: a */
    public final ArrayList f6855a;

    /* JADX INFO: renamed from: b */
    public final int[] f6856b;

    /* JADX INFO: renamed from: c */
    public final int[] f6857c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1670d f6858d;

    /* JADX INFO: renamed from: e */
    public final int f6859e;

    /* JADX INFO: renamed from: f */
    public final int f6860f;

    /* JADX INFO: renamed from: g */
    public final boolean f6861g;

    public C1734t(AbstractC1670d abstractC1670d, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i13;
        int i14;
        this.f6855a = arrayList;
        this.f6856b = iArr;
        this.f6857c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f6858d = abstractC1670d;
        int iMo5220i = abstractC1670d.mo5220i();
        this.f6859e = iMo5220i;
        int iMo5219h = abstractC1670d.mo5219h();
        this.f6860f = iMo5219h;
        this.f6861g = true;
        C1730s c1730s = arrayList.isEmpty() ? null : (C1730s) arrayList.get(0);
        if (c1730s == null || c1730s.f6840a != 0 || c1730s.f6841b != 0) {
            arrayList.add(0, new C1730s(0, 0, 0));
        }
        arrayList.add(new C1730s(iMo5220i, iMo5219h, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1730s c1730s2 = (C1730s) it.next();
            for (int i15 = 0; i15 < c1730s2.f6842c; i15++) {
                int i16 = c1730s2.f6840a + i15;
                int i17 = c1730s2.f6841b + i15;
                int i18 = abstractC1670d.mo5216a(i16, i17) ? 1 : 2;
                iArr[i16] = (i17 << 4) | i18;
                iArr2[i17] = (i16 << 4) | i18;
            }
        }
        if (this.f6861g) {
            Iterator it3 = arrayList.iterator();
            int i19 = 0;
            while (it3.hasNext()) {
                C1730s c1730s3 = (C1730s) it3.next();
                while (true) {
                    i13 = c1730s3.f6840a;
                    if (i19 < i13) {
                        if (iArr[i19] == 0) {
                            int size = arrayList.size();
                            int i24 = 0;
                            for (int i25 = 0; i25 < size; i25++) {
                                C1730s c1730s4 = (C1730s) arrayList.get(i25);
                                while (true) {
                                    i14 = c1730s4.f6841b;
                                    if (i24 < i14) {
                                        if (iArr2[i24] == 0 && abstractC1670d.mo5217b(i19, i24)) {
                                            int i26 = abstractC1670d.mo5216a(i19, i24) ? 8 : 4;
                                            iArr[i19] = (i24 << 4) | i26;
                                            iArr2[i24] = i26 | (i19 << 4);
                                            break;
                                        }
                                        i24++;
                                    }
                                }
                                i24 = c1730s4.f6842c + i14;
                            }
                        }
                        i19++;
                    }
                }
                i19 = c1730s3.f6842c + i13;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1742v m5326b(ArrayDeque arrayDeque, int i13, boolean z4) {
        C1742v c1742v;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c1742v = null;
                break;
            }
            c1742v = (C1742v) it.next();
            if (c1742v.f6887a == i13 && c1742v.f6889c == z4) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C1742v c1742v2 = (C1742v) it.next();
            if (z4) {
                c1742v2.f6888b--;
            } else {
                c1742v2.f6888b++;
            }
        }
        return c1742v;
    }

    /* JADX INFO: renamed from: a */
    public final void m5327a(InterfaceC1657a1 interfaceC1657a1) {
        int[] iArr;
        AbstractC1670d abstractC1670d;
        int i13;
        int i14;
        ArrayList arrayList;
        C1734t c1734t = this;
        C1690i c1690i = interfaceC1657a1 instanceof C1690i ? (C1690i) interfaceC1657a1 : new C1690i(interfaceC1657a1);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = c1734t.f6855a;
        boolean z4 = true;
        int size = arrayList2.size() - 1;
        int i15 = c1734t.f6859e;
        int i16 = c1734t.f6860f;
        int i17 = i15;
        while (size >= 0) {
            C1730s c1730s = (C1730s) arrayList2.get(size);
            int i18 = c1730s.f6840a;
            int i19 = c1730s.f6842c;
            int i24 = i18 + i19;
            int i25 = c1730s.f6841b;
            int i26 = i25 + i19;
            while (true) {
                iArr = c1734t.f6856b;
                abstractC1670d = c1734t.f6858d;
                boolean z13 = z4;
                i13 = 0;
                if (i17 <= i24) {
                    break;
                }
                i17--;
                int i27 = iArr[i17];
                if ((i27 & 12) != 0) {
                    arrayList = arrayList2;
                    int i28 = i27 >> 4;
                    C1742v c1742vM5326b = m5326b(arrayDeque, i28, false);
                    if (c1742vM5326b != null) {
                        int i29 = (i15 - c1742vM5326b.f6888b) - 1;
                        c1690i.mo2217d(i17, i29);
                        if ((i27 & 4) != 0) {
                            c1690i.mo2216c(i29, z13 ? 1 : 0, abstractC1670d.mo5218g(i17, i28));
                        }
                    } else {
                        arrayDeque.add(new C1742v(i17, (i15 - i17) - (z13 ? 1 : 0), z13));
                    }
                } else {
                    arrayList = arrayList2;
                    c1690i.mo2215b(i17, z13 ? 1 : 0);
                    i15--;
                }
                arrayList2 = arrayList;
                z4 = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i16 > i26) {
                i16--;
                int i34 = c1734t.f6857c[i16];
                if ((i34 & 12) != 0) {
                    int i35 = i34 >> 4;
                    C1742v c1742vM5326b2 = m5326b(arrayDeque, i35, true);
                    if (c1742vM5326b2 == null) {
                        arrayDeque.add(new C1742v(i16, i15 - i17, false));
                        i14 = 0;
                    } else {
                        i14 = 0;
                        c1690i.mo2217d((i15 - c1742vM5326b2.f6888b) - 1, i17);
                        if ((i34 & 4) != 0) {
                            c1690i.mo2216c(i17, 1, abstractC1670d.mo5218g(i35, i16));
                        }
                    }
                } else {
                    i14 = i13;
                    c1690i.mo2214a(i17, 1);
                    i15++;
                }
                c1734t = this;
                i13 = i14;
            }
            int i36 = i25;
            int i37 = i18;
            while (i13 < i19) {
                if ((iArr[i37] & 15) == 2) {
                    c1690i.mo2216c(i37, 1, abstractC1670d.mo5218g(i37, i36));
                }
                i37++;
                i36++;
                i13++;
            }
            size--;
            c1734t = this;
            z4 = true;
            i16 = i25;
            i17 = i18;
            arrayList2 = arrayList3;
        }
        c1690i.m5251e();
    }
}
