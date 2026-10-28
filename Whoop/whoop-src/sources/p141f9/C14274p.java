package p141f9;

import a33.C0352d;
import bs.AbstractC3572a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import p516u8.C34610p;

/* JADX INFO: renamed from: f9.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C14274p extends AbstractC14272n {

    /* JADX INFO: renamed from: j */
    public final C0352d f52122j;

    /* JADX INFO: renamed from: k */
    public final C0352d f52123k;

    /* JADX INFO: renamed from: l */
    public final long f52124l;

    public C14274p(C14268j c14268j, long j7, long j13, long j14, long j15, long j16, List list, long j17, C0352d c0352d, C0352d c0352d2, long j18, long j19) {
        super(c14268j, j7, j13, j14, j16, list, j17, j18, j19);
        this.f52122j = c0352d;
        this.f52123k = c0352d2;
        this.f52124l = j15;
    }

    @Override // p141f9.AbstractC14277s
    /* JADX INFO: renamed from: a */
    public final C14268j mo40763a(AbstractC14271m abstractC14271m) {
        C0352d c0352d = this.f52122j;
        if (c0352d == null) {
            return this.f52129a;
        }
        C34610p c34610p = abstractC14271m.f52111w;
        return new C14268j(c0352d.m933e(c34610p.f145770a, 0L, 0L, c34610p.f145779j), 0L, -1L);
    }

    @Override // p141f9.AbstractC14272n
    /* JADX INFO: renamed from: d */
    public final long mo40757d(long j7) {
        List list = this.f52117f;
        if (list != null) {
            return list.size();
        }
        long j13 = this.f52124l;
        if (j13 != -1) {
            return (j13 - this.f52115d) + 1;
        }
        if (j7 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j7).multiply(BigInteger.valueOf(this.f52130b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f52116e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i13 = AbstractC3572a.f14447a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // p141f9.AbstractC14272n
    /* JADX INFO: renamed from: h */
    public final C14268j mo40761h(C14269k c14269k, long j7) {
        long j13 = this.f52115d;
        List list = this.f52117f;
        long j14 = list != null ? ((C14275q) list.get((int) (j7 - j13))).f52125a : (j7 - j13) * this.f52116e;
        C34610p c34610p = c14269k.f52111w;
        return new C14268j(this.f52123k.m933e(c34610p.f145770a, j7, j14, c34610p.f145779j), 0L, -1L);
    }
}
