package p636y3;

import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: y3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C39169a {

    /* JADX INFO: renamed from: a */
    public final long f168407a;

    /* JADX INFO: renamed from: a */
    public static final long m124757a(int i13, int i14, int i15, int i16) {
        if (i14 < i13 || i16 < i15 || i13 < 0 || i15 < 0) {
            AbstractC39177i.m124789a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AbstractC39170b.m124776h(i13, i14, i15, i16);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m124758b(long j7, int i13, int i14, int i15, int i16, int i17) {
        if ((i17 & 1) != 0) {
            i13 = m124767k(j7);
        }
        if ((i17 & 2) != 0) {
            i14 = m124765i(j7);
        }
        if ((i17 & 4) != 0) {
            i15 = m124766j(j7);
        }
        if ((i17 & 8) != 0) {
            i16 = m124764h(j7);
        }
        return m124757a(i13, i14, i15, i16);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m124759c(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m124760d(long j7) {
        int i13 = (int) (3 & j7);
        int i14 = (((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1);
        return (((int) (j7 >> (i14 + 46))) & ((1 << (18 - i14)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m124761e(long j7) {
        int i13 = (int) (3 & j7);
        return (((int) (j7 >> 33)) & ((1 << (((((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1)) + 13)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m124762f(long j7) {
        int i13 = (int) (3 & j7);
        int i14 = (((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1);
        int i15 = (1 << (18 - i14)) - 1;
        int i16 = ((int) (j7 >> (i14 + 15))) & i15;
        int i17 = ((int) (j7 >> (i14 + 46))) & i15;
        return i16 == (i17 == 0 ? Integer.MAX_VALUE : i17 - 1);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m124763g(long j7) {
        int i13 = (int) (3 & j7);
        int i14 = (1 << (((((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1)) + 13)) - 1;
        int i15 = ((int) (j7 >> 2)) & i14;
        int i16 = ((int) (j7 >> 33)) & i14;
        return i15 == (i16 == 0 ? Integer.MAX_VALUE : i16 - 1);
    }

    /* JADX INFO: renamed from: h */
    public static final int m124764h(long j7) {
        int i13 = (int) (3 & j7);
        int i14 = (((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1);
        int i15 = ((int) (j7 >> (i14 + 46))) & ((1 << (18 - i14)) - 1);
        if (i15 == 0) {
            return Integer.MAX_VALUE;
        }
        return i15 - 1;
    }

    /* JADX INFO: renamed from: i */
    public static final int m124765i(long j7) {
        int i13 = (int) (3 & j7);
        int i14 = (int) (j7 >> 33);
        int i15 = i14 & ((1 << (((((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1)) + 13)) - 1);
        if (i15 == 0) {
            return Integer.MAX_VALUE;
        }
        return i15 - 1;
    }

    /* JADX INFO: renamed from: j */
    public static final int m124766j(long j7) {
        int i13 = (int) (3 & j7);
        int i14 = (((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1);
        return ((int) (j7 >> (i14 + 15))) & ((1 << (18 - i14)) - 1);
    }

    /* JADX INFO: renamed from: k */
    public static final int m124767k(long j7) {
        int i13 = (int) (3 & j7);
        return ((int) (j7 >> 2)) & ((1 << (((((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1)) + 13)) - 1);
    }

    /* JADX INFO: renamed from: l */
    public static String m124768l(long j7) {
        int iM124765i = m124765i(j7);
        String strValueOf = iM124765i == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM124765i);
        int iM124764h = m124764h(j7);
        String strValueOf2 = iM124764h != Integer.MAX_VALUE ? String.valueOf(iM124764h) : "Infinity";
        StringBuilder sb4 = new StringBuilder("Constraints(minWidth = ");
        sb4.append(m124767k(j7));
        sb4.append(", maxWidth = ");
        sb4.append(strValueOf);
        sb4.append(", minHeight = ");
        sb4.append(m124766j(j7));
        sb4.append(", maxHeight = ");
        return AbstractC25012a.m73377j(sb4, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C39169a) {
            return this.f168407a == ((C39169a) obj).f168407a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f168407a);
    }

    public final String toString() {
        return m124768l(this.f168407a);
    }
}
