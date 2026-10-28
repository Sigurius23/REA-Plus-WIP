package p353o0;

import androidx.compose.foundation.lazy.layout.C1106b;
import bc3.AbstractC3006f0;
import java.util.List;
import p268k0.AbstractC22086a;
import p293l2.C23226c;
import p389p0.C28546r;
import p389p0.C28550t;
import p389p0.InterfaceC28518e0;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p636y3.C39178j;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: o0.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C27332p implements InterfaceC28518e0 {

    /* JADX INFO: renamed from: a */
    public final int f109446a;

    /* JADX INFO: renamed from: b */
    public final Object f109447b;

    /* JADX INFO: renamed from: c */
    public final int f109448c;

    /* JADX INFO: renamed from: d */
    public final EnumC39181m f109449d;

    /* JADX INFO: renamed from: e */
    public final int f109450e;

    /* JADX INFO: renamed from: f */
    public final int f109451f;

    /* JADX INFO: renamed from: g */
    public final List f109452g;

    /* JADX INFO: renamed from: h */
    public final long f109453h;

    /* JADX INFO: renamed from: i */
    public final Object f109454i;

    /* JADX INFO: renamed from: j */
    public final C1106b f109455j;

    /* JADX INFO: renamed from: k */
    public final long f109456k;

    /* JADX INFO: renamed from: l */
    public final int f109457l;

    /* JADX INFO: renamed from: m */
    public final int f109458m;

    /* JADX INFO: renamed from: n */
    public final int f109459n;

    /* JADX INFO: renamed from: o */
    public final int f109460o;

    /* JADX INFO: renamed from: p */
    public int f109461p = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: q */
    public int f109462q;

    /* JADX INFO: renamed from: r */
    public int f109463r;

    /* JADX INFO: renamed from: s */
    public final long f109464s;

    /* JADX INFO: renamed from: t */
    public long f109465t;

    /* JADX INFO: renamed from: u */
    public int f109466u;

    /* JADX INFO: renamed from: v */
    public int f109467v;

    /* JADX INFO: renamed from: w */
    public boolean f109468w;

    public C27332p(int i13, Object obj, int i14, int i15, EnumC39181m enumC39181m, int i16, int i17, List list, long j7, Object obj2, C1106b c1106b, long j13, int i18, int i19) {
        this.f109446a = i13;
        this.f109447b = obj;
        this.f109448c = i14;
        this.f109449d = enumC39181m;
        this.f109450e = i16;
        this.f109451f = i17;
        this.f109452g = list;
        this.f109453h = j7;
        this.f109454i = obj2;
        this.f109455j = c1106b;
        this.f109456k = j13;
        this.f109457l = i18;
        this.f109458m = i19;
        int size = list.size();
        int iMax = 0;
        for (int i24 = 0; i24 < size; i24++) {
            iMax = Math.max(iMax, ((AbstractC39104j1) list.get(i24)).f168212x);
        }
        this.f109459n = iMax;
        int i25 = i15 + iMax;
        this.f109460o = i25 >= 0 ? i25 : 0;
        this.f109464s = (((long) this.f109448c) << 32) | (((long) iMax) & 4294967295L);
        this.f109465t = 0L;
        this.f109466u = -1;
        this.f109467v = -1;
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: a */
    public final void mo77538a(int i13, int i14, int i15, int i16) {
        m82474m(i13, i14, i15, i16, -1, -1);
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: b */
    public final int mo77539b() {
        return this.f109452g.size();
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: c */
    public final boolean mo77540c() {
        return this.f109468w;
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: d */
    public final long mo77541d() {
        return this.f109456k;
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: e */
    public final boolean mo77542e() {
        return true;
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: f */
    public final int mo77543f() {
        return this.f109458m;
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: g */
    public final int mo77544g() {
        return this.f109460o;
    }

    @Override // p389p0.InterfaceC28518e0
    public final int getIndex() {
        return this.f109446a;
    }

    @Override // p389p0.InterfaceC28518e0
    public final Object getKey() {
        return this.f109447b;
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: h */
    public final Object mo77545h(int i13) {
        return ((AbstractC39104j1) this.f109452g.get(i13)).mo454p();
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: i */
    public final void mo77546i() {
        this.f109468w = true;
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: j */
    public final long mo77547j(int i13) {
        return this.f109465t;
    }

    @Override // p389p0.InterfaceC28518e0
    /* JADX INFO: renamed from: k */
    public final int mo77548k() {
        return this.f109457l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final void m82473l(AbstractC39101i1 abstractC39101i1, boolean z4) {
        if (this.f109461p == Integer.MIN_VALUE) {
            AbstractC22086a.m63158a("position() should be called first");
        }
        List list = this.f109452g;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) list.get(i13);
            int i14 = this.f109462q - abstractC39104j1.f168212x;
            int i15 = this.f109463r;
            long j7 = this.f109465t;
            C28550t c28550tM3437a = this.f109455j.m3437a(i13, this.f109447b);
            C23226c c23226c = null;
            Object[] objArr = 0;
            if (c28550tM3437a != null) {
                if (z4) {
                    c28550tM3437a.f115518r = j7;
                } else {
                    long jM124794d = C39178j.m124794d(!C39178j.m124792b(c28550tM3437a.f115518r, C28550t.f115499s) ? c28550tM3437a.f115518r : j7, ((C39178j) c28550tM3437a.f115517q.getValue()).f168416a);
                    int i16 = (int) (j7 & 4294967295L);
                    if (((i16 <= i14 && ((int) (jM124794d & 4294967295L)) <= i14) || (i16 >= i15 && ((int) (jM124794d & 4294967295L)) >= i15)) && c28550tM3437a.m86854h()) {
                        AbstractC3006f0.m8732z(c28550tM3437a.f115501a, null, null, new C28546r(c28550tM3437a, objArr == true ? 1 : 0, 1), 3);
                    }
                    j7 = jM124794d;
                }
                c23226c = c28550tM3437a.f115514n;
            }
            long jM124794d2 = C39178j.m124794d(j7, this.f109453h);
            if (!z4 && c28550tM3437a != null) {
                c28550tM3437a.f115513m = jM124794d2;
            }
            if (c23226c != null) {
                abstractC39101i1.getClass();
                AbstractC39101i1.m124621a(abstractC39104j1, abstractC39101i1);
                abstractC39104j1.mo455p0(C39178j.m124794d(jM124794d2, abstractC39104j1.f168210E), 0.0f, c23226c);
            } else {
                AbstractC39101i1.m124628t(abstractC39101i1, abstractC39104j1, jM124794d2);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m82474m(int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f109461p = i16;
        if (this.f109449d == EnumC39181m.f168424x) {
            i14 = (i15 - i14) - this.f109448c;
        }
        this.f109465t = (((long) i14) << 32) | (((long) i13) & 4294967295L);
        this.f109466u = i17;
        this.f109467v = i18;
        this.f109462q = -this.f109450e;
        this.f109463r = i16 + this.f109451f;
    }
}
