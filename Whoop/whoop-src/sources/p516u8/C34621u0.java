package p516u8;

import java.util.Arrays;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: u8.u0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34621u0 {

    /* JADX INFO: renamed from: a */
    public final int f145857a;

    /* JADX INFO: renamed from: b */
    public final C34611p0 f145858b;

    /* JADX INFO: renamed from: c */
    public final boolean f145859c;

    /* JADX INFO: renamed from: d */
    public final int[] f145860d;

    /* JADX INFO: renamed from: e */
    public final boolean[] f145861e;

    static {
        AbstractC38065t.m121892F(0);
        AbstractC38065t.m121892F(1);
        AbstractC38065t.m121892F(3);
        AbstractC38065t.m121892F(4);
    }

    public C34621u0(C34611p0 c34611p0, boolean z4, int[] iArr, boolean[] zArr) {
        int i13 = c34611p0.f145796a;
        this.f145857a = i13;
        boolean z13 = false;
        AbstractC35849g.m113802d(i13 == iArr.length && i13 == zArr.length);
        this.f145858b = c34611p0;
        if (z4 && i13 > 1) {
            z13 = true;
        }
        this.f145859c = z13;
        this.f145860d = (int[]) iArr.clone();
        this.f145861e = (boolean[]) zArr.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m109416a(int i13) {
        return this.f145860d[i13] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C34621u0.class == obj.getClass()) {
            C34621u0 c34621u0 = (C34621u0) obj;
            if (this.f145859c == c34621u0.f145859c && this.f145858b.equals(c34621u0.f145858b) && Arrays.equals(this.f145860d, c34621u0.f145860d) && Arrays.equals(this.f145861e, c34621u0.f145861e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f145861e) + ((Arrays.hashCode(this.f145860d) + (((this.f145858b.hashCode() * 31) + (this.f145859c ? 1 : 0)) * 31)) * 31);
    }
}
