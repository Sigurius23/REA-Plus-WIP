package jb3;

import c93.InterfaceC4339a;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: jb3.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C21554n implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82654w;

    /* JADX INFO: renamed from: x */
    public final C21556p f82655x;

    /* JADX INFO: renamed from: y */
    public final AbstractC21557q f82656y;

    public /* synthetic */ C21554n(C21556p c21556p, AbstractC21557q abstractC21557q, int i13) {
        this.f82654w = i13;
        this.f82655x = c21556p;
        this.f82656y = abstractC21557q;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f82654w) {
            case 0:
                return AbstractC12350b.m34556E(this.f82655x.f82662a.keySet(), this.f82656y.mo60575h());
            default:
                return AbstractC12350b.m34556E(this.f82655x.f82663b.keySet(), this.f82656y.mo60576i());
        }
    }
}
