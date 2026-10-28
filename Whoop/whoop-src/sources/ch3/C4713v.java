package ch3;

import xg3.AbstractC38292s;
import xg3.InterfaceC38279f;

/* JADX INFO: renamed from: ch3.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C4713v implements InterfaceC38279f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19289w;

    public /* synthetic */ C4713v(int i13) {
        this.f19289w = i13;
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public final Object mo1678b(Object obj) {
        switch (this.f19289w) {
            case 0:
                return (AbstractC38292s) obj;
            default:
                AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
                C4698n0 c4698n0 = new C4698n0(abstractC38292s);
                C4700o0 c4700o0 = new C4700o0(c4698n0, 0);
                c4698n0.f19242x = c4700o0;
                abstractC38292s.m122688c(c4700o0);
                abstractC38292s.m122688c(c4698n0);
                abstractC38292s.mo14765f(c4698n0);
                return c4700o0;
        }
    }
}
