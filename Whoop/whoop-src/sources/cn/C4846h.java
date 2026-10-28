package cn;

import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p588wm.C37373o;
import p588wm.C37375q;

/* JADX INFO: renamed from: cn.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C4846h implements InterfaceC4844f {

    /* JADX INFO: renamed from: a */
    public final long f20131a;

    /* JADX INFO: renamed from: b */
    public final int f20132b;

    /* JADX INFO: renamed from: c */
    public final long f20133c;

    /* JADX INFO: renamed from: d */
    public final long f20134d;

    /* JADX INFO: renamed from: e */
    public final long f20135e;

    /* JADX INFO: renamed from: f */
    public final long[] f20136f;

    public C4846h(long j7, int i13, long j13, long j14, long[] jArr) {
        this.f20131a = j7;
        this.f20132b = i13;
        this.f20133c = j13;
        this.f20136f = jArr;
        this.f20134d = j14;
        this.f20135e = j14 != -1 ? j7 + j14 : -1L;
    }

    @Override // cn.InterfaceC4844f
    /* JADX INFO: renamed from: a */
    public final long mo15415a(long j7) {
        long j13 = j7 - this.f20131a;
        if (!mo3113e() || j13 <= this.f20132b) {
            return 0L;
        }
        long[] jArr = this.f20136f;
        AbstractC24543a.m71574j(jArr);
        double d3 = (j13 * 256.0d) / this.f20134d;
        int iM71674e = AbstractC24567y.m71674e(jArr, (long) d3, true);
        long j14 = this.f20133c;
        long j15 = (((long) iM71674e) * j14) / 100;
        long j16 = jArr[iM71674e];
        int i13 = iM71674e + 1;
        long j17 = (j14 * ((long) i13)) / 100;
        long j18 = iM71674e == 99 ? 256L : jArr[i13];
        return Math.round((j16 == j18 ? 0.0d : (d3 - j16) / (j18 - j16)) * (j17 - j15)) + j15;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: c */
    public final C37373o mo3112c(long j7) {
        double d3;
        double d14;
        boolean zMo3113e = mo3113e();
        int i13 = this.f20132b;
        long j13 = this.f20131a;
        if (!zMo3113e) {
            C37375q c37375q = new C37375q(0L, j13 + ((long) i13));
            return new C37373o(c37375q, c37375q);
        }
        long jM71678i = AbstractC24567y.m71678i(j7, 0L, this.f20133c);
        double d15 = (jM71678i * 100.0d) / this.f20133c;
        double d16 = 0.0d;
        if (d15 <= 0.0d) {
            d3 = 256.0d;
        } else if (d15 >= 100.0d) {
            d3 = 256.0d;
            d16 = 256.0d;
        } else {
            int i14 = (int) d15;
            long[] jArr = this.f20136f;
            AbstractC24543a.m71574j(jArr);
            double d17 = jArr[i14];
            if (i14 == 99) {
                d3 = 256.0d;
                d14 = 256.0d;
            } else {
                d3 = 256.0d;
                d14 = jArr[i14 + 1];
            }
            d16 = ((d14 - d17) * (d15 - ((double) i14))) + d17;
        }
        long j14 = this.f20134d;
        C37375q c37375q2 = new C37375q(jM71678i, j13 + AbstractC24567y.m71678i(Math.round((d16 / d3) * j14), i13, j14 - 1));
        return new C37373o(c37375q2, c37375q2);
    }

    @Override // cn.InterfaceC4844f
    /* JADX INFO: renamed from: d */
    public final long mo15416d() {
        return this.f20135e;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: e */
    public final boolean mo3113e() {
        return this.f20136f != null;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: f */
    public final long mo3114f() {
        return this.f20133c;
    }
}
