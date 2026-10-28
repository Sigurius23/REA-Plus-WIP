package p361o9;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Objects;
import p031b9.AbstractC2829f;
import p516u8.C34610p;
import p516u8.C34611p0;
import p516u8.C34615r0;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41058v0;
import p690zr.AbstractC41063y;
import p690zr.C41056u0;

/* JADX INFO: renamed from: o9.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C27666f extends AbstractC27675o implements Comparable {

    /* JADX INFO: renamed from: E */
    public final int f111343E;

    /* JADX INFO: renamed from: F */
    public final boolean f111344F;

    /* JADX INFO: renamed from: G */
    public final String f111345G;

    /* JADX INFO: renamed from: H */
    public final C27670j f111346H;

    /* JADX INFO: renamed from: I */
    public final boolean f111347I;

    /* JADX INFO: renamed from: J */
    public final int f111348J;

    /* JADX INFO: renamed from: K */
    public final int f111349K;

    /* JADX INFO: renamed from: L */
    public final int f111350L;

    /* JADX INFO: renamed from: M */
    public final boolean f111351M;

    /* JADX INFO: renamed from: N */
    public final boolean f111352N;

    /* JADX INFO: renamed from: O */
    public final int f111353O;

    /* JADX INFO: renamed from: P */
    public final int f111354P;

    /* JADX INFO: renamed from: Q */
    public final boolean f111355Q;

    /* JADX INFO: renamed from: R */
    public final int f111356R;

    /* JADX INFO: renamed from: S */
    public final int f111357S;

    /* JADX INFO: renamed from: T */
    public final int f111358T;

    /* JADX INFO: renamed from: U */
    public final int f111359U;

    /* JADX INFO: renamed from: V */
    public final boolean f111360V;

    /* JADX INFO: renamed from: W */
    public final boolean f111361W;

    /* JADX INFO: renamed from: X */
    public final boolean f111362X;

    /* JADX WARN: Code duplicated, block: B:113:0x0186  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0144  */
    /* JADX WARN: Code duplicated, block: B:90:0x0146  */
    /* JADX WARN: Code duplicated, block: B:93:0x014f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0151  */
    public C27666f(int i13, C34611p0 c34611p0, int i14, C27670j c27670j, int i15, boolean z4, C27665e c27665e, int i16) {
        int i17;
        int iM83671M;
        boolean z13;
        int iM83671M2;
        boolean z14;
        boolean z15;
        boolean z16;
        C34615r0 c34615r0;
        super(i13, c34611p0, i14);
        this.f111346H = c27670j;
        boolean z17 = c27670j.f111383x;
        AbstractC41023g0 abstractC41023g0 = c27670j.f145845n;
        AbstractC41023g0 abstractC41023g1 = c27670j.f145842k;
        int i18 = z17 ? 24 : 16;
        int i19 = 0;
        this.f111351M = false;
        this.f111345G = C27677q.m83672P(this.f111403z.f145773d);
        this.f111347I = AbstractC2829f.m8056m(i15, false);
        int i24 = 0;
        while (true) {
            i17 = Integer.MAX_VALUE;
            if (i24 >= abstractC41023g1.size()) {
                iM83671M = 0;
                i24 = Integer.MAX_VALUE;
                break;
            } else {
                iM83671M = C27677q.m83671M(this.f111403z, (String) abstractC41023g1.get(i24), false);
                if (iM83671M > 0) {
                    break;
                } else {
                    i24++;
                }
            }
        }
        this.f111349K = i24;
        this.f111348J = iM83671M;
        int i25 = this.f111403z.f145775f;
        this.f111350L = (i25 == 0 || i25 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        C34610p c34610p = this.f111403z;
        int i26 = c34610p.f145775f;
        this.f111352N = i26 == 0 || (i26 & 1) != 0;
        this.f111355Q = (c34610p.f145774e & 1) != 0;
        String str = c34610p.f145783n;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z13 = true;
                    break;
                default:
                    z13 = false;
                    break;
            }
        } else {
            z13 = false;
        }
        this.f111362X = z13;
        int i27 = c34610p.f145759D;
        this.f111356R = i27;
        this.f111357S = c34610p.f145760E;
        int i28 = c34610p.f145779j;
        this.f111358T = i28;
        this.f111344F = (i28 == -1 || i28 <= c27670j.f145844m) && (i27 == -1 || i27 <= c27670j.f145843l) && c27665e.apply(c34610p);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = AbstractC38065t.f163031a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i29 = 0; i29 < strArrSplit.length; i29++) {
            strArrSplit[i29] = AbstractC38065t.m121897K(strArrSplit[i29]);
        }
        int i34 = 0;
        while (true) {
            if (i34 < strArrSplit.length) {
                iM83671M2 = C27677q.m83671M(this.f111403z, strArrSplit[i34], false);
                if (iM83671M2 <= 0) {
                    i34++;
                }
            } else {
                iM83671M2 = 0;
                i34 = Integer.MAX_VALUE;
            }
        }
        this.f111353O = i34;
        this.f111354P = iM83671M2;
        for (int i35 = 0; i35 < abstractC41023g0.size(); i35++) {
            String str2 = this.f111403z.f145783n;
            if (str2 != null && str2.equals(abstractC41023g0.get(i35))) {
                i17 = i35;
                this.f111359U = i17;
                if ((i15 & 384) == 128) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f111360V = z14;
                if ((i15 & 64) == 64) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                this.f111361W = z15;
                boolean z18 = this.f111344F;
                C27670j c27670j2 = this.f111346H;
                z16 = c27670j2.f111385z;
                c34615r0 = c27670j2.f145846o;
                if (AbstractC2829f.m8056m(i15, z16) && (z18 || c27670j2.f111382w)) {
                    c34615r0.getClass();
                    if (AbstractC2829f.m8056m(i15, false) || !z18 || this.f111403z.f145779j == -1 || ((!c27670j2.f111377A && z4) || (i18 & i15) == 0)) {
                        i19 = 1;
                    } else {
                        i19 = 2;
                    }
                }
                this.f111343E = i19;
            }
        }
        this.f111359U = i17;
        if ((i15 & 384) == 128) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f111360V = z14;
        if ((i15 & 64) == 64) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f111361W = z15;
        boolean z19 = this.f111344F;
        C27670j c27670j3 = this.f111346H;
        z16 = c27670j3.f111385z;
        c34615r0 = c27670j3.f145846o;
        if (AbstractC2829f.m8056m(i15, z16)) {
            c34615r0.getClass();
            if (AbstractC2829f.m8056m(i15, false)) {
                i19 = 1;
            } else {
                i19 = 1;
            }
        }
        this.f111343E = i19;
    }

    @Override // p361o9.AbstractC27675o
    /* JADX INFO: renamed from: a */
    public final int mo83659a() {
        return this.f111343E;
    }

    @Override // p361o9.AbstractC27675o
    /* JADX INFO: renamed from: b */
    public final boolean mo83660b(AbstractC27675o abstractC27675o) {
        int i13;
        String str;
        C27666f c27666f = (C27666f) abstractC27675o;
        C34610p c34610p = c27666f.f111403z;
        this.f111346H.getClass();
        C34610p c34610p2 = this.f111403z;
        int i14 = c34610p2.f145759D;
        if (i14 == -1 || i14 != c34610p.f145759D) {
            return false;
        }
        return (this.f111351M || ((str = c34610p2.f145783n) != null && TextUtils.equals(str, c34610p.f145783n))) && (i13 = c34610p2.f145760E) != -1 && i13 == c34610p.f145760E && this.f111360V == c27666f.f111360V && this.f111361W == c27666f.f111361W;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C27666f c27666f) {
        boolean z4 = this.f111347I;
        boolean z13 = this.f111344F;
        AbstractC41058v0 abstractC41058v0Mo133240a = (z13 && z4) ? C27677q.f111422j : C27677q.f111422j.mo133240a();
        boolean z14 = c27666f.f111347I;
        int i13 = c27666f.f111358T;
        AbstractC41063y abstractC41063yMo133310c = AbstractC41063y.f177072a.mo133310c(z4, z14);
        Integer numValueOf = Integer.valueOf(this.f111349K);
        Integer numValueOf2 = Integer.valueOf(c27666f.f111349K);
        C41056u0 c41056u0 = C41056u0.f177064y;
        AbstractC41063y abstractC41063yMo133309b = abstractC41063yMo133310c.mo133309b(numValueOf, numValueOf2, c41056u0).mo133308a(this.f111348J, c27666f.f111348J).mo133308a(this.f111350L, c27666f.f111350L).mo133310c(this.f111355Q, c27666f.f111355Q).mo133310c(this.f111352N, c27666f.f111352N).mo133309b(Integer.valueOf(this.f111353O), Integer.valueOf(c27666f.f111353O), c41056u0).mo133308a(this.f111354P, c27666f.f111354P).mo133310c(z13, c27666f.f111344F).mo133309b(Integer.valueOf(this.f111359U), Integer.valueOf(c27666f.f111359U), c41056u0);
        this.f111346H.getClass();
        AbstractC41063y abstractC41063yMo133309b2 = abstractC41063yMo133309b.mo133310c(this.f111360V, c27666f.f111360V).mo133310c(this.f111361W, c27666f.f111361W).mo133310c(this.f111362X, c27666f.f111362X).mo133309b(Integer.valueOf(this.f111356R), Integer.valueOf(c27666f.f111356R), abstractC41058v0Mo133240a).mo133309b(Integer.valueOf(this.f111357S), Integer.valueOf(c27666f.f111357S), abstractC41058v0Mo133240a);
        if (Objects.equals(this.f111345G, c27666f.f111345G)) {
            abstractC41063yMo133309b2 = abstractC41063yMo133309b2.mo133309b(Integer.valueOf(this.f111358T), Integer.valueOf(i13), abstractC41058v0Mo133240a);
        }
        return abstractC41063yMo133309b2.mo133312e();
    }
}
