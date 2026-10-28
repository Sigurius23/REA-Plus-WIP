package ch3;

import gh3.C15862g;
import p014aj.C0929d;
import xg3.AbstractC38284k;
import xg3.AbstractC38292s;
import xg3.InterfaceC38279f;

/* JADX INFO: renamed from: ch3.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4690j0 implements InterfaceC38279f {

    /* JADX INFO: renamed from: w */
    public final AbstractC38284k f19211w;

    /* JADX INFO: renamed from: x */
    public final boolean f19212x;

    /* JADX INFO: renamed from: y */
    public final int f19213y;

    public C4690j0(AbstractC38284k abstractC38284k, boolean z4, int i13) {
        this.f19211w = abstractC38284k;
        this.f19212x = z4;
        this.f19213y = i13 <= 0 ? C15862g.f59961x : i13;
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public final Object mo1678b(Object obj) {
        boolean z4 = this.f19212x;
        int i13 = this.f19213y;
        C4688i0 c4688i0 = new C4688i0(this.f19211w, (AbstractC38292s) obj, z4, i13);
        C0929d c0929d = new C0929d(c4688i0);
        AbstractC38292s abstractC38292s = c4688i0.f19192E;
        abstractC38292s.mo14765f(c0929d);
        abstractC38292s.m122688c(c4688i0.f19193F);
        abstractC38292s.m122688c(c4688i0);
        return c4688i0;
    }
}
