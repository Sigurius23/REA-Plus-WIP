package p636y3;

import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: y3.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC39170b {
    /* JADX INFO: renamed from: a */
    public static final long m124769a(int i13, int i14, int i15, int i16) {
        if (!((i15 >= 0) & (i14 >= i13) & (i16 >= i15) & (i13 >= 0))) {
            AbstractC39177i.m124789a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m124776h(i13, i14, i15, i16);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m124770b(int i13, int i14, int i15) {
        if ((i15 & 2) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        if ((i15 & 8) != 0) {
            i14 = Integer.MAX_VALUE;
        }
        return m124769a(0, i13, 0, i14);
    }

    /* JADX INFO: renamed from: c */
    public static final int m124771c(int i13) {
        if (i13 < 8191) {
            return 13;
        }
        if (i13 < 32767) {
            return 15;
        }
        if (i13 < 65535) {
            return 16;
        }
        return i13 < 262143 ? 18 : 255;
    }

    /* JADX INFO: renamed from: d */
    public static final long m124772d(long j7, long j13) {
        int i13 = (int) (j13 >> 32);
        int iM124767k = C39169a.m124767k(j7);
        int iM124765i = C39169a.m124765i(j7);
        if (i13 < iM124767k) {
            i13 = iM124767k;
        }
        if (i13 <= iM124765i) {
            iM124765i = i13;
        }
        int i14 = (int) (j13 & 4294967295L);
        int iM124766j = C39169a.m124766j(j7);
        int iM124764h = C39169a.m124764h(j7);
        if (i14 < iM124766j) {
            i14 = iM124766j;
        }
        if (i14 <= iM124764h) {
            iM124764h = i14;
        }
        return (((long) iM124765i) << 32) | (((long) iM124764h) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public static final long m124773e(long j7, long j13) {
        int iM124767k = C39169a.m124767k(j7);
        int iM124765i = C39169a.m124765i(j7);
        int iM124766j = C39169a.m124766j(j7);
        int iM124764h = C39169a.m124764h(j7);
        int iM124767k2 = C39169a.m124767k(j13);
        if (iM124767k2 < iM124767k) {
            iM124767k2 = iM124767k;
        }
        if (iM124767k2 > iM124765i) {
            iM124767k2 = iM124765i;
        }
        int iM124765i2 = C39169a.m124765i(j13);
        if (iM124765i2 >= iM124767k) {
            iM124767k = iM124765i2;
        }
        if (iM124767k <= iM124765i) {
            iM124765i = iM124767k;
        }
        int iM124766j2 = C39169a.m124766j(j13);
        if (iM124766j2 < iM124766j) {
            iM124766j2 = iM124766j;
        }
        if (iM124766j2 > iM124764h) {
            iM124766j2 = iM124764h;
        }
        int iM124764h2 = C39169a.m124764h(j13);
        if (iM124764h2 >= iM124766j) {
            iM124766j = iM124764h2;
        }
        if (iM124766j <= iM124764h) {
            iM124764h = iM124766j;
        }
        return m124769a(iM124767k2, iM124765i, iM124766j2, iM124764h);
    }

    /* JADX INFO: renamed from: f */
    public static final int m124774f(int i13, long j7) {
        int iM124766j = C39169a.m124766j(j7);
        int iM124764h = C39169a.m124764h(j7);
        if (i13 < iM124766j) {
            i13 = iM124766j;
        }
        return i13 > iM124764h ? iM124764h : i13;
    }

    /* JADX INFO: renamed from: g */
    public static final int m124775g(int i13, long j7) {
        int iM124767k = C39169a.m124767k(j7);
        int iM124765i = C39169a.m124765i(j7);
        if (i13 < iM124767k) {
            i13 = iM124767k;
        }
        return i13 > iM124765i ? iM124765i : i13;
    }

    /* JADX INFO: renamed from: h */
    public static final long m124776h(int i13, int i14, int i15, int i16) {
        int i17 = i16 == Integer.MAX_VALUE ? i15 : i16;
        int iM124771c = m124771c(i17);
        int i18 = i14 == Integer.MAX_VALUE ? i13 : i14;
        int iM124771c2 = m124771c(i18);
        if (iM124771c + iM124771c2 > 31) {
            m124779k(i18, i17);
        }
        int i19 = i14 + 1;
        int i24 = i16 + 1;
        int i25 = iM124771c2 - 13;
        return (((long) (i19 & (~(i19 >> 31)))) << 33) | ((long) ((i25 >> 1) + (i25 & 1))) | (((long) i13) << 2) | (((long) i15) << (iM124771c2 + 2)) | (((long) (i24 & (~(i24 >> 31)))) << (iM124771c2 + 33));
    }

    /* JADX INFO: renamed from: i */
    public static final long m124777i(int i13, long j7, int i14) {
        int iM124767k = C39169a.m124767k(j7) + i13;
        if (iM124767k < 0) {
            iM124767k = 0;
        }
        int iM124765i = C39169a.m124765i(j7);
        if (iM124765i != Integer.MAX_VALUE && (iM124765i = iM124765i + i13) < 0) {
            iM124765i = 0;
        }
        int iM124766j = C39169a.m124766j(j7) + i14;
        if (iM124766j < 0) {
            iM124766j = 0;
        }
        int iM124764h = C39169a.m124764h(j7);
        return m124769a(iM124767k, iM124765i, iM124766j, (iM124764h == Integer.MAX_VALUE || (iM124764h = iM124764h + i14) >= 0) ? iM124764h : 0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ long m124778j(int i13, int i14, long j7, int i15) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = 0;
        }
        return m124777i(i13, j7, i14);
    }

    /* JADX INFO: renamed from: k */
    public static final void m124779k(int i13, int i14) {
        throw new IllegalArgumentException(AbstractC25012a.m73372e(i13, i14, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    /* JADX INFO: renamed from: l */
    public static final Void m124780l(int i13) {
        throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Can't represent a size of ", " in Constraints"));
    }
}
