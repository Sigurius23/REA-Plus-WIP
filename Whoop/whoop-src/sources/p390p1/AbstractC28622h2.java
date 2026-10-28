package p390p1;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.h2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC28622h2 {
    /* JADX INFO: renamed from: a */
    public static final int m87026a(int[] iArr, int i13) {
        return iArr[(i13 * 5) + 3];
    }

    /* JADX INFO: renamed from: b */
    public static final int m87027b(ArrayList arrayList, int i13, int i14) {
        int iM87030e = m87030e(arrayList, i13, i14);
        return iM87030e >= 0 ? iM87030e : -(iM87030e + 1);
    }

    /* JADX INFO: renamed from: c */
    public static final int m87028c(int[] iArr, int i13) {
        int i14 = i13 * 5;
        return Integer.bitCount(iArr[i14 + 1] >> 28) + iArr[i14 + 4];
    }

    /* JADX INFO: renamed from: d */
    public static final void m87029d(int i13, int i14, int[] iArr) {
        if (i14 >= 0) {
        }
        int i15 = (i13 * 5) + 1;
        iArr[i15] = i14 | (iArr[i15] & (-67108864));
    }

    /* JADX INFO: renamed from: e */
    public static final int m87030e(ArrayList arrayList, int i13, int i14) {
        int size = arrayList.size() - 1;
        int i15 = 0;
        while (i15 <= size) {
            int i16 = (i15 + size) >>> 1;
            int i17 = ((C28591a) arrayList.get(i16)).f115705a;
            if (i17 < 0) {
                i17 += i14;
            }
            int iM65751k = AbstractC22676k.m65751k(i17, i13);
            if (iM65751k < 0) {
                i15 = i16 + 1;
            } else {
                if (iM65751k <= 0) {
                    return i16;
                }
                size = i16 - 1;
            }
        }
        return -(i15 + 1);
    }

    /* JADX INFO: renamed from: f */
    public static final void m87031f() {
        throw new ConcurrentModificationException();
    }
}
