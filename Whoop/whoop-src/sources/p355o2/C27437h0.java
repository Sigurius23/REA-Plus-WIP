package p355o2;

import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o2.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C27437h0 extends AbstractC27435g0 {

    /* JADX INFO: renamed from: E */
    public final float f110588E;

    /* JADX INFO: renamed from: F */
    public final AbstractC17911t f110589F;

    /* JADX INFO: renamed from: G */
    public final float f110590G;

    /* JADX INFO: renamed from: H */
    public final float f110591H;

    /* JADX INFO: renamed from: I */
    public final int f110592I;

    /* JADX INFO: renamed from: J */
    public final int f110593J;

    /* JADX INFO: renamed from: K */
    public final float f110594K;

    /* JADX INFO: renamed from: L */
    public final float f110595L;

    /* JADX INFO: renamed from: M */
    public final float f110596M;

    /* JADX INFO: renamed from: N */
    public final float f110597N;

    /* JADX INFO: renamed from: w */
    public final String f110598w;

    /* JADX INFO: renamed from: x */
    public final List f110599x;

    /* JADX INFO: renamed from: y */
    public final int f110600y;

    /* JADX INFO: renamed from: z */
    public final AbstractC17911t f110601z;

    public C27437h0(String str, List list, int i13, AbstractC17911t abstractC17911t, float f13, AbstractC17911t abstractC17911t2, float f14, float f15, int i14, int i15, float f16, float f17, float f18, float f19) {
        this.f110598w = str;
        this.f110599x = list;
        this.f110600y = i13;
        this.f110601z = abstractC17911t;
        this.f110588E = f13;
        this.f110589F = abstractC17911t2;
        this.f110590G = f14;
        this.f110591H = f15;
        this.f110592I = i14;
        this.f110593J = i15;
        this.f110594K = f16;
        this.f110595L = f17;
        this.f110596M = f18;
        this.f110597N = f19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C27437h0.class == obj.getClass()) {
            C27437h0 c27437h0 = (C27437h0) obj;
            return AbstractC22676k.m65745e(this.f110598w, c27437h0.f110598w) && AbstractC22676k.m65745e(this.f110601z, c27437h0.f110601z) && this.f110588E == c27437h0.f110588E && AbstractC22676k.m65745e(this.f110589F, c27437h0.f110589F) && this.f110590G == c27437h0.f110590G && this.f110591H == c27437h0.f110591H && this.f110592I == c27437h0.f110592I && this.f110593J == c27437h0.f110593J && this.f110594K == c27437h0.f110594K && this.f110595L == c27437h0.f110595L && this.f110596M == c27437h0.f110596M && this.f110597N == c27437h0.f110597N && this.f110600y == c27437h0.f110600y && AbstractC22676k.m65745e(this.f110599x, c27437h0.f110599x);
        }
        return false;
    }

    public final int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.f110598w.hashCode() * 31, 31, this.f110599x);
        AbstractC17911t abstractC17911t = this.f110601z;
        int iM30447a = AbstractC11266d.m30447a(this.f110588E, (iM31983b + (abstractC17911t != null ? abstractC17911t.hashCode() : 0)) * 31, 31);
        AbstractC17911t abstractC17911t2 = this.f110589F;
        return Integer.hashCode(this.f110600y) + AbstractC11266d.m30447a(this.f110597N, AbstractC11266d.m30447a(this.f110596M, AbstractC11266d.m30447a(this.f110595L, AbstractC11266d.m30447a(this.f110594K, AbstractC11266d.m30448b(this.f110593J, AbstractC11266d.m30448b(this.f110592I, AbstractC11266d.m30447a(this.f110591H, AbstractC11266d.m30447a(this.f110590G, (iM30447a + (abstractC17911t2 != null ? abstractC17911t2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
