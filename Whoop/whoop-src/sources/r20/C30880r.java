package r20;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2550j3;
import bc3.AbstractC3006f0;
import bi.AbstractC3269g;
import d30.C11566v;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import java.io.Closeable;
import ou1.C28376a;
import p390p1.C28655q;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32416g;

/* JADX INFO: renamed from: r20.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C30880r implements InterfaceC30881s, Closeable {

    /* JADX INFO: renamed from: w */
    public final C11566v f127334w;

    /* JADX INFO: renamed from: x */
    public final boolean f127335x;

    /* JADX INFO: renamed from: y */
    public final C13081r1 f127336y = AbstractC3269g.m9493Z(new C30864b(true, null));

    /* JADX INFO: renamed from: z */
    public final boolean f127337z = true;

    /* JADX INFO: renamed from: E */
    public final float f127330E = 0;

    /* JADX INFO: renamed from: F */
    public final float f127331F = AbstractC30882t.f127338a;

    /* JADX INFO: renamed from: G */
    public final float f127332G = AbstractC30882t.f127340c;

    /* JADX INFO: renamed from: H */
    public final boolean f127333H = true;

    public C30880r(C11566v c11566v, boolean z4) {
        this.f127334w = c11566v;
        this.f127335x = z4;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: J */
    public final void mo94924J(Composer composer, Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1422248203);
        AbstractC32416g.m101156m(this.f127334w, this.f127335x, modifier, c28655q, 384, 0);
        c28655q.m87173q(false);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: T */
    public final boolean mo94925T() {
        return this.f127337z;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: a0 */
    public final InterfaceC13037f2 mo94926a0(boolean z4, boolean z13) {
        return AbstractC3269g.m9493Z(null);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: b */
    public final C13081r1 mo94927b() {
        return this.f127336y;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: b0 */
    public final InterfaceC13037f2 mo94928b0(boolean z4) {
        return AbstractC3269g.m9493Z(Boolean.valueOf(this.f127335x));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC3006f0.m8714h(this.f127334w.f37325i, null);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: h */
    public final EnumC30870h mo94929h() {
        return EnumC30870h.f127291x;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: i */
    public final float mo94930i() {
        return this.f127331F;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: k */
    public final InterfaceC13037f2 mo94931k() {
        return AbstractC3269g.m9493Z(new C2550j3(!this.f127334w.f37324h, false, false, new C28376a(7)));
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: m */
    public final float mo94932m() {
        return this.f127330E;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: s */
    public final boolean mo94933s() {
        return this.f127333H;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: x */
    public final float mo94934x() {
        return this.f127332G;
    }
}
