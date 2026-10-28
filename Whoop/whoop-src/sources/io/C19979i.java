package io;

import p690zr.AbstractC41023g0;
import p690zr.AbstractC41063y;
import p690zr.C41056u0;
import sn.C32766w0;

/* JADX INFO: renamed from: io.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C19979i extends AbstractC19981k implements Comparable {

    /* JADX INFO: renamed from: E */
    public final int f74955E;

    /* JADX INFO: renamed from: F */
    public final boolean f74956F;

    /* JADX INFO: renamed from: G */
    public final boolean f74957G;

    /* JADX INFO: renamed from: H */
    public final boolean f74958H;

    /* JADX INFO: renamed from: I */
    public final int f74959I;

    /* JADX INFO: renamed from: J */
    public final int f74960J;

    /* JADX INFO: renamed from: K */
    public final int f74961K;

    /* JADX INFO: renamed from: L */
    public final int f74962L;

    /* JADX INFO: renamed from: M */
    public final boolean f74963M;

    public C19979i(int i13, C32766w0 c32766w0, int i14, C18744f c18744f, int i15, String str) {
        int iM55866a;
        super(i13, c32766w0, i14);
        int i16 = 0;
        this.f74956F = C20033m.m55867b(i15, false);
        int i17 = this.f74967z.f130101z;
        int i18 = c18744f.f73656Z;
        AbstractC41023g0 abstractC41023g0 = c18744f.f77570S;
        int i19 = i17 & (~i18);
        this.f74957G = (i19 & 1) != 0;
        this.f74958H = (i19 & 2) != 0;
        AbstractC41023g0 abstractC41023g0M133256r = abstractC41023g0.isEmpty() ? AbstractC41023g0.m133256r("") : abstractC41023g0;
        int i24 = 0;
        while (true) {
            if (i24 >= abstractC41023g0M133256r.size()) {
                iM55866a = 0;
                i24 = Integer.MAX_VALUE;
                break;
            } else {
                iM55866a = C20033m.m55866a(this.f74967z, (String) abstractC41023g0M133256r.get(i24), c18744f.f77572U);
                if (iM55866a > 0) {
                    break;
                } else {
                    i24++;
                }
            }
        }
        this.f74959I = i24;
        this.f74960J = iM55866a;
        int i25 = this.f74967z.f130070E;
        int i26 = c18744f.f77571T;
        int iBitCount = (i25 == 0 || i25 != i26) ? Integer.bitCount(i25 & i26) : Integer.MAX_VALUE;
        this.f74961K = iBitCount;
        this.f74963M = (this.f74967z.f130070E & 1088) != 0;
        int iM55866a2 = C20033m.m55866a(this.f74967z, str, C20033m.m55869d(str) == null);
        this.f74962L = iM55866a2;
        boolean z4 = iM55866a > 0 || (abstractC41023g0.isEmpty() && iBitCount > 0) || this.f74957G || (this.f74958H && iM55866a2 > 0);
        if (C20033m.m55867b(i15, c18744f.f73666j0) && z4) {
            i16 = 1;
        }
        this.f74955E = i16;
    }

    @Override // io.AbstractC19981k
    /* JADX INFO: renamed from: a */
    public final int mo54507a() {
        return this.f74955E;
    }

    @Override // io.AbstractC19981k
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo54508b(AbstractC19981k abstractC19981k) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C19979i c19979i) {
        AbstractC41063y abstractC41063yMo133310c = AbstractC41063y.f177072a.mo133310c(this.f74956F, c19979i.f74956F);
        Integer numValueOf = Integer.valueOf(this.f74959I);
        Integer numValueOf2 = Integer.valueOf(c19979i.f74959I);
        C41056u0 c41056u0 = C41056u0.f177063x;
        C41056u0 c41056u1 = C41056u0.f177064y;
        AbstractC41063y abstractC41063yMo133309b = abstractC41063yMo133310c.mo133309b(numValueOf, numValueOf2, c41056u1);
        int i13 = c19979i.f74960J;
        int i14 = this.f74960J;
        AbstractC41063y abstractC41063yMo133308a = abstractC41063yMo133309b.mo133308a(i14, i13);
        int i15 = c19979i.f74961K;
        int i16 = this.f74961K;
        AbstractC41063y abstractC41063yMo133310c2 = abstractC41063yMo133308a.mo133308a(i16, i15).mo133310c(this.f74957G, c19979i.f74957G);
        Boolean boolValueOf = Boolean.valueOf(this.f74958H);
        Boolean boolValueOf2 = Boolean.valueOf(c19979i.f74958H);
        if (i14 != 0) {
            c41056u0 = c41056u1;
        }
        AbstractC41063y abstractC41063yMo133308a2 = abstractC41063yMo133310c2.mo133309b(boolValueOf, boolValueOf2, c41056u0).mo133308a(this.f74962L, c19979i.f74962L);
        if (i16 == 0) {
            abstractC41063yMo133308a2 = abstractC41063yMo133308a2.mo133311d(this.f74963M, c19979i.f74963M);
        }
        return abstractC41063yMo133308a2.mo133312e();
    }
}
