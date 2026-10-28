package r20;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2547j0;
import b30.C2550j3;
import bc3.AbstractC3006f0;
import bi.AbstractC3269g;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import java.io.Closeable;
import ou1.C28376a;
import p390p1.C28655q;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32410a;

/* JADX INFO: renamed from: r20.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C30868f implements InterfaceC30881s, Closeable {

    /* JADX INFO: renamed from: w */
    public final C2547j0 f127279w;

    /* JADX INFO: renamed from: x */
    public final C13081r1 f127280x = AbstractC3269g.m9493Z(new C30864b(true, null));

    /* JADX INFO: renamed from: y */
    public final boolean f127281y = true;

    /* JADX INFO: renamed from: z */
    public final float f127282z = 0;

    /* JADX INFO: renamed from: E */
    public final float f127275E = AbstractC30882t.f127338a;

    /* JADX INFO: renamed from: F */
    public final float f127276F = AbstractC30882t.f127339b;

    /* JADX INFO: renamed from: G */
    public final EnumC30870h f127277G = EnumC30870h.f127290w;

    /* JADX INFO: renamed from: H */
    public final boolean f127278H = true;

    public C30868f(C2547j0 c2547j0) {
        this.f127279w = c2547j0;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: J */
    public final void mo94924J(Composer composer, Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-992403751);
        AbstractC32410a.m101020b(this.f127279w, modifier, c28655q, 48);
        c28655q.m87173q(false);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: T */
    public final boolean mo94925T() {
        return this.f127281y;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: a0 */
    public final InterfaceC13037f2 mo94926a0(boolean z4, boolean z13) {
        return AbstractC3269g.m9484M(this.f127279w.f9898r, new C30867e(0, z13, z4));
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: b */
    public final C13081r1 mo94927b() {
        return this.f127280x;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: b0 */
    public final InterfaceC13037f2 mo94928b0(boolean z4) {
        return AbstractC3269g.m9493Z(Boolean.valueOf(z4));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC3006f0.m8714h(this.f127279w.f9891k, null);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: h */
    public final EnumC30870h mo94929h() {
        return this.f127277G;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: i */
    public final float mo94930i() {
        return this.f127275E;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: k */
    public final InterfaceC13037f2 mo94931k() {
        return AbstractC3269g.m9493Z(new C2550j3(!this.f127279w.f9894n, false, false, new C28376a(7)));
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: m */
    public final float mo94932m() {
        return this.f127282z;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: s */
    public final boolean mo94933s() {
        return this.f127278H;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: x */
    public final float mo94934x() {
        return this.f127276F;
    }
}
