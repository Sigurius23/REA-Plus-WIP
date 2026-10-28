package p002a0;

import java.util.ConcurrentModificationException;
import p024b0.AbstractC2177a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a0.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0064z {

    /* JADX INFO: renamed from: a */
    public static final Object f201a = new Object();

    /* JADX INFO: renamed from: b */
    public static final long[] f202b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object f203c = new Object();

    /* JADX INFO: renamed from: a */
    public static final void m159a(C0024g1 c0024g1) {
        int i13 = c0024g1.f58z;
        int[] iArr = c0024g1.f56x;
        Object[] objArr = c0024g1.f57y;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            Object obj = objArr[i15];
            if (obj != f203c) {
                if (i15 != i14) {
                    iArr[i14] = iArr[i15];
                    objArr[i14] = obj;
                    objArr[i15] = null;
                }
                i14++;
            }
        }
        c0024g1.f55w = false;
        c0024g1.f58z = i14;
    }

    /* JADX INFO: renamed from: b */
    public static final void m160b(C0025h c0025h, int i13) {
        c0025h.f59w = new int[i13];
        c0025h.f60x = new Object[i13];
    }

    /* JADX INFO: renamed from: c */
    public static final int m161c(C0025h c0025h, Object obj, int i13) {
        int i14 = c0025h.f61y;
        if (i14 == 0) {
            return -1;
        }
        try {
            int iM6853a = AbstractC2177a.m6853a(i14, i13, c0025h.f59w);
            if (iM6853a < 0 || AbstractC22676k.m65745e(obj, c0025h.f60x[iM6853a])) {
                return iM6853a;
            }
            int i15 = iM6853a + 1;
            while (i15 < i14 && c0025h.f59w[i15] == i13) {
                if (AbstractC22676k.m65745e(obj, c0025h.f60x[i15])) {
                    return i15;
                }
                i15++;
            }
            for (int i16 = iM6853a - 1; i16 >= 0 && c0025h.f59w[i16] == i13; i16--) {
                if (AbstractC22676k.m65745e(obj, c0025h.f60x[i16])) {
                    return i16;
                }
            }
            return ~i15;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
