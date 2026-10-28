package r20;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bi.AbstractC3269g;
import d30.C11535h;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import hc3.C17171d;
import java.io.Closeable;
import n53.C26318e;
import p097ds.AbstractC12314q;
import p390p1.C28655q;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.C30617w;
import pf.C29124b;

/* JADX INFO: renamed from: r20.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C30873k implements InterfaceC30881s, Closeable {

    /* JADX INFO: renamed from: w */
    public final C11535h f127304w;

    /* JADX INFO: renamed from: y */
    public final float f127306y;

    /* JADX INFO: renamed from: z */
    public final float f127307z;

    /* JADX INFO: renamed from: x */
    public final C13081r1 f127305x = AbstractC3269g.m9493Z(new C30864b(false, null));

    /* JADX INFO: renamed from: E */
    public final float f127303E = AbstractC30882t.f127340c;

    public C30873k(C11535h c11535h) {
        this.f127304w = c11535h;
        float f13 = 0;
        this.f127306y = f13;
        this.f127307z = f13;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: J */
    public final void mo94924J(Composer composer, Modifier modifier) {
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-449464720);
        AbstractC12314q.m34326f(this.f127304w, c28655q, 0);
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
        return AbstractC3269g.m9484M((C26318e) this.f127304w.f37193j, new C30617w(15));
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: b */
    public final C13081r1 mo94927b() {
        return this.f127305x;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: b0 */
    public final InterfaceC13037f2 mo94928b0(boolean z4) {
        return AbstractC3269g.m9493Z(Boolean.FALSE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC3006f0.m8714h((C17171d) this.f127304w.f37191h, null);
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: h */
    public final EnumC30870h mo94929h() {
        return EnumC30870h.f127291x;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: i */
    public final float mo94930i() {
        return this.f127307z;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: k */
    public final InterfaceC13037f2 mo94931k() {
        return AbstractC3269g.m9484M((C26318e) this.f127304w.f37193j, new C29124b(this, 19));
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: m */
    public final float mo94932m() {
        return this.f127306y;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: s */
    public final boolean mo94933s() {
        return false;
    }

    @Override // r20.InterfaceC30881s
    /* JADX INFO: renamed from: x */
    public final float mo94934x() {
        return this.f127303E;
    }
}
