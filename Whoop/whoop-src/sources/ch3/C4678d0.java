package ch3;

import bh3.InterfaceC3261h;
import xg3.AbstractC38292s;
import xg3.C38280g;
import xg3.InterfaceC38279f;

/* JADX INFO: renamed from: ch3.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4678d0 implements InterfaceC38279f, InterfaceC3261h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19139w;

    /* JADX INFO: renamed from: x */
    public final Object f19140x;

    public C4678d0(C38280g c38280g) {
        this.f19139w = 1;
        this.f19140x = c38280g;
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public final Object mo1678b(Object obj) {
        switch (this.f19139w) {
            case 0:
                AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
                return new C4717x(this, abstractC38292s, abstractC38292s);
            default:
                AbstractC38292s abstractC38292s2 = (AbstractC38292s) obj;
                C4700o0 c4700o0 = new C4700o0(abstractC38292s2, false);
                C4702p0 c4702p0 = new C4702p0(c4700o0, c4700o0);
                C4702p0 c4702p1 = new C4702p0(c4702p0, 2);
                c4700o0.m122688c(c4702p0);
                c4700o0.m122688c(c4702p1);
                abstractC38292s2.m122688c(c4700o0);
                ((C38280g) this.f19140x).m122671W(c4702p1);
                return c4702p0;
        }
    }

    @Override // bh3.InterfaceC3261h
    /* JADX INFO: renamed from: c */
    public Object mo9474c(Object obj, Object obj2) {
        return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
    }

    public C4678d0() {
        this.f19139w = 0;
        this.f19140x = this;
    }
}
