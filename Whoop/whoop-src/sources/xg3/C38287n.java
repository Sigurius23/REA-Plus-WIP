package xg3;

import bh3.InterfaceC3254a;
import ch3.C4674b1;

/* JADX INFO: renamed from: xg3.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C38287n implements InterfaceC3254a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC38291r f164086w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC38283j f164087x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C4674b1 f164088y;

    public C38287n(C4674b1 c4674b1, AbstractC38291r abstractC38291r, AbstractC38283j abstractC38283j) {
        this.f164088y = c4674b1;
        this.f164086w = abstractC38291r;
        this.f164087x = abstractC38283j;
    }

    @Override // bh3.InterfaceC3254a
    public final void call() {
        C38286m c38286m = new C38286m(this);
        this.f164086w.m122687c(c38286m);
        this.f164088y.f19130x.m122685c(c38286m);
    }
}
