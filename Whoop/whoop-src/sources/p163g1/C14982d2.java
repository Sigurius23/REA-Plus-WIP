package p163g1;

import ej1.C13242h;
import ep1.C13412g;
import l83.C23465k;
import m83.C25272z;
import p005a3.InterfaceC0186c0;
import p026b2.AbstractC2316v;
import p180h0.EnumC16377d2;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p636y3.C39180l;

/* JADX INFO: renamed from: g1.d2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14982d2 extends AbstractC2316v implements InterfaceC0186c0 {

    /* JADX INFO: renamed from: O */
    public C14947a0 f55998O;

    /* JADX INFO: renamed from: P */
    public C13242h f55999P;

    /* JADX INFO: renamed from: Q */
    public EnumC16377d2 f56000Q;

    /* JADX INFO: renamed from: R */
    public boolean f56001R;

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        this.f56001R = false;
    }

    @Override // p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j7);
        if (!interfaceC39133t0.mo781A() || !this.f56001R) {
            C23465k c23465k = (C23465k) this.f55999P.invoke(new C39180l((((long) abstractC39104j1Mo448T.f168212x) & 4294967295L) | (((long) abstractC39104j1Mo448T.f168211w) << 32)), new C39169a(j7));
            this.f55998O.m43076k((C15059k3) c23465k.f92937w, c23465k.f92938x);
        }
        this.f56001R = interfaceC39133t0.mo781A() || this.f56001R;
        return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C13412g(interfaceC39133t0, this, abstractC39104j1Mo448T, 11));
    }
}
