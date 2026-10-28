package p329n0;

import bc3.InterfaceC2994c0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import m83.AbstractC25265s;
import p180h0.EnumC16377d2;
import p635y2.InterfaceC39130s0;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: n0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C26061n implements InterfaceC39130s0 {

    /* JADX INFO: renamed from: a */
    public final C26062o f103167a;

    /* JADX INFO: renamed from: b */
    public final int f103168b;

    /* JADX INFO: renamed from: c */
    public final boolean f103169c;

    /* JADX INFO: renamed from: d */
    public final float f103170d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC39130s0 f103171e;

    /* JADX INFO: renamed from: f */
    public final float f103172f;

    /* JADX INFO: renamed from: g */
    public final boolean f103173g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2994c0 f103174h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC39171c f103175i;

    /* JADX INFO: renamed from: j */
    public final long f103176j;

    /* JADX INFO: renamed from: k */
    public final Object f103177k;

    /* JADX INFO: renamed from: l */
    public final int f103178l;

    /* JADX INFO: renamed from: m */
    public final int f103179m;

    /* JADX INFO: renamed from: n */
    public final int f103180n;

    /* JADX INFO: renamed from: o */
    public final EnumC16377d2 f103181o;

    /* JADX INFO: renamed from: p */
    public final int f103182p;

    /* JADX INFO: renamed from: q */
    public final int f103183q;

    public C26061n(C26062o c26062o, int i13, boolean z4, float f13, InterfaceC39130s0 interfaceC39130s0, float f14, boolean z13, InterfaceC2994c0 interfaceC2994c0, InterfaceC39171c interfaceC39171c, long j7, List list, int i14, int i15, int i16, EnumC16377d2 enumC16377d2, int i17, int i18) {
        this.f103167a = c26062o;
        this.f103168b = i13;
        this.f103169c = z4;
        this.f103170d = f13;
        this.f103171e = interfaceC39130s0;
        this.f103172f = f14;
        this.f103173g = z13;
        this.f103174h = interfaceC2994c0;
        this.f103175i = interfaceC39171c;
        this.f103176j = j7;
        this.f103177k = list;
        this.f103178l = i14;
        this.f103179m = i15;
        this.f103180n = i16;
        this.f103181o = enumC16377d2;
        this.f103182p = i17;
        this.f103183q = i18;
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: a */
    public final Map mo776a() {
        return this.f103171e.mo776a();
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: b */
    public final void mo777b() {
        this.f103171e.mo777b();
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: c */
    public final Function1 mo778c() {
        return this.f103171e.mo778c();
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: d */
    public final C26061n m77536d(int i13, boolean z4) {
        C26062o c26062o;
        if (this.f103173g) {
            return null;
        }
        ?? r15 = this.f103177k;
        if (r15.isEmpty() || (c26062o = this.f103167a) == null) {
            return null;
        }
        int iMo77544g = c26062o.mo77544g();
        int i14 = this.f103168b - i13;
        if (i14 < 0 || i14 >= iMo77544g) {
            return null;
        }
        C26062o c26062o2 = (C26062o) AbstractC25265s.m74096F0(r15);
        C26062o c26062o3 = (C26062o) AbstractC25265s.m74112P0(r15);
        if (c26062o2.mo77540c() || c26062o3.mo77540c()) {
            return null;
        }
        int i15 = this.f103179m;
        int i16 = this.f103178l;
        if (i13 < 0) {
            if (Math.min((c26062o2.mo77544g() + c26062o2.m77551n()) - i16, (c26062o3.mo77544g() + c26062o3.m77551n()) - i15) <= (-i13)) {
                return null;
            }
        } else if (Math.min(i16 - c26062o2.m77551n(), i15 - c26062o3.m77551n()) <= i13) {
            return null;
        }
        int size = ((Collection) r15).size();
        for (int i17 = 0; i17 < size; i17++) {
            ((C26062o) r15.get(i17)).m77549l(i13, z4);
        }
        return new C26061n(this.f103167a, i14, this.f103169c || i13 > 0, i13, this.f103171e, this.f103172f, this.f103173g, this.f103174h, this.f103175i, this.f103176j, r15, this.f103178l, this.f103179m, this.f103180n, this.f103181o, this.f103182p, this.f103183q);
    }

    /* JADX INFO: renamed from: e */
    public final long m77537e() {
        InterfaceC39130s0 interfaceC39130s0 = this.f103171e;
        return (((long) interfaceC39130s0.getWidth()) << 32) | (((long) interfaceC39130s0.getHeight()) & 4294967295L);
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getHeight() {
        return this.f103171e.getHeight();
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getWidth() {
        return this.f103171e.getWidth();
    }
}
