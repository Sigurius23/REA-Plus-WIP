package p164g2;

import java.util.Comparator;
import p005a3.AbstractC0201g;
import p005a3.C0230n0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g2.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C15253y implements Comparator {

    /* JADX INFO: renamed from: w */
    public static final C15253y f57279w = new C15253y();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C15252x c15252x = (C15252x) obj;
        C15252x c15252x2 = (C15252x) obj2;
        int i13 = 0;
        if (AbstractC15235g.m43336z(c15252x) && AbstractC15235g.m43336z(c15252x2)) {
            C0230n0 c0230n0M516p = AbstractC0201g.m516p(c15252x);
            C0230n0 c0230n0M516p2 = AbstractC0201g.m516p(c15252x2);
            if (!AbstractC22676k.m65745e(c0230n0M516p, c0230n0M516p2)) {
                Object[] objArr = new C0230n0[16];
                int i14 = 0;
                while (c0230n0M516p != null) {
                    int i15 = i14 + 1;
                    if (objArr.length < i15) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i15, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i14 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i14 + 0);
                    }
                    objArr[0] = c0230n0M516p;
                    i14++;
                    c0230n0M516p = c0230n0M516p.m588G();
                }
                Object[] objArr3 = new C0230n0[16];
                int i16 = 0;
                while (c0230n0M516p2 != null) {
                    int i17 = i16 + 1;
                    if (objArr3.length < i17) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i17, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i16 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i16 + 0);
                    }
                    objArr3[0] = c0230n0M516p2;
                    i16++;
                    c0230n0M516p2 = c0230n0M516p2.m588G();
                }
                int iMin = Math.min(i14 - 1, i16 - 1);
                if (iMin >= 0) {
                    while (AbstractC22676k.m65745e(objArr[i13], objArr3[i13])) {
                        if (i13 != iMin) {
                            i13++;
                        }
                    }
                    return AbstractC22676k.m65751k(((C0230n0) objArr[i13]).m590H(), ((C0230n0) objArr3[i13]).m590H());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (AbstractC15235g.m43336z(c15252x)) {
                return -1;
            }
            if (AbstractC15235g.m43336z(c15252x2)) {
                return 1;
            }
        }
        return 0;
    }
}
