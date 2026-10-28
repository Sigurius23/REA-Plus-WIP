package p719m22;

import p390p1.InterfaceC28690z0;
import p635y2.InterfaceC39147y;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import st1.AbstractC32993n;
import wl0.AbstractC37352a;

/* JADX INFO: renamed from: m22.n */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24959n implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97676w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28690z0 f97677x;

    public /* synthetic */ C24959n(InterfaceC28690z0 interfaceC28690z0, int i13) {
        this.f97676w = i13;
        this.f97677x = interfaceC28690z0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f97676w) {
            case 0:
                return AbstractC42788s.m73245q(this.f97677x, (C39180l) obj);
            case 1:
                return AbstractC32993n.m104212r(this.f97677x, (InterfaceC39147y) obj);
            default:
                return AbstractC37352a.m119618k(this.f97677x, (InterfaceC39147y) obj);
        }
    }
}
