package ch3;

import dh3.C12052a;
import fh3.C14493a;
import mh3.C25565b;
import xg3.AbstractC38292s;
import xg3.InterfaceC38279f;

/* JADX INFO: renamed from: ch3.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4673b0 implements InterfaceC38279f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19127w;

    /* JADX INFO: renamed from: x */
    public final Object f19128x;

    public /* synthetic */ C4673b0(Object obj, int i13) {
        this.f19127w = i13;
        this.f19128x = obj;
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public final Object mo1678b(Object obj) {
        switch (this.f19127w) {
            case 0:
                AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
                C4693l c4693l = new C4693l(abstractC38292s, (Class) this.f19128x, 2);
                abstractC38292s.m122688c(c4693l);
                return c4693l;
            default:
                AbstractC38292s abstractC38292s2 = (AbstractC38292s) obj;
                C12052a c12052a = new C12052a();
                C25565b c25565b = new C25565b(1);
                C4704q0 c4704q0 = new C4704q0(this, abstractC38292s2, c12052a, c25565b);
                ((C14493a) c25565b.f100259x).m41405c(c4704q0);
                abstractC38292s2.m122688c(c25565b);
                abstractC38292s2.mo14765f(c12052a);
                return c4704q0;
        }
    }
}
