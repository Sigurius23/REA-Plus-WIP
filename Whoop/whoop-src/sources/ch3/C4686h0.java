package ch3;

import xg3.AbstractC38292s;
import xg3.InterfaceC38279f;

/* JADX INFO: renamed from: ch3.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4686h0 implements InterfaceC38279f {

    /* JADX INFO: renamed from: w */
    public final boolean f19189w;

    public C4686h0(boolean z4) {
        this.f19189w = z4;
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public final Object mo1678b(Object obj) {
        AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
        C4684g0 c4684g0 = new C4684g0(abstractC38292s, this.f19189w);
        C4682f0 c4682f0 = new C4682f0(c4684g0);
        c4684g0.f19171H = c4682f0;
        abstractC38292s.m122688c(c4684g0);
        abstractC38292s.mo14765f(c4682f0);
        return c4684g0;
    }
}
