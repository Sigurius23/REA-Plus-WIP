package p588wm;

import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: wm.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C37372n implements InterfaceC37374p {

    /* JADX INFO: renamed from: a */
    public final long[] f159863a;

    /* JADX INFO: renamed from: b */
    public final long[] f159864b;

    /* JADX INFO: renamed from: c */
    public final long f159865c;

    /* JADX INFO: renamed from: d */
    public final boolean f159866d;

    public C37372n(long j7, long[] jArr, long[] jArr2) {
        AbstractC24543a.m71569e(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z4 = length > 0;
        this.f159866d = z4;
        if (!z4 || jArr2[0] <= 0) {
            this.f159863a = jArr;
            this.f159864b = jArr2;
        } else {
            int i13 = length + 1;
            long[] jArr3 = new long[i13];
            this.f159863a = jArr3;
            long[] jArr4 = new long[i13];
            this.f159864b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f159865c = j7;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: c */
    public final C37373o mo3112c(long j7) {
        if (!this.f159866d) {
            C37375q c37375q = C37375q.f159869c;
            return new C37373o(c37375q, c37375q);
        }
        long[] jArr = this.f159864b;
        int iM71674e = AbstractC24567y.m71674e(jArr, j7, true);
        long j13 = jArr[iM71674e];
        long[] jArr2 = this.f159863a;
        C37375q c37375q2 = new C37375q(j13, jArr2[iM71674e]);
        if (j13 == j7 || iM71674e == jArr.length - 1) {
            return new C37373o(c37375q2, c37375q2);
        }
        int i13 = iM71674e + 1;
        return new C37373o(c37375q2, new C37375q(jArr[i13], jArr2[i13]));
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: e */
    public final boolean mo3113e() {
        return this.f159866d;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: f */
    public final long mo3114f() {
        return this.f159865c;
    }
}
