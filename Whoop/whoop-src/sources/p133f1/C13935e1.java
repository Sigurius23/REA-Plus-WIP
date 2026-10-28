package p133f1;

import p002a0.AbstractC0058w;
import p002a0.C0035k0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: f1.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13935e1 implements InterfaceC13970q0 {

    /* JADX INFO: renamed from: a */
    public final boolean f49678a;

    /* JADX INFO: renamed from: b */
    public final int f49679b;

    /* JADX INFO: renamed from: c */
    public final int f49680c;

    /* JADX INFO: renamed from: d */
    public final C13981u f49681d;

    /* JADX INFO: renamed from: e */
    public final C13972r f49682e;

    public C13935e1(boolean z4, int i13, int i14, C13981u c13981u, C13972r c13972r) {
        this.f49678a = z4;
        this.f49679b = i13;
        this.f49680c = i14;
        this.f49681d = c13981u;
        this.f49682e = c13972r;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: a */
    public final boolean mo39698a() {
        return this.f49678a;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: b */
    public final C13972r mo39699b() {
        return this.f49682e;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: c */
    public final C13972r mo39700c() {
        return this.f49682e;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: d */
    public final int mo39701d() {
        return this.f49680c;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: e */
    public final EnumC13939g mo39702e() {
        int i13 = this.f49679b;
        int i14 = this.f49680c;
        if (i13 < i14) {
            return EnumC13939g.f49691x;
        }
        return i13 > i14 ? EnumC13939g.f49690w : this.f49682e.m39769b();
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: f */
    public final boolean mo39703f(InterfaceC13970q0 interfaceC13970q0) {
        if (this.f49681d == null || interfaceC13970q0 == null || !(interfaceC13970q0 instanceof C13935e1)) {
            return true;
        }
        C13935e1 c13935e1 = (C13935e1) interfaceC13970q0;
        if (this.f49679b != c13935e1.f49679b || this.f49680c != c13935e1.f49680c || this.f49678a != c13935e1.f49678a) {
            return true;
        }
        C13972r c13972r = c13935e1.f49682e;
        C13972r c13972r2 = this.f49682e;
        return (c13972r2.f49815a == c13972r.f49815a && c13972r2.f49817c == c13972r.f49817c && c13972r2.f49818d == c13972r.f49818d) ? false : true;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: g */
    public final void mo39704g(Function1 function1) {
    }

    @Override // p133f1.InterfaceC13970q0
    public final int getSize() {
        return 1;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: h */
    public final C0035k0 mo39705h(C13981u c13981u) {
        boolean z4 = c13981u.f49881c;
        C13978t c13978t = c13981u.f49880b;
        C13978t c13978t2 = c13981u.f49879a;
        if ((!z4 && c13978t2.f49872b > c13978t.f49872b) || (z4 && c13978t2.f49872b <= c13978t.f49872b)) {
            c13981u = C13981u.m39791a(c13981u, null, null, !z4, 3);
        }
        long j7 = this.f49682e.f49815a;
        C0035k0 c0035k0 = AbstractC0058w.f176a;
        C0035k0 c0035k1 = new C0035k0();
        c0035k1.m84h(j7, c13981u);
        return c0035k1;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: i */
    public final C13981u mo39706i() {
        return this.f49681d;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: j */
    public final C13972r mo39707j() {
        return this.f49682e;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: k */
    public final C13972r mo39708k() {
        return this.f49682e;
    }

    @Override // p133f1.InterfaceC13970q0
    /* JADX INFO: renamed from: l */
    public final int mo39709l() {
        return this.f49679b;
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f49678a + ", crossed=" + mo39702e() + ", info=\n\t" + this.f49682e + ')';
    }
}
