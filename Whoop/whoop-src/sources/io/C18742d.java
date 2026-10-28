package io;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import p309lo.AbstractC24567y;
import p465rm.C31521c0;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41058v0;
import p690zr.AbstractC41063y;
import p690zr.C41056u0;
import sn.C32766w0;

/* JADX INFO: renamed from: io.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C18742d extends AbstractC19981k implements Comparable {

    /* JADX INFO: renamed from: E */
    public final int f73635E;

    /* JADX INFO: renamed from: F */
    public final boolean f73636F;

    /* JADX INFO: renamed from: G */
    public final String f73637G;

    /* JADX INFO: renamed from: H */
    public final C18744f f73638H;

    /* JADX INFO: renamed from: I */
    public final boolean f73639I;

    /* JADX INFO: renamed from: J */
    public final int f73640J;

    /* JADX INFO: renamed from: K */
    public final int f73641K;

    /* JADX INFO: renamed from: L */
    public final int f73642L;

    /* JADX INFO: renamed from: M */
    public final boolean f73643M;

    /* JADX INFO: renamed from: N */
    public final int f73644N;

    /* JADX INFO: renamed from: O */
    public final int f73645O;

    /* JADX INFO: renamed from: P */
    public final boolean f73646P;

    /* JADX INFO: renamed from: Q */
    public final int f73647Q;

    /* JADX INFO: renamed from: R */
    public final int f73648R;

    /* JADX INFO: renamed from: S */
    public final int f73649S;

    /* JADX INFO: renamed from: T */
    public final int f73650T;

    /* JADX INFO: renamed from: U */
    public final boolean f73651U;

    /* JADX INFO: renamed from: V */
    public final boolean f73652V;

    public C18742d(int i13, C32766w0 c32766w0, int i14, C18744f c18744f, int i15, boolean z4) {
        AbstractC41023g0 abstractC41023g0;
        int i16;
        int iM55866a;
        String[] strArrSplit;
        int iM55866a2;
        super(i13, c32766w0, i14);
        this.f73638H = c18744f;
        this.f73637G = C20033m.m55869d(this.f74967z.f130100y);
        int i17 = 0;
        this.f73639I = C20033m.m55867b(i15, false);
        int i18 = 0;
        while (true) {
            AbstractC41023g0 abstractC41023g1 = c18744f.f77565N;
            abstractC41023g0 = c18744f.f77569R;
            i16 = Integer.MAX_VALUE;
            if (i18 >= abstractC41023g1.size()) {
                iM55866a = 0;
                i18 = Integer.MAX_VALUE;
                break;
            } else {
                iM55866a = C20033m.m55866a(this.f74967z, (String) c18744f.f77565N.get(i18), false);
                if (iM55866a > 0) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        this.f73641K = i18;
        this.f73640J = iM55866a;
        int i19 = this.f74967z.f130070E;
        int i24 = c18744f.f77566O;
        this.f73642L = (i19 == 0 || i19 != i24) ? Integer.bitCount(i19 & i24) : Integer.MAX_VALUE;
        C31521c0 c31521c0 = this.f74967z;
        int i25 = c31521c0.f130070E;
        this.f73643M = i25 == 0 || (i25 & 1) != 0;
        this.f73646P = (c31521c0.f130101z & 1) != 0;
        int i26 = c31521c0.f130090Y;
        this.f73647Q = i26;
        this.f73648R = c31521c0.f130091Z;
        int i27 = c31521c0.f130073H;
        this.f73649S = i27;
        this.f73636F = (i27 == -1 || i27 <= c18744f.f77568Q) && (i26 == -1 || i26 <= c18744f.f77567P);
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i28 = AbstractC24567y.f95875a;
        if (i28 >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArrSplit = new String[]{i28 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i29 = 0; i29 < strArrSplit.length; i29++) {
            strArrSplit[i29] = AbstractC24567y.m71663A(strArrSplit[i29]);
        }
        int i34 = 0;
        while (true) {
            if (i34 >= strArrSplit.length) {
                iM55866a2 = 0;
                i34 = Integer.MAX_VALUE;
                break;
            } else {
                iM55866a2 = C20033m.m55866a(this.f74967z, strArrSplit[i34], false);
                if (iM55866a2 > 0) {
                    break;
                } else {
                    i34++;
                }
            }
        }
        this.f73644N = i34;
        this.f73645O = iM55866a2;
        for (int i35 = 0; i35 < abstractC41023g0.size(); i35++) {
            String str = this.f74967z.f130077L;
            if (str != null && str.equals(abstractC41023g0.get(i35))) {
                i16 = i35;
                break;
            }
        }
        this.f73650T = i16;
        this.f73651U = (i15 & 128) == 128;
        this.f73652V = (i15 & 64) == 64;
        boolean z13 = this.f73636F;
        C18744f c18744f2 = this.f73638H;
        if (C20033m.m55867b(i15, c18744f2.f73666j0) && (z13 || c18744f2.f73661e0)) {
            i17 = (!C20033m.m55867b(i15, false) || !z13 || this.f74967z.f130073H == -1 || c18744f2.f77574W || c18744f2.f77573V || (!c18744f2.f73668l0 && z4)) ? 1 : 2;
        }
        this.f73635E = i17;
    }

    @Override // io.AbstractC19981k
    /* JADX INFO: renamed from: a */
    public final int mo54507a() {
        return this.f73635E;
    }

    @Override // io.AbstractC19981k
    /* JADX INFO: renamed from: b */
    public final boolean mo54508b(AbstractC19981k abstractC19981k) {
        int i13;
        String str;
        int i14;
        C18742d c18742d = (C18742d) abstractC19981k;
        C31521c0 c31521c0 = c18742d.f74967z;
        C18744f c18744f = this.f73638H;
        boolean z4 = c18744f.f73664h0;
        C31521c0 c31521c1 = this.f74967z;
        if (!z4 && ((i14 = c31521c1.f130090Y) == -1 || i14 != c31521c0.f130090Y)) {
            return false;
        }
        if (!c18744f.f73662f0 && ((str = c31521c1.f130077L) == null || !TextUtils.equals(str, c31521c0.f130077L))) {
            return false;
        }
        if (!c18744f.f73663g0 && ((i13 = c31521c1.f130091Z) == -1 || i13 != c31521c0.f130091Z)) {
            return false;
        }
        if (c18744f.f73665i0) {
            return true;
        }
        return this.f73651U == c18742d.f73651U && this.f73652V == c18742d.f73652V;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C18742d c18742d) {
        boolean z4 = this.f73639I;
        boolean z13 = this.f73636F;
        AbstractC41058v0 abstractC41058v0Mo133240a = (z13 && z4) ? C20033m.f75160e : C20033m.f75160e.mo133240a();
        boolean z14 = c18742d.f73639I;
        int i13 = c18742d.f73649S;
        AbstractC41063y abstractC41063yMo133310c = AbstractC41063y.f177072a.mo133310c(z4, z14);
        Integer numValueOf = Integer.valueOf(this.f73641K);
        Integer numValueOf2 = Integer.valueOf(c18742d.f73641K);
        C41056u0 c41056u0 = C41056u0.f177064y;
        AbstractC41063y abstractC41063yMo133309b = abstractC41063yMo133310c.mo133309b(numValueOf, numValueOf2, c41056u0).mo133308a(this.f73640J, c18742d.f73640J).mo133308a(this.f73642L, c18742d.f73642L).mo133310c(this.f73646P, c18742d.f73646P).mo133310c(this.f73643M, c18742d.f73643M).mo133309b(Integer.valueOf(this.f73644N), Integer.valueOf(c18742d.f73644N), c41056u0).mo133308a(this.f73645O, c18742d.f73645O).mo133310c(z13, c18742d.f73636F).mo133309b(Integer.valueOf(this.f73650T), Integer.valueOf(c18742d.f73650T), c41056u0);
        int i14 = this.f73649S;
        AbstractC41063y abstractC41063yMo133309b2 = abstractC41063yMo133309b.mo133309b(Integer.valueOf(i14), Integer.valueOf(i13), this.f73638H.f77573V ? C20033m.f75160e.mo133240a() : C20033m.f75161f).mo133310c(this.f73651U, c18742d.f73651U).mo133310c(this.f73652V, c18742d.f73652V).mo133309b(Integer.valueOf(this.f73647Q), Integer.valueOf(c18742d.f73647Q), abstractC41058v0Mo133240a).mo133309b(Integer.valueOf(this.f73648R), Integer.valueOf(c18742d.f73648R), abstractC41058v0Mo133240a);
        Integer numValueOf3 = Integer.valueOf(i14);
        Integer numValueOf4 = Integer.valueOf(i13);
        if (!AbstractC24567y.m71670a(this.f73637G, c18742d.f73637G)) {
            abstractC41058v0Mo133240a = C20033m.f75161f;
        }
        return abstractC41063yMo133309b2.mo133309b(numValueOf3, numValueOf4, abstractC41058v0Mo133240a).mo133312e();
    }
}
