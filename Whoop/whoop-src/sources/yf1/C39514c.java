package yf1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import wf1.C37245c;

/* JADX INFO: renamed from: yf1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C39514c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f169936w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37245c.c f169937x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f169938y;

    public /* synthetic */ C39514c(C37245c.c cVar, Function1 function1, int i13) {
        this.f169936w = i13;
        this.f169937x = cVar;
        this.f169938y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f169936w) {
            case 0:
                return AbstractC39515d.m126187k(this.f169937x, this.f169938y);
            case 1:
                return AbstractC39515d.m126188l(this.f169937x, this.f169938y);
            case 2:
                return AbstractC39515d.m126189m(this.f169937x, this.f169938y);
            default:
                return AbstractC39515d.m126184h(this.f169937x, this.f169938y);
        }
    }
}
