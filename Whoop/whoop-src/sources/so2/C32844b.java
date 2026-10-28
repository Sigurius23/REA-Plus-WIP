package so2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import po2.C29404c;

/* JADX INFO: renamed from: so2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32844b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f136869w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C29404c.b f136870x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f136871y;

    public /* synthetic */ C32844b(C29404c.b bVar, Function1 function1, int i13) {
        this.f136869w = i13;
        this.f136870x = bVar;
        this.f136871y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f136869w) {
            case 0:
                return AbstractC32845c.m103086k(this.f136870x, this.f136871y);
            case 1:
                return AbstractC32845c.m103087l(this.f136870x, this.f136871y);
            case 2:
                return AbstractC32845c.m103088m(this.f136870x, this.f136871y);
            default:
                return AbstractC32845c.m103083h(this.f136870x, this.f136871y);
        }
    }
}
