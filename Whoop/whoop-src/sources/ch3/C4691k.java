package ch3;

import bh3.InterfaceC3260g;
import p014aj.C0928c;
import xg3.AbstractC38292s;
import xg3.C38280g;
import xg3.InterfaceC38278e;

/* JADX INFO: renamed from: ch3.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C4691k implements InterfaceC38278e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19214w;

    /* JADX INFO: renamed from: x */
    public final C38280g f19215x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC3260g f19216y;

    public /* synthetic */ C4691k(C38280g c38280g, InterfaceC3260g interfaceC3260g, int i13) {
        this.f19214w = i13;
        this.f19215x = c38280g;
        this.f19216y = interfaceC3260g;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f19214w) {
            case 0:
                AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
                C4689j c4689j = new C4689j(new C4700o0(abstractC38292s, true), this.f19216y);
                abstractC38292s.m122688c(c4689j);
                abstractC38292s.m122688c(c4689j.f19208K);
                abstractC38292s.mo14765f(new C0928c(c4689j, 5));
                if (!abstractC38292s.mo14749a()) {
                    this.f19215x.m122671W(c4689j);
                }
                break;
            case 1:
                AbstractC38292s abstractC38292s2 = (AbstractC38292s) obj;
                C4693l c4693l = new C4693l(abstractC38292s2, this.f19216y);
                abstractC38292s2.m122688c(c4693l);
                this.f19215x.m122671W(c4693l);
                break;
            default:
                AbstractC38292s abstractC38292s3 = (AbstractC38292s) obj;
                C4693l c4693l2 = new C4693l(abstractC38292s3, this.f19216y, 1);
                abstractC38292s3.m122688c(c4693l2);
                this.f19215x.m122671W(c4693l2);
                break;
        }
    }
}
