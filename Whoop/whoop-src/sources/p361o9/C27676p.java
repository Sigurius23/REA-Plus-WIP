package p361o9;

import java.util.Objects;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2829f;
import p516u8.C34610p;
import p516u8.C34611p0;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41058v0;
import p690zr.AbstractC41063y;
import p690zr.C41056u0;

/* JADX INFO: renamed from: o9.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C27676p extends AbstractC27675o {

    /* JADX INFO: renamed from: E */
    public final boolean f111404E;

    /* JADX INFO: renamed from: F */
    public final C27670j f111405F;

    /* JADX INFO: renamed from: G */
    public final boolean f111406G;

    /* JADX INFO: renamed from: H */
    public final boolean f111407H;

    /* JADX INFO: renamed from: I */
    public final boolean f111408I;

    /* JADX INFO: renamed from: J */
    public final int f111409J;

    /* JADX INFO: renamed from: K */
    public final int f111410K;

    /* JADX INFO: renamed from: L */
    public final int f111411L;

    /* JADX INFO: renamed from: M */
    public final int f111412M;

    /* JADX INFO: renamed from: N */
    public final int f111413N;

    /* JADX INFO: renamed from: O */
    public final int f111414O;

    /* JADX INFO: renamed from: P */
    public final boolean f111415P;

    /* JADX INFO: renamed from: Q */
    public final int f111416Q;

    /* JADX INFO: renamed from: R */
    public final boolean f111417R;

    /* JADX INFO: renamed from: S */
    public final int f111418S;

    /* JADX INFO: renamed from: T */
    public final boolean f111419T;

    /* JADX INFO: renamed from: U */
    public final boolean f111420U;

    /* JADX INFO: renamed from: V */
    public final int f111421V;

    /* JADX WARN: Code duplicated, block: B:124:0x016c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:42:0x006a  */
    public C27676p(int i13, C34611p0 c34611p0, int i14, C27670j c27670j, int i15, String str, int i16, boolean z4) {
        boolean z13;
        boolean z14;
        int i17;
        int iM83671M;
        int i18;
        int i19;
        C34610p c34610p;
        int i24;
        int i25;
        int i26;
        C34610p c34610p2;
        int i27;
        int i28;
        int i29;
        super(i13, c34611p0, i14);
        this.f111405F = c27670j;
        boolean z15 = c27670j.f111381v;
        AbstractC41023g0 abstractC41023g0 = c27670j.f145840i;
        AbstractC41023g0 abstractC41023g1 = c27670j.f145841j;
        int i34 = z15 ? 24 : 16;
        int i35 = 0;
        this.f111417R = false;
        if (!z4 || (((i27 = (c34610p2 = this.f111403z).f145790u) != -1 && i27 > c27670j.f145832a) || ((i28 = c34610p2.f145791v) != -1 && i28 > c27670j.f145833b))) {
            z13 = false;
        } else {
            float f13 = c34610p2.f145792w;
            if ((f13 == -1.0f || f13 <= c27670j.f145834c) && ((i29 = c34610p2.f145779j) == -1 || i29 <= c27670j.f145835d)) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        this.f111404E = z13;
        if (!z4 || (((i24 = (c34610p = this.f111403z).f145790u) != -1 && i24 < 0) || ((i25 = c34610p.f145791v) != -1 && i25 < 0))) {
            z14 = false;
        } else {
            float f14 = c34610p.f145792w;
            if ((f14 == -1.0f || f14 >= 0) && ((i26 = c34610p.f145779j) == -1 || i26 >= 0)) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        this.f111406G = z14;
        this.f111407H = AbstractC2829f.m8056m(i15, false);
        C34610p c34610p3 = this.f111403z;
        float f15 = c34610p3.f145792w;
        this.f111408I = f15 != -1.0f && f15 >= 10.0f;
        this.f111409J = c34610p3.f145779j;
        int i36 = c34610p3.f145790u;
        this.f111410K = (i36 == -1 || (i19 = c34610p3.f145791v) == -1) ? -1 : i36 * i19;
        int i37 = 0;
        while (true) {
            i17 = Integer.MAX_VALUE;
            if (i37 >= abstractC41023g1.size()) {
                iM83671M = 0;
                i37 = Integer.MAX_VALUE;
                break;
            } else {
                iM83671M = C27677q.m83671M(this.f111403z, (String) abstractC41023g1.get(i37), false);
                if (iM83671M > 0) {
                    break;
                } else {
                    i37++;
                }
            }
        }
        this.f111412M = i37;
        this.f111413N = iM83671M;
        int i38 = this.f111403z.f145775f;
        AbstractC41058v0 abstractC41058v0 = C27677q.f111422j;
        this.f111414O = (i38 == 0 || i38 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        int i39 = this.f111403z.f145775f;
        this.f111415P = i39 == 0 || (i39 & 1) != 0;
        this.f111416Q = C27677q.m83671M(this.f111403z, str, C27677q.m83672P(str) == null);
        for (int i44 = 0; i44 < abstractC41023g0.size(); i44++) {
            String str2 = this.f111403z.f145783n;
            if (str2 != null && str2.equals(abstractC41023g0.get(i44))) {
                i17 = i44;
                break;
            }
        }
        this.f111411L = i17;
        this.f111419T = (i15 & 384) == 128;
        this.f111420U = (i15 & 64) == 64;
        C34610p c34610p4 = this.f111403z;
        String str3 = c34610p4.f145783n;
        if (str3 != null) {
            i18 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    i18 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i18 = 3;
                    break;
                case "video/avc":
                    i18 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i18 = 2;
                    break;
                default:
                    i18 = 0;
                    break;
            }
        } else {
            i18 = 0;
        }
        this.f111421V = i18;
        boolean z16 = this.f111404E;
        C27670j c27670j2 = this.f111405F;
        if ((c34610p4.f145775f & DfuBaseService.ERROR_CONNECTION_MASK) == 0 && AbstractC2829f.m8056m(i15, c27670j2.f111385z) && (z16 || c27670j2.f111380u)) {
            i35 = (AbstractC2829f.m8056m(i15, false) && this.f111406G && z16 && c34610p4.f145779j != -1 && (i34 & i15) != 0) ? 2 : 1;
        }
        this.f111418S = i35;
    }

    /* JADX INFO: renamed from: c */
    public static int m83669c(C27676p c27676p, C27676p c27676p2) {
        AbstractC41063y abstractC41063yMo133310c = AbstractC41063y.f177072a.mo133310c(c27676p.f111407H, c27676p2.f111407H);
        Integer numValueOf = Integer.valueOf(c27676p.f111412M);
        Integer numValueOf2 = Integer.valueOf(c27676p2.f111412M);
        C41056u0 c41056u0 = C41056u0.f177064y;
        AbstractC41063y abstractC41063yMo133309b = abstractC41063yMo133310c.mo133309b(numValueOf, numValueOf2, c41056u0).mo133308a(c27676p.f111413N, c27676p2.f111413N).mo133308a(c27676p.f111414O, c27676p2.f111414O).mo133310c(c27676p.f111415P, c27676p2.f111415P).mo133308a(c27676p.f111416Q, c27676p2.f111416Q).mo133310c(c27676p.f111408I, c27676p2.f111408I).mo133310c(c27676p.f111404E, c27676p2.f111404E).mo133310c(c27676p.f111406G, c27676p2.f111406G).mo133309b(Integer.valueOf(c27676p.f111411L), Integer.valueOf(c27676p2.f111411L), c41056u0);
        boolean z4 = c27676p.f111419T;
        AbstractC41063y abstractC41063yMo133310c2 = abstractC41063yMo133309b.mo133310c(z4, c27676p2.f111419T);
        boolean z13 = c27676p.f111420U;
        AbstractC41063y abstractC41063yMo133310c3 = abstractC41063yMo133310c2.mo133310c(z13, c27676p2.f111420U);
        if (z4 && z13) {
            abstractC41063yMo133310c3 = abstractC41063yMo133310c3.mo133308a(c27676p.f111421V, c27676p2.f111421V);
        }
        return abstractC41063yMo133310c3.mo133312e();
    }

    @Override // p361o9.AbstractC27675o
    /* JADX INFO: renamed from: a */
    public final int mo83659a() {
        return this.f111418S;
    }

    @Override // p361o9.AbstractC27675o
    /* JADX INFO: renamed from: b */
    public final boolean mo83660b(AbstractC27675o abstractC27675o) {
        C27676p c27676p = (C27676p) abstractC27675o;
        if (!this.f111417R && !Objects.equals(this.f111403z.f145783n, c27676p.f111403z.f145783n)) {
            return false;
        }
        this.f111405F.getClass();
        return this.f111419T == c27676p.f111419T && this.f111420U == c27676p.f111420U;
    }
}
