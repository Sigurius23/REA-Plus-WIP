package ch3;

import p031b9.AbstractC2875y;
import xg3.AbstractC38292s;
import xg3.InterfaceC38279f;

/* JADX INFO: renamed from: ch3.v0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4714v0 implements InterfaceC38279f {

    /* JADX INFO: renamed from: w */
    public final int f19290w;

    public C4714v0(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "limit >= 0 required but it was "));
        }
        this.f19290w = i13;
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public final Object mo1678b(Object obj) {
        AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
        C4712u0 c4712u0 = new C4712u0(this, abstractC38292s);
        if (this.f19290w == 0) {
            abstractC38292s.onCompleted();
            c4712u0.mo14750b();
        }
        abstractC38292s.m122688c(c4712u0);
        return c4712u0;
    }
}
