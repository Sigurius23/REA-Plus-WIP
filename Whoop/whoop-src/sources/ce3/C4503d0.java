package ce3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ce3.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4503d0 {

    /* JADX INFO: renamed from: a */
    public int f18142a;

    /* JADX INFO: renamed from: b */
    public final int[] f18143b = new int[10];

    /* JADX INFO: renamed from: a */
    public final int m14118a() {
        if ((this.f18142a & 16) != 0) {
            return this.f18143b[4];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: b */
    public final void m14119b(C4503d0 other) {
        AbstractC22676k.m65750j(other, "other");
        for (int i13 = 0; i13 < 10; i13++) {
            if (((1 << i13) & other.f18142a) != 0) {
                m14120c(i13, other.f18143b[i13]);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14120c(int i13, int i14) {
        if (i13 >= 0) {
            int[] iArr = this.f18143b;
            if (i13 >= iArr.length) {
                return;
            }
            this.f18142a = (1 << i13) | this.f18142a;
            iArr[i13] = i14;
        }
    }
}
