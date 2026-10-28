package p074cs;

import java.io.Serializable;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: cs.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C11094a implements Serializable {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f35190y = 0;

    /* JADX INFO: renamed from: w */
    public final int[] f35191w;

    /* JADX INFO: renamed from: x */
    public final int f35192x;

    static {
        new C11094a(new int[0]);
    }

    public C11094a(int[] iArr) {
        int length = iArr.length;
        this.f35191w = iArr;
        this.f35192x = length;
    }

    public final boolean equals(Object obj) {
        C11094a c11094a;
        int i13;
        int i14;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C11094a) && (i14 = this.f35192x) == (i13 = (c11094a = (C11094a) obj).f35192x)) {
            for (int i15 = 0; i15 < i14; i15++) {
                AbstractC31484o.m96957i(i15, i14);
                int i16 = this.f35191w[i15];
                AbstractC31484o.m96957i(i15, i13);
                if (i16 == c11094a.f35191w[i15]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.f35192x; i14++) {
            i13 = (i13 * 31) + this.f35191w[i14];
        }
        return i13;
    }

    public final String toString() {
        int i13 = this.f35192x;
        if (i13 == 0) {
            return "[]";
        }
        StringBuilder sb4 = new StringBuilder(i13 * 5);
        sb4.append('[');
        int[] iArr = this.f35191w;
        sb4.append(iArr[0]);
        for (int i14 = 1; i14 < i13; i14++) {
            sb4.append(", ");
            sb4.append(iArr[i14]);
        }
        sb4.append(']');
        return sb4.toString();
    }
}
