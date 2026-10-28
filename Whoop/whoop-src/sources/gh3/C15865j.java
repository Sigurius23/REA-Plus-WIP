package gh3;

import bh3.InterfaceC3260g;
import dh3.C12053b;
import ih3.C18530c;
import p133f1.C13968p1;
import xg3.AbstractC38292s;
import xg3.C38280g;
import xg3.InterfaceC38278e;

/* JADX INFO: renamed from: gh3.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C15865j implements InterfaceC38278e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f59966w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC3260g f59967x;

    /* JADX INFO: renamed from: y */
    public final Object f59968y;

    public /* synthetic */ C15865j(Object obj, InterfaceC3260g interfaceC3260g, int i13) {
        this.f59966w = i13;
        this.f59968y = obj;
        this.f59967x = interfaceC3260g;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f59966w) {
            case 0:
                AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
                C38280g c38280g = (C38280g) this.f59967x.mo1678b(((C15867l) this.f59968y).f59973x);
                if (!(c38280g instanceof C15867l)) {
                    c38280g.m122671W(new C18530c(abstractC38292s, abstractC38292s));
                } else {
                    Object obj2 = ((C15867l) c38280g).f59973x;
                    abstractC38292s.mo14765f(C15867l.f59972y ? new C12053b(abstractC38292s, obj2) : new C13968p1(2, abstractC38292s, obj2));
                }
                break;
            default:
                AbstractC38292s abstractC38292s2 = (AbstractC38292s) obj;
                abstractC38292s2.mo14765f(new C15866k(abstractC38292s2, this.f59968y, this.f59967x));
                break;
        }
    }
}
