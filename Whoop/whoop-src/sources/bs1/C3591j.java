package bs1;

import p390p1.InterfaceC28601c1;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bs1.j */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3591j implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14586w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f14587x;

    public /* synthetic */ C3591j(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f14586w = i13;
        this.f14587x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14586w) {
            case 0:
                return AbstractC3593l.m10958h(this.f14587x, ((Boolean) obj).booleanValue());
            default:
                return AbstractC3583c0.m10824c2(this.f14587x, (InterfaceC39147y) obj);
        }
    }
}
