package ev1;

import c93.InterfaceC4339a;
import cv1.C11146c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ev1.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C13685d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48499w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11146c.b f48500x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f48501y;

    public /* synthetic */ C13685d(C11146c.b bVar, Function1 function1, int i13) {
        this.f48499w = i13;
        this.f48500x = bVar;
        this.f48501y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f48499w) {
            case 0:
                return AbstractC13686e.m38619k(this.f48500x, this.f48501y);
            case 1:
                return AbstractC13686e.m38620l(this.f48500x, this.f48501y);
            case 2:
                return AbstractC13686e.m38621m(this.f48500x, this.f48501y);
            default:
                return AbstractC13686e.m38616h(this.f48500x, this.f48501y);
        }
    }
}
