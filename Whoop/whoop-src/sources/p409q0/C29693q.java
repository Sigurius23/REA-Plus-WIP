package p409q0;

import bc3.InterfaceC2994c0;
import java.util.List;
import java.util.Map;
import m83.AbstractC25265s;
import m83.C25271y;
import p180h0.EnumC16377d2;
import p206i0.InterfaceC17836n;
import p635y2.InterfaceC39130s0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: q0.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C29693q implements InterfaceC39130s0 {

    /* JADX INFO: renamed from: a */
    public final List f121381a;

    /* JADX INFO: renamed from: b */
    public final int f121382b;

    /* JADX INFO: renamed from: c */
    public final int f121383c;

    /* JADX INFO: renamed from: d */
    public final int f121384d;

    /* JADX INFO: renamed from: e */
    public final EnumC16377d2 f121385e;

    /* JADX INFO: renamed from: f */
    public final int f121386f;

    /* JADX INFO: renamed from: g */
    public final int f121387g;

    /* JADX INFO: renamed from: h */
    public final int f121388h;

    /* JADX INFO: renamed from: i */
    public final C29678d f121389i;

    /* JADX INFO: renamed from: j */
    public final C29678d f121390j;

    /* JADX INFO: renamed from: k */
    public final float f121391k;

    /* JADX INFO: renamed from: l */
    public final int f121392l;

    /* JADX INFO: renamed from: m */
    public final boolean f121393m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC17836n f121394n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC39130s0 f121395o;

    /* JADX INFO: renamed from: p */
    public final boolean f121396p;

    /* JADX INFO: renamed from: q */
    public final List f121397q;

    /* JADX INFO: renamed from: r */
    public final List f121398r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC2994c0 f121399s;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C29693q(int i13, int i14, int i15, EnumC16377d2 enumC16377d2, int i16, int i17, int i18, InterfaceC17836n interfaceC17836n, InterfaceC39130s0 interfaceC39130s0, InterfaceC2994c0 interfaceC2994c0) {
        C25271y c25271y = C25271y.f99162w;
        this(c25271y, i13, i14, i15, enumC16377d2, i16, i17, i18, null, null, 0.0f, 0, false, interfaceC17836n, interfaceC39130s0, false, c25271y, c25271y, interfaceC2994c0);
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: a */
    public final Map mo776a() {
        return this.f121395o.mo776a();
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: b */
    public final void mo777b() {
        this.f121395o.mo777b();
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: c */
    public final Function1 mo778c() {
        return this.f121395o.mo778c();
    }

    /* JADX INFO: renamed from: d */
    public final C29693q m91153d(int i13) {
        int i14;
        int i15 = this.f121382b + this.f121383c;
        if (this.f121396p) {
            return null;
        }
        List list = this.f121381a;
        if (list.isEmpty() || this.f121389i == null || (i14 = this.f121392l - i13) < 0 || i14 >= i15) {
            return null;
        }
        float f13 = this.f121391k - (i15 != 0 ? i13 / i15 : 0.0f);
        if (this.f121390j == null || f13 >= 0.5f || f13 <= -0.5f) {
            return null;
        }
        C29678d c29678d = (C29678d) AbstractC25265s.m74096F0(list);
        C29678d c29678d2 = (C29678d) AbstractC25265s.m74112P0(list);
        int i16 = this.f121387g;
        int i17 = this.f121386f;
        if (i13 < 0) {
            if (Math.min((c29678d.f121304k + i15) - i17, (c29678d2.f121304k + i15) - i16) <= (-i13)) {
                return null;
            }
        } else if (Math.min(i17 - c29678d.f121304k, i16 - c29678d2.f121304k) <= i13) {
            return null;
        }
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            ((C29678d) list.get(i18)).m91151a(i13);
        }
        List list2 = this.f121397q;
        int size2 = list2.size();
        for (int i19 = 0; i19 < size2; i19++) {
            ((C29678d) list2.get(i19)).m91151a(i13);
        }
        List list3 = this.f121398r;
        int size3 = list3.size();
        for (int i24 = 0; i24 < size3; i24++) {
            ((C29678d) list3.get(i24)).m91151a(i13);
        }
        return new C29693q(this.f121381a, this.f121382b, this.f121383c, this.f121384d, this.f121385e, this.f121386f, this.f121387g, this.f121388h, this.f121389i, this.f121390j, f13, i14, this.f121393m || i13 > 0, this.f121394n, this.f121395o, this.f121396p, this.f121397q, this.f121398r, this.f121399s);
    }

    /* JADX INFO: renamed from: e */
    public final long m91154e() {
        InterfaceC39130s0 interfaceC39130s0 = this.f121395o;
        return (((long) interfaceC39130s0.getWidth()) << 32) | (((long) interfaceC39130s0.getHeight()) & 4294967295L);
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getHeight() {
        return this.f121395o.getHeight();
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getWidth() {
        return this.f121395o.getWidth();
    }

    public C29693q(List list, int i13, int i14, int i15, EnumC16377d2 enumC16377d2, int i16, int i17, int i18, C29678d c29678d, C29678d c29678d2, float f13, int i19, boolean z4, InterfaceC17836n interfaceC17836n, InterfaceC39130s0 interfaceC39130s0, boolean z13, List list2, List list3, InterfaceC2994c0 interfaceC2994c0) {
        this.f121381a = list;
        this.f121382b = i13;
        this.f121383c = i14;
        this.f121384d = i15;
        this.f121385e = enumC16377d2;
        this.f121386f = i16;
        this.f121387g = i17;
        this.f121388h = i18;
        this.f121389i = c29678d;
        this.f121390j = c29678d2;
        this.f121391k = f13;
        this.f121392l = i19;
        this.f121393m = z4;
        this.f121394n = interfaceC17836n;
        this.f121395o = interfaceC39130s0;
        this.f121396p = z13;
        this.f121397q = list2;
        this.f121398r = list3;
        this.f121399s = interfaceC2994c0;
    }
}
