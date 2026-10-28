package yw1;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import uw1.C35311d;

/* JADX INFO: renamed from: yw1.j */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C39823j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f171622w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35311d.b f171623x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f171624y;

    public /* synthetic */ C39823j(C35311d.b bVar, Function1 function1, int i13) {
        this.f171622w = i13;
        this.f171623x = bVar;
        this.f171624y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f171622w) {
            case 0:
                return AbstractC39824k.m127732j(this.f171623x, this.f171624y);
            case 1:
                return AbstractC39824k.m127733k(this.f171623x, this.f171624y);
            default:
                return AbstractC39824k.m127729g(this.f171623x, this.f171624y);
        }
    }
}
