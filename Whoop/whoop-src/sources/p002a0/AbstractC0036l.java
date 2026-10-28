package p002a0;

import m83.AbstractC25260n;

/* JADX INFO: renamed from: a0.l */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0036l {

    /* JADX INFO: renamed from: a */
    public static final float[] f105a;

    static {
        long[] jArr = AbstractC0015d1.f36a;
        int iM19d = AbstractC0015d1.m19d(0);
        int iMax = iM19d > 0 ? Math.max(7, AbstractC0015d1.m18c(iM19d)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
        }
        int i13 = iMax >> 3;
        long j7 = 255 << ((iMax & 7) << 3);
        jArr[i13] = (jArr[i13] & (~j7)) | j7;
        float[] fArr = new float[iMax];
        f105a = new float[0];
    }
}
