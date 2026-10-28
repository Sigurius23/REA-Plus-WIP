package e51;

import c93.InterfaceC4339a;
import p329n0.C26068u;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: e51.k */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C12735k implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43552w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12738n f43553x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f43554y;

    public /* synthetic */ C12735k(C12738n c12738n, Object obj, int i13) {
        this.f43552w = i13;
        this.f43553x = c12738n;
        this.f43554y = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int iM35641h;
        switch (this.f43552w) {
            case 0:
                iM35641h = AbstractC12736l.a.m35641h(this.f43553x, (C26068u) this.f43554y);
                break;
            default:
                iM35641h = AbstractC12736l.m35633t(this.f43553x, (InterfaceC28601c1) this.f43554y);
                break;
        }
        return Integer.valueOf(iM35641h);
    }
}
