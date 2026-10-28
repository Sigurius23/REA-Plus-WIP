package cn;

import android.util.Pair;
import p309lo.AbstractC24567y;
import p588wm.C37373o;
import p588wm.C37375q;

/* JADX INFO: renamed from: cn.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C4841c implements InterfaceC4844f {

    /* JADX INFO: renamed from: a */
    public final long[] f20105a;

    /* JADX INFO: renamed from: b */
    public final long[] f20106b;

    /* JADX INFO: renamed from: c */
    public final long f20107c;

    public C4841c(long j7, long[] jArr, long[] jArr2) {
        this.f20105a = jArr;
        this.f20106b = jArr2;
        this.f20107c = j7 == -9223372036854775807L ? AbstractC24567y.m71695z(jArr2[jArr2.length - 1]) : j7;
    }

    /* JADX INFO: renamed from: b */
    public static Pair m15418b(long j7, long[] jArr, long[] jArr2) {
        int iM71674e = AbstractC24567y.m71674e(jArr, j7, true);
        long j13 = jArr[iM71674e];
        long j14 = jArr2[iM71674e];
        int i13 = iM71674e + 1;
        if (i13 == jArr.length) {
            return Pair.create(Long.valueOf(j13), Long.valueOf(j14));
        }
        long j15 = jArr[i13];
        return Pair.create(Long.valueOf(j7), Long.valueOf(((long) ((j15 == j13 ? 0.0d : (j7 - j13) / (j15 - j13)) * (jArr2[i13] - j14))) + j14));
    }

    @Override // cn.InterfaceC4844f
    /* JADX INFO: renamed from: a */
    public final long mo15415a(long j7) {
        return AbstractC24567y.m71695z(((Long) m15418b(j7, this.f20105a, this.f20106b).second).longValue());
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: c */
    public final C37373o mo3112c(long j7) {
        Pair pairM15418b = m15418b(AbstractC24567y.m71669G(AbstractC24567y.m71678i(j7, 0L, this.f20107c)), this.f20106b, this.f20105a);
        C37375q c37375q = new C37375q(AbstractC24567y.m71695z(((Long) pairM15418b.first).longValue()), ((Long) pairM15418b.second).longValue());
        return new C37373o(c37375q, c37375q);
    }

    @Override // cn.InterfaceC4844f
    /* JADX INFO: renamed from: d */
    public final long mo15416d() {
        return -1L;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: e */
    public final boolean mo3113e() {
        return true;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: f */
    public final long mo3114f() {
        return this.f20107c;
    }
}
