package p094dn;

import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: dn.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C12200t {

    /* JADX INFO: renamed from: a */
    public final C12197q f40751a;

    /* JADX INFO: renamed from: b */
    public final int f40752b;

    /* JADX INFO: renamed from: c */
    public final long[] f40753c;

    /* JADX INFO: renamed from: d */
    public final int[] f40754d;

    /* JADX INFO: renamed from: e */
    public final int f40755e;

    /* JADX INFO: renamed from: f */
    public final long[] f40756f;

    /* JADX INFO: renamed from: g */
    public final int[] f40757g;

    /* JADX INFO: renamed from: h */
    public final long f40758h;

    public C12200t(C12197q c12197q, long[] jArr, int[] iArr, int i13, long[] jArr2, int[] iArr2, long j7) {
        AbstractC24543a.m71569e(iArr.length == jArr2.length);
        AbstractC24543a.m71569e(jArr.length == jArr2.length);
        AbstractC24543a.m71569e(iArr2.length == jArr2.length);
        this.f40751a = c12197q;
        this.f40753c = jArr;
        this.f40754d = iArr;
        this.f40755e = i13;
        this.f40756f = jArr2;
        this.f40757g = iArr2;
        this.f40758h = j7;
        this.f40752b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m33817a(long j7) {
        long[] jArr = this.f40756f;
        for (int iM71671b = AbstractC24567y.m71671b(jArr, j7, true); iM71671b < jArr.length; iM71671b++) {
            if ((this.f40757g[iM71671b] & 1) != 0) {
                return iM71671b;
            }
        }
        return -1;
    }
}
