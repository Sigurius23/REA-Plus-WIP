package p291l0;

import kf1.C22440a;
import p026b2.InterfaceC2300f;
import p026b2.InterfaceC2301g;

/* JADX INFO: renamed from: l0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22977m {

    /* JADX INFO: renamed from: a */
    public static final C22949e f90650a = new C22949e(4);

    /* JADX INFO: renamed from: b */
    public static final C22949e f90651b = new C22949e(3);

    /* JADX INFO: renamed from: c */
    public static final C22957g f90652c = new C22957g(1);

    /* JADX INFO: renamed from: d */
    public static final C22957g f90653d = new C22957g(0);

    /* JADX INFO: renamed from: e */
    public static final C22961h f90654e = new C22961h(0);

    /* JADX INFO: renamed from: f */
    public static final C22961h f90655f = new C22961h(3);

    /* JADX INFO: renamed from: g */
    public static final C22961h f90656g = new C22961h(2);

    /* JADX INFO: renamed from: h */
    public static final C22961h f90657h = new C22961h(1);

    /* JADX INFO: renamed from: a */
    public static C22961h m66738a() {
        return f90654e;
    }

    /* JADX INFO: renamed from: b */
    public static C22961h m66739b() {
        return f90656g;
    }

    /* JADX INFO: renamed from: c */
    public static void m66740c(int i13, int[] iArr, int[] iArr2, boolean z4) {
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        float f13 = (i13 - i15) / 2;
        if (!z4) {
            int length = iArr.length;
            int i17 = 0;
            while (i14 < length) {
                int i18 = iArr[i14];
                iArr2[i17] = Math.round(f13);
                f13 += i18;
                i14++;
                i17++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i19 = iArr[length2];
            iArr2[length2] = Math.round(f13);
            f13 += i19;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m66741d(int[] iArr, int[] iArr2, boolean z4) {
        int i13 = 0;
        if (!z4) {
            int length = iArr.length;
            int i14 = 0;
            int i15 = 0;
            while (i13 < length) {
                int i16 = iArr[i13];
                iArr2[i14] = i15;
                i15 += i16;
                i13++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = iArr[length2];
            iArr2[length2] = i13;
            i13 += i17;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m66742e(int i13, int[] iArr, int[] iArr2, boolean z4) {
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        int i17 = i13 - i15;
        if (!z4) {
            int length = iArr.length;
            int i18 = 0;
            while (i14 < length) {
                int i19 = iArr[i14];
                iArr2[i18] = i17;
                i17 += i19;
                i14++;
                i18++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i24 = iArr[length2];
            iArr2[length2] = i17;
            i17 += i24;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m66743f(int i13, int[] iArr, int[] iArr2, boolean z4) {
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        float length = iArr.length == 0 ? 0.0f : (i13 - i15) / iArr.length;
        float f13 = length / 2;
        if (!z4) {
            int length2 = iArr.length;
            int i17 = 0;
            while (i14 < length2) {
                int i18 = iArr[i14];
                iArr2[i17] = Math.round(f13);
                f13 += i18 + length;
                i14++;
                i17++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i19 = iArr[length3];
            iArr2[length3] = Math.round(f13);
            f13 += i19 + length;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m66744g(int i13, int[] iArr, int[] iArr2, boolean z4) {
        if (iArr.length == 0) {
            return;
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        float fMax = (i13 - i15) / Math.max(iArr.length - 1, 1);
        float f13 = (z4 && iArr.length == 1) ? fMax : 0.0f;
        if (z4) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i17 = iArr[length];
                iArr2[length] = Math.round(f13);
                f13 += i17 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i18 = 0;
        while (i14 < length2) {
            int i19 = iArr[i14];
            iArr2[i18] = Math.round(f13);
            f13 += i19 + fMax;
            i14++;
            i18++;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m66745h(int i13, int[] iArr, int[] iArr2, boolean z4) {
        int i14 = 0;
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        float length = (i13 - i15) / (iArr.length + 1);
        if (z4) {
            float f13 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i17 = iArr[length2];
                iArr2[length2] = Math.round(f13);
                f13 += i17 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f14 = length;
        int i18 = 0;
        while (i14 < length3) {
            int i19 = iArr[i14];
            iArr2[i18] = Math.round(f14);
            f14 += i19 + length;
            i14++;
            i18++;
        }
    }

    /* JADX INFO: renamed from: i */
    public static C22971k m66746i(float f13) {
        return new C22971k(f13, true, new C22440a(25));
    }

    /* JADX INFO: renamed from: j */
    public static C22971k m66747j(float f13, InterfaceC2300f interfaceC2300f) {
        return new C22971k(f13, true, new C22941c(interfaceC2300f, 0));
    }

    /* JADX INFO: renamed from: k */
    public static C22971k m66748k(float f13, InterfaceC2301g interfaceC2301g) {
        return new C22971k(f13, false, new C22945d(interfaceC2301g, 0));
    }
}
