package y83;

import m83.AbstractC25260n;

/* JADX INFO: renamed from: y83.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC39348d {

    /* JADX INFO: renamed from: a */
    public static final byte[] f169356a;

    /* JADX INFO: renamed from: b */
    public static final int[] f169357b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f169358c;

    /* JADX INFO: renamed from: d */
    public static final int[] f169359d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f169356a = bArr;
        int[] iArr = new int[256];
        AbstractC25260n.m74074o0(iArr, -1);
        iArr[61] = -2;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i14 < 64) {
            iArr[bArr[i14]] = i15;
            i14++;
            i15++;
        }
        f169357b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f169358c = bArr2;
        int[] iArr2 = new int[256];
        AbstractC25260n.m74074o0(iArr2, -1);
        iArr2[61] = -2;
        int i16 = 0;
        while (i13 < 64) {
            iArr2[bArr2[i13]] = i16;
            i13++;
            i16++;
        }
        f169359d = iArr2;
    }
}
