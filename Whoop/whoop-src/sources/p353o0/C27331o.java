package p353o0;

import bc3.InterfaceC2994c0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import m83.AbstractC25265s;
import p180h0.EnumC16377d2;
import p389p0.C28550t;
import p635y2.InterfaceC39130s0;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import se.AbstractC32416g;

/* JADX INFO: renamed from: o0.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C27331o implements InterfaceC39130s0 {

    /* JADX INFO: renamed from: a */
    public final C27333q f109427a;

    /* JADX INFO: renamed from: b */
    public final int f109428b;

    /* JADX INFO: renamed from: c */
    public final boolean f109429c;

    /* JADX INFO: renamed from: d */
    public final float f109430d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC39130s0 f109431e;

    /* JADX INFO: renamed from: f */
    public final float f109432f;

    /* JADX INFO: renamed from: g */
    public final boolean f109433g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2994c0 f109434h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC39171c f109435i;

    /* JADX INFO: renamed from: j */
    public final int f109436j;

    /* JADX INFO: renamed from: k */
    public final Function1 f109437k;

    /* JADX INFO: renamed from: l */
    public final Function1 f109438l;

    /* JADX INFO: renamed from: m */
    public final Object f109439m;

    /* JADX INFO: renamed from: n */
    public final int f109440n;

    /* JADX INFO: renamed from: o */
    public final int f109441o;

    /* JADX INFO: renamed from: p */
    public final int f109442p;

    /* JADX INFO: renamed from: q */
    public final EnumC16377d2 f109443q;

    /* JADX INFO: renamed from: r */
    public final int f109444r;

    /* JADX INFO: renamed from: s */
    public final int f109445s;

    public C27331o(C27333q c27333q, int i13, boolean z4, float f13, InterfaceC39130s0 interfaceC39130s0, float f14, boolean z13, InterfaceC2994c0 interfaceC2994c0, InterfaceC39171c interfaceC39171c, int i14, Function1 function1, Function1 function2, List list, int i15, int i16, int i17, EnumC16377d2 enumC16377d2, int i18, int i19) {
        this.f109427a = c27333q;
        this.f109428b = i13;
        this.f109429c = z4;
        this.f109430d = f13;
        this.f109431e = interfaceC39130s0;
        this.f109432f = f14;
        this.f109433g = z13;
        this.f109434h = interfaceC2994c0;
        this.f109435i = interfaceC39171c;
        this.f109436j = i14;
        this.f109437k = function1;
        this.f109438l = function2;
        this.f109439m = list;
        this.f109440n = i15;
        this.f109441o = i16;
        this.f109442p = i17;
        this.f109443q = enumC16377d2;
        this.f109444r = i18;
        this.f109445s = i19;
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: a */
    public final Map mo776a() {
        return this.f109431e.mo776a();
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: b */
    public final void mo777b() {
        this.f109431e.mo777b();
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: c */
    public final Function1 mo778c() {
        return this.f109431e.mo778c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: d */
    public final C27331o m82471d(int i13, boolean z4) {
        C27333q c27333q;
        ?? r14;
        int i14;
        long j7;
        if (this.f109433g) {
            return null;
        }
        ?? r10 = this.f109439m;
        if (r10.isEmpty() || (c27333q = this.f109427a) == null) {
            return null;
        }
        int i15 = c27333q.f109475g;
        int i16 = this.f109428b - i13;
        if (i16 < 0 || i16 >= i15) {
            return null;
        }
        C27332p c27332p = (C27332p) AbstractC25265s.m74096F0(r10);
        C27332p c27332p2 = (C27332p) AbstractC25265s.m74112P0(r10);
        if (c27332p.f109468w || c27332p2.f109468w) {
            return null;
        }
        int i17 = this.f109441o;
        int i18 = this.f109440n;
        EnumC16377d2 enumC16377d2 = this.f109443q;
        if (i13 < 0) {
            if (Math.min((AbstractC32416g.m101138G(c27332p, enumC16377d2) + c27332p.f109460o) - i18, (AbstractC32416g.m101138G(c27332p2, enumC16377d2) + c27332p2.f109460o) - i17) <= (-i13)) {
                return null;
            }
        } else if (Math.min(i18 - AbstractC32416g.m101138G(c27332p, enumC16377d2), i17 - AbstractC32416g.m101138G(c27332p2, enumC16377d2)) <= i13) {
            return null;
        }
        int size = ((Collection) r10).size();
        int i19 = 0;
        ?? r15 = r10;
        while (i19 < size) {
            C27332p c27332p3 = (C27332p) r15.get(i19);
            c27332p3.getClass();
            if (c27332p3.f109468w) {
                r14 = r15;
                i14 = size;
            } else {
                long j13 = c27332p3.f109465t;
                long j14 = 4294967295L;
                c27332p3.f109465t = (((long) ((int) (j13 >> 32))) << 32) | (((long) (((int) (j13 & 4294967295L)) + i13)) & 4294967295L);
                if (z4) {
                    int size2 = c27332p3.f109452g.size();
                    int i24 = 0;
                    while (i24 < size2) {
                        C28550t c28550tM3437a = c27332p3.f109455j.m3437a(i24, c27332p3.f109447b);
                        if (c28550tM3437a != null) {
                            r15 = r15;
                            long j15 = c28550tM3437a.f115512l;
                            j7 = j14;
                            c28550tM3437a.f115512l = (((long) (((int) (j15 & j7)) + i13)) & j7) | (((long) ((int) (j15 >> 32))) << 32);
                        } else {
                            r15 = r15;
                            j7 = j14;
                        }
                        i24++;
                        r15 = r15;
                        j14 = j7;
                        size = size;
                    }
                    r15 = r15;
                }
                r14 = r15;
                i14 = size;
            }
            i19++;
            i16 = i16;
            r15 = r14;
            size = i14;
        }
        return new C27331o(this.f109427a, i16, this.f109429c || i13 > 0, i13, this.f109431e, this.f109432f, this.f109433g, this.f109434h, this.f109435i, this.f109436j, this.f109437k, this.f109438l, r15, this.f109440n, this.f109441o, this.f109442p, enumC16377d2, this.f109444r, this.f109445s);
    }

    /* JADX INFO: renamed from: e */
    public final long m82472e() {
        InterfaceC39130s0 interfaceC39130s0 = this.f109431e;
        return (((long) interfaceC39130s0.getWidth()) << 32) | (((long) interfaceC39130s0.getHeight()) & 4294967295L);
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getHeight() {
        return this.f109431e.getHeight();
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getWidth() {
        return this.f109431e.getWidth();
    }
}
