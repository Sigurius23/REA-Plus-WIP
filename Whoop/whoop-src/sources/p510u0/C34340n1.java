package p510u0;

import e93.AbstractC12889b;
import p180h0.EnumC16377d2;
import p181h2.C16618c;
import p294l3.C23283u0;
import p389p0.C28539n0;
import p390p1.C28617g1;
import p390p1.C28621h1;
import p390p1.C28633k1;
import p390p1.C28676v0;
import p634y1.AbstractC39038k;
import p734sl0.C32587b2;

/* JADX INFO: renamed from: u0.n1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34340n1 {

    /* JADX INFO: renamed from: g */
    public static final C28539n0 f144247g = AbstractC39038k.m124456b(new C32587b2(9), new C34350r(8));

    /* JADX INFO: renamed from: a */
    public final C28617g1 f144248a;

    /* JADX INFO: renamed from: b */
    public final C28617g1 f144249b = new C28617g1(0.0f);

    /* JADX INFO: renamed from: c */
    public final C28621h1 f144250c = new C28621h1(0);

    /* JADX INFO: renamed from: d */
    public C16618c f144251d = C16618c.f63938e;

    /* JADX INFO: renamed from: e */
    public long f144252e = C23283u0.f92251b;

    /* JADX INFO: renamed from: f */
    public final C28633k1 f144253f;

    public C34340n1(EnumC16377d2 enumC16377d2, float f13) {
        this.f144248a = new C28617g1(f13);
        this.f144253f = new C28633k1(enumC16377d2, C28676v0.f115974F);
    }

    /* JADX INFO: renamed from: a */
    public final void m108644a(EnumC16377d2 enumC16377d2, C16618c c16618c, int i13, int i14) {
        float f13;
        float f14 = i14 - i13;
        this.f144249b.m87023y(f14);
        float f15 = c16618c.f63939a;
        float f16 = c16618c.f63940b;
        C16618c c16618c2 = this.f144251d;
        float f17 = c16618c2.f63939a;
        C28617g1 c28617g1 = this.f144248a;
        if (f15 != f17 || f16 != c16618c2.f63940b) {
            boolean z4 = enumC16377d2 == EnumC16377d2.f62971w;
            if (z4) {
                f15 = f16;
            }
            float f18 = z4 ? c16618c.f63942d : c16618c.f63941c;
            float fM87022x = c28617g1.m87022x();
            float f19 = i13;
            float f24 = fM87022x + f19;
            if (f18 <= f24 && (f15 >= fM87022x || f18 - f15 <= f19)) {
                f13 = (f15 >= fM87022x || f18 - f15 > f19) ? 0.0f : f15 - fM87022x;
            } else {
                f13 = f18 - f24;
            }
            c28617g1.m87023y(c28617g1.m87022x() + f13);
            this.f144251d = c16618c;
        }
        c28617g1.m87023y(AbstractC12889b.m36283m(c28617g1.m87022x(), 0.0f, f14));
        this.f144250c.m87025y(i13);
    }
}
