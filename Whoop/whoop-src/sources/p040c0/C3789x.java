package p040c0;

import p002a0.AbstractC0015d1;
import p002a0.C0057v0;
import p026b2.InterfaceC2302h;
import p077d0.C11397r1;
import p077d0.C11421z1;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p558vp.AbstractC36259c;
import p636y3.C39180l;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: c0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C3789x implements InterfaceC3770q {

    /* JADX INFO: renamed from: a */
    public final C11421z1 f15447a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2302h f15448b;

    /* JADX INFO: renamed from: c */
    public EnumC39181m f15449c;

    /* JADX INFO: renamed from: d */
    public final C28633k1 f15450d = AbstractC28683x.m87272z(new C39180l(0));

    /* JADX INFO: renamed from: e */
    public final C0057v0 f15451e;

    /* JADX INFO: renamed from: f */
    public C11397r1 f15452f;

    public C3789x(C11421z1 c11421z1, InterfaceC2302h interfaceC2302h, EnumC39181m enumC39181m) {
        this.f15447a = c11421z1;
        this.f15448b = interfaceC2302h;
        this.f15449c = enumC39181m;
        long[] jArr = AbstractC0015d1.f36a;
        this.f15451e = new C0057v0();
    }

    /* JADX INFO: renamed from: e */
    public static final long m11593e(C3789x c3789x, long j7, long j13) {
        return c3789x.f15448b.mo7156a(j7, j13, EnumC39181m.f168423w);
    }

    /* JADX INFO: renamed from: f */
    public static final long m11594f(C3789x c3789x) {
        C11397r1 c11397r1 = c3789x.f15452f;
        return c11397r1 != null ? ((C39180l) c11397r1.getValue()).f168422a : ((C39180l) c3789x.f15450d.getValue()).f168422a;
    }

    @Override // p077d0.InterfaceC11403t1
    /* JADX INFO: renamed from: b */
    public final Object mo11595b() {
        return this.f15447a.m30664f().mo11595b();
    }

    @Override // p077d0.InterfaceC11403t1
    /* JADX INFO: renamed from: c */
    public final Object mo11596c() {
        return this.f15447a.m30664f().mo11596c();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11597g(int i13) {
        if (AbstractC36259c.m115670G(i13, 0)) {
            return true;
        }
        if (AbstractC36259c.m115670G(i13, 4) && this.f15449c == EnumC39181m.f168423w) {
            return true;
        }
        return AbstractC36259c.m115670G(i13, 5) && this.f15449c == EnumC39181m.f168424x;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11598h(int i13) {
        return AbstractC36259c.m115670G(i13, 1) || (AbstractC36259c.m115670G(i13, 4) && this.f15449c == EnumC39181m.f168424x) || (AbstractC36259c.m115670G(i13, 5) && this.f15449c == EnumC39181m.f168423w);
    }
}
