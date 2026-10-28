package ch3;

import xg3.AbstractC38283j;
import xg3.AbstractC38284k;
import xg3.AbstractC38292s;
import xg3.C38280g;
import xg3.InterfaceC38278e;

/* JADX INFO: renamed from: ch3.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4710t0 implements InterfaceC38278e {

    /* JADX INFO: renamed from: w */
    public final AbstractC38284k f19278w;

    /* JADX INFO: renamed from: x */
    public final C38280g f19279x;

    /* JADX INFO: renamed from: y */
    public final boolean f19280y;

    public C4710t0(C38280g c38280g, AbstractC38284k abstractC38284k, boolean z4) {
        this.f19278w = abstractC38284k;
        this.f19279x = c38280g;
        this.f19280y = z4;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
        AbstractC38283j abstractC38283jMo37108a = this.f19278w.mo37108a();
        C4708s0 c4708s0 = new C4708s0(abstractC38292s, this.f19280y, abstractC38283jMo37108a, this.f19279x);
        abstractC38292s.m122688c(c4708s0);
        abstractC38292s.m122688c(abstractC38283jMo37108a);
        abstractC38283jMo37108a.mo37106c(c4708s0);
    }
}
