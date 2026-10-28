package p361o9;

import p031b9.AbstractC2829f;
import p516u8.C34611p0;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41058v0;
import p690zr.AbstractC41063y;
import p690zr.C41056u0;

/* JADX INFO: renamed from: o9.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C27673m extends AbstractC27675o implements Comparable {

    /* JADX INFO: renamed from: E */
    public final int f111391E;

    /* JADX INFO: renamed from: F */
    public final boolean f111392F;

    /* JADX INFO: renamed from: G */
    public final boolean f111393G;

    /* JADX INFO: renamed from: H */
    public final boolean f111394H;

    /* JADX INFO: renamed from: I */
    public final int f111395I;

    /* JADX INFO: renamed from: J */
    public final int f111396J;

    /* JADX INFO: renamed from: K */
    public final int f111397K;

    /* JADX INFO: renamed from: L */
    public final int f111398L;

    /* JADX INFO: renamed from: M */
    public final boolean f111399M;

    public C27673m(int i13, C34611p0 c34611p0, int i14, C27670j c27670j, int i15, String str, String str2) {
        int iM83671M;
        super(i13, c34611p0, i14);
        int i16 = 0;
        this.f111392F = AbstractC2829f.m8056m(i15, false);
        int i17 = this.f111403z.f145774e;
        int i18 = c27670j.f145849r;
        AbstractC41023g0 abstractC41023g0 = c27670j.f145847p;
        int i19 = i17 & (~i18);
        this.f111393G = (i19 & 1) != 0;
        this.f111394H = (i19 & 2) != 0;
        AbstractC41023g0 abstractC41023g0M133256r = str2 != null ? AbstractC41023g0.m133256r(str2) : abstractC41023g0.isEmpty() ? AbstractC41023g0.m133256r("") : abstractC41023g0;
        int i24 = 0;
        while (true) {
            if (i24 >= abstractC41023g0M133256r.size()) {
                iM83671M = 0;
                i24 = Integer.MAX_VALUE;
                break;
            } else {
                iM83671M = C27677q.m83671M(this.f111403z, (String) abstractC41023g0M133256r.get(i24), false);
                if (iM83671M > 0) {
                    break;
                } else {
                    i24++;
                }
            }
        }
        this.f111395I = i24;
        this.f111396J = iM83671M;
        int i25 = str2 != null ? 1088 : 0;
        int i26 = this.f111403z.f145775f;
        AbstractC41058v0 abstractC41058v0 = C27677q.f111422j;
        int iBitCount = (i26 == 0 || i26 != i25) ? Integer.bitCount(i25 & i26) : Integer.MAX_VALUE;
        this.f111397K = iBitCount;
        this.f111399M = (1088 & this.f111403z.f145775f) != 0;
        int iM83671M2 = C27677q.m83671M(this.f111403z, str, C27677q.m83672P(str) == null);
        this.f111398L = iM83671M2;
        boolean z4 = iM83671M > 0 || (abstractC41023g0.isEmpty() && iBitCount > 0) || this.f111393G || (this.f111394H && iM83671M2 > 0);
        if (AbstractC2829f.m8056m(i15, c27670j.f111385z) && z4) {
            i16 = 1;
        }
        this.f111391E = i16;
    }

    @Override // p361o9.AbstractC27675o
    /* JADX INFO: renamed from: a */
    public final int mo83659a() {
        return this.f111391E;
    }

    @Override // p361o9.AbstractC27675o
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo83660b(AbstractC27675o abstractC27675o) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C27673m c27673m) {
        AbstractC41063y abstractC41063yMo133310c = AbstractC41063y.f177072a.mo133310c(this.f111392F, c27673m.f111392F);
        Integer numValueOf = Integer.valueOf(this.f111395I);
        Integer numValueOf2 = Integer.valueOf(c27673m.f111395I);
        C41056u0 c41056u0 = C41056u0.f177063x;
        C41056u0 c41056u1 = C41056u0.f177064y;
        AbstractC41063y abstractC41063yMo133309b = abstractC41063yMo133310c.mo133309b(numValueOf, numValueOf2, c41056u1);
        int i13 = c27673m.f111396J;
        int i14 = this.f111396J;
        AbstractC41063y abstractC41063yMo133308a = abstractC41063yMo133309b.mo133308a(i14, i13);
        int i15 = c27673m.f111397K;
        int i16 = this.f111397K;
        AbstractC41063y abstractC41063yMo133310c2 = abstractC41063yMo133308a.mo133308a(i16, i15).mo133310c(this.f111393G, c27673m.f111393G);
        Boolean boolValueOf = Boolean.valueOf(this.f111394H);
        Boolean boolValueOf2 = Boolean.valueOf(c27673m.f111394H);
        if (i14 != 0) {
            c41056u0 = c41056u1;
        }
        AbstractC41063y abstractC41063yMo133308a2 = abstractC41063yMo133310c2.mo133309b(boolValueOf, boolValueOf2, c41056u0).mo133308a(this.f111398L, c27673m.f111398L);
        if (i16 == 0) {
            abstractC41063yMo133308a2 = abstractC41063yMo133308a2.mo133311d(this.f111399M, c27673m.f111399M);
        }
        return abstractC41063yMo133308a2.mo133312e();
    }
}
