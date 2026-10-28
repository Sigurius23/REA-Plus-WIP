package ch3;

import dh3.C12053b;
import gh3.C15867l;
import lh3.AbstractC24088k;
import p133f1.C13968p1;
import xg3.AbstractC38292s;
import xg3.InterfaceC38278e;
import xg3.InterfaceC38288o;

/* JADX INFO: renamed from: ch3.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C4697n implements InterfaceC38278e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19235w;

    /* JADX INFO: renamed from: x */
    public final Object f19236x;

    public /* synthetic */ C4697n(Object obj, int i13) {
        this.f19235w = i13;
        this.f19236x = obj;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f19235w) {
            case 0:
                AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
                abstractC38292s.mo14765f(new C4695m(abstractC38292s, (Object[]) this.f19236x));
                break;
            case 1:
                AbstractC38292s abstractC38292s2 = (AbstractC38292s) obj;
                C4722z0 c4722z0 = new C4722z0(abstractC38292s2);
                abstractC38292s2.m122688c(c4722z0);
                ((InterfaceC38288o) this.f19236x).mo9472b(c4722z0);
                break;
            case 2:
                AbstractC38292s abstractC38292s3 = (AbstractC38292s) obj;
                boolean z4 = C15867l.f59972y;
                Object obj2 = this.f19236x;
                abstractC38292s3.mo14765f(z4 ? new C12053b(abstractC38292s3, obj2) : new C13968p1(2, abstractC38292s3, obj2));
                break;
            default:
                ((AbstractC24088k) this.f19236x).m122671W((AbstractC38292s) obj);
                break;
        }
    }
}
