package r20;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2659y0;
import bi.AbstractC3269g;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import p390p1.C28655q;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r20.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C30878p implements InterfaceC30881s {

    /* JADX INFO: renamed from: w */
    public final C2659y0 f127319w;

    /* JADX INFO: renamed from: y */
    public final float f127321y;

    /* JADX INFO: renamed from: z */
    public final float f127322z;

    /* JADX INFO: renamed from: x */
    public final C13081r1 f127320x = AbstractC3269g.m9493Z(new C30864b(false, null));

    /* JADX INFO: renamed from: E */
    public final float f127318E = AbstractC30882t.f127340c;

    public C30878p(C2659y0 c2659y0) {
        this.f127319w = c2659y0;
        float f13 = 0;
        this.f127321y = f13;
        this.f127322z = f13;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: J */
    public final void mo94924J(Composer composer, Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-822692864);
        AbstractC34870c0.m110021w(this.f127319w, modifier, c28655q, 48);
        c28655q.m87173q(false);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: T */
    public final boolean mo94925T() {
        return false;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: a0 */
    public final InterfaceC13037f2 mo94926a0(boolean z4, boolean z13) {
        return AbstractC3269g.m9493Z(this.f127319w.f10414y);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: b */
    public final C13081r1 mo94927b() {
        return this.f127320x;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: b0 */
    public final InterfaceC13037f2 mo94928b0(boolean z4) {
        return AbstractC3269g.m9493Z(Boolean.FALSE);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: h */
    public final EnumC30870h mo94929h() {
        return EnumC30870h.f127291x;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: i */
    public final float mo94930i() {
        return this.f127322z;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: k */
    public final InterfaceC13037f2 mo94931k() {
        return AbstractC3269g.m9493Z(this.f127319w.f10415z);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: m */
    public final float mo94932m() {
        return this.f127321y;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: s */
    public final boolean mo94933s() {
        return false;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: x */
    public final float mo94934x() {
        return this.f127318E;
    }
}
