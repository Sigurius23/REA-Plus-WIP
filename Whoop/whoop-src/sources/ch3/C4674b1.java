package ch3;

import bh3.InterfaceC3260g;
import xg3.AbstractC38283j;
import xg3.AbstractC38284k;
import xg3.AbstractC38291r;
import xg3.C38287n;
import xg3.C38289p;
import xg3.InterfaceC38288o;

/* JADX INFO: renamed from: ch3.b1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4674b1 implements InterfaceC38288o {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19129w;

    /* JADX INFO: renamed from: x */
    public final C38289p f19130x;

    /* JADX INFO: renamed from: y */
    public final Object f19131y;

    public /* synthetic */ C4674b1(C38289p c38289p, Object obj, int i13) {
        this.f19129w = i13;
        this.f19130x = c38289p;
        this.f19131y = obj;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f19129w) {
            case 0:
                AbstractC38291r abstractC38291r = (AbstractC38291r) obj;
                C4671a1 c4671a1 = new C4671a1(abstractC38291r, (InterfaceC3260g) this.f19131y);
                abstractC38291r.m122687c(c4671a1);
                this.f19130x.m122685c(c4671a1);
                break;
            default:
                AbstractC38291r abstractC38291r2 = (AbstractC38291r) obj;
                AbstractC38283j abstractC38283jMo37108a = ((AbstractC38284k) this.f19131y).mo37108a();
                abstractC38291r2.m122687c(abstractC38283jMo37108a);
                abstractC38283jMo37108a.mo37106c(new C38287n(this, abstractC38291r2, abstractC38283jMo37108a));
                break;
        }
    }
}
