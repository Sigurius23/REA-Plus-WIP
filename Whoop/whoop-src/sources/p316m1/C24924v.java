package p316m1;

import c93.InterfaceC4351m;
import js2.C21930h;
import l83.C23465k;
import m83.C25272z;
import mc3.C25437c;
import p005a3.InterfaceC0186c0;
import p026b2.AbstractC2316v;
import p180h0.EnumC16377d2;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p636y3.C39180l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m1.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C24924v extends AbstractC2316v implements InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public C24902g f97609O;

    /* JADX INFO: renamed from: P */
    public InterfaceC4351m f97610P;

    /* JADX INFO: renamed from: Q */
    public EnumC16377d2 f97611Q;

    /* JADX INFO: renamed from: R */
    public boolean f97612R;

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        this.f97612R = false;
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j7);
        if (!interfaceC39133t0.mo781A() || !this.f97612R) {
            C23465k c23465k = (C23465k) this.f97610P.invoke(new C39180l((((long) abstractC39104j1Mo448T.f168212x) & 4294967295L) | (((long) abstractC39104j1Mo448T.f168211w) << 32)), new C39169a(j7));
            C24902g c24902g = this.f97609O;
            C24893b0 c24893b0 = (C24893b0) c23465k.f92937w;
            Object obj = c23465k.f92938x;
            if (!AbstractC22676k.m65745e(c24902g.m73008d(), c24893b0)) {
                c24902g.f97553m.setValue(c24893b0);
                C25437c c25437c = c24902g.f97545e.f97511b;
                boolean zTryLock = c25437c.tryLock();
                if (zTryLock) {
                    try {
                        C24900f c24900f = c24902g.f97554n;
                        float fM72993d = c24902g.m73008d().m72993d(obj);
                        if (!Float.isNaN(fM72993d)) {
                            C24900f.m73004a(c24900f, fM72993d);
                            c24902g.m73012h(null);
                        }
                        c24902g.m73011g(obj);
                        c25437c.mo68214i(null);
                    } catch (Throwable th3) {
                        c25437c.mo68214i(null);
                        throw th3;
                    }
                }
                if (!zTryLock) {
                    c24902g.m73012h(obj);
                }
            }
        }
        this.f97612R = interfaceC39133t0.mo781A() || this.f97612R;
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C21930h(interfaceC39133t0, this, abstractC39104j1Mo448T, 15));
    }
}
