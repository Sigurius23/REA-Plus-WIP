package p465rm;

import java.util.Arrays;
import p309lo.AbstractC24543a;
import sn.C32766w0;

/* JADX INFO: renamed from: rm.p1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31561p1 implements InterfaceC31529f {

    /* JADX INFO: renamed from: w */
    public final C32766w0 f130351w;

    /* JADX INFO: renamed from: x */
    public final int[] f130352x;

    /* JADX INFO: renamed from: y */
    public final int f130353y;

    /* JADX INFO: renamed from: z */
    public final boolean[] f130354z;

    public C31561p1(C32766w0 c32766w0, int[] iArr, int i13, boolean[] zArr) {
        int i14 = c32766w0.f136260w;
        AbstractC24543a.m71569e(i14 == iArr.length && i14 == zArr.length);
        this.f130351w = c32766w0;
        this.f130352x = (int[]) iArr.clone();
        this.f130353y = i13;
        this.f130354z = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C31561p1.class == obj.getClass()) {
            C31561p1 c31561p1 = (C31561p1) obj;
            if (this.f130353y == c31561p1.f130353y && this.f130351w.equals(c31561p1.f130351w) && Arrays.equals(this.f130352x, c31561p1.f130352x) && Arrays.equals(this.f130354z, c31561p1.f130354z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f130354z) + ((((Arrays.hashCode(this.f130352x) + (this.f130351w.hashCode() * 31)) * 31) + this.f130353y) * 31);
    }
}
