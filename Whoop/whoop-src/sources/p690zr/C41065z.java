package p690zr;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: zr.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C41065z extends AbstractC41058v0 implements Serializable {

    /* JADX INFO: renamed from: w */
    public final Comparator[] f177078w;

    public C41065z(C41045p c41045p, C41045p c41045p2) {
        this.f177078w = new Comparator[]{c41045p, c41045p2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i13 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f177078w;
            if (i13 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i13].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i13++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C41065z) {
            return Arrays.equals(this.f177078w, ((C41065z) obj).f177078w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f177078w);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(Arrays.toString(this.f177078w), ")", new StringBuilder("Ordering.compound("));
    }
}
