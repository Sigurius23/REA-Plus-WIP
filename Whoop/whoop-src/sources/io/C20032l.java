package io;

import no.nordicsemi.android.dfu.DfuBaseService;
import p309lo.AbstractC24567y;
import p465rm.C31521c0;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41063y;
import p690zr.C41056u0;
import sn.C32766w0;

/* JADX INFO: renamed from: io.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C20032l extends AbstractC19981k {

    /* JADX INFO: renamed from: E */
    public final boolean f75146E;

    /* JADX INFO: renamed from: F */
    public final C18744f f75147F;

    /* JADX INFO: renamed from: G */
    public final boolean f75148G;

    /* JADX INFO: renamed from: H */
    public final boolean f75149H;

    /* JADX INFO: renamed from: I */
    public final int f75150I;

    /* JADX INFO: renamed from: J */
    public final int f75151J;

    /* JADX INFO: renamed from: K */
    public final int f75152K;

    /* JADX INFO: renamed from: L */
    public final int f75153L;

    /* JADX INFO: renamed from: M */
    public final boolean f75154M;

    /* JADX INFO: renamed from: N */
    public final boolean f75155N;

    /* JADX INFO: renamed from: O */
    public final int f75156O;

    /* JADX INFO: renamed from: P */
    public final boolean f75157P;

    /* JADX INFO: renamed from: Q */
    public final boolean f75158Q;

    /* JADX INFO: renamed from: R */
    public final int f75159R;

    /* JADX WARN: Code duplicated, block: B:111:0x012f  */
    /* JADX WARN: Code duplicated, block: B:31:0x004d  */
    /* JADX WARN: Code duplicated, block: B:51:0x007b  */
    public C20032l(int i13, C32766w0 c32766w0, int i14, C18744f c18744f, int i15, int i16, boolean z4) {
        boolean z13;
        boolean z14;
        int i17;
        int i18;
        C31521c0 c31521c0;
        int i19;
        int i24;
        int i25;
        C31521c0 c31521c1;
        int i26;
        int i27;
        int i28;
        super(i13, c32766w0, i14);
        this.f75147F = c18744f;
        boolean z15 = c18744f.f73659c0;
        AbstractC41023g0 abstractC41023g0 = c18744f.f77563L;
        int i29 = z15 ? 24 : 16;
        int i34 = 0;
        this.f75155N = c18744f.f73658b0 && (i16 & i29) != 0;
        if (!z4 || (((i26 = (c31521c1 = this.f74967z).f130082Q) != -1 && i26 > c18744f.f77577w) || ((i27 = c31521c1.f130083R) != -1 && i27 > c18744f.f77578x))) {
            z13 = false;
        } else {
            float f13 = c31521c1.f130084S;
            if ((f13 == -1.0f || f13 <= c18744f.f77579y) && ((i28 = c31521c1.f130073H) == -1 || i28 <= c18744f.f77580z)) {
                z13 = true;
            } else {
                z13 = false;
            }
        }
        this.f75146E = z13;
        if (!z4 || (((i19 = (c31521c0 = this.f74967z).f130082Q) != -1 && i19 < c18744f.f77556E) || ((i24 = c31521c0.f130083R) != -1 && i24 < c18744f.f77557F))) {
            z14 = false;
        } else {
            float f14 = c31521c0.f130084S;
            if ((f14 == -1.0f || f14 >= c18744f.f77558G) && ((i25 = c31521c0.f130073H) == -1 || i25 >= c18744f.f77559H)) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        this.f75148G = z14;
        this.f75149H = C20033m.m55867b(i15, false);
        C31521c0 c31521c2 = this.f74967z;
        this.f75150I = c31521c2.f130073H;
        int i35 = c31521c2.f130082Q;
        this.f75151J = (i35 == -1 || (i18 = c31521c2.f130083R) == -1) ? -1 : i35 * i18;
        int i36 = c31521c2.f130070E;
        int i37 = c18744f.f77564M;
        int i38 = Integer.MAX_VALUE;
        this.f75153L = (i36 == 0 || i36 != i37) ? Integer.bitCount(i36 & i37) : Integer.MAX_VALUE;
        int i39 = this.f74967z.f130070E;
        this.f75154M = i39 == 0 || (i39 & 1) != 0;
        for (int i44 = 0; i44 < abstractC41023g0.size(); i44++) {
            String str = this.f74967z.f130077L;
            if (str != null && str.equals(abstractC41023g0.get(i44))) {
                i38 = i44;
                break;
            }
        }
        this.f75152K = i38;
        this.f75157P = (i15 & 128) == 128;
        this.f75158Q = (i15 & 64) == 64;
        C31521c0 c31521c3 = this.f74967z;
        String str2 = c31521c3.f130077L;
        if (str2 != null) {
            i17 = 3;
            switch (str2) {
                case "video/av01":
                    i17 = 4;
                    break;
                case "video/hevc":
                    break;
                case "video/avc":
                    i17 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i17 = 2;
                    break;
                default:
                    i17 = 0;
                    break;
            }
        } else {
            i17 = 0;
        }
        this.f75159R = i17;
        boolean z16 = this.f75146E;
        C18744f c18744f2 = this.f75147F;
        if ((c31521c3.f130070E & DfuBaseService.ERROR_CONNECTION_MASK) == 0 && C20033m.m55867b(i15, c18744f2.f73666j0) && (z16 || c18744f2.f73657a0)) {
            i34 = (!C20033m.m55867b(i15, false) || !this.f75148G || !z16 || c31521c3.f130073H == -1 || c18744f2.f77574W || c18744f2.f77573V || (i29 & i15) == 0) ? 1 : 2;
        }
        this.f75156O = i34;
    }

    /* JADX INFO: renamed from: c */
    public static int m55865c(C20032l c20032l, C20032l c20032l2) {
        AbstractC41063y abstractC41063yMo133309b = AbstractC41063y.f177072a.mo133310c(c20032l.f75149H, c20032l2.f75149H).mo133308a(c20032l.f75153L, c20032l2.f75153L).mo133310c(c20032l.f75154M, c20032l2.f75154M).mo133310c(c20032l.f75146E, c20032l2.f75146E).mo133310c(c20032l.f75148G, c20032l2.f75148G).mo133309b(Integer.valueOf(c20032l.f75152K), Integer.valueOf(c20032l2.f75152K), C41056u0.f177064y);
        boolean z4 = c20032l.f75157P;
        AbstractC41063y abstractC41063yMo133310c = abstractC41063yMo133309b.mo133310c(z4, c20032l2.f75157P);
        boolean z13 = c20032l.f75158Q;
        AbstractC41063y abstractC41063yMo133310c2 = abstractC41063yMo133310c.mo133310c(z13, c20032l2.f75158Q);
        if (z4 && z13) {
            abstractC41063yMo133310c2 = abstractC41063yMo133310c2.mo133308a(c20032l.f75159R, c20032l2.f75159R);
        }
        return abstractC41063yMo133310c2.mo133312e();
    }

    @Override // io.AbstractC19981k
    /* JADX INFO: renamed from: a */
    public final int mo54507a() {
        return this.f75156O;
    }

    @Override // io.AbstractC19981k
    /* JADX INFO: renamed from: b */
    public final boolean mo54508b(AbstractC19981k abstractC19981k) {
        C20032l c20032l = (C20032l) abstractC19981k;
        if (!this.f75155N && !AbstractC24567y.m71670a(this.f74967z.f130077L, c20032l.f74967z.f130077L)) {
            return false;
        }
        if (this.f75147F.f73660d0) {
            return true;
        }
        return this.f75157P == c20032l.f75157P && this.f75158Q == c20032l.f75158Q;
    }
}
