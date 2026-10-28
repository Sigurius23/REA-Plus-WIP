package p329n0;

import androidx.compose.foundation.lazy.layout.C1106b;
import bc3.AbstractC3006f0;
import java.util.List;
import p026b2.C2306l;
import p026b2.InterfaceC2300f;
import p026b2.InterfaceC2301g;
import p268k0.AbstractC22086a;
import p293l2.C23226c;
import p389p0.C28546r;
import p389p0.C28550t;
import p389p0.InterfaceC28518e0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p636y3.C39178j;
import p636y3.EnumC39181m;
import p715kotlin.KotlinNothingValueException;

/* JADX INFO: renamed from: n0.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C26062o implements InterfaceC26054g, InterfaceC28518e0 {

    /* JADX INFO: renamed from: a */
    public final int f103184a;

    /* JADX INFO: renamed from: b */
    public final List f103185b;

    /* JADX INFO: renamed from: c */
    public final boolean f103186c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2300f f103187d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2301g f103188e;

    /* JADX INFO: renamed from: f */
    public final EnumC39181m f103189f;

    /* JADX INFO: renamed from: g */
    public final int f103190g;

    /* JADX INFO: renamed from: h */
    public final int f103191h;

    /* JADX INFO: renamed from: i */
    public final int f103192i;

    /* JADX INFO: renamed from: j */
    public final long f103193j;

    /* JADX INFO: renamed from: k */
    public final Object f103194k;

    /* JADX INFO: renamed from: l */
    public final Object f103195l;

    /* JADX INFO: renamed from: m */
    public final C1106b f103196m;

    /* JADX INFO: renamed from: n */
    public final long f103197n;

    /* JADX INFO: renamed from: o */
    public int f103198o;

    /* JADX INFO: renamed from: p */
    public final int f103199p;

    /* JADX INFO: renamed from: q */
    public final int f103200q;

    /* JADX INFO: renamed from: r */
    public final int f103201r;

    /* JADX INFO: renamed from: s */
    public boolean f103202s;

    /* JADX INFO: renamed from: t */
    public int f103203t = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: u */
    public int f103204u;

    /* JADX INFO: renamed from: v */
    public int f103205v;

    /* JADX INFO: renamed from: w */
    public final int[] f103206w;

    public C26062o(int i13, List list, boolean z4, InterfaceC2300f interfaceC2300f, InterfaceC2301g interfaceC2301g, EnumC39181m enumC39181m, int i14, int i15, int i16, long j7, Object obj, Object obj2, C1106b c1106b, long j13) {
        this.f103184a = i13;
        this.f103185b = list;
        this.f103186c = z4;
        this.f103187d = interfaceC2300f;
        this.f103188e = interfaceC2301g;
        this.f103189f = enumC39181m;
        this.f103190g = i14;
        this.f103191h = i15;
        this.f103192i = i16;
        this.f103193j = j7;
        this.f103194k = obj;
        this.f103195l = obj2;
        this.f103196m = c1106b;
        this.f103197n = j13;
        int size = list.size();
        int i17 = 0;
        int iMax = 0;
        for (int i18 = 0; i18 < size; i18++) {
            AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) list.get(i18);
            boolean z13 = this.f103186c;
            i17 += z13 ? abstractC39104j1.f168212x : abstractC39104j1.f168211w;
            iMax = Math.max(iMax, !z13 ? abstractC39104j1.f168212x : abstractC39104j1.f168211w);
        }
        this.f103199p = i17;
        int i19 = i17 + this.f103192i;
        this.f103200q = i19 >= 0 ? i19 : 0;
        this.f103201r = iMax;
        this.f103206w = new int[this.f103185b.size() * 2];
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: a */
    public final void mo77538a(int i13, int i14, int i15, int i16) {
        m77554q(i13, i15, i16);
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: b */
    public final int mo77539b() {
        return this.f103185b.size();
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: c */
    public final boolean mo77540c() {
        return this.f103202s;
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: d */
    public final long mo77541d() {
        return this.f103197n;
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: e */
    public final boolean mo77542e() {
        return this.f103186c;
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: f */
    public final int mo77543f() {
        return 1;
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: g */
    public final int mo77544g() {
        return this.f103200q;
    }

    @Override // p389p0.InterfaceC28518e0
    public final int getIndex() {
        return this.f103184a;
    }

    @Override // p389p0.InterfaceC28518e0
    public final Object getKey() {
        return this.f103194k;
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: h */
    public final Object mo77545h(int i13) {
        return ((AbstractC39104j1) this.f103185b.get(i13)).mo454p();
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: i */
    public final void mo77546i() {
        this.f103202s = true;
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: j */
    public final long mo77547j(int i13) {
        if (i13 == 0 && this.f103185b.size() == 0) {
            if (this.f103186c) {
                return (4294967295L & ((long) this.f103198o)) | (((long) 0) << 32);
            }
            return (4294967295L & ((long) 0)) | (((long) this.f103198o) << 32);
        }
        int i14 = i13 * 2;
        int[] iArr = this.f103206w;
        int i15 = iArr[i14];
        return (4294967295L & ((long) iArr[i14 + 1])) | (((long) i15) << 32);
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: k */
    public final int mo77548k() {
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m77549l(int i13, boolean z4) {
        boolean z13;
        int i14;
        int i15;
        if (this.f103202s) {
            return;
        }
        this.f103198o += i13;
        int[] iArr = this.f103206w;
        int length = iArr.length;
        int i16 = 0;
        while (true) {
            z13 = this.f103186c;
            if (i16 >= length) {
                break;
            }
            int i17 = i16 & 1;
            if ((z13 && i17 != 0) || (!z13 && i17 == 0)) {
                iArr[i16] = iArr[i16] + i13;
            }
            i16++;
        }
        if (z4) {
            int size = this.f103185b.size();
            for (int i18 = 0; i18 < size; i18++) {
                C28550t c28550tM3437a = this.f103196m.m3437a(i18, this.f103194k);
                if (c28550tM3437a != null) {
                    long j7 = c28550tM3437a.f115512l;
                    if (z13) {
                        i14 = (int) (j7 >> 32);
                        i15 = ((int) (j7 & 4294967295L)) + i13;
                    } else {
                        i14 = ((int) (j7 >> 32)) + i13;
                        i15 = (int) (j7 & 4294967295L);
                    }
                    c28550tM3437a.f115512l = (((long) i15) & 4294967295L) | (((long) i14) << 32);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m77550m(long j7) {
        return (int) (this.f103186c ? j7 & 4294967295L : j7 >> 32);
    }

    /* JADX INFO: renamed from: n */
    public final int m77551n() {
        return this.f103198o;
    }

    /* JADX INFO: renamed from: o */
    public final int m77552o() {
        return this.f103199p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final void m77553p(AbstractC39101i1 abstractC39101i1, boolean z4) {
        if (this.f103203t == Integer.MIN_VALUE) {
            AbstractC22086a.m63158a("position() should be called first");
        }
        List list = this.f103185b;
        int size = list.size();
        int i13 = 0;
        while (i13 < size) {
            AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) list.get(i13);
            int i14 = this.f103204u;
            boolean z13 = this.f103186c;
            int i15 = i14 - (z13 ? abstractC39104j1.f168212x : abstractC39104j1.f168211w);
            int i16 = this.f103205v;
            long jMo77547j = mo77547j(i13);
            C28550t c28550tM3437a = this.f103196m.m3437a(i13, this.f103194k);
            C23226c c23226c = null;
            Object[] objArr = 0;
            if (c28550tM3437a != null) {
                if (z4) {
                    c28550tM3437a.f115518r = jMo77547j;
                } else {
                    if (!C39178j.m124792b(c28550tM3437a.f115518r, C28550t.f115499s)) {
                        jMo77547j = c28550tM3437a.f115518r;
                    }
                    long jM124794d = C39178j.m124794d(jMo77547j, ((C39178j) c28550tM3437a.f115517q.getValue()).f168416a);
                    if (((m77550m(jMo77547j) <= i15 && m77550m(jM124794d) <= i15) || (m77550m(jMo77547j) >= i16 && m77550m(jM124794d) >= i16)) && c28550tM3437a.m86854h()) {
                        AbstractC3006f0.m8732z(c28550tM3437a.f115501a, null, null, new C28546r(c28550tM3437a, objArr == true ? 1 : 0, 1), 3);
                    }
                    jMo77547j = jM124794d;
                }
                c23226c = c28550tM3437a.f115514n;
            } else {
                list = list;
                size = size;
            }
            long jM124794d2 = C39178j.m124794d(jMo77547j, this.f103193j);
            if (!z4 && c28550tM3437a != null) {
                c28550tM3437a.f115513m = jM124794d2;
            }
            if (z13) {
                if (c23226c != null) {
                    abstractC39101i1.getClass();
                    AbstractC39101i1.m124621a(abstractC39104j1, abstractC39101i1);
                    abstractC39104j1.mo455p0(C39178j.m124794d(jM124794d2, abstractC39104j1.f168210E), 0.0f, c23226c);
                } else {
                    AbstractC39101i1.m124628t(abstractC39101i1, abstractC39104j1, jM124794d2);
                }
            } else if (c23226c == null) {
                AbstractC39101i1.m124626p(abstractC39101i1, abstractC39104j1, jM124794d2);
            } else if (abstractC39101i1.mo124630c() == EnumC39181m.f168423w || abstractC39101i1.mo124631e() == 0) {
                AbstractC39101i1.m124621a(abstractC39104j1, abstractC39101i1);
                abstractC39104j1.mo455p0(C39178j.m124794d(jM124794d2, abstractC39104j1.f168210E), 0.0f, c23226c);
            } else {
                int iMo124631e = (abstractC39101i1.mo124631e() - abstractC39104j1.f168211w) - ((int) (jM124794d2 >> 32));
                AbstractC39101i1.m124621a(abstractC39104j1, abstractC39101i1);
                abstractC39104j1.mo455p0(C39178j.m124794d((((long) ((int) (jM124794d2 & 4294967295L))) & 4294967295L) | (((long) iMo124631e) << 32), abstractC39104j1.f168210E), 0.0f, c23226c);
            }
            i13++;
            list = list;
            size = size;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m77554q(int i13, int i14, int i15) {
        int i16;
        this.f103198o = i13;
        boolean z4 = this.f103186c;
        this.f103203t = z4 ? i15 : i14;
        List list = this.f103185b;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) list.get(i17);
            int i18 = i17 * 2;
            int[] iArr = this.f103206w;
            if (z4) {
                InterfaceC2300f interfaceC2300f = this.f103187d;
                if (interfaceC2300f == null) {
                    AbstractC22086a.m63159b("null horizontalAlignment when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                iArr[i18] = interfaceC2300f.mo7155a(abstractC39104j1.f168211w, i14, this.f103189f);
                iArr[i18 + 1] = i13;
                i16 = abstractC39104j1.f168212x;
            } else {
                iArr[i18] = i13;
                int i19 = i18 + 1;
                InterfaceC2301g interfaceC2301g = this.f103188e;
                if (interfaceC2301g == null) {
                    AbstractC22086a.m63159b("null verticalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                iArr[i19] = ((C2306l) interfaceC2301g).m7157a(abstractC39104j1.f168212x, i15);
                i16 = abstractC39104j1.f168211w;
            }
            i13 += i16;
        }
        this.f103204u = -this.f103190g;
        this.f103205v = this.f103203t + this.f103191h;
    }
}
