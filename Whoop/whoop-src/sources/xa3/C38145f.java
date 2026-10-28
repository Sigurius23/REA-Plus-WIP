package xa3;

import c93.InterfaceC4339a;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: xa3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C38145f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f163308w;

    /* JADX INFO: renamed from: x */
    public final C38148i f163309x;

    /* JADX INFO: renamed from: y */
    public final AbstractC27736h f163310y;

    public /* synthetic */ C38145f(C38148i c38148i, AbstractC27736h abstractC27736h, int i13) {
        this.f163308w = i13;
        this.f163309x = c38148i;
        this.f163310y = abstractC27736h;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f163308w) {
            case 0:
                C38148i c38148i = this.f163309x;
                C38151l c38151l = c38148i.f163321a;
                return AbstractC39414r.m125863I0(((InterfaceC38142c) c38151l.f163367b.getValue(c38151l, C38151l.f163341Y[0])).mo122160a(this.f163310y.m83822j(AbstractC27741m.f111819C), c38148i), "Collection");
            default:
                C38148i c38148i2 = this.f163309x;
                C38151l c38151l2 = c38148i2.f163321a;
                return AbstractC39414r.m125863I0(((InterfaceC38142c) c38151l2.f163367b.getValue(c38151l2, C38151l.f163341Y[0])).mo122160a(this.f163310y.m83823k("Array"), c38148i2), "Array");
        }
    }
}
