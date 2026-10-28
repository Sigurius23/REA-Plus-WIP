package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1670d {

    /* JADX INFO: renamed from: b */
    public static ExecutorService f6602b;

    /* JADX INFO: renamed from: a */
    public static final Object f6601a = new Object();

    /* JADX INFO: renamed from: c */
    public static final C1726r f6603c = new C1726r(0);

    /* JADX INFO: renamed from: c */
    public static C1734t m5212c(AbstractC1670d abstractC1670d) {
        int i13;
        C1750x c1750x;
        int i14;
        C1746w c1746w;
        C1730s c1730s;
        int i15;
        int i16;
        C1750x c1750x2;
        C1750x c1750x3;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int iMo5220i = abstractC1670d.mo5220i();
        int iMo5219h = abstractC1670d.mo5219h();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C1746w c1746w2 = new C1746w();
        int i28 = 0;
        c1746w2.f6905a = 0;
        c1746w2.f6906b = iMo5220i;
        c1746w2.f6907c = 0;
        c1746w2.f6908d = iMo5219h;
        arrayList2.add(c1746w2);
        int i29 = iMo5220i + iMo5219h;
        int i34 = 1;
        int i35 = (((i29 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i35];
        int i36 = i35 / 2;
        int[] iArr2 = new int[i35];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C1746w c1746w3 = (C1746w) arrayList2.remove(arrayList2.size() - i34);
            if (c1746w3.m5334b() >= i34 && c1746w3.m5333a() >= i34) {
                int iM5333a = ((c1746w3.m5333a() + c1746w3.m5334b()) + i34) / 2;
                int i37 = i34 + i36;
                iArr[i37] = c1746w3.f6905a;
                iArr2[i37] = c1746w3.f6906b;
                int i38 = i28;
                while (true) {
                    if (i38 >= iM5333a) {
                        i13 = i36;
                        c1750x = null;
                        break;
                    }
                    int i39 = Math.abs(c1746w3.m5334b() - c1746w3.m5333a()) % 2 == i34 ? i34 : i28;
                    int iM5334b = c1746w3.m5334b() - c1746w3.m5333a();
                    int i44 = -i38;
                    int i45 = i44;
                    while (true) {
                        if (i45 > i38) {
                            i15 = i28;
                            i13 = i36;
                            i16 = iM5333a;
                            c1750x2 = null;
                            break;
                        }
                        if (i45 == i44 || (i45 != i38 && iArr[i45 + 1 + i36] > iArr[(i45 - 1) + i36])) {
                            i25 = iArr[i45 + 1 + i36];
                            i26 = i25;
                        } else {
                            i25 = iArr[(i45 - 1) + i36];
                            i26 = i25 + 1;
                        }
                        i13 = i36;
                        int i46 = ((i26 - c1746w3.f6905a) + c1746w3.f6907c) - i45;
                        int i47 = (i38 == 0 || i26 != i25) ? i46 : i46 - 1;
                        int i48 = i45;
                        int i49 = i46;
                        int i54 = i26;
                        i16 = iM5333a;
                        while (i54 < c1746w3.f6906b && i49 < c1746w3.f6908d && abstractC1670d.mo5217b(i54, i49)) {
                            i54++;
                            i49++;
                        }
                        iArr[i48 + i13] = i54;
                        if (i39 != 0) {
                            int i55 = iM5334b - i48;
                            i27 = i39;
                            if (i55 >= i44 + 1 && i55 <= i38 - 1 && iArr2[i55 + i13] <= i54) {
                                c1750x2 = new C1750x();
                                c1750x2.f6918a = i25;
                                c1750x2.f6919b = i47;
                                c1750x2.f6920c = i54;
                                c1750x2.f6921d = i49;
                                i15 = 0;
                                c1750x2.f6922e = false;
                                break;
                            }
                        } else {
                            i27 = i39;
                        }
                        i45 = i48 + 2;
                        i28 = 0;
                        i36 = i13;
                        iM5333a = i16;
                        i39 = i27;
                    }
                    if (c1750x2 != null) {
                        c1750x = c1750x2;
                        break;
                    }
                    int i56 = (c1746w3.m5334b() - c1746w3.m5333a()) % 2 == 0 ? 1 : i15;
                    int iM5334b2 = c1746w3.m5334b() - c1746w3.m5333a();
                    int i57 = i44;
                    while (true) {
                        if (i57 > i38) {
                            c1750x3 = null;
                            break;
                        }
                        if (i57 == i44 || (i57 != i38 && iArr2[i57 + 1 + i13] < iArr2[(i57 - 1) + i13])) {
                            i17 = iArr2[i57 + 1 + i13];
                            i18 = i17;
                        } else {
                            i17 = iArr2[(i57 - 1) + i13];
                            i18 = i17 - 1;
                        }
                        int i58 = c1746w3.f6908d - ((c1746w3.f6906b - i18) - i57);
                        int i59 = (i38 == 0 || i18 != i17) ? i58 : i58 + 1;
                        int i64 = i56;
                        while (true) {
                            if (i18 > c1746w3.f6905a && i58 > c1746w3.f6907c) {
                                i19 = iM5334b2;
                                if (!abstractC1670d.mo5217b(i18 - 1, i58 - 1)) {
                                    break;
                                }
                                i18--;
                                i58--;
                                iM5334b2 = i19;
                            } else {
                                i19 = iM5334b2;
                                break;
                            }
                        }
                        iArr2[i57 + i13] = i18;
                        if (i64 != 0 && (i24 = i19 - i57) >= i44 && i24 <= i38 && iArr[i24 + i13] >= i18) {
                            c1750x3 = new C1750x();
                            c1750x3.f6918a = i18;
                            c1750x3.f6919b = i58;
                            c1750x3.f6920c = i17;
                            c1750x3.f6921d = i59;
                            c1750x3.f6922e = true;
                            break;
                        }
                        i57 += 2;
                        i56 = i64;
                        iM5334b2 = i19;
                    }
                    if (c1750x3 != null) {
                        c1750x = c1750x3;
                        break;
                    }
                    i38++;
                    i36 = i13;
                    iM5333a = i16;
                    i34 = 1;
                    i28 = 0;
                }
            } else {
                i13 = i36;
                c1750x = null;
                break;
            }
            if (c1750x != null) {
                if (c1750x.m5343a() > 0) {
                    int i65 = c1750x.f6921d;
                    int i66 = c1750x.f6919b;
                    int i67 = i65 - i66;
                    int i68 = c1750x.f6920c;
                    int i69 = c1750x.f6918a;
                    int i74 = i68 - i69;
                    if (i67 == i74) {
                        c1730s = new C1730s(i69, i66, i74);
                    } else if (c1750x.f6922e) {
                        c1730s = new C1730s(i69, i66, c1750x.m5343a());
                    } else {
                        c1730s = i67 > i74 ? new C1730s(i69, i66 + 1, c1750x.m5343a()) : new C1730s(i69 + 1, i66, c1750x.m5343a());
                    }
                    arrayList.add(c1730s);
                }
                if (arrayList3.isEmpty()) {
                    c1746w = new C1746w();
                    i14 = 1;
                } else {
                    i14 = 1;
                    c1746w = (C1746w) arrayList3.remove(arrayList3.size() - 1);
                }
                c1746w.f6905a = c1746w3.f6905a;
                c1746w.f6907c = c1746w3.f6907c;
                c1746w.f6906b = c1750x.f6918a;
                c1746w.f6908d = c1750x.f6919b;
                arrayList2.add(c1746w);
                c1746w3.f6906b = c1746w3.f6906b;
                c1746w3.f6908d = c1746w3.f6908d;
                c1746w3.f6905a = c1750x.f6920c;
                c1746w3.f6907c = c1750x.f6921d;
                arrayList2.add(c1746w3);
            } else {
                i14 = 1;
                arrayList3.add(c1746w3);
            }
            i36 = i13;
            i34 = i14;
            i28 = 0;
        }
        Collections.sort(arrayList, f6603c);
        return new C1734t(abstractC1670d, arrayList, iArr, iArr2);
    }

    /* JADX INFO: renamed from: d */
    public static int m5213d(C1701k2 c1701k2, AbstractC1667c1 abstractC1667c1, View view, View view2, AbstractC1740u1 abstractC1740u1, boolean z4) {
        if (abstractC1740u1.getChildCount() == 0 || c1701k2.m5276b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return Math.abs(abstractC1740u1.getPosition(view) - abstractC1740u1.getPosition(view2)) + 1;
        }
        return Math.min(abstractC1667c1.mo5188l(), abstractC1667c1.mo5178b(view2) - abstractC1667c1.mo5181e(view));
    }

    /* JADX INFO: renamed from: e */
    public static int m5214e(C1701k2 c1701k2, AbstractC1667c1 abstractC1667c1, View view, View view2, AbstractC1740u1 abstractC1740u1, boolean z4, boolean z13) {
        if (abstractC1740u1.getChildCount() == 0 || c1701k2.m5276b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z13 ? Math.max(0, (c1701k2.m5276b() - Math.max(abstractC1740u1.getPosition(view), abstractC1740u1.getPosition(view2))) - 1) : Math.max(0, Math.min(abstractC1740u1.getPosition(view), abstractC1740u1.getPosition(view2)));
        if (z4) {
            return Math.round((iMax * (Math.abs(abstractC1667c1.mo5178b(view2) - abstractC1667c1.mo5181e(view)) / (Math.abs(abstractC1740u1.getPosition(view) - abstractC1740u1.getPosition(view2)) + 1))) + (abstractC1667c1.mo5187k() - abstractC1667c1.mo5181e(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: f */
    public static int m5215f(C1701k2 c1701k2, AbstractC1667c1 abstractC1667c1, View view, View view2, AbstractC1740u1 abstractC1740u1, boolean z4) {
        if (abstractC1740u1.getChildCount() == 0 || c1701k2.m5276b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return c1701k2.m5276b();
        }
        return (int) (((abstractC1667c1.mo5178b(view2) - abstractC1667c1.mo5181e(view)) / (Math.abs(abstractC1740u1.getPosition(view) - abstractC1740u1.getPosition(view2)) + 1)) * c1701k2.m5276b());
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo5216a(int i13, int i14);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo5217b(int i13, int i14);

    /* JADX INFO: renamed from: g */
    public abstract Object mo5218g(int i13, int i14);

    /* JADX INFO: renamed from: h */
    public abstract int mo5219h();

    /* JADX INFO: renamed from: i */
    public abstract int mo5220i();
}
